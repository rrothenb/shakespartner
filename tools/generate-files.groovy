import groovy.json.JsonSlurper

import java.nio.file.Paths

def getTemplate = { templateName ->
    def templateEngine = new groovy.text.GStringTemplateEngine()
    def templateFile = new File("${templateName}.groovy")
    templateEngine.createTemplate(templateFile)
}

def render = {template, binding ->
    template.make(binding).toString()
}

JsonSlurper slurper = new JsonSlurper()
def result

Paths.get('shakespeare.json').withReader { reader ->
    result = slurper.parse(reader)
}

enum RomanDigits {
    I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

    private magnitude;
    private RomanDigits(magnitude) { this.magnitude = magnitude }

    String toString() { super.toString() + "=${magnitude}" }

    static BigInteger parse(String numeral) {
        assert numeral != null && !numeral.empty
        def digits = (numeral as List).collect {
            RomanDigits.valueOf(it)
        }
        def L = digits.size()
        (0..<L).inject(0g) { total, i ->
            def sign = (i == L - 1 || digits[i] >= digits[i+1]) ? 1 : -1
            total + sign * digits[i].magnitude
        }
    }
}

def convertRomanNumerals = { name ->
    def words = [
          "the zeroth",
          "the first",
          "the second",
          "the third",
          "the fourth",
          "the fifth",
          "the sixth",
          "the seventh",
          "the eighth",
          "the ninth",
          "the tenth",
          "the eleventh",
          "the twelfth",
          "the thirteenth",
          "the fourteenth",
          "the fifteenth",
          "the sixteenth",
          "the seventeenth",
          "the eighteenth",
          "the nineteenth",
          "the twentieth"
    ]
    def matcher = name =~ /.*\b([vxVX]|[ivxIVX][ivxIVX]+)\b.*/
    if (matcher.matches()) {
        name.replaceFirst(matcher.group(1),words[RomanDigits.parse(matcher.group(1).toUpperCase())])
    }
    else {
        name
    }
}

def characters = [:]
def plays = []
def playRefsByName = [:]

def play = [:]
def scene = [:]
def line = [:]
def scenes = []

int actNumber
int sceneNumber

for (def entry : result) {
    String speaker = entry.speaker.toLowerCase()
    speaker = convertRomanNumerals(speaker)
    String playName = entry.play_name.toLowerCase()
    playName = convertRomanNumerals(playName)
    String text = entry.text_entry
    def (playNumber, sceneNumberPart, lineNumber) = entry.line_number.tokenize('.')
    if (play.playName != playName) {
        play = [playName:playName,
                playClassName:playName.replaceAll(' ',''),
                playPackageName: playName.replaceAll(' ','').toLowerCase(),
                scenes: [:],
                characterData: [:]]
        plays << play
        playRefsByName['"' + play.playName.toLowerCase() + '"'] = "\"shakespartner.plays.${play.playClassName}\""
    }
    if (text.startsWith('ACT ')) {
        actNumber = RomanDigits.parse(text.substring(4))
    }
    else if (text.startsWith('SCENE ')) {
        String location = text.replaceFirst('[^.]*. *','')
        sceneNumber = RomanDigits.parse(text.substring(6).replaceFirst('[.:].*$',''))
        scene = [sceneName: "Act${actNumber}Scene${sceneNumber}",
                 playPackageName: play.playClassName.toLowerCase(),
                 location: location,
                 actNumber: actNumber,
                 sceneNumber: sceneNumber,
                 lines: []]

        scenes << scene
        play.scenes["\"$actNumber|$sceneNumber\""] = "\"shakespartner.plays.${scene.playPackageName}.Act${actNumber}Scene${sceneNumber}\""
    }
    else if (!playNumber) {
        scene.lines << [text: text]
    }
    else {
        if (line.speaker == speaker) {
            line.text += ' ' + entry.text_entry
        }
        else {
            if (speaker == "") {
                speaker = null
            }
            line = [speaker: speaker, text: entry.text_entry]
            String quotedSpeaker = '"' + speaker + '"'
            if (play.characterData[quotedSpeaker]) {
                play.characterData[quotedSpeaker] << "\"act ${actNumber} scene ${sceneNumber}\""
            }
            else {
                play.characterData[quotedSpeaker] = ["\"act ${actNumber} scene ${sceneNumber}\""] as TreeSet
            }
            String quotedPlayName = '"' + play.playName.toLowerCase() + '"';
            if (characters[quotedSpeaker]) {
                characters[quotedSpeaker] << quotedPlayName
            }
            else {
                characters[quotedSpeaker] = [quotedPlayName] as TreeSet
            }
            scene.lines << line
        }
    }
}

def playTemplate = getTemplate("PlayTemplate")
def playsTemplate = getTemplate("PlaysTemplate")
def sceneTemplate = getTemplate("SceneTemplate")
def charactersTemplate = getTemplate("CharactersTemplate")

String charactersClass = render(charactersTemplate, [characters: characters])
File charactersFile = new File("../src/main/groovy/shakespartner/Characters.groovy")
charactersFile.write charactersClass

String playsClass = render(playsTemplate, [plays: playRefsByName])
File playsFile = new File("../src/main/groovy/shakespartner/Plays.groovy")
playsFile.write playsClass

for (def sceneDef : scenes) {
    for (def lineDef : sceneDef.lines) {
        if (lineDef.speaker) {
            lineDef.speaker = '"' + lineDef.speaker + '"'
        }
        lineDef.text = '"' + lineDef.text + '"'
    }
    String sceneClass = render(sceneTemplate, sceneDef)
    File sceneFileDir = new File("../src/main/groovy/shakespartner/plays/${sceneDef.playPackageName}")
    sceneFileDir.mkdirs()
    File sceneFile = new File("../src/main/groovy/shakespartner/plays/${sceneDef.playPackageName}/${sceneDef.sceneName}.groovy")
    sceneFile.write sceneClass
}

for (def playDef : plays) {
    String playClass = render(playTemplate, playDef)
    File playFile = new File("../src/main/groovy/shakespartner/plays/${playDef.playClassName}.groovy")
    playFile.write playClass
}

File listOfCharacters = new File("../src/main/speechAssets/customSlotTypes/LIST_OF_CHARACTERS")
listOfCharacters.delete()
listOfCharacters.createNewFile()
listOfCharacters.withWriter { file ->
    for (def character : characters.keySet().sort()) {
        file.println character.replaceAll('"','')
    }
}

File listOfPlays = new File("../src/main/speechAssets/customSlotTypes/LIST_OF_PLAYS")
listOfPlays.delete()
listOfPlays.createNewFile()
listOfPlays.withWriter { file ->
    for (def playName : plays*.playName.sort()) {
        file.println playName
    }
}

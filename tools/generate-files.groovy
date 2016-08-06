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
    println matcher
    println "'$name'"
    println matcher.matches()
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
    println "speaker: $speaker, playName: $playName, text: $text, sceneNumberPart: $sceneNumberPart"
    if (play.playName != playName) {
        play = [playName:playName,
                playClassName:playName.replaceAll(' ',''),
                playPackageName: playName.replaceAll(' ','').toLowerCase(),
                scenes: [:],
                characterData: [:]]
        println(play)
        plays << play
        playRefsByName['"' + play.playName.toLowerCase() + '"'] = "\"shakespartner.plays.${play.playClassName}\""
    }
    if (text.startsWith('ACT ')) {
        println entry
        actNumber = RomanDigits.parse(text.substring(4))
        println "starting Act " + actNumber
    }
    else if (text.startsWith('SCENE ')) {
        println entry
        String location = text.replaceFirst('[^.]*. *','')
        sceneNumber = RomanDigits.parse(text.substring(6).replaceFirst('[.:].*$',''))
        println "starting Scene " + sceneNumber
        scene = [sceneName: "Act${actNumber}Scene${sceneNumber}",
                 playPackageName: play.playClassName.toLowerCase(),
                 location: location,
                 actNumber: actNumber,
                 sceneNumber: sceneNumber,
                 lines: []]

        println(scene)
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

println characters

println plays
println playRefsByName

def playTemplate = getTemplate("PlayTemplate")
def playsTemplate = getTemplate("PlaysTemplate")
def sceneTemplate = getTemplate("SceneTemplate")
def charactersTemplate = getTemplate("CharactersTemplate")

String charactersClass = render(charactersTemplate, [characters: characters])
println charactersClass
File charactersFile = new File("../src/main/groovy/shakespartner/Characters.groovy")
charactersFile.write charactersClass

String playsClass = render(playsTemplate, [plays: playRefsByName])
println playsClass
File playsFile = new File("../src/main/groovy/shakespartner/Plays.groovy")
playsFile.write playsClass

for (def sceneDef : scenes) {
    println sceneDef
    for (def lineDef : sceneDef.lines) {
        if (lineDef.speaker) {
            lineDef.speaker = '"' + lineDef.speaker + '"'
        }
        lineDef.text = '"' + lineDef.text + '"'
    }
    String sceneClass = render(sceneTemplate, sceneDef)
    println sceneClass
    File sceneFileDir = new File("../src/main/groovy/shakespartner/plays/${sceneDef.playPackageName}")
    sceneFileDir.mkdirs()
    File sceneFile = new File("../src/main/groovy/shakespartner/plays/${sceneDef.playPackageName}/${sceneDef.sceneName}.groovy")
    sceneFile.write sceneClass
}

for (def playDef : plays) {
    println playDef
    String playClass = render(playTemplate, playDef)
    println playClass
    File playFile = new File("../src/main/groovy/shakespartner/plays/${playDef.playClassName}.groovy")
    playFile.write playClass
}

println "LIST_OF_CHARACTERS"
for (def character : characters.keySet().sort()) {
    println character.replaceAll('"','')
}

println "LIST_OF_PLAYS"
for (def playName : plays*.playName.sort()) {
    println playName
}
package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class awinterstale extends Play {
   String getName() {
      "a winters tale"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.awinterstale.Act1Scene1", "1|2":"shakespartner.plays.awinterstale.Act1Scene2", "2|1":"shakespartner.plays.awinterstale.Act2Scene1", "2|2":"shakespartner.plays.awinterstale.Act2Scene2", "2|3":"shakespartner.plays.awinterstale.Act2Scene3", "3|1":"shakespartner.plays.awinterstale.Act3Scene1", "3|2":"shakespartner.plays.awinterstale.Act3Scene2", "3|3":"shakespartner.plays.awinterstale.Act3Scene3", "4|1":"shakespartner.plays.awinterstale.Act4Scene1", "4|2":"shakespartner.plays.awinterstale.Act4Scene2", "4|3":"shakespartner.plays.awinterstale.Act4Scene3", "4|4":"shakespartner.plays.awinterstale.Act4Scene4", "5|1":"shakespartner.plays.awinterstale.Act5Scene1", "5|2":"shakespartner.plays.awinterstale.Act5Scene2", "5|3":"shakespartner.plays.awinterstale.Act5Scene3"]

   static Map<String,List<String>> characterData = ["archidamus":["act 1 scene 1"], "camillo":["act 1 scene 1", "act 1 scene 2", "act 4 scene 2", "act 4 scene 4", "act 5 scene 3"], "polixenes":["act 1 scene 2", "act 4 scene 2", "act 4 scene 4", "act 5 scene 3"], "leontes":["act 1 scene 2", "act 2 scene 1", "act 2 scene 3", "act 3 scene 2", "act 5 scene 1", "act 5 scene 3"], "hermione":["act 1 scene 2", "act 2 scene 1", "act 3 scene 2", "act 5 scene 3"], "mamillius":["act 1 scene 2", "act 2 scene 1"], "first lady":["act 2 scene 1"], "second lady":["act 2 scene 1"], "first lord":["act 2 scene 1", "act 2 scene 3", "act 3 scene 2"], "antigonus":["act 2 scene 1", "act 2 scene 3", "act 3 scene 3"], "paulina":["act 2 scene 2", "act 2 scene 3", "act 3 scene 2", "act 5 scene 1", "act 5 scene 3"], "gaoler":["act 2 scene 2"], "emilia":["act 2 scene 2"], "first servant":["act 2 scene 3"], "second servant":["act 2 scene 3"], "lords":["act 2 scene 3", "act 3 scene 2"], "servant":["act 2 scene 3", "act 3 scene 2", "act 4 scene 4"], "cleomenes":["act 3 scene 1", "act 5 scene 1"], "dion":["act 3 scene 1", "act 3 scene 2", "act 5 scene 1"], "officer":["act 3 scene 2"], "mariner":["act 3 scene 3"], "shepherd":["act 3 scene 3", "act 4 scene 4", "act 5 scene 2"], "clown":["act 3 scene 3", "act 4 scene 3", "act 4 scene 4", "act 5 scene 2"], "time":["act 4 scene 1"], "autolycus":["act 4 scene 3", "act 4 scene 4", "act 5 scene 2"], "florizel":["act 4 scene 4", "act 5 scene 1"], "perdita":["act 4 scene 4", "act 5 scene 1", "act 5 scene 3"], "dorcas":["act 4 scene 4"], "mopsa":["act 4 scene 4"], "shepard":["act 4 scene 4"], "gentleman":["act 5 scene 1"], "lord":["act 5 scene 1"], "first gentleman":["act 5 scene 2"], "second gentleman":["act 5 scene 2"], "third gentleman":["act 5 scene 2"]]
}
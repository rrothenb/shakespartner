package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class acomedyoferrors extends Play {
   String getName() {
      "a comedy of errors"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.acomedyoferrors.Act1Scene1", "1|2":"shakespartner.plays.acomedyoferrors.Act1Scene2", "2|1":"shakespartner.plays.acomedyoferrors.Act2Scene1", "2|2":"shakespartner.plays.acomedyoferrors.Act2Scene2", "3|1":"shakespartner.plays.acomedyoferrors.Act3Scene1", "3|2":"shakespartner.plays.acomedyoferrors.Act3Scene2", "4|1":"shakespartner.plays.acomedyoferrors.Act4Scene1", "4|2":"shakespartner.plays.acomedyoferrors.Act4Scene2", "4|3":"shakespartner.plays.acomedyoferrors.Act4Scene3", "4|4":"shakespartner.plays.acomedyoferrors.Act4Scene4", "5|1":"shakespartner.plays.acomedyoferrors.Act5Scene1"]

   static Map<String,List<String>> characterData = ["aegeon":["act 1 scene 1", "act 5 scene 1"], "duke solinus":["act 1 scene 1", "act 5 scene 1"], "gaoler":["act 1 scene 1"], "first merchant":["act 1 scene 2"], "of syracuse":["act 1 scene 2", "act 2 scene 2", "act 3 scene 2", "act 4 scene 3", "act 4 scene 4", "act 5 scene 1"], "dromio of syracuse":["act 1 scene 2", "act 2 scene 2", "act 3 scene 1", "act 3 scene 2", "act 4 scene 1", "act 4 scene 2", "act 4 scene 3", "act 4 scene 4", "act 5 scene 1"], "dromio of ephesus":["act 1 scene 2", "act 2 scene 1", "act 3 scene 1", "act 4 scene 1", "act 4 scene 4", "act 5 scene 1"], "adriana":["act 2 scene 1", "act 2 scene 2", "act 3 scene 1", "act 4 scene 2", "act 4 scene 4", "act 5 scene 1"], "luciana":["act 2 scene 1", "act 2 scene 2", "act 3 scene 2", "act 4 scene 2", "act 4 scene 4", "act 5 scene 1"], "of ephesus":["act 3 scene 1", "act 4 scene 1", "act 4 scene 4", "act 5 scene 1"], "balthazar":["act 3 scene 1"], "luce":["act 3 scene 1"], "antipholus":["act 3 scene 1", "act 3 scene 2", "act 4 scene 4", "act 5 scene 1"], "angelo":["act 3 scene 1", "act 3 scene 2", "act 4 scene 1", "act 5 scene 1"], "second merchant":["act 4 scene 1", "act 5 scene 1"], "officer":["act 4 scene 1", "act 4 scene 4"], "courtezan":["act 4 scene 3", "act 4 scene 4", "act 5 scene 1"], "pinch":["act 4 scene 4"], "aemelia":["act 5 scene 1"], "servant":["act 5 scene 1"]]
}
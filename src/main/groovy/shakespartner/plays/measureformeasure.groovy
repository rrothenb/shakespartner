package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class measureformeasure extends Play {
   String getName() {
      "measure for measure"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.measureformeasure.Act1Scene1", "1|2":"shakespartner.plays.measureformeasure.Act1Scene2", "1|3":"shakespartner.plays.measureformeasure.Act1Scene3", "1|4":"shakespartner.plays.measureformeasure.Act1Scene4", "2|1":"shakespartner.plays.measureformeasure.Act2Scene1", "2|2":"shakespartner.plays.measureformeasure.Act2Scene2", "2|3":"shakespartner.plays.measureformeasure.Act2Scene3", "2|4":"shakespartner.plays.measureformeasure.Act2Scene4", "3|1":"shakespartner.plays.measureformeasure.Act3Scene1", "3|2":"shakespartner.plays.measureformeasure.Act3Scene2", "4|1":"shakespartner.plays.measureformeasure.Act4Scene1", "4|2":"shakespartner.plays.measureformeasure.Act4Scene2", "4|3":"shakespartner.plays.measureformeasure.Act4Scene3", "4|4":"shakespartner.plays.measureformeasure.Act4Scene4", "4|5":"shakespartner.plays.measureformeasure.Act4Scene5", "4|6":"shakespartner.plays.measureformeasure.Act4Scene6", "5|1":"shakespartner.plays.measureformeasure.Act5Scene1"]

   static Map<String,List<String>> characterData = ["duke vincentio":["act 1 scene 1", "act 1 scene 3", "act 2 scene 3", "act 3 scene 1", "act 3 scene 2", "act 4 scene 1", "act 4 scene 2", "act 4 scene 3", "act 4 scene 5", "act 5 scene 1"], "escalus":["act 1 scene 1", "act 2 scene 1", "act 3 scene 2", "act 4 scene 4", "act 5 scene 1"], "angelo":["act 1 scene 1", "act 2 scene 1", "act 2 scene 2", "act 2 scene 4", "act 4 scene 4", "act 5 scene 1"], "duke":["act 1 scene 1"], "lucio":["act 1 scene 2", "act 1 scene 4", "act 2 scene 2", "act 3 scene 2", "act 4 scene 3", "act 5 scene 1"], "first gentleman":["act 1 scene 2"], "second gentleman":["act 1 scene 2"], "mistress overdone":["act 1 scene 2", "act 3 scene 2"], "pompey":["act 1 scene 2", "act 2 scene 1", "act 3 scene 2", "act 4 scene 2", "act 4 scene 3"], "claudio":["act 1 scene 2", "act 3 scene 1", "act 4 scene 2"], "provost":["act 1 scene 2", "act 2 scene 1", "act 2 scene 2", "act 2 scene 3", "act 3 scene 1", "act 3 scene 2", "act 4 scene 2", "act 4 scene 3", "act 5 scene 1"], "friar thomas":["act 1 scene 3"], "isabella":["act 1 scene 4", "act 2 scene 2", "act 2 scene 4", "act 3 scene 1", "act 4 scene 1", "act 4 scene 3", "act 4 scene 6", "act 5 scene 1"], "francisca":["act 1 scene 4"], "elbow":["act 2 scene 1", "act 3 scene 2"], "froth":["act 2 scene 1"], "pomphey":["act 2 scene 1"], "justice":["act 2 scene 1"], "servant":["act 2 scene 2", "act 2 scene 4"], "juliet":["act 2 scene 3"], "mariana":["act 4 scene 1", "act 4 scene 6", "act 5 scene 1"], "abhorson":["act 4 scene 2", "act 4 scene 3"], "messenger":["act 4 scene 2"], "barnardine":["act 4 scene 3"], "friar peter":["act 4 scene 5", "act 4 scene 6", "act 5 scene 1"]]
}
package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class thetempest extends Play {
   String getName() {
      "the tempest"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.thetempest.Act1Scene1", "1|2":"shakespartner.plays.thetempest.Act1Scene2", "2|1":"shakespartner.plays.thetempest.Act2Scene1", "2|2":"shakespartner.plays.thetempest.Act2Scene2", "3|1":"shakespartner.plays.thetempest.Act3Scene1", "3|2":"shakespartner.plays.thetempest.Act3Scene2", "3|3":"shakespartner.plays.thetempest.Act3Scene3", "4|1":"shakespartner.plays.thetempest.Act4Scene1", "5|1":"shakespartner.plays.thetempest.Act5Scene1"]

   static Map<String,List<String>> characterData = ["master":["act 1 scene 1"], "boatswain":["act 1 scene 1", "act 5 scene 1"], "alonso":["act 1 scene 1", "act 2 scene 1", "act 3 scene 3", "act 5 scene 1"], "antonio":["act 1 scene 1", "act 2 scene 1", "act 3 scene 3", "act 5 scene 1"], "gonzalo":["act 1 scene 1", "act 2 scene 1", "act 3 scene 3", "act 5 scene 1"], "sebastian":["act 1 scene 1", "act 2 scene 1", "act 3 scene 3", "act 5 scene 1"], "mariners":["act 1 scene 1"], "miranda":["act 1 scene 2", "act 3 scene 1", "act 4 scene 1", "act 5 scene 1"], "prospero":["act 1 scene 2", "act 3 scene 1", "act 3 scene 3", "act 4 scene 1", "act 5 scene 1"], "ariel":["act 1 scene 2", "act 2 scene 1", "act 3 scene 2", "act 3 scene 3", "act 4 scene 1", "act 5 scene 1"], "caliban":["act 1 scene 2", "act 2 scene 2", "act 3 scene 2", "act 4 scene 1", "act 5 scene 1"], "ferdinand":["act 1 scene 2", "act 3 scene 1", "act 4 scene 1", "act 5 scene 1"], "adrian":["act 2 scene 1", "act 3 scene 3"], "francisco":["act 2 scene 1", "act 3 scene 3"], "trinculo":["act 2 scene 2", "act 3 scene 2", "act 4 scene 1", "act 5 scene 1"], "stephano":["act 2 scene 2", "act 3 scene 2", "act 4 scene 1", "act 5 scene 1"], "iris":["act 4 scene 1"], "ceres":["act 4 scene 1"], "juno":["act 4 scene 1"]]
}
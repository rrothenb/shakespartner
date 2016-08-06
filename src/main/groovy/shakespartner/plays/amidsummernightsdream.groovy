package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class amidsummernightsdream extends Play {
   String getName() {
      "a midsummer nights dream"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.amidsummernightsdream.Act1Scene1", "1|2":"shakespartner.plays.amidsummernightsdream.Act1Scene2", "2|1":"shakespartner.plays.amidsummernightsdream.Act2Scene1", "2|2":"shakespartner.plays.amidsummernightsdream.Act2Scene2", "3|1":"shakespartner.plays.amidsummernightsdream.Act3Scene1", "3|2":"shakespartner.plays.amidsummernightsdream.Act3Scene2", "4|1":"shakespartner.plays.amidsummernightsdream.Act4Scene1", "4|2":"shakespartner.plays.amidsummernightsdream.Act4Scene2", "5|1":"shakespartner.plays.amidsummernightsdream.Act5Scene1"]

   static Map<String,List<String>> characterData = ["theseus":["act 1 scene 1", "act 4 scene 1", "act 5 scene 1"], "hippolyta":["act 1 scene 1", "act 4 scene 1", "act 5 scene 1"], "egeus":["act 1 scene 1", "act 4 scene 1"], "hermia":["act 1 scene 1", "act 2 scene 2", "act 3 scene 2", "act 4 scene 1"], "demetrius":["act 1 scene 1", "act 2 scene 1", "act 2 scene 2", "act 3 scene 2", "act 4 scene 1", "act 5 scene 1"], "lysander":["act 1 scene 1", "act 2 scene 2", "act 3 scene 2", "act 4 scene 1", "act 5 scene 1"], "helena":["act 1 scene 1", "act 2 scene 1", "act 2 scene 2", "act 3 scene 2", "act 4 scene 1"], "quince":["act 1 scene 2", "act 3 scene 1", "act 4 scene 2"], "bottom":["act 1 scene 2", "act 3 scene 1", "act 4 scene 1", "act 4 scene 2", "act 5 scene 1"], "flute":["act 1 scene 2", "act 3 scene 1", "act 4 scene 2"], "starveling":["act 1 scene 2", "act 3 scene 1", "act 4 scene 2"], "snout":["act 1 scene 2", "act 3 scene 1"], "snug":["act 1 scene 2", "act 4 scene 2"], "all":["act 1 scene 2", "act 3 scene 1"], "puck":["act 2 scene 1", "act 2 scene 2", "act 3 scene 1", "act 3 scene 2", "act 4 scene 1", "act 5 scene 1"], "fairy":["act 2 scene 1", "act 2 scene 2"], "oberon":["act 2 scene 1", "act 2 scene 2", "act 3 scene 2", "act 4 scene 1", "act 5 scene 1"], "titania":["act 2 scene 1", "act 2 scene 2", "act 3 scene 1", "act 4 scene 1", "act 5 scene 1"], "peaseblossom":["act 3 scene 1", "act 4 scene 1"], "cobweb":["act 3 scene 1", "act 4 scene 1"], "moth":["act 3 scene 1"], "mustardseed":["act 3 scene 1", "act 4 scene 1"], "hernia":["act 3 scene 2"], "philostrate":["act 5 scene 1"], "prologue":["act 5 scene 1"], "wall":["act 5 scene 1"], "pyramus":["act 5 scene 1"], "thisbe":["act 5 scene 1"], "lion":["act 5 scene 1"], "moonshine":["act 5 scene 1"]]
}
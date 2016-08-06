package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class loveslabourslost extends Play {
   String getName() {
      "loves labours lost"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.loveslabourslost.Act1Scene1", "1|2":"shakespartner.plays.loveslabourslost.Act1Scene2", "2|1":"shakespartner.plays.loveslabourslost.Act2Scene1", "3|1":"shakespartner.plays.loveslabourslost.Act3Scene1", "4|1":"shakespartner.plays.loveslabourslost.Act4Scene1", "4|2":"shakespartner.plays.loveslabourslost.Act4Scene2", "4|3":"shakespartner.plays.loveslabourslost.Act4Scene3", "5|1":"shakespartner.plays.loveslabourslost.Act5Scene1", "5|2":"shakespartner.plays.loveslabourslost.Act5Scene2"]

   static Map<String,List<String>> characterData = ["ferdinand":["act 1 scene 1", "act 2 scene 1", "act 4 scene 3", "act 5 scene 2"], "longaville":["act 1 scene 1", "act 2 scene 1", "act 4 scene 3", "act 5 scene 2"], "dumain":["act 1 scene 1", "act 2 scene 1", "act 4 scene 3", "act 5 scene 2"], "biron":["act 1 scene 1", "act 2 scene 1", "act 3 scene 1", "act 4 scene 3", "act 5 scene 2"], "dull":["act 1 scene 1", "act 1 scene 2", "act 4 scene 2", "act 5 scene 1"], "costard":["act 1 scene 1", "act 1 scene 2", "act 3 scene 1", "act 4 scene 1", "act 4 scene 2", "act 4 scene 3", "act 5 scene 1", "act 5 scene 2"], "adriano de armado":["act 1 scene 2", "act 3 scene 1", "act 5 scene 1", "act 5 scene 2"], "moth":["act 1 scene 2", "act 3 scene 1", "act 5 scene 1", "act 5 scene 2"], "armado":["act 1 scene 2"], "jaquenetta":["act 1 scene 2", "act 4 scene 2", "act 4 scene 3"], "boyet":["act 2 scene 1", "act 4 scene 1", "act 5 scene 2"], "princess":["act 2 scene 1", "act 4 scene 1", "act 5 scene 2"], "first lord":["act 2 scene 1"], "maria":["act 2 scene 1", "act 4 scene 1", "act 5 scene 2"], "katharine":["act 2 scene 1", "act 5 scene 2"], "rosaline":["act 2 scene 1", "act 4 scene 1", "act 5 scene 2"], "forester":["act 4 scene 1"], "sir nathaniel":["act 4 scene 2", "act 5 scene 1", "act 5 scene 2"], "holofernes":["act 4 scene 2", "act 5 scene 1", "act 5 scene 2"], "mercade":["act 5 scene 2"]]
}
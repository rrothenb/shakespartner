package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class kingjohn extends Play {
   String getName() {
      "king john"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.kingjohn.Act1Scene1", "2|1":"shakespartner.plays.kingjohn.Act2Scene1", "3|1":"shakespartner.plays.kingjohn.Act3Scene1", "3|2":"shakespartner.plays.kingjohn.Act3Scene2", "3|3":"shakespartner.plays.kingjohn.Act3Scene3", "3|4":"shakespartner.plays.kingjohn.Act3Scene4", "4|1":"shakespartner.plays.kingjohn.Act4Scene1", "4|2":"shakespartner.plays.kingjohn.Act4Scene2", "4|3":"shakespartner.plays.kingjohn.Act4Scene3", "5|1":"shakespartner.plays.kingjohn.Act5Scene1", "5|2":"shakespartner.plays.kingjohn.Act5Scene2", "5|3":"shakespartner.plays.kingjohn.Act5Scene3", "5|4":"shakespartner.plays.kingjohn.Act5Scene4", "5|5":"shakespartner.plays.kingjohn.Act5Scene5", "5|6":"shakespartner.plays.kingjohn.Act5Scene6", "5|7":"shakespartner.plays.kingjohn.Act5Scene7"]

   static Map<String,List<String>> characterData = ["king john":["act 1 scene 1", "act 2 scene 1", "act 3 scene 1", "act 3 scene 2", "act 3 scene 3", "act 4 scene 2", "act 5 scene 1", "act 5 scene 3", "act 5 scene 7"], "chatillon":["act 1 scene 1", "act 2 scene 1"], "queen elinor":["act 1 scene 1", "act 2 scene 1", "act 3 scene 1", "act 3 scene 3"], "essex":["act 1 scene 1"], "bastard":["act 1 scene 1", "act 2 scene 1", "act 3 scene 1", "act 3 scene 2", "act 3 scene 3", "act 4 scene 2", "act 4 scene 3", "act 5 scene 1", "act 5 scene 2", "act 5 scene 6", "act 5 scene 7"], "robert":["act 1 scene 1"], "lady faulconbridge":["act 1 scene 1"], "gurney":["act 1 scene 1"], "lewis":["act 2 scene 1", "act 3 scene 1", "act 3 scene 4", "act 5 scene 2", "act 5 scene 5"], "arthur":["act 2 scene 1", "act 3 scene 1", "act 3 scene 3", "act 4 scene 1", "act 4 scene 3"], "austria":["act 2 scene 1", "act 3 scene 1"], "constance":["act 2 scene 1", "act 3 scene 1", "act 3 scene 4"], "king philip":["act 2 scene 1", "act 3 scene 1", "act 3 scene 4"], "blanch":["act 2 scene 1", "act 3 scene 1"], "first citizen":["act 2 scene 1"], "french herald":["act 2 scene 1"], "english herald":["act 2 scene 1"], "salisbury":["act 3 scene 1", "act 4 scene 2", "act 4 scene 3", "act 5 scene 2", "act 5 scene 4", "act 5 scene 7"], "cardinal pandulph":["act 3 scene 1", "act 3 scene 4", "act 5 scene 1", "act 5 scene 2"], "elinor":["act 3 scene 3"], "hubert":["act 3 scene 3", "act 4 scene 1", "act 4 scene 2", "act 4 scene 3", "act 5 scene 3", "act 5 scene 6"], "first executioner":["act 4 scene 1"], "pembroke":["act 4 scene 2", "act 4 scene 3", "act 5 scene 4", "act 5 scene 7"], "messenger":["act 4 scene 2", "act 5 scene 3", "act 5 scene 5"], "peter":["act 4 scene 2"], "bigot":["act 4 scene 3"], "melun":["act 5 scene 4"], "prince henry":["act 5 scene 7"]]
}
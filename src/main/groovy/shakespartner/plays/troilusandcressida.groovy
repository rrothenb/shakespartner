package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class troilusandcressida extends Play {
   String getName() {
      "troilus and cressida"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.troilusandcressida.Act1Scene1", "1|2":"shakespartner.plays.troilusandcressida.Act1Scene2", "1|3":"shakespartner.plays.troilusandcressida.Act1Scene3", "2|1":"shakespartner.plays.troilusandcressida.Act2Scene1", "2|2":"shakespartner.plays.troilusandcressida.Act2Scene2", "2|3":"shakespartner.plays.troilusandcressida.Act2Scene3", "3|1":"shakespartner.plays.troilusandcressida.Act3Scene1", "3|2":"shakespartner.plays.troilusandcressida.Act3Scene2", "3|3":"shakespartner.plays.troilusandcressida.Act3Scene3", "4|1":"shakespartner.plays.troilusandcressida.Act4Scene1", "4|2":"shakespartner.plays.troilusandcressida.Act4Scene2", "4|3":"shakespartner.plays.troilusandcressida.Act4Scene3", "4|4":"shakespartner.plays.troilusandcressida.Act4Scene4", "4|5":"shakespartner.plays.troilusandcressida.Act4Scene5", "5|1":"shakespartner.plays.troilusandcressida.Act5Scene1", "5|2":"shakespartner.plays.troilusandcressida.Act5Scene2", "5|3":"shakespartner.plays.troilusandcressida.Act5Scene3", "5|4":"shakespartner.plays.troilusandcressida.Act5Scene4", "5|5":"shakespartner.plays.troilusandcressida.Act5Scene5", "5|6":"shakespartner.plays.troilusandcressida.Act5Scene6", "5|7":"shakespartner.plays.troilusandcressida.Act5Scene7", "5|8":"shakespartner.plays.troilusandcressida.Act5Scene8", "5|9":"shakespartner.plays.troilusandcressida.Act5Scene9", "5|10":"shakespartner.plays.troilusandcressida.Act5Scene10"]

   static Map<String,List<String>> characterData = ["troilus":["act 1 scene 1", "act 2 scene 2", "act 3 scene 2", "act 4 scene 2", "act 4 scene 3", "act 4 scene 4", "act 4 scene 5", "act 5 scene 1", "act 5 scene 10", "act 5 scene 2", "act 5 scene 3", "act 5 scene 4", "act 5 scene 6"], "pandarus":["act 1 scene 1", "act 1 scene 2", "act 3 scene 1", "act 3 scene 2", "act 4 scene 2", "act 4 scene 4", "act 5 scene 10", "act 5 scene 3"], "aeneas":["act 1 scene 1", "act 1 scene 3", "act 4 scene 1", "act 4 scene 2", "act 4 scene 4", "act 4 scene 5", "act 5 scene 10", "act 5 scene 2"], "cressida":["act 1 scene 2", "act 3 scene 2", "act 4 scene 2", "act 4 scene 4", "act 4 scene 5", "act 5 scene 2"], "alexander":["act 1 scene 2"], "boy":["act 1 scene 2", "act 3 scene 2"], "agamemnon":["act 1 scene 3", "act 2 scene 3", "act 3 scene 3", "act 4 scene 5", "act 5 scene 1", "act 5 scene 5", "act 5 scene 9"], "nestor":["act 1 scene 3", "act 2 scene 3", "act 3 scene 3", "act 4 scene 5", "act 5 scene 5", "act 5 scene 9"], "ulysses":["act 1 scene 3", "act 2 scene 3", "act 3 scene 3", "act 4 scene 5", "act 5 scene 1", "act 5 scene 2", "act 5 scene 5"], "menelaus":["act 1 scene 3", "act 3 scene 3", "act 4 scene 5", "act 5 scene 1"], "ajax":["act 2 scene 1", "act 2 scene 3", "act 3 scene 3", "act 4 scene 5", "act 5 scene 1", "act 5 scene 5", "act 5 scene 6", "act 5 scene 9"], "thersites":["act 2 scene 1", "act 2 scene 3", "act 3 scene 3", "act 5 scene 1", "act 5 scene 2", "act 5 scene 4", "act 5 scene 7"], "achilles":["act 2 scene 1", "act 2 scene 3", "act 3 scene 3", "act 4 scene 5", "act 5 scene 1", "act 5 scene 5", "act 5 scene 6", "act 5 scene 7", "act 5 scene 8"], "patroclus":["act 2 scene 1", "act 2 scene 3", "act 3 scene 3", "act 4 scene 5", "act 5 scene 1"], "priam":["act 2 scene 2", "act 5 scene 3"], "hector":["act 2 scene 2", "act 4 scene 5", "act 5 scene 1", "act 5 scene 3", "act 5 scene 4", "act 5 scene 6", "act 5 scene 8"], "helenus":["act 2 scene 2"], "cassandra":["act 2 scene 2", "act 5 scene 3"], "paris":["act 2 scene 2", "act 3 scene 1", "act 4 scene 1", "act 4 scene 3", "act 4 scene 4"], "diomedes":["act 2 scene 3", "act 3 scene 3", "act 4 scene 1", "act 4 scene 4", "act 4 scene 5", "act 5 scene 1", "act 5 scene 2", "act 5 scene 4", "act 5 scene 5", "act 5 scene 6", "act 5 scene 9"], "servant":["act 3 scene 1", "act 5 scene 5"], "helen":["act 3 scene 1"], "calchas":["act 3 scene 3", "act 5 scene 2"], "deiphobus":["act 4 scene 1", "act 4 scene 4"], "all":["act 4 scene 5", "act 5 scene 10"], "andromache":["act 5 scene 3"], "margarelon":["act 5 scene 7"], "myrmidons":["act 5 scene 8"]]
}
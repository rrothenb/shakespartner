package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class asyoulikeit extends Play {
   String getName() {
      "as you like it"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.asyoulikeit.Act1Scene1", "1|2":"shakespartner.plays.asyoulikeit.Act1Scene2", "1|3":"shakespartner.plays.asyoulikeit.Act1Scene3", "2|1":"shakespartner.plays.asyoulikeit.Act2Scene1", "2|2":"shakespartner.plays.asyoulikeit.Act2Scene2", "2|3":"shakespartner.plays.asyoulikeit.Act2Scene3", "2|4":"shakespartner.plays.asyoulikeit.Act2Scene4", "2|5":"shakespartner.plays.asyoulikeit.Act2Scene5", "2|6":"shakespartner.plays.asyoulikeit.Act2Scene6", "2|7":"shakespartner.plays.asyoulikeit.Act2Scene7", "3|1":"shakespartner.plays.asyoulikeit.Act3Scene1", "3|2":"shakespartner.plays.asyoulikeit.Act3Scene2", "3|3":"shakespartner.plays.asyoulikeit.Act3Scene3", "3|4":"shakespartner.plays.asyoulikeit.Act3Scene4", "3|5":"shakespartner.plays.asyoulikeit.Act3Scene5", "4|1":"shakespartner.plays.asyoulikeit.Act4Scene1", "4|2":"shakespartner.plays.asyoulikeit.Act4Scene2", "4|3":"shakespartner.plays.asyoulikeit.Act4Scene3", "5|1":"shakespartner.plays.asyoulikeit.Act5Scene1", "5|2":"shakespartner.plays.asyoulikeit.Act5Scene2", "5|3":"shakespartner.plays.asyoulikeit.Act5Scene3", "5|4":"shakespartner.plays.asyoulikeit.Act5Scene4"]

   static Map<String,List<String>> characterData = ["orlando":["act 1 scene 1", "act 1 scene 2", "act 2 scene 3", "act 2 scene 6", "act 2 scene 7", "act 3 scene 2", "act 4 scene 1", "act 5 scene 2", "act 5 scene 4"], "adam":["act 1 scene 1", "act 2 scene 3", "act 2 scene 6", "act 2 scene 7"], "oliver":["act 1 scene 1", "act 3 scene 1", "act 4 scene 3", "act 5 scene 2"], "dennis":["act 1 scene 1"], "charles":["act 1 scene 1", "act 1 scene 2"], "celia":["act 1 scene 2", "act 1 scene 3", "act 2 scene 4", "act 3 scene 2", "act 3 scene 4", "act 4 scene 1", "act 4 scene 3"], "rosalind":["act 1 scene 2", "act 1 scene 3", "act 2 scene 4", "act 3 scene 2", "act 3 scene 4", "act 3 scene 5", "act 4 scene 1", "act 4 scene 3", "act 5 scene 2", "act 5 scene 4"], "touchstone":["act 1 scene 2", "act 2 scene 4", "act 3 scene 2", "act 3 scene 3", "act 5 scene 1", "act 5 scene 3", "act 5 scene 4"], "le beau":["act 1 scene 2"], "duke frederick":["act 1 scene 2", "act 1 scene 3", "act 2 scene 2", "act 3 scene 1"], "duke senior":["act 2 scene 1", "act 2 scene 7", "act 5 scene 4"], "amiens":["act 2 scene 1", "act 2 scene 5", "act 2 scene 7"], "first lord":["act 2 scene 1", "act 2 scene 2", "act 2 scene 7"], "second lord":["act 2 scene 1", "act 2 scene 2"], "corin":["act 2 scene 4", "act 3 scene 2", "act 3 scene 4", "act 5 scene 1"], "silvius":["act 2 scene 4", "act 3 scene 5", "act 4 scene 3", "act 5 scene 2", "act 5 scene 4"], "jaques":["act 2 scene 5", "act 2 scene 7", "act 3 scene 2", "act 3 scene 3", "act 4 scene 1", "act 4 scene 2", "act 5 scene 4"], "audrey":["act 3 scene 3", "act 5 scene 1", "act 5 scene 3"], "sir oliver martext":["act 3 scene 3"], "phebe":["act 3 scene 5", "act 5 scene 2", "act 5 scene 4"], "a lord":["act 4 scene 2"], "forester":["act 4 scene 2"], "william":["act 5 scene 1"], "first page":["act 5 scene 3"], "second page":["act 5 scene 3"], "hymen":["act 5 scene 4"], "jaques de boys":["act 5 scene 4"]]
}
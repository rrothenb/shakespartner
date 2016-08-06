package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class kinglear extends Play {
   String getName() {
      "king lear"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.kinglear.Act1Scene1", "1|2":"shakespartner.plays.kinglear.Act1Scene2", "1|3":"shakespartner.plays.kinglear.Act1Scene3", "1|4":"shakespartner.plays.kinglear.Act1Scene4", "1|5":"shakespartner.plays.kinglear.Act1Scene5", "2|1":"shakespartner.plays.kinglear.Act2Scene1", "2|2":"shakespartner.plays.kinglear.Act2Scene2", "2|3":"shakespartner.plays.kinglear.Act2Scene3", "2|4":"shakespartner.plays.kinglear.Act2Scene4", "3|1":"shakespartner.plays.kinglear.Act3Scene1", "3|2":"shakespartner.plays.kinglear.Act3Scene2", "3|3":"shakespartner.plays.kinglear.Act3Scene3", "3|4":"shakespartner.plays.kinglear.Act3Scene4", "3|5":"shakespartner.plays.kinglear.Act3Scene5", "3|6":"shakespartner.plays.kinglear.Act3Scene6", "3|7":"shakespartner.plays.kinglear.Act3Scene7", "4|1":"shakespartner.plays.kinglear.Act4Scene1", "4|2":"shakespartner.plays.kinglear.Act4Scene2", "4|3":"shakespartner.plays.kinglear.Act4Scene3", "4|4":"shakespartner.plays.kinglear.Act4Scene4", "4|5":"shakespartner.plays.kinglear.Act4Scene5", "4|6":"shakespartner.plays.kinglear.Act4Scene6", "4|7":"shakespartner.plays.kinglear.Act4Scene7", "5|1":"shakespartner.plays.kinglear.Act5Scene1", "5|2":"shakespartner.plays.kinglear.Act5Scene2", "5|3":"shakespartner.plays.kinglear.Act5Scene3"]

   static Map<String,List<String>> characterData = ["kent":["act 1 scene 1", "act 1 scene 4", "act 1 scene 5", "act 2 scene 2", "act 2 scene 4", "act 3 scene 1", "act 3 scene 2", "act 3 scene 4", "act 3 scene 6", "act 4 scene 3", "act 4 scene 7", "act 5 scene 3"], "gloucester":["act 1 scene 1", "act 1 scene 2", "act 2 scene 1", "act 2 scene 2", "act 2 scene 4", "act 3 scene 3", "act 3 scene 4", "act 3 scene 6", "act 3 scene 7", "act 4 scene 1", "act 4 scene 6", "act 5 scene 2"], "edmund":["act 1 scene 1", "act 1 scene 2", "act 2 scene 1", "act 2 scene 2", "act 3 scene 3", "act 3 scene 5", "act 4 scene 2", "act 5 scene 1", "act 5 scene 3"], "king lear":["act 1 scene 1", "act 1 scene 4", "act 1 scene 5", "act 2 scene 4", "act 3 scene 2", "act 3 scene 4", "act 3 scene 6", "act 4 scene 6", "act 4 scene 7", "act 5 scene 3"], "goneril":["act 1 scene 1", "act 1 scene 3", "act 1 scene 4", "act 2 scene 4", "act 3 scene 7", "act 4 scene 2", "act 5 scene 1", "act 5 scene 3"], "cordelia":["act 1 scene 1", "act 4 scene 4", "act 4 scene 7", "act 5 scene 3"], "lear":["act 1 scene 1"], "regan":["act 1 scene 1", "act 2 scene 1", "act 2 scene 2", "act 2 scene 4", "act 3 scene 7", "act 4 scene 5", "act 5 scene 1", "act 5 scene 3"], "cornwall":["act 1 scene 1", "act 2 scene 1", "act 2 scene 2", "act 2 scene 4", "act 3 scene 5", "act 3 scene 7"], "burgundy":["act 1 scene 1"], "king of france":["act 1 scene 1"], "edgar":["act 1 scene 2", "act 2 scene 1", "act 2 scene 3", "act 3 scene 4", "act 3 scene 6", "act 4 scene 1", "act 4 scene 6", "act 5 scene 1", "act 5 scene 2", "act 5 scene 3"], "oswald":["act 1 scene 3", "act 1 scene 4", "act 2 scene 2", "act 3 scene 7", "act 4 scene 2", "act 4 scene 5", "act 4 scene 6"], "knight":["act 1 scene 4"], "fool":["act 1 scene 4", "act 1 scene 5", "act 2 scene 4", "act 3 scene 2", "act 3 scene 4", "act 3 scene 6"], "albany":["act 1 scene 4", "act 4 scene 2", "act 5 scene 1", "act 5 scene 3"], "gentleman":["act 1 scene 5", "act 2 scene 4", "act 3 scene 1", "act 4 scene 3", "act 4 scene 6", "act 4 scene 7", "act 5 scene 3"], "curan":["act 2 scene 1"], "first servant":["act 3 scene 7"], "second servant":["act 3 scene 7"], "third servant":["act 3 scene 7"], "old man":["act 4 scene 1"], "messenger":["act 4 scene 2", "act 4 scene 4"], "doctor":["act 4 scene 4", "act 4 scene 7"], "captain":["act 5 scene 3"], "herald":["act 5 scene 3"]]
}
package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class allswellthatendswell extends Play {
   String getName() {
      "alls well that ends well"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.allswellthatendswell.Act1Scene1", "1|2":"shakespartner.plays.allswellthatendswell.Act1Scene2", "1|3":"shakespartner.plays.allswellthatendswell.Act1Scene3", "2|1":"shakespartner.plays.allswellthatendswell.Act2Scene1", "2|2":"shakespartner.plays.allswellthatendswell.Act2Scene2", "2|3":"shakespartner.plays.allswellthatendswell.Act2Scene3", "2|4":"shakespartner.plays.allswellthatendswell.Act2Scene4", "2|5":"shakespartner.plays.allswellthatendswell.Act2Scene5", "3|1":"shakespartner.plays.allswellthatendswell.Act3Scene1", "3|2":"shakespartner.plays.allswellthatendswell.Act3Scene2", "3|3":"shakespartner.plays.allswellthatendswell.Act3Scene3", "3|4":"shakespartner.plays.allswellthatendswell.Act3Scene4", "3|5":"shakespartner.plays.allswellthatendswell.Act3Scene5", "3|6":"shakespartner.plays.allswellthatendswell.Act3Scene6", "3|7":"shakespartner.plays.allswellthatendswell.Act3Scene7", "4|1":"shakespartner.plays.allswellthatendswell.Act4Scene1", "4|2":"shakespartner.plays.allswellthatendswell.Act4Scene2", "4|3":"shakespartner.plays.allswellthatendswell.Act4Scene3", "4|4":"shakespartner.plays.allswellthatendswell.Act4Scene4", "4|5":"shakespartner.plays.allswellthatendswell.Act4Scene5", "5|1":"shakespartner.plays.allswellthatendswell.Act5Scene1", "5|2":"shakespartner.plays.allswellthatendswell.Act5Scene2", "5|3":"shakespartner.plays.allswellthatendswell.Act5Scene3"]

   static Map<String,List<String>> characterData = ["countess":["act 1 scene 1", "act 1 scene 3", "act 2 scene 2", "act 3 scene 2", "act 3 scene 4", "act 4 scene 5", "act 5 scene 3"], "bertram":["act 1 scene 1", "act 1 scene 2", "act 2 scene 1", "act 2 scene 3", "act 2 scene 5", "act 3 scene 3", "act 3 scene 6", "act 4 scene 2", "act 4 scene 3", "act 5 scene 3"], "lafeu":["act 1 scene 1", "act 2 scene 1", "act 2 scene 3", "act 2 scene 5", "act 4 scene 5", "act 5 scene 2", "act 5 scene 3"], "helena":["act 1 scene 1", "act 1 scene 3", "act 2 scene 1", "act 2 scene 3", "act 2 scene 4", "act 2 scene 5", "act 3 scene 2", "act 3 scene 5", "act 3 scene 7", "act 4 scene 4", "act 5 scene 1", "act 5 scene 3"], "parolles":["act 1 scene 1", "act 2 scene 1", "act 2 scene 3", "act 2 scene 4", "act 2 scene 5", "act 3 scene 5", "act 3 scene 6", "act 4 scene 1", "act 4 scene 3", "act 5 scene 2", "act 5 scene 3"], "page":["act 1 scene 1"], "king":["act 1 scene 2", "act 2 scene 1", "act 2 scene 3", "act 5 scene 3"], "first lord":["act 1 scene 2", "act 2 scene 1", "act 2 scene 3", "act 3 scene 1", "act 3 scene 6", "act 4 scene 3"], "second lord":["act 1 scene 2", "act 2 scene 1", "act 2 scene 3", "act 3 scene 1", "act 3 scene 6", "act 4 scene 1", "act 4 scene 3"], "steward":["act 1 scene 3", "act 3 scene 4"], "clown":["act 1 scene 3", "act 2 scene 2", "act 2 scene 4", "act 3 scene 2", "act 4 scene 5", "act 5 scene 2"], "both":["act 2 scene 1", "act 3 scene 5"], "all":["act 2 scene 3", "act 4 scene 1"], "fourth lord":["act 2 scene 3"], "duke":["act 3 scene 1", "act 3 scene 3"], "first gentleman":["act 3 scene 2"], "second gentleman":["act 3 scene 2"], "widow":["act 3 scene 5", "act 3 scene 7", "act 4 scene 4", "act 5 scene 1", "act 5 scene 3"], "diana":["act 3 scene 5", "act 4 scene 2", "act 4 scene 4", "act 5 scene 3"], "mariana":["act 3 scene 5"], "first soldier":["act 4 scene 1", "act 4 scene 3"], "second soldier":["act 4 scene 1"], "servant":["act 4 scene 3"], "gentleman":["act 5 scene 1", "act 5 scene 3"]]
}
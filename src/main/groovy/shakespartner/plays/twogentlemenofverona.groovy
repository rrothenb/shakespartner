package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class twogentlemenofverona extends Play {
   String getName() {
      "two gentlemen of verona"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.twogentlemenofverona.Act1Scene1", "1|2":"shakespartner.plays.twogentlemenofverona.Act1Scene2", "1|3":"shakespartner.plays.twogentlemenofverona.Act1Scene3", "2|1":"shakespartner.plays.twogentlemenofverona.Act2Scene1", "2|2":"shakespartner.plays.twogentlemenofverona.Act2Scene2", "2|3":"shakespartner.plays.twogentlemenofverona.Act2Scene3", "2|4":"shakespartner.plays.twogentlemenofverona.Act2Scene4", "2|5":"shakespartner.plays.twogentlemenofverona.Act2Scene5", "2|6":"shakespartner.plays.twogentlemenofverona.Act2Scene6", "2|7":"shakespartner.plays.twogentlemenofverona.Act2Scene7", "3|1":"shakespartner.plays.twogentlemenofverona.Act3Scene1", "3|2":"shakespartner.plays.twogentlemenofverona.Act3Scene2", "4|1":"shakespartner.plays.twogentlemenofverona.Act4Scene1", "4|2":"shakespartner.plays.twogentlemenofverona.Act4Scene2", "4|3":"shakespartner.plays.twogentlemenofverona.Act4Scene3", "4|4":"shakespartner.plays.twogentlemenofverona.Act4Scene4", "5|1":"shakespartner.plays.twogentlemenofverona.Act5Scene1", "5|2":"shakespartner.plays.twogentlemenofverona.Act5Scene2", "5|3":"shakespartner.plays.twogentlemenofverona.Act5Scene3", "5|4":"shakespartner.plays.twogentlemenofverona.Act5Scene4"]

   static Map<String,List<String>> characterData = ["valentine":["act 1 scene 1", "act 2 scene 1", "act 2 scene 4", "act 3 scene 1", "act 4 scene 1", "act 5 scene 4"], "proteus":["act 1 scene 1", "act 1 scene 3", "act 2 scene 2", "act 2 scene 4", "act 2 scene 6", "act 3 scene 1", "act 3 scene 2", "act 4 scene 2", "act 4 scene 4", "act 5 scene 2", "act 5 scene 4"], "speed":["act 1 scene 1", "act 2 scene 1", "act 2 scene 4", "act 2 scene 5", "act 3 scene 1", "act 4 scene 1"], "julia":["act 1 scene 2", "act 2 scene 2", "act 2 scene 7", "act 4 scene 2", "act 4 scene 4", "act 5 scene 2", "act 5 scene 4"], "lucetta":["act 1 scene 2", "act 2 scene 7"], "antonio":["act 1 scene 3"], "panthino":["act 1 scene 3", "act 2 scene 2", "act 2 scene 3"], "silvia":["act 2 scene 1", "act 2 scene 4", "act 4 scene 2", "act 4 scene 3", "act 4 scene 4", "act 5 scene 1", "act 5 scene 3", "act 5 scene 4"], "launce":["act 2 scene 3", "act 2 scene 5", "act 3 scene 1", "act 4 scene 4"], "thurio":["act 2 scene 4", "act 3 scene 2", "act 4 scene 2", "act 5 scene 2", "act 5 scene 4"], "duke":["act 2 scene 4", "act 3 scene 1", "act 3 scene 2", "act 5 scene 2", "act 5 scene 4"], "first outlaw":["act 4 scene 1", "act 5 scene 3"], "second outlaw":["act 4 scene 1", "act 5 scene 3"], "third outlaw":["act 4 scene 1", "act 5 scene 3"], "host":["act 4 scene 2"], "eglamour":["act 4 scene 3", "act 5 scene 1"], "outlaws":["act 5 scene 4"]]
}
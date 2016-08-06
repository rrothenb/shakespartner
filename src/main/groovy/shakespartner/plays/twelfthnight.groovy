package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class twelfthnight extends Play {
   String getName() {
      "twelfth night"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.twelfthnight.Act1Scene1", "1|2":"shakespartner.plays.twelfthnight.Act1Scene2", "1|3":"shakespartner.plays.twelfthnight.Act1Scene3", "1|4":"shakespartner.plays.twelfthnight.Act1Scene4", "1|5":"shakespartner.plays.twelfthnight.Act1Scene5", "2|1":"shakespartner.plays.twelfthnight.Act2Scene1", "2|2":"shakespartner.plays.twelfthnight.Act2Scene2", "2|3":"shakespartner.plays.twelfthnight.Act2Scene3", "2|4":"shakespartner.plays.twelfthnight.Act2Scene4", "2|5":"shakespartner.plays.twelfthnight.Act2Scene5", "3|1":"shakespartner.plays.twelfthnight.Act3Scene1", "3|2":"shakespartner.plays.twelfthnight.Act3Scene2", "3|3":"shakespartner.plays.twelfthnight.Act3Scene3", "3|4":"shakespartner.plays.twelfthnight.Act3Scene4", "4|1":"shakespartner.plays.twelfthnight.Act4Scene1", "4|2":"shakespartner.plays.twelfthnight.Act4Scene2", "4|3":"shakespartner.plays.twelfthnight.Act4Scene3", "5|1":"shakespartner.plays.twelfthnight.Act5Scene1"]

   static Map<String,List<String>> characterData = ["duke orsino":["act 1 scene 1", "act 1 scene 4", "act 2 scene 4", "act 5 scene 1"], "curio":["act 1 scene 1", "act 2 scene 4"], "valentine":["act 1 scene 1", "act 1 scene 4"], "viola":["act 1 scene 2", "act 1 scene 4", "act 1 scene 5", "act 2 scene 2", "act 2 scene 4", "act 3 scene 1", "act 3 scene 4", "act 5 scene 1"], "captain":["act 1 scene 2"], "sir toby belch":["act 1 scene 3", "act 1 scene 5", "act 2 scene 3", "act 2 scene 5", "act 3 scene 1", "act 3 scene 2", "act 3 scene 4", "act 4 scene 1", "act 4 scene 2", "act 5 scene 1"], "maria":["act 1 scene 3", "act 1 scene 5", "act 2 scene 3", "act 2 scene 5", "act 3 scene 2", "act 3 scene 4", "act 4 scene 2"], "sir andrew":["act 1 scene 3", "act 2 scene 3", "act 2 scene 5", "act 3 scene 1", "act 3 scene 2", "act 3 scene 4", "act 4 scene 1", "act 5 scene 1"], "clown":["act 1 scene 5", "act 2 scene 3", "act 2 scene 4", "act 3 scene 1", "act 4 scene 1", "act 4 scene 2", "act 5 scene 1"], "olivia":["act 1 scene 5", "act 3 scene 1", "act 3 scene 4", "act 4 scene 1", "act 4 scene 3", "act 5 scene 1"], "malvolio":["act 1 scene 5", "act 2 scene 2", "act 2 scene 3", "act 2 scene 5", "act 3 scene 4", "act 4 scene 2", "act 5 scene 1"], "antonio":["act 2 scene 1", "act 3 scene 3", "act 3 scene 4", "act 5 scene 1"], "sebastian":["act 2 scene 1", "act 3 scene 3", "act 4 scene 1", "act 4 scene 3", "act 5 scene 1"], "fabian":["act 2 scene 5", "act 3 scene 2", "act 3 scene 4", "act 5 scene 1"], "servant":["act 3 scene 4"], "first officer":["act 3 scene 4", "act 5 scene 1"], "second officer":["act 3 scene 4"], "priest":["act 5 scene 1"]]
}
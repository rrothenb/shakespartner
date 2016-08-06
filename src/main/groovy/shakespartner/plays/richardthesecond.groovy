package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class richardthesecond extends Play {
   String getName() {
      "richard the second"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.richardthesecond.Act1Scene1", "1|2":"shakespartner.plays.richardthesecond.Act1Scene2", "1|3":"shakespartner.plays.richardthesecond.Act1Scene3", "1|4":"shakespartner.plays.richardthesecond.Act1Scene4", "2|1":"shakespartner.plays.richardthesecond.Act2Scene1", "2|2":"shakespartner.plays.richardthesecond.Act2Scene2", "2|3":"shakespartner.plays.richardthesecond.Act2Scene3", "2|4":"shakespartner.plays.richardthesecond.Act2Scene4", "3|1":"shakespartner.plays.richardthesecond.Act3Scene1", "3|2":"shakespartner.plays.richardthesecond.Act3Scene2", "3|3":"shakespartner.plays.richardthesecond.Act3Scene3", "3|4":"shakespartner.plays.richardthesecond.Act3Scene4", "4|1":"shakespartner.plays.richardthesecond.Act4Scene1", "5|1":"shakespartner.plays.richardthesecond.Act5Scene1", "5|2":"shakespartner.plays.richardthesecond.Act5Scene2", "5|3":"shakespartner.plays.richardthesecond.Act5Scene3", "5|4":"shakespartner.plays.richardthesecond.Act5Scene4", "5|5":"shakespartner.plays.richardthesecond.Act5Scene5", "5|6":"shakespartner.plays.richardthesecond.Act5Scene6"]

   static Map<String,List<String>> characterData = ["king richard the second":["act 1 scene 1", "act 1 scene 3", "act 1 scene 4", "act 2 scene 1", "act 3 scene 2", "act 3 scene 3", "act 4 scene 1", "act 5 scene 1", "act 5 scene 5"], "john of gaunt":["act 1 scene 1", "act 1 scene 2", "act 1 scene 3", "act 2 scene 1"], "henry bolingbroke":["act 1 scene 1", "act 1 scene 3", "act 2 scene 3", "act 3 scene 1", "act 3 scene 3", "act 4 scene 1", "act 5 scene 3", "act 5 scene 6"], "thomas mowbray":["act 1 scene 1", "act 1 scene 3"], "duchess":["act 1 scene 2"], "lord marshal":["act 1 scene 3"], "duke of aumerle":["act 1 scene 3", "act 1 scene 4", "act 3 scene 2", "act 3 scene 3", "act 4 scene 1", "act 5 scene 2", "act 5 scene 3"], "first herald":["act 1 scene 3"], "second herald":["act 1 scene 3"], "green":["act 1 scene 4", "act 2 scene 2", "act 3 scene 1"], "bushy":["act 1 scene 4", "act 2 scene 2", "act 3 scene 1"], "all":["act 1 scene 4"], "duke of york":["act 2 scene 1", "act 2 scene 2", "act 2 scene 3", "act 3 scene 1", "act 3 scene 3", "act 4 scene 1", "act 5 scene 2", "act 5 scene 3"], "queen":["act 2 scene 1", "act 2 scene 2", "act 3 scene 4", "act 5 scene 1"], "northumberland":["act 2 scene 1", "act 2 scene 3", "act 3 scene 3", "act 4 scene 1", "act 5 scene 1", "act 5 scene 6"], "lord ross":["act 2 scene 1", "act 2 scene 3"], "lord willoughby":["act 2 scene 1", "act 2 scene 3"], "servant":["act 2 scene 2", "act 3 scene 4", "act 5 scene 4"], "bagot":["act 2 scene 2", "act 4 scene 1"], "henry percy":["act 2 scene 3", "act 3 scene 3", "act 4 scene 1", "act 5 scene 3", "act 5 scene 6"], "lord berkeley":["act 2 scene 3"], "captain":["act 2 scene 4"], "earl of salisbury":["act 2 scene 4", "act 3 scene 2"], "bishop of carlisle":["act 3 scene 2", "act 4 scene 1"], "sir stephen scroop":["act 3 scene 2"], "lady":["act 3 scene 4"], "gardener":["act 3 scene 4"], "lord fitzwater":["act 4 scene 1", "act 5 scene 6"], "lord":["act 4 scene 1"], "duke of surrey":["act 4 scene 1"], "abbot":["act 4 scene 1"], "duchess of york":["act 5 scene 2", "act 5 scene 3"], "exton":["act 5 scene 4", "act 5 scene 5", "act 5 scene 6"], "groom":["act 5 scene 5"], "keeper":["act 5 scene 5"]]
}
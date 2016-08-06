package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class othello extends Play {
   String getName() {
      "othello"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.othello.Act1Scene1", "1|2":"shakespartner.plays.othello.Act1Scene2", "1|3":"shakespartner.plays.othello.Act1Scene3", "2|1":"shakespartner.plays.othello.Act2Scene1", "2|2":"shakespartner.plays.othello.Act2Scene2", "2|3":"shakespartner.plays.othello.Act2Scene3", "3|1":"shakespartner.plays.othello.Act3Scene1", "3|2":"shakespartner.plays.othello.Act3Scene2", "3|3":"shakespartner.plays.othello.Act3Scene3", "3|4":"shakespartner.plays.othello.Act3Scene4", "4|1":"shakespartner.plays.othello.Act4Scene1", "4|2":"shakespartner.plays.othello.Act4Scene2", "4|3":"shakespartner.plays.othello.Act4Scene3", "5|1":"shakespartner.plays.othello.Act5Scene1", "5|2":"shakespartner.plays.othello.Act5Scene2"]

   static Map<String,List<String>> characterData = ["roderigo":["act 1 scene 1", "act 1 scene 2", "act 1 scene 3", "act 2 scene 1", "act 2 scene 3", "act 4 scene 2", "act 5 scene 1"], "iago":["act 1 scene 1", "act 1 scene 2", "act 1 scene 3", "act 2 scene 1", "act 2 scene 3", "act 3 scene 1", "act 3 scene 2", "act 3 scene 3", "act 3 scene 4", "act 4 scene 1", "act 4 scene 2", "act 5 scene 1", "act 5 scene 2"], "brabantio":["act 1 scene 1", "act 1 scene 2", "act 1 scene 3"], "othello":["act 1 scene 2", "act 1 scene 3", "act 2 scene 1", "act 2 scene 3", "act 3 scene 2", "act 3 scene 3", "act 3 scene 4", "act 4 scene 1", "act 4 scene 2", "act 4 scene 3", "act 5 scene 1", "act 5 scene 2"], "cassio":["act 1 scene 2", "act 2 scene 1", "act 2 scene 3", "act 3 scene 1", "act 3 scene 3", "act 3 scene 4", "act 4 scene 1", "act 5 scene 1", "act 5 scene 2"], "first officer":["act 1 scene 2", "act 1 scene 3"], "duke of venice":["act 1 scene 3"], "first senator":["act 1 scene 3"], "second senator":["act 1 scene 3"], "sailor":["act 1 scene 3"], "messenger":["act 1 scene 3"], "senator":["act 1 scene 3"], "desdemona":["act 1 scene 3", "act 2 scene 1", "act 2 scene 3", "act 3 scene 3", "act 3 scene 4", "act 4 scene 1", "act 4 scene 2", "act 4 scene 3", "act 5 scene 2"], "montano":["act 2 scene 1", "act 2 scene 3", "act 5 scene 2"], "first gentleman":["act 2 scene 1"], "second gentleman":["act 2 scene 1"], "third gentleman":["act 2 scene 1"], "fourth gentleman":["act 2 scene 1"], "second gentlemen":["act 2 scene 1"], "emilia":["act 2 scene 1", "act 3 scene 1", "act 3 scene 3", "act 3 scene 4", "act 4 scene 2", "act 4 scene 3", "act 5 scene 1", "act 5 scene 2"], "herald":["act 2 scene 2"], "all":["act 2 scene 3", "act 5 scene 2"], "clown":["act 3 scene 1", "act 3 scene 4"], "first musician":["act 3 scene 1"], "gentleman":["act 3 scene 2"], "bianca":["act 3 scene 4", "act 4 scene 1", "act 5 scene 1"], "lodovico":["act 4 scene 1", "act 4 scene 3", "act 5 scene 1", "act 5 scene 2"], "gratiano":["act 5 scene 1", "act 5 scene 2"]]
}
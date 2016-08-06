package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class romeoandjuliet extends Play {
   String getName() {
      "romeo and juliet"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.romeoandjuliet.Act1Scene1", "1|2":"shakespartner.plays.romeoandjuliet.Act1Scene2", "1|3":"shakespartner.plays.romeoandjuliet.Act1Scene3", "1|4":"shakespartner.plays.romeoandjuliet.Act1Scene4", "1|5":"shakespartner.plays.romeoandjuliet.Act1Scene5", "2|1":"shakespartner.plays.romeoandjuliet.Act2Scene1", "2|2":"shakespartner.plays.romeoandjuliet.Act2Scene2", "2|3":"shakespartner.plays.romeoandjuliet.Act2Scene3", "2|4":"shakespartner.plays.romeoandjuliet.Act2Scene4", "2|5":"shakespartner.plays.romeoandjuliet.Act2Scene5", "2|6":"shakespartner.plays.romeoandjuliet.Act2Scene6", "3|1":"shakespartner.plays.romeoandjuliet.Act3Scene1", "3|2":"shakespartner.plays.romeoandjuliet.Act3Scene2", "3|3":"shakespartner.plays.romeoandjuliet.Act3Scene3", "3|4":"shakespartner.plays.romeoandjuliet.Act3Scene4", "3|5":"shakespartner.plays.romeoandjuliet.Act3Scene5", "4|1":"shakespartner.plays.romeoandjuliet.Act4Scene1", "4|2":"shakespartner.plays.romeoandjuliet.Act4Scene2", "4|3":"shakespartner.plays.romeoandjuliet.Act4Scene3", "4|4":"shakespartner.plays.romeoandjuliet.Act4Scene4", "4|5":"shakespartner.plays.romeoandjuliet.Act4Scene5", "5|1":"shakespartner.plays.romeoandjuliet.Act5Scene1", "5|2":"shakespartner.plays.romeoandjuliet.Act5Scene2", "5|3":"shakespartner.plays.romeoandjuliet.Act5Scene3"]

   static Map<String,List<String>> characterData = ["sampson":["act 1 scene 1"], "gregory":["act 1 scene 1"], "abraham":["act 1 scene 1"], "benvolio":["act 1 scene 1", "act 1 scene 2", "act 1 scene 4", "act 1 scene 5", "act 2 scene 1", "act 2 scene 4", "act 3 scene 1"], "tybalt":["act 1 scene 1", "act 1 scene 5", "act 3 scene 1"], "first citizen":["act 1 scene 1", "act 3 scene 1"], "capulet":["act 1 scene 1", "act 1 scene 2", "act 1 scene 5", "act 3 scene 4", "act 3 scene 5", "act 4 scene 2", "act 4 scene 4", "act 4 scene 5", "act 5 scene 3"], "lady capulet":["act 1 scene 1", "act 1 scene 3", "act 3 scene 1", "act 3 scene 4", "act 3 scene 5", "act 4 scene 2", "act 4 scene 3", "act 4 scene 4", "act 4 scene 5", "act 5 scene 3"], "montague":["act 1 scene 1", "act 3 scene 1", "act 5 scene 3"], "lady montague":["act 1 scene 1"], "prince":["act 1 scene 1", "act 3 scene 1", "act 5 scene 3"], "romeo":["act 1 scene 1", "act 1 scene 2", "act 1 scene 4", "act 1 scene 5", "act 2 scene 1", "act 2 scene 2", "act 2 scene 3", "act 2 scene 4", "act 2 scene 6", "act 3 scene 1", "act 3 scene 3", "act 3 scene 5", "act 5 scene 1", "act 5 scene 3"], "paris":["act 1 scene 2", "act 3 scene 4", "act 4 scene 1", "act 4 scene 5", "act 5 scene 3"], "servant":["act 1 scene 2", "act 1 scene 3", "act 1 scene 5"], "nurse":["act 1 scene 3", "act 1 scene 5", "act 2 scene 2", "act 2 scene 4", "act 2 scene 5", "act 3 scene 2", "act 3 scene 3", "act 3 scene 5", "act 4 scene 2", "act 4 scene 4", "act 4 scene 5"], "juliet":["act 1 scene 3", "act 1 scene 5", "act 2 scene 2", "act 2 scene 5", "act 2 scene 6", "act 3 scene 2", "act 3 scene 5", "act 4 scene 1", "act 4 scene 2", "act 4 scene 3", "act 5 scene 3"], "mercutio":["act 1 scene 4", "act 2 scene 1", "act 2 scene 4", "act 3 scene 1"], "first servant":["act 1 scene 5", "act 4 scene 4"], "second servant":["act 1 scene 5", "act 4 scene 2", "act 4 scene 4"], "second capulet":["act 1 scene 5"], "chorus":["act 2 scene 5"], "friar laurence":["act 2 scene 3", "act 2 scene 6", "act 3 scene 3", "act 4 scene 1", "act 4 scene 5", "act 5 scene 2", "act 5 scene 3"], "peter":["act 2 scene 4", "act 4 scene 5"], "lady  capulet":["act 4 scene 2"], "first musician":["act 4 scene 5"], "second musician":["act 4 scene 5"], "musician":["act 4 scene 5"], "third musician":["act 4 scene 5"], "balthasar":["act 5 scene 1", "act 5 scene 3"], "apothecary":["act 5 scene 1"], "friar john":["act 5 scene 2"], "page":["act 5 scene 3"], "first watchman":["act 5 scene 3"], "second watchman":["act 5 scene 3"], "third watchman":["act 5 scene 3"]]
}
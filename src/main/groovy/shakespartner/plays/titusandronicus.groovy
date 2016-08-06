package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class titusandronicus extends Play {
   String getName() {
      "titus andronicus"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.titusandronicus.Act1Scene1", "2|1":"shakespartner.plays.titusandronicus.Act2Scene1", "2|2":"shakespartner.plays.titusandronicus.Act2Scene2", "2|3":"shakespartner.plays.titusandronicus.Act2Scene3", "2|4":"shakespartner.plays.titusandronicus.Act2Scene4", "3|1":"shakespartner.plays.titusandronicus.Act3Scene1", "3|2":"shakespartner.plays.titusandronicus.Act3Scene2", "4|1":"shakespartner.plays.titusandronicus.Act4Scene1", "4|2":"shakespartner.plays.titusandronicus.Act4Scene2", "4|3":"shakespartner.plays.titusandronicus.Act4Scene3", "4|4":"shakespartner.plays.titusandronicus.Act4Scene4", "5|1":"shakespartner.plays.titusandronicus.Act5Scene1", "5|2":"shakespartner.plays.titusandronicus.Act5Scene2", "5|3":"shakespartner.plays.titusandronicus.Act5Scene3"]

   static Map<String,List<String>> characterData = ["saturninus":["act 1 scene 1", "act 2 scene 2", "act 2 scene 3", "act 4 scene 4", "act 5 scene 3"], "bassianus":["act 1 scene 1", "act 2 scene 2", "act 2 scene 3"], "marcus andronicus":["act 1 scene 1", "act 2 scene 2", "act 3 scene 1", "act 3 scene 2", "act 4 scene 1", "act 4 scene 3", "act 5 scene 2", "act 5 scene 3"], "captain":["act 1 scene 1"], "titus andronicus":["act 1 scene 1", "act 2 scene 2", "act 2 scene 3", "act 3 scene 1", "act 3 scene 2", "act 4 scene 1", "act 4 scene 3", "act 5 scene 2", "act 5 scene 3"], "lucius":["act 1 scene 1", "act 3 scene 1", "act 5 scene 1", "act 5 scene 3"], "tamora":["act 1 scene 1", "act 2 scene 3", "act 4 scene 4", "act 5 scene 2", "act 5 scene 3"], "chiron":["act 1 scene 1", "act 2 scene 1", "act 2 scene 3", "act 2 scene 4", "act 4 scene 2", "act 5 scene 2"], "demetrius":["act 1 scene 1", "act 2 scene 1", "act 2 scene 2", "act 2 scene 3", "act 2 scene 4", "act 4 scene 2", "act 5 scene 2"], "lavinia":["act 1 scene 1", "act 2 scene 2", "act 2 scene 3"], "tribunes":["act 1 scene 1"], "mutius":["act 1 scene 1"], "martius":["act 1 scene 1", "act 2 scene 3"], "quintus":["act 1 scene 1", "act 2 scene 3"], "all":["act 1 scene 1", "act 5 scene 3"], "aaron":["act 2 scene 1", "act 2 scene 3", "act 3 scene 1", "act 4 scene 2", "act 5 scene 1", "act 5 scene 3"], "marcus":["act 2 scene 4"], "messenger":["act 3 scene 1"], "young lucius":["act 3 scene 2", "act 4 scene 1", "act 4 scene 2", "act 5 scene 3"], "nurse":["act 4 scene 2"], "publius":["act 4 scene 3", "act 5 scene 2"], "clown":["act 4 scene 3", "act 4 scene 4"], "aemilius":["act 4 scene 4", "act 5 scene 1", "act 5 scene 3"], "first goth":["act 5 scene 1", "act 5 scene 3"], "all the goths":["act 5 scene 1"], "second goth":["act 5 scene 1"], "third goth":["act 5 scene 1"]]
}
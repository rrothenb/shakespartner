package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class pericles extends Play {
   String getName() {
      "pericles"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.pericles.Act1Scene1", "1|2":"shakespartner.plays.pericles.Act1Scene2", "1|3":"shakespartner.plays.pericles.Act1Scene3", "1|4":"shakespartner.plays.pericles.Act1Scene4", "2|1":"shakespartner.plays.pericles.Act2Scene1", "2|2":"shakespartner.plays.pericles.Act2Scene2", "2|3":"shakespartner.plays.pericles.Act2Scene3", "2|4":"shakespartner.plays.pericles.Act2Scene4", "2|5":"shakespartner.plays.pericles.Act2Scene5", "3|1":"shakespartner.plays.pericles.Act3Scene1", "3|2":"shakespartner.plays.pericles.Act3Scene2", "3|3":"shakespartner.plays.pericles.Act3Scene3", "3|4":"shakespartner.plays.pericles.Act3Scene4", "4|1":"shakespartner.plays.pericles.Act4Scene1", "4|2":"shakespartner.plays.pericles.Act4Scene2", "4|3":"shakespartner.plays.pericles.Act4Scene3", "4|4":"shakespartner.plays.pericles.Act4Scene4", "4|5":"shakespartner.plays.pericles.Act4Scene5", "4|6":"shakespartner.plays.pericles.Act4Scene6", "5|1":"shakespartner.plays.pericles.Act5Scene1", "5|2":"shakespartner.plays.pericles.Act5Scene2", "5|3":"shakespartner.plays.pericles.Act5Scene3"]

   static Map<String,List<String>> characterData = ["antiochus":["act 1 scene 1"], "pericles":["act 1 scene 1", "act 1 scene 2", "act 1 scene 4", "act 2 scene 1", "act 2 scene 3", "act 2 scene 5", "act 3 scene 1", "act 3 scene 3", "act 5 scene 1", "act 5 scene 3"], "daughter":["act 1 scene 1"], "thaliard":["act 1 scene 1", "act 1 scene 3"], "messenger":["act 1 scene 1"], "first lord":["act 1 scene 2", "act 2 scene 2", "act 2 scene 4", "act 5 scene 1"], "second lord":["act 1 scene 2", "act 2 scene 2", "act 2 scene 4"], "helicanus":["act 1 scene 2", "act 1 scene 3", "act 2 scene 4", "act 5 scene 1", "act 5 scene 3"], "cleon":["act 1 scene 4", "act 3 scene 3", "act 4 scene 3"], "dionyza":["act 1 scene 4", "act 3 scene 3", "act 4 scene 1", "act 4 scene 3"], "lord":["act 1 scene 4"], "all":["act 1 scene 4", "act 2 scene 4"], "gower":["act 2 scene 4", "act 3 scene 5", "act 4 scene 4", "act 5 scene 2", "act 5 scene 3", "act 5 scene 6"], "first fisherman":["act 2 scene 1"], "second fisherman":["act 2 scene 1"], "third fisherman":["act 2 scene 1"], "simonides":["act 2 scene 2", "act 2 scene 3", "act 2 scene 5"], "thaisa":["act 2 scene 2", "act 2 scene 3", "act 2 scene 5", "act 3 scene 2", "act 3 scene 4", "act 5 scene 3"], "third lord":["act 2 scene 2", "act 2 scene 4"], "knights":["act 2 scene 3"], "marshal":["act 2 scene 3"], "first knight":["act 2 scene 3", "act 2 scene 5"], "escanes":["act 2 scene 4"], "second knight":["act 2 scene 5"], "third knight":["act 2 scene 5"], "both":["act 2 scene 5"], "lychorida":["act 3 scene 1"], "first sailor":["act 3 scene 1"], "second sailor":["act 3 scene 1"], "cerimon":["act 3 scene 2", "act 3 scene 4", "act 5 scene 3"], "philemon":["act 3 scene 2"], "servant":["act 3 scene 2"], "first gentleman":["act 3 scene 2", "act 4 scene 5", "act 5 scene 1"], "second gentleman":["act 3 scene 2", "act 4 scene 5"], "first servant":["act 3 scene 2"], "leonine":["act 4 scene 1"], "marina":["act 4 scene 1", "act 4 scene 2", "act 4 scene 6", "act 5 scene 1", "act 5 scene 3"], "first pirate":["act 4 scene 1", "act 4 scene 2"], "second pirate":["act 4 scene 1"], "third pirate":["act 4 scene 1"], "pandar":["act 4 scene 2", "act 4 scene 6"], "boult":["act 4 scene 2", "act 4 scene 6"], "bawd":["act 4 scene 2", "act 4 scene 6"], "lysimachus":["act 4 scene 6", "act 5 scene 1"], "tyrian sailor":["act 5 scene 1"], "diana":["act 5 scene 1"]]
}
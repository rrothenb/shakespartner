package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class henryv extends Play {
   String getName() {
      "henry v"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.henryv.Act1Scene1", "1|2":"shakespartner.plays.henryv.Act1Scene2", "2|1":"shakespartner.plays.henryv.Act2Scene1", "2|2":"shakespartner.plays.henryv.Act2Scene2", "2|3":"shakespartner.plays.henryv.Act2Scene3", "2|4":"shakespartner.plays.henryv.Act2Scene4", "3|1":"shakespartner.plays.henryv.Act3Scene1", "3|2":"shakespartner.plays.henryv.Act3Scene2", "3|3":"shakespartner.plays.henryv.Act3Scene3", "3|4":"shakespartner.plays.henryv.Act3Scene4", "3|5":"shakespartner.plays.henryv.Act3Scene5", "3|6":"shakespartner.plays.henryv.Act3Scene6", "3|7":"shakespartner.plays.henryv.Act3Scene7", "4|1":"shakespartner.plays.henryv.Act4Scene1", "4|2":"shakespartner.plays.henryv.Act4Scene2", "4|3":"shakespartner.plays.henryv.Act4Scene3", "4|4":"shakespartner.plays.henryv.Act4Scene4", "4|5":"shakespartner.plays.henryv.Act4Scene5", "4|6":"shakespartner.plays.henryv.Act4Scene6", "4|7":"shakespartner.plays.henryv.Act4Scene7", "4|8":"shakespartner.plays.henryv.Act4Scene8", "5|1":"shakespartner.plays.henryv.Act5Scene1", "5|2":"shakespartner.plays.henryv.Act5Scene2"]

   static Map<String,List<String>> characterData = ["chorus":["act 1 scene 2", "act 2 scene 2", "act 3 scene 4", "act 4 scene 7", "act 5 scene 2", "act 5 scene 8"], "canterbury":["act 1 scene 1", "act 1 scene 2"], "ely":["act 1 scene 1", "act 1 scene 2"], "king henry v":["act 1 scene 2", "act 2 scene 2", "act 3 scene 1", "act 3 scene 3", "act 3 scene 6", "act 4 scene 1", "act 4 scene 3", "act 4 scene 6", "act 4 scene 7", "act 4 scene 8", "act 5 scene 2"], "exeter":["act 1 scene 2", "act 2 scene 2", "act 2 scene 4", "act 4 scene 3", "act 4 scene 6", "act 4 scene 7", "act 4 scene 8", "act 5 scene 2"], "westmoreland":["act 1 scene 2", "act 2 scene 2", "act 4 scene 3", "act 5 scene 2"], "first ambassador":["act 1 scene 2"], "bardolph":["act 2 scene 1", "act 2 scene 3", "act 3 scene 2"], "nym":["act 2 scene 1", "act 2 scene 3", "act 3 scene 2"], "pistol":["act 2 scene 1", "act 2 scene 3", "act 3 scene 2", "act 3 scene 6", "act 4 scene 1", "act 4 scene 4", "act 5 scene 1"], "hostess":["act 2 scene 1", "act 2 scene 3"], "boy":["act 2 scene 1", "act 2 scene 3", "act 3 scene 2", "act 4 scene 4"], "bedford":["act 2 scene 2", "act 4 scene 3"], "scroop":["act 2 scene 2"], "cambridge":["act 2 scene 2"], "grey":["act 2 scene 2"], "king of france":["act 2 scene 4", "act 3 scene 5", "act 5 scene 2"], "dauphin":["act 2 scene 4", "act 3 scene 5", "act 3 scene 7", "act 4 scene 2", "act 4 scene 5"], "constable":["act 2 scene 4", "act 3 scene 5", "act 3 scene 7", "act 4 scene 2", "act 4 scene 5"], "messenger":["act 2 scene 4", "act 3 scene 7", "act 4 scene 2"], "fluellen":["act 3 scene 2", "act 3 scene 6", "act 4 scene 1", "act 4 scene 7", "act 4 scene 8", "act 5 scene 1"], "gower":["act 3 scene 2", "act 3 scene 6", "act 4 scene 1", "act 4 scene 7", "act 4 scene 8", "act 5 scene 1"], "jamy":["act 3 scene 2"], "macmorris":["act 3 scene 2"], "governor":["act 3 scene 3"], "katharine":["act 3 scene 4", "act 5 scene 2"], "alice":["act 3 scene 4", "act 5 scene 2"], "bourbon":["act 3 scene 5", "act 4 scene 5"], "montjoy":["act 3 scene 6", "act 4 scene 3", "act 4 scene 7"], "gloucester":["act 3 scene 6", "act 4 scene 1", "act 4 scene 3", "act 4 scene 7"], "orleans":["act 3 scene 7", "act 4 scene 2", "act 4 scene 5"], "rambures":["act 3 scene 7", "act 4 scene 2"], "erpingham":["act 4 scene 1"], "court":["act 4 scene 1"], "bates":["act 4 scene 1"], "williams":["act 4 scene 1", "act 4 scene 7", "act 4 scene 8"], "grandpre":["act 4 scene 2"], "salisbury":["act 4 scene 3"], "york":["act 4 scene 3"], "french soldier":["act 4 scene 4"], "warwick":["act 4 scene 8"], "herald":["act 4 scene 8"], "queen isabel":["act 5 scene 2"], "burgundy":["act 5 scene 2"], "french king":["act 5 scene 2"], "all":["act 5 scene 2"]]
}
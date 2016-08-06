package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class merchantofvenice extends Play {
   String getName() {
      "merchant of venice"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.merchantofvenice.Act1Scene1", "1|2":"shakespartner.plays.merchantofvenice.Act1Scene2", "1|3":"shakespartner.plays.merchantofvenice.Act1Scene3", "2|1":"shakespartner.plays.merchantofvenice.Act2Scene1", "2|2":"shakespartner.plays.merchantofvenice.Act2Scene2", "2|3":"shakespartner.plays.merchantofvenice.Act2Scene3", "2|4":"shakespartner.plays.merchantofvenice.Act2Scene4", "2|5":"shakespartner.plays.merchantofvenice.Act2Scene5", "2|6":"shakespartner.plays.merchantofvenice.Act2Scene6", "2|7":"shakespartner.plays.merchantofvenice.Act2Scene7", "2|8":"shakespartner.plays.merchantofvenice.Act2Scene8", "2|9":"shakespartner.plays.merchantofvenice.Act2Scene9", "3|1":"shakespartner.plays.merchantofvenice.Act3Scene1", "3|2":"shakespartner.plays.merchantofvenice.Act3Scene2", "3|3":"shakespartner.plays.merchantofvenice.Act3Scene3", "3|4":"shakespartner.plays.merchantofvenice.Act3Scene4", "3|5":"shakespartner.plays.merchantofvenice.Act3Scene5", "4|1":"shakespartner.plays.merchantofvenice.Act4Scene1", "4|2":"shakespartner.plays.merchantofvenice.Act4Scene2", "5|1":"shakespartner.plays.merchantofvenice.Act5Scene1"]

   static Map<String,List<String>> characterData = ["antonio":["act 1 scene 1", "act 1 scene 3", "act 2 scene 6", "act 3 scene 3", "act 4 scene 1", "act 5 scene 1"], "salarino":["act 1 scene 1", "act 2 scene 4", "act 2 scene 6", "act 2 scene 8", "act 3 scene 1", "act 3 scene 3"], "salanio":["act 1 scene 1", "act 2 scene 4", "act 2 scene 8", "act 3 scene 1"], "bassanio":["act 1 scene 1", "act 1 scene 3", "act 2 scene 2", "act 3 scene 2", "act 4 scene 1", "act 5 scene 1"], "lorenzo":["act 1 scene 1", "act 2 scene 4", "act 2 scene 6", "act 3 scene 2", "act 3 scene 4", "act 3 scene 5", "act 5 scene 1"], "gratiano":["act 1 scene 1", "act 2 scene 2", "act 2 scene 4", "act 2 scene 6", "act 3 scene 2", "act 4 scene 1", "act 4 scene 2", "act 5 scene 1"], "portia":["act 1 scene 2", "act 2 scene 1", "act 2 scene 7", "act 2 scene 9", "act 3 scene 2", "act 3 scene 4", "act 4 scene 1", "act 4 scene 2", "act 5 scene 1"], "nerissa":["act 1 scene 2", "act 2 scene 9", "act 3 scene 2", "act 3 scene 4", "act 4 scene 1", "act 4 scene 2", "act 5 scene 1"], "servant":["act 1 scene 2", "act 2 scene 9", "act 3 scene 1"], "shylock":["act 1 scene 3", "act 2 scene 5", "act 3 scene 1", "act 3 scene 3", "act 4 scene 1"], "morocco":["act 2 scene 1", "act 2 scene 7"], "launcelot":["act 2 scene 2", "act 2 scene 3", "act 2 scene 4", "act 2 scene 5", "act 3 scene 5", "act 5 scene 1"], "gobbo":["act 2 scene 2"], "leonardo":["act 2 scene 2"], "jessica":["act 2 scene 3", "act 2 scene 5", "act 2 scene 6", "act 3 scene 2", "act 3 scene 4", "act 3 scene 5", "act 5 scene 1"], "arragon":["act 2 scene 9"], "tubal":["act 3 scene 1"], "all":["act 3 scene 2"], "salerio":["act 3 scene 2", "act 4 scene 1"], "balthasar":["act 3 scene 4"], "duke":["act 4 scene 1"], "clerk":["act 4 scene 1"], "stephano":["act 5 scene 1"]]
}
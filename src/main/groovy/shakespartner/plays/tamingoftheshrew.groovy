package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class tamingoftheshrew extends Play {
   String getName() {
      "taming of the shrew"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["5|1":"shakespartner.plays.tamingoftheshrew.Act5Scene1", "5|2":"shakespartner.plays.tamingoftheshrew.Act5Scene2", "1|1":"shakespartner.plays.tamingoftheshrew.Act1Scene1", "1|2":"shakespartner.plays.tamingoftheshrew.Act1Scene2", "2|1":"shakespartner.plays.tamingoftheshrew.Act2Scene1", "3|1":"shakespartner.plays.tamingoftheshrew.Act3Scene1", "3|2":"shakespartner.plays.tamingoftheshrew.Act3Scene2", "4|1":"shakespartner.plays.tamingoftheshrew.Act4Scene1", "4|2":"shakespartner.plays.tamingoftheshrew.Act4Scene2", "4|3":"shakespartner.plays.tamingoftheshrew.Act4Scene3", "4|4":"shakespartner.plays.tamingoftheshrew.Act4Scene4", "4|5":"shakespartner.plays.tamingoftheshrew.Act4Scene5"]

   static Map<String,List<String>> characterData = ["sly":["act 1 scene 1", "act 5 scene 1", "act 5 scene 2"], "hostess":["act 5 scene 1"], "lord":["act 5 scene 1", "act 5 scene 2"], "first huntsman":["act 5 scene 1"], "second huntsman":["act 5 scene 1"], "servant":["act 3 scene 1", "act 5 scene 1"], "players":["act 5 scene 1"], "a player":["act 5 scene 1"], "first servant":["act 1 scene 1", "act 4 scene 1", "act 5 scene 2"], "second servant":["act 5 scene 2"], "third servant":["act 5 scene 2"], "all":["act 5 scene 2"], "page":["act 1 scene 1", "act 5 scene 2"], "messenger":["act 5 scene 2"], "lucentio":["act 1 scene 1", "act 1 scene 2", "act 3 scene 1", "act 3 scene 2", "act 4 scene 2", "act 4 scene 4", "act 5 scene 1", "act 5 scene 2"], "tranio":["act 1 scene 1", "act 1 scene 2", "act 2 scene 1", "act 3 scene 2", "act 4 scene 2", "act 4 scene 4", "act 5 scene 1", "act 5 scene 2"], "baptista":["act 1 scene 1", "act 2 scene 1", "act 3 scene 2", "act 4 scene 4", "act 5 scene 1", "act 5 scene 2"], "gremio":["act 1 scene 1", "act 1 scene 2", "act 2 scene 1", "act 3 scene 2", "act 5 scene 1", "act 5 scene 2"], "katharina":["act 1 scene 1", "act 2 scene 1", "act 3 scene 2", "act 4 scene 1", "act 4 scene 3", "act 4 scene 5", "act 5 scene 1", "act 5 scene 2"], "hortensio":["act 1 scene 1", "act 1 scene 2", "act 2 scene 1", "act 3 scene 1", "act 4 scene 2", "act 4 scene 3", "act 4 scene 5", "act 5 scene 2"], "hortensia":["act 1 scene 1"], "bianca":["act 1 scene 1", "act 2 scene 1", "act 3 scene 1", "act 3 scene 2", "act 4 scene 2", "act 5 scene 1", "act 5 scene 2"], "biondello":["act 1 scene 1", "act 1 scene 2", "act 3 scene 2", "act 4 scene 2", "act 4 scene 4", "act 5 scene 1", "act 5 scene 2"], "petruchio":["act 1 scene 2", "act 2 scene 1", "act 3 scene 2", "act 4 scene 1", "act 4 scene 3", "act 4 scene 5", "act 5 scene 1", "act 5 scene 2"], "grumio":["act 1 scene 2", "act 3 scene 2", "act 4 scene 1", "act 4 scene 3"], "katarina":["act 3 scene 2"], "curtis":["act 4 scene 1"], "nathaniel":["act 4 scene 1"], "philip":["act 4 scene 1"], "joseph":["act 4 scene 1"], "nicholas":["act 4 scene 1"], "peter":["act 4 scene 1"], "pedant":["act 4 scene 2", "act 4 scene 4", "act 5 scene 1"], "haberdasher":["act 4 scene 3"], "tailor":["act 4 scene 3"], "vincentio":["act 4 scene 5", "act 5 scene 1", "act 5 scene 2"], "widow":["act 5 scene 2"]]
}
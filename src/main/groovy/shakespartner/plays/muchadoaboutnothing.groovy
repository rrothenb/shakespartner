package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class muchadoaboutnothing extends Play {
   String getName() {
      "much ado about nothing"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.muchadoaboutnothing.Act1Scene1", "1|2":"shakespartner.plays.muchadoaboutnothing.Act1Scene2", "1|3":"shakespartner.plays.muchadoaboutnothing.Act1Scene3", "2|1":"shakespartner.plays.muchadoaboutnothing.Act2Scene1", "2|2":"shakespartner.plays.muchadoaboutnothing.Act2Scene2", "2|3":"shakespartner.plays.muchadoaboutnothing.Act2Scene3", "3|1":"shakespartner.plays.muchadoaboutnothing.Act3Scene1", "3|2":"shakespartner.plays.muchadoaboutnothing.Act3Scene2", "3|3":"shakespartner.plays.muchadoaboutnothing.Act3Scene3", "3|4":"shakespartner.plays.muchadoaboutnothing.Act3Scene4", "3|5":"shakespartner.plays.muchadoaboutnothing.Act3Scene5", "4|1":"shakespartner.plays.muchadoaboutnothing.Act4Scene1", "4|2":"shakespartner.plays.muchadoaboutnothing.Act4Scene2", "5|1":"shakespartner.plays.muchadoaboutnothing.Act5Scene1", "5|2":"shakespartner.plays.muchadoaboutnothing.Act5Scene2", "5|3":"shakespartner.plays.muchadoaboutnothing.Act5Scene3", "5|4":"shakespartner.plays.muchadoaboutnothing.Act5Scene4"]

   static Map<String,List<String>> characterData = ["leonato":["act 1 scene 1", "act 1 scene 2", "act 2 scene 1", "act 2 scene 3", "act 3 scene 2", "act 3 scene 5", "act 4 scene 1", "act 5 scene 1", "act 5 scene 4"], "messenger":["act 1 scene 1", "act 3 scene 5", "act 5 scene 4"], "beatrice":["act 1 scene 1", "act 2 scene 1", "act 2 scene 3", "act 3 scene 1", "act 3 scene 4", "act 4 scene 1", "act 5 scene 2", "act 5 scene 4"], "hero":["act 1 scene 1", "act 2 scene 1", "act 3 scene 1", "act 3 scene 4", "act 4 scene 1", "act 5 scene 4"], "don pedro":["act 1 scene 1", "act 2 scene 1", "act 2 scene 3", "act 3 scene 2", "act 4 scene 1", "act 5 scene 1", "act 5 scene 3", "act 5 scene 4"], "benedick":["act 1 scene 1", "act 2 scene 1", "act 2 scene 3", "act 3 scene 2", "act 4 scene 1", "act 5 scene 1", "act 5 scene 2", "act 5 scene 4"], "don john":["act 1 scene 1", "act 1 scene 3", "act 2 scene 1", "act 2 scene 2", "act 3 scene 2", "act 4 scene 1"], "claudio":["act 1 scene 1", "act 2 scene 1", "act 2 scene 3", "act 3 scene 2", "act 4 scene 1", "act 5 scene 1", "act 5 scene 3", "act 5 scene 4"], "antonio":["act 1 scene 2", "act 2 scene 1", "act 5 scene 1", "act 5 scene 4"], "conrade":["act 1 scene 3", "act 3 scene 3", "act 4 scene 2"], "borachio":["act 1 scene 3", "act 2 scene 1", "act 2 scene 2", "act 3 scene 3", "act 4 scene 2", "act 5 scene 1"], "balthasar":["act 2 scene 1", "act 2 scene 3"], "margaret":["act 2 scene 1", "act 3 scene 1", "act 3 scene 4", "act 5 scene 2"], "ursula":["act 2 scene 1", "act 3 scene 1", "act 3 scene 4", "act 5 scene 2"], "boy":["act 2 scene 3"], "dogberry":["act 3 scene 3", "act 3 scene 5", "act 4 scene 2", "act 5 scene 1"], "verges":["act 3 scene 3", "act 3 scene 5", "act 4 scene 2", "act 5 scene 1"], "first watchman":["act 3 scene 3", "act 4 scene 2"], "second watchman":["act 3 scene 3", "act 4 scene 2"], "watchman":["act 3 scene 3", "act 4 scene 2"], "friar francis":["act 4 scene 1", "act 5 scene 4"], "sexton":["act 4 scene 2"], "lord":["act 5 scene 3"]]
}
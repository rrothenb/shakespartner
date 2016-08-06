package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class hamlet extends Play {
   String getName() {
      "hamlet"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.hamlet.Act1Scene1", "1|2":"shakespartner.plays.hamlet.Act1Scene2", "1|3":"shakespartner.plays.hamlet.Act1Scene3", "1|4":"shakespartner.plays.hamlet.Act1Scene4", "1|5":"shakespartner.plays.hamlet.Act1Scene5", "2|1":"shakespartner.plays.hamlet.Act2Scene1", "2|2":"shakespartner.plays.hamlet.Act2Scene2", "3|1":"shakespartner.plays.hamlet.Act3Scene1", "3|2":"shakespartner.plays.hamlet.Act3Scene2", "3|3":"shakespartner.plays.hamlet.Act3Scene3", "3|4":"shakespartner.plays.hamlet.Act3Scene4", "4|1":"shakespartner.plays.hamlet.Act4Scene1", "4|2":"shakespartner.plays.hamlet.Act4Scene2", "4|3":"shakespartner.plays.hamlet.Act4Scene3", "4|4":"shakespartner.plays.hamlet.Act4Scene4", "4|5":"shakespartner.plays.hamlet.Act4Scene5", "4|6":"shakespartner.plays.hamlet.Act4Scene6", "4|7":"shakespartner.plays.hamlet.Act4Scene7", "5|1":"shakespartner.plays.hamlet.Act5Scene1", "5|2":"shakespartner.plays.hamlet.Act5Scene2"]

   static Map<String,List<String>> characterData = ["bernardo":["act 1 scene 1", "act 1 scene 2"], "francisco":["act 1 scene 1"], "horatio":["act 1 scene 1", "act 1 scene 2", "act 1 scene 4", "act 1 scene 5", "act 3 scene 2", "act 4 scene 5", "act 4 scene 6", "act 5 scene 1", "act 5 scene 2"], "marcellus":["act 1 scene 1", "act 1 scene 2", "act 1 scene 4", "act 1 scene 5"], "king claudius":["act 1 scene 2", "act 2 scene 2", "act 3 scene 1", "act 3 scene 2", "act 3 scene 3", "act 4 scene 1", "act 4 scene 3", "act 4 scene 5", "act 4 scene 7", "act 5 scene 1", "act 5 scene 2"], "voltimand":["act 1 scene 2", "act 2 scene 2"], "laertes":["act 1 scene 2", "act 1 scene 3", "act 4 scene 5", "act 4 scene 7", "act 5 scene 1", "act 5 scene 2"], "lord polonius":["act 1 scene 2", "act 1 scene 3", "act 2 scene 1", "act 2 scene 2", "act 3 scene 1", "act 3 scene 2", "act 3 scene 3", "act 3 scene 4"], "hamlet":["act 1 scene 2", "act 1 scene 4", "act 1 scene 5", "act 2 scene 2", "act 3 scene 1", "act 3 scene 2", "act 3 scene 3", "act 3 scene 4", "act 4 scene 2", "act 4 scene 3", "act 4 scene 4", "act 5 scene 1", "act 5 scene 2"], "queen gertrude":["act 1 scene 2", "act 2 scene 2", "act 3 scene 1", "act 3 scene 2", "act 3 scene 4", "act 4 scene 1", "act 4 scene 5", "act 4 scene 7", "act 5 scene 1", "act 5 scene 2"], "all":["act 1 scene 2", "act 3 scene 2", "act 5 scene 1", "act 5 scene 2"], "ophelia":["act 1 scene 3", "act 2 scene 1", "act 3 scene 1", "act 3 scene 2", "act 4 scene 5"], "ghost":["act 1 scene 5", "act 3 scene 4"], "reynaldo":["act 2 scene 1"], "rosencrantz":["act 2 scene 2", "act 3 scene 1", "act 3 scene 2", "act 3 scene 3", "act 4 scene 2", "act 4 scene 3", "act 4 scene 4"], "guildenstern":["act 2 scene 2", "act 3 scene 1", "act 3 scene 2", "act 3 scene 3", "act 4 scene 2"], "first player":["act 2 scene 2", "act 3 scene 2"], "prologue":["act 3 scene 2"], "player king":["act 3 scene 2"], "player queen":["act 3 scene 2"], "lucianus":["act 3 scene 2"], "prince fortinbras":["act 4 scene 4", "act 5 scene 2"], "captain":["act 4 scene 4"], "gentleman":["act 4 scene 5"], "danes":["act 4 scene 5"], "servant":["act 4 scene 6"], "first sailor":["act 4 scene 6"], "messenger":["act 4 scene 7"], "first clown":["act 5 scene 1"], "second clown":["act 5 scene 1"], "first priest":["act 5 scene 1"], "osric":["act 5 scene 2"], "lord":["act 5 scene 2"], "first ambassador":["act 5 scene 2"]]
}
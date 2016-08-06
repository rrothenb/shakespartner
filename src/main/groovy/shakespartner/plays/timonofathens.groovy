package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class timonofathens extends Play {
   String getName() {
      "timon of athens"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.timonofathens.Act1Scene1", "1|2":"shakespartner.plays.timonofathens.Act1Scene2", "2|1":"shakespartner.plays.timonofathens.Act2Scene1", "2|2":"shakespartner.plays.timonofathens.Act2Scene2", "3|1":"shakespartner.plays.timonofathens.Act3Scene1", "3|2":"shakespartner.plays.timonofathens.Act3Scene2", "3|3":"shakespartner.plays.timonofathens.Act3Scene3", "3|4":"shakespartner.plays.timonofathens.Act3Scene4", "3|5":"shakespartner.plays.timonofathens.Act3Scene5", "3|6":"shakespartner.plays.timonofathens.Act3Scene6", "4|1":"shakespartner.plays.timonofathens.Act4Scene1", "4|2":"shakespartner.plays.timonofathens.Act4Scene2", "4|3":"shakespartner.plays.timonofathens.Act4Scene3", "5|1":"shakespartner.plays.timonofathens.Act5Scene1", "5|2":"shakespartner.plays.timonofathens.Act5Scene2", "5|3":"shakespartner.plays.timonofathens.Act5Scene3", "5|4":"shakespartner.plays.timonofathens.Act5Scene4"]

   static Map<String,List<String>> characterData = ["poet":["act 1 scene 1", "act 5 scene 1"], "painter":["act 1 scene 1", "act 5 scene 1"], "merchant":["act 1 scene 1"], "jeweller":["act 1 scene 1"], "timon":["act 1 scene 1", "act 1 scene 2", "act 2 scene 2", "act 3 scene 4", "act 3 scene 6", "act 4 scene 1", "act 4 scene 3", "act 5 scene 1"], "messenger":["act 1 scene 1", "act 5 scene 2"], "old athenian":["act 1 scene 1"], "lucilius":["act 1 scene 1", "act 3 scene 2"], "apemantus":["act 1 scene 1", "act 1 scene 2", "act 2 scene 2", "act 4 scene 3"], "alcibiades":["act 1 scene 1", "act 1 scene 2", "act 3 scene 5", "act 4 scene 3", "act 5 scene 4"], "first lord":["act 1 scene 1", "act 1 scene 2", "act 3 scene 6"], "second lord":["act 1 scene 1", "act 1 scene 2", "act 3 scene 6"], "ventidius":["act 1 scene 2"], "third lord":["act 1 scene 2", "act 3 scene 6"], "servant":["act 1 scene 2", "act 3 scene 1", "act 3 scene 3"], "cupid":["act 1 scene 2"], "first lady":["act 1 scene 2"], "all ladies":["act 1 scene 2"], "flavius":["act 1 scene 2", "act 2 scene 2", "act 3 scene 4", "act 4 scene 2", "act 4 scene 3", "act 5 scene 1"], "all":["act 1 scene 2"], "second servant":["act 1 scene 2", "act 3 scene 4", "act 4 scene 2"], "third servant":["act 1 scene 2", "act 4 scene 2"], "all lords":["act 1 scene 2"], "senator":["act 2 scene 1"], "caphis":["act 2 scene 1", "act 2 scene 2"], "all servants":["act 2 scene 2"], "fool":["act 2 scene 2"], "page":["act 2 scene 2"], "servants":["act 2 scene 2"], "flaminius":["act 2 scene 2", "act 3 scene 1", "act 3 scene 4"], "lucullus":["act 3 scene 1"], "first stranger":["act 3 scene 2"], "second stranger":["act 3 scene 2"], "servilius":["act 3 scene 2", "act 3 scene 4"], "third stranger":["act 3 scene 2"], "sempronius":["act 3 scene 3"], "first servant":["act 3 scene 4", "act 4 scene 2"], "titus":["act 3 scene 4"], "hortensius":["act 3 scene 4"], "philotus":["act 3 scene 4"], "first senator":["act 3 scene 5", "act 5 scene 1", "act 5 scene 2", "act 5 scene 4"], "second senator":["act 3 scene 5", "act 5 scene 1", "act 5 scene 2", "act 5 scene 4"], "third senator":["act 3 scene 5", "act 5 scene 2"], "some speak":["act 3 scene 6"], "some others":["act 3 scene 6"], "fourth lord":["act 3 scene 6"], "phrynia":["act 4 scene 3"], "timandra":["act 4 scene 3"], "first bandit":["act 4 scene 3"], "second bandit":["act 4 scene 3"], "third bandit":["act 4 scene 3"], "banditti":["act 4 scene 3"], "both":["act 5 scene 1", "act 5 scene 4"], "soldier":["act 5 scene 3", "act 5 scene 4"]]
}
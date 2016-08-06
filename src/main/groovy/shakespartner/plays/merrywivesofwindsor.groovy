package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class merrywivesofwindsor extends Play {
   String getName() {
      "merry wives of windsor"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.merrywivesofwindsor.Act1Scene1", "1|2":"shakespartner.plays.merrywivesofwindsor.Act1Scene2", "1|3":"shakespartner.plays.merrywivesofwindsor.Act1Scene3", "1|4":"shakespartner.plays.merrywivesofwindsor.Act1Scene4", "2|1":"shakespartner.plays.merrywivesofwindsor.Act2Scene1", "2|2":"shakespartner.plays.merrywivesofwindsor.Act2Scene2", "2|3":"shakespartner.plays.merrywivesofwindsor.Act2Scene3", "3|1":"shakespartner.plays.merrywivesofwindsor.Act3Scene1", "3|2":"shakespartner.plays.merrywivesofwindsor.Act3Scene2", "3|3":"shakespartner.plays.merrywivesofwindsor.Act3Scene3", "3|4":"shakespartner.plays.merrywivesofwindsor.Act3Scene4", "3|5":"shakespartner.plays.merrywivesofwindsor.Act3Scene5", "4|1":"shakespartner.plays.merrywivesofwindsor.Act4Scene1", "4|2":"shakespartner.plays.merrywivesofwindsor.Act4Scene2", "4|3":"shakespartner.plays.merrywivesofwindsor.Act4Scene3", "4|4":"shakespartner.plays.merrywivesofwindsor.Act4Scene4", "4|5":"shakespartner.plays.merrywivesofwindsor.Act4Scene5", "4|6":"shakespartner.plays.merrywivesofwindsor.Act4Scene6", "5|1":"shakespartner.plays.merrywivesofwindsor.Act5Scene1", "5|2":"shakespartner.plays.merrywivesofwindsor.Act5Scene2", "5|3":"shakespartner.plays.merrywivesofwindsor.Act5Scene3", "5|4":"shakespartner.plays.merrywivesofwindsor.Act5Scene4", "5|5":"shakespartner.plays.merrywivesofwindsor.Act5Scene5"]

   static Map<String,List<String>> characterData = ["shallow":["act 1 scene 1", "act 2 scene 1", "act 2 scene 3", "act 3 scene 1", "act 3 scene 2", "act 3 scene 4", "act 4 scene 2", "act 5 scene 2"], "slender":["act 1 scene 1", "act 2 scene 3", "act 3 scene 1", "act 3 scene 2", "act 3 scene 4", "act 5 scene 2", "act 5 scene 5"], "sir hugh evans":["act 1 scene 1", "act 1 scene 2", "act 3 scene 1", "act 3 scene 3", "act 4 scene 1", "act 4 scene 2", "act 4 scene 4", "act 4 scene 5", "act 5 scene 4", "act 5 scene 5"], "page":["act 1 scene 1", "act 2 scene 1", "act 2 scene 3", "act 3 scene 1", "act 3 scene 2", "act 3 scene 3", "act 3 scene 4", "act 4 scene 2", "act 4 scene 4", "act 5 scene 2", "act 5 scene 5"], "falstaff":["act 1 scene 1", "act 1 scene 3", "act 2 scene 2", "act 3 scene 3", "act 3 scene 5", "act 4 scene 2", "act 4 scene 5", "act 5 scene 1", "act 5 scene 5"], "bardolph":["act 1 scene 1", "act 1 scene 3", "act 2 scene 2", "act 3 scene 5", "act 4 scene 3", "act 4 scene 5"], "pistol":["act 1 scene 1", "act 1 scene 3", "act 2 scene 1", "act 2 scene 2", "act 5 scene 5"], "nym":["act 1 scene 1", "act 1 scene 3", "act 2 scene 1"], "simple":["act 1 scene 1", "act 1 scene 2", "act 1 scene 4", "act 3 scene 1", "act 4 scene 5"], "anne page":["act 1 scene 1", "act 3 scene 4", "act 5 scene 5"], "host":["act 1 scene 3", "act 2 scene 1", "act 2 scene 3", "act 3 scene 1", "act 3 scene 2", "act 4 scene 3", "act 4 scene 5", "act 4 scene 6"], "mistress quickly":["act 1 scene 4", "act 2 scene 1", "act 2 scene 2", "act 3 scene 4", "act 3 scene 5", "act 4 scene 1", "act 4 scene 5", "act 5 scene 1", "act 5 scene 5"], "rugby":["act 1 scene 4", "act 2 scene 3"], "doctor caius":["act 1 scene 4", "act 2 scene 3", "act 3 scene 1", "act 3 scene 2", "act 3 scene 3", "act 4 scene 5", "act 5 scene 3", "act 5 scene 5"], "fenton":["act 1 scene 4", "act 3 scene 4", "act 4 scene 6", "act 5 scene 5"], "mistress page":["act 2 scene 1", "act 3 scene 2", "act 3 scene 3", "act 3 scene 4", "act 4 scene 1", "act 4 scene 2", "act 4 scene 4", "act 5 scene 3", "act 5 scene 5"], "mistress ford":["act 2 scene 1", "act 3 scene 3", "act 4 scene 2", "act 4 scene 4", "act 5 scene 3", "act 5 scene 5"], "ford":["act 2 scene 1", "act 2 scene 2", "act 3 scene 2", "act 3 scene 3", "act 3 scene 5", "act 4 scene 2", "act 4 scene 4", "act 5 scene 1", "act 5 scene 5"], "robin":["act 2 scene 2", "act 3 scene 2", "act 3 scene 3"], "all":["act 3 scene 2"], "servant":["act 3 scene 3"], "william page":["act 4 scene 1"], "first servant":["act 4 scene 2"], "second servant":["act 4 scene 2"]]
}
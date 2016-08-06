package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class cymbeline extends Play {
   String getName() {
      "cymbeline"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.cymbeline.Act1Scene1", "1|2":"shakespartner.plays.cymbeline.Act1Scene2", "1|3":"shakespartner.plays.cymbeline.Act1Scene3", "1|4":"shakespartner.plays.cymbeline.Act1Scene4", "1|5":"shakespartner.plays.cymbeline.Act1Scene5", "1|6":"shakespartner.plays.cymbeline.Act1Scene6", "2|1":"shakespartner.plays.cymbeline.Act2Scene1", "2|2":"shakespartner.plays.cymbeline.Act2Scene2", "2|4":"shakespartner.plays.cymbeline.Act2Scene4", "2|5":"shakespartner.plays.cymbeline.Act2Scene5", "3|1":"shakespartner.plays.cymbeline.Act3Scene1", "3|2":"shakespartner.plays.cymbeline.Act3Scene2", "3|3":"shakespartner.plays.cymbeline.Act3Scene3", "3|4":"shakespartner.plays.cymbeline.Act3Scene4", "3|5":"shakespartner.plays.cymbeline.Act3Scene5", "3|6":"shakespartner.plays.cymbeline.Act3Scene6", "3|7":"shakespartner.plays.cymbeline.Act3Scene7", "4|1":"shakespartner.plays.cymbeline.Act4Scene1", "4|2":"shakespartner.plays.cymbeline.Act4Scene2", "4|3":"shakespartner.plays.cymbeline.Act4Scene3", "4|4":"shakespartner.plays.cymbeline.Act4Scene4", "5|1":"shakespartner.plays.cymbeline.Act5Scene1", "5|2":"shakespartner.plays.cymbeline.Act5Scene2", "5|3":"shakespartner.plays.cymbeline.Act5Scene3", "5|4":"shakespartner.plays.cymbeline.Act5Scene4", "5|5":"shakespartner.plays.cymbeline.Act5Scene5"]

   static Map<String,List<String>> characterData = ["first gentleman":["act 1 scene 1"], "second gentleman":["act 1 scene 1"], "queen":["act 1 scene 1", "act 1 scene 5", "act 2 scene 2", "act 3 scene 1", "act 3 scene 5"], "posthumus leonatus":["act 1 scene 1", "act 1 scene 4", "act 2 scene 4", "act 2 scene 5", "act 5 scene 1", "act 5 scene 3", "act 5 scene 4", "act 5 scene 5"], "imogen":["act 1 scene 1", "act 1 scene 3", "act 1 scene 6", "act 2 scene 2", "act 3 scene 2", "act 3 scene 4", "act 3 scene 6", "act 4 scene 2", "act 5 scene 5"], "cymbeline":["act 1 scene 1", "act 2 scene 2", "act 3 scene 1", "act 3 scene 5", "act 4 scene 3", "act 5 scene 5"], "pisanio":["act 1 scene 1", "act 1 scene 3", "act 1 scene 5", "act 1 scene 6", "act 2 scene 2", "act 3 scene 2", "act 3 scene 4", "act 3 scene 5", "act 4 scene 3", "act 5 scene 5"], "first lord":["act 1 scene 2", "act 2 scene 1", "act 2 scene 2", "act 4 scene 3"], "cloten":["act 1 scene 2", "act 2 scene 1", "act 2 scene 2", "act 3 scene 1", "act 3 scene 5", "act 4 scene 1", "act 4 scene 2"], "second lord":["act 1 scene 2", "act 2 scene 1", "act 2 scene 2"], "lady":["act 1 scene 3", "act 2 scene 2"], "iachimo":["act 1 scene 4", "act 1 scene 6", "act 2 scene 2", "act 2 scene 4", "act 5 scene 2", "act 5 scene 5"], "philario":["act 1 scene 4", "act 2 scene 4"], "frenchman":["act 1 scene 4"], "first lady":["act 1 scene 5", "act 5 scene 5"], "cornelius":["act 1 scene 5", "act 5 scene 5"], "null":["act 2 scene 2"], "messenger":["act 2 scene 2", "act 5 scene 4"], "caius lucius":["act 3 scene 1", "act 3 scene 5", "act 4 scene 2", "act 5 scene 2", "act 5 scene 5"], "lords":["act 3 scene 1"], "belarius":["act 3 scene 3", "act 3 scene 6", "act 4 scene 2", "act 4 scene 4", "act 5 scene 2", "act 5 scene 5"], "guiderius":["act 3 scene 3", "act 3 scene 6", "act 4 scene 2", "act 4 scene 4", "act 5 scene 5"], "arviragus":["act 3 scene 3", "act 3 scene 6", "act 4 scene 2", "act 4 scene 4", "act 5 scene 2", "act 5 scene 5"], "attendant":["act 3 scene 5"], "first senator":["act 3 scene 7"], "first tribune":["act 3 scene 7"], "second senator":["act 3 scene 7"], "captain":["act 4 scene 2"], "soothsayer":["act 4 scene 2", "act 5 scene 5"], "lord":["act 5 scene 3"], "first captain":["act 5 scene 3"], "second captain":["act 5 scene 3"], "first gaoler":["act 5 scene 4"], "second gaoler":["act 5 scene 4"], "sicilius leonatus":["act 5 scene 4"], "mother":["act 5 scene 4"], "first brother":["act 5 scene 4"], "second brother":["act 5 scene 4"], "jupiter":["act 5 scene 4"], "all":["act 5 scene 4"]]
}
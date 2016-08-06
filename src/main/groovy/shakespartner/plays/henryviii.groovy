package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class henryviii extends Play {
   String getName() {
      "henry viii"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.henryviii.Act1Scene1", "1|2":"shakespartner.plays.henryviii.Act1Scene2", "1|3":"shakespartner.plays.henryviii.Act1Scene3", "1|4":"shakespartner.plays.henryviii.Act1Scene4", "2|1":"shakespartner.plays.henryviii.Act2Scene1", "2|2":"shakespartner.plays.henryviii.Act2Scene2", "2|3":"shakespartner.plays.henryviii.Act2Scene3", "2|4":"shakespartner.plays.henryviii.Act2Scene4", "3|1":"shakespartner.plays.henryviii.Act3Scene1", "3|2":"shakespartner.plays.henryviii.Act3Scene2", "4|1":"shakespartner.plays.henryviii.Act4Scene1", "4|2":"shakespartner.plays.henryviii.Act4Scene2", "5|1":"shakespartner.plays.henryviii.Act5Scene1", "5|2":"shakespartner.plays.henryviii.Act5Scene2", "5|3":"shakespartner.plays.henryviii.Act5Scene3", "5|4":"shakespartner.plays.henryviii.Act5Scene4", "5|5":"shakespartner.plays.henryviii.Act5Scene5"]

   static Map<String,List<String>> characterData = ["buckingham":["act 1 scene 1", "act 2 scene 1"], "norfolk":["act 1 scene 1", "act 1 scene 2", "act 2 scene 2", "act 3 scene 2", "act 5 scene 3"], "abergavenny":["act 1 scene 1"], "cardinal wolsey":["act 1 scene 1", "act 1 scene 2", "act 1 scene 4", "act 2 scene 2", "act 2 scene 4", "act 3 scene 1", "act 3 scene 2"], "first secretary":["act 1 scene 1"], "brandon":["act 1 scene 1"], "sergeant":["act 1 scene 1"], "king henry viii":["act 1 scene 2", "act 1 scene 4", "act 2 scene 2", "act 2 scene 4", "act 3 scene 2", "act 5 scene 1", "act 5 scene 2", "act 5 scene 3", "act 5 scene 5"], "queen katharine":["act 1 scene 2", "act 2 scene 4", "act 3 scene 1"], "surveyor":["act 1 scene 2"], "chamberlain":["act 1 scene 3", "act 1 scene 4", "act 2 scene 2", "act 2 scene 3", "act 3 scene 2", "act 5 scene 3", "act 5 scene 4"], "sands":["act 1 scene 3", "act 1 scene 4"], "lovell":["act 1 scene 3", "act 1 scene 4", "act 2 scene 1", "act 5 scene 1"], "guildford":["act 1 scene 4"], "anne":["act 1 scene 4", "act 2 scene 3"], "servant":["act 1 scene 4"], "first gentleman":["act 2 scene 1", "act 4 scene 1"], "second gentleman":["act 2 scene 1", "act 4 scene 1"], "vaux":["act 2 scene 1"], "suffolk":["act 2 scene 2", "act 3 scene 2", "act 5 scene 1", "act 5 scene 3"], "cardinal campeius":["act 2 scene 2", "act 2 scene 4", "act 3 scene 1"], "gardiner":["act 2 scene 2", "act 5 scene 1", "act 5 scene 3"], "old lady":["act 2 scene 3", "act 5 scene 1"], "scribe":["act 2 scene 4"], "crier":["act 2 scene 4"], "griffith":["act 2 scene 4", "act 4 scene 2"], "lincoln":["act 2 scene 4"], "gentleman":["act 3 scene 1", "act 5 scene 1"], "surrey":["act 3 scene 2", "act 5 scene 3"], "cromwell":["act 3 scene 2", "act 5 scene 3"], "third gentleman":["act 4 scene 1"], "both":["act 4 scene 1"], "katharine":["act 4 scene 2"], "patience":["act 4 scene 2"], "messenger":["act 4 scene 2"], "capucius":["act 4 scene 2"], "boy":["act 5 scene 1"], "denny":["act 5 scene 1"], "cranmer":["act 5 scene 1", "act 5 scene 2", "act 5 scene 3", "act 5 scene 5"], "keeper":["act 5 scene 2", "act 5 scene 3"], "doctor butts":["act 5 scene 2"], "chancellor":["act 5 scene 3"], "all":["act 5 scene 3"], "porter":["act 5 scene 4"], "man":["act 5 scene 4"], "garter":["act 5 scene 5"]]
}
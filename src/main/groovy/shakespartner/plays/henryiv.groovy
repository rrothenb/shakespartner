package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class henryiv extends Play {
   String getName() {
      "henry iv"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.henryiv.Act1Scene1", "1|2":"shakespartner.plays.henryiv.Act1Scene2", "1|3":"shakespartner.plays.henryiv.Act1Scene3", "2|1":"shakespartner.plays.henryiv.Act2Scene1", "2|2":"shakespartner.plays.henryiv.Act2Scene2", "2|3":"shakespartner.plays.henryiv.Act2Scene3", "2|4":"shakespartner.plays.henryiv.Act2Scene4", "3|1":"shakespartner.plays.henryiv.Act3Scene1", "3|2":"shakespartner.plays.henryiv.Act3Scene2", "4|1":"shakespartner.plays.henryiv.Act4Scene1", "4|2":"shakespartner.plays.henryiv.Act4Scene2", "4|3":"shakespartner.plays.henryiv.Act4Scene3", "4|4":"shakespartner.plays.henryiv.Act4Scene4", "5|1":"shakespartner.plays.henryiv.Act5Scene1", "5|2":"shakespartner.plays.henryiv.Act5Scene2", "5|3":"shakespartner.plays.henryiv.Act5Scene3", "5|4":"shakespartner.plays.henryiv.Act5Scene4", "5|5":"shakespartner.plays.henryiv.Act5Scene5"]

   static Map<String,List<String>> characterData = ["king henry iv":["act 1 scene 1", "act 1 scene 3", "act 3 scene 2", "act 5 scene 1", "act 5 scene 4", "act 5 scene 5"], "westmoreland":["act 1 scene 1", "act 4 scene 2", "act 5 scene 4"], "falstaff":["act 1 scene 2", "act 2 scene 2", "act 2 scene 4", "act 3 scene 2", "act 4 scene 2", "act 5 scene 1", "act 5 scene 3", "act 5 scene 4"], "prince henry":["act 1 scene 2", "act 2 scene 2", "act 2 scene 4", "act 3 scene 2", "act 4 scene 2", "act 5 scene 1", "act 5 scene 3", "act 5 scene 4", "act 5 scene 5"], "poins":["act 1 scene 2", "act 2 scene 2", "act 2 scene 4"], "earl of worcester":["act 1 scene 3", "act 3 scene 1", "act 4 scene 1", "act 4 scene 3", "act 5 scene 1", "act 5 scene 2", "act 5 scene 5"], "northumberland":["act 1 scene 3"], "hotspur":["act 1 scene 3", "act 2 scene 3", "act 3 scene 1", "act 4 scene 1", "act 4 scene 3", "act 5 scene 2", "act 5 scene 3", "act 5 scene 4"], "sir walter blunt":["act 1 scene 3", "act 3 scene 2", "act 4 scene 3", "act 5 scene 3"], "first carrier":["act 2 scene 1"], "ostler":["act 2 scene 1"], "second carrier":["act 2 scene 1"], "gadshill":["act 2 scene 1", "act 2 scene 2", "act 2 scene 4"], "chamberlain":["act 2 scene 1"], "bardolph":["act 2 scene 2", "act 2 scene 4", "act 3 scene 2", "act 4 scene 2"], "peto":["act 2 scene 2", "act 2 scene 4"], "first traveller":["act 2 scene 2"], "thieves":["act 2 scene 2"], "travellers":["act 2 scene 2"], "lady percy":["act 2 scene 3", "act 3 scene 1"], "servant":["act 2 scene 3"], "francis":["act 2 scene 4"], "vintner":["act 2 scene 4"], "hostess":["act 2 scene 4", "act 3 scene 2"], "sheriff":["act 2 scene 4"], "carrier":["act 2 scene 4"], "mortimer":["act 3 scene 1"], "glendower":["act 3 scene 1"], "earl of douglas":["act 4 scene 1", "act 4 scene 3", "act 5 scene 2", "act 5 scene 3", "act 5 scene 4"], "messenger":["act 4 scene 1", "act 5 scene 2"], "vernon":["act 4 scene 1", "act 4 scene 3", "act 5 scene 2"], "worcester":["act 4 scene 1"], "archbishop of york":["act 4 scene 4"], "sir michael":["act 4 scene 4"], "lancaster":["act 5 scene 4", "act 5 scene 5"]]
}
package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class macbeth extends Play {
   String getName() {
      "macbeth"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.macbeth.Act1Scene1", "1|2":"shakespartner.plays.macbeth.Act1Scene2", "1|3":"shakespartner.plays.macbeth.Act1Scene3", "1|4":"shakespartner.plays.macbeth.Act1Scene4", "1|5":"shakespartner.plays.macbeth.Act1Scene5", "1|6":"shakespartner.plays.macbeth.Act1Scene6", "1|7":"shakespartner.plays.macbeth.Act1Scene7", "2|1":"shakespartner.plays.macbeth.Act2Scene1", "2|2":"shakespartner.plays.macbeth.Act2Scene2", "2|3":"shakespartner.plays.macbeth.Act2Scene3", "2|4":"shakespartner.plays.macbeth.Act2Scene4", "3|1":"shakespartner.plays.macbeth.Act3Scene1", "3|2":"shakespartner.plays.macbeth.Act3Scene2", "3|3":"shakespartner.plays.macbeth.Act3Scene3", "3|4":"shakespartner.plays.macbeth.Act3Scene4", "3|5":"shakespartner.plays.macbeth.Act3Scene5", "3|6":"shakespartner.plays.macbeth.Act3Scene6", "4|1":"shakespartner.plays.macbeth.Act4Scene1", "4|2":"shakespartner.plays.macbeth.Act4Scene2", "4|3":"shakespartner.plays.macbeth.Act4Scene3", "5|1":"shakespartner.plays.macbeth.Act5Scene1", "5|2":"shakespartner.plays.macbeth.Act5Scene2", "5|3":"shakespartner.plays.macbeth.Act5Scene3", "5|4":"shakespartner.plays.macbeth.Act5Scene4", "5|5":"shakespartner.plays.macbeth.Act5Scene5", "5|6":"shakespartner.plays.macbeth.Act5Scene6", "5|7":"shakespartner.plays.macbeth.Act5Scene7", "5|8":"shakespartner.plays.macbeth.Act5Scene8"]

   static Map<String,List<String>> characterData = ["first witch":["act 1 scene 1", "act 1 scene 3", "act 3 scene 5", "act 4 scene 1"], "second witch":["act 1 scene 1", "act 1 scene 3", "act 4 scene 1"], "third witch":["act 1 scene 1", "act 1 scene 3", "act 4 scene 1"], "all":["act 1 scene 1", "act 1 scene 3", "act 2 scene 3", "act 4 scene 1", "act 5 scene 8"], "duncan":["act 1 scene 2", "act 1 scene 4", "act 1 scene 6"], "malcolm":["act 1 scene 2", "act 1 scene 4", "act 2 scene 3", "act 4 scene 3", "act 5 scene 4", "act 5 scene 6", "act 5 scene 7", "act 5 scene 8"], "sergeant":["act 1 scene 2"], "lennox":["act 1 scene 2", "act 2 scene 3", "act 3 scene 4", "act 3 scene 6", "act 4 scene 1", "act 5 scene 2"], "ross":["act 1 scene 2", "act 1 scene 3", "act 2 scene 4", "act 3 scene 4", "act 4 scene 2", "act 4 scene 3", "act 5 scene 8"], "macbeth":["act 1 scene 3", "act 1 scene 4", "act 1 scene 5", "act 1 scene 7", "act 2 scene 1", "act 2 scene 2", "act 2 scene 3", "act 3 scene 1", "act 3 scene 2", "act 3 scene 4", "act 4 scene 1", "act 5 scene 3", "act 5 scene 5", "act 5 scene 7", "act 5 scene 8"], "banquo":["act 1 scene 3", "act 1 scene 4", "act 1 scene 6", "act 2 scene 1", "act 2 scene 3", "act 3 scene 1", "act 3 scene 3"], "angus":["act 1 scene 3", "act 5 scene 2"], "lady macbeth":["act 1 scene 5", "act 1 scene 6", "act 1 scene 7", "act 2 scene 2", "act 2 scene 3", "act 3 scene 1", "act 3 scene 2", "act 3 scene 4", "act 5 scene 1"], "messenger":["act 1 scene 5", "act 4 scene 2", "act 5 scene 5"], "fleance":["act 2 scene 1"], "porter":["act 2 scene 3"], "macduff":["act 2 scene 3", "act 2 scene 4", "act 4 scene 3", "act 5 scene 4", "act 5 scene 6", "act 5 scene 7", "act 5 scene 8"], "donalbain":["act 2 scene 3"], "old man":["act 2 scene 4"], "attendant":["act 3 scene 1"], "first murderer":["act 3 scene 1", "act 3 scene 3", "act 3 scene 4", "act 4 scene 2"], "second murderer":["act 3 scene 1", "act 3 scene 3"], "both murderers":["act 3 scene 1"], "servant":["act 3 scene 2", "act 5 scene 3"], "third murderer":["act 3 scene 3"], "lords":["act 3 scene 4"], "hecate":["act 3 scene 5", "act 4 scene 1"], "lord":["act 3 scene 6"], "first apparition":["act 4 scene 1"], "second apparition":["act 4 scene 1"], "third apparition":["act 4 scene 1"], "lady macduff":["act 4 scene 2"], "son":["act 4 scene 2"], "doctor":["act 4 scene 3", "act 5 scene 1", "act 5 scene 3"], "gentlewoman":["act 5 scene 1"], "menteith":["act 5 scene 2", "act 5 scene 4"], "caithness":["act 5 scene 2"], "seyton":["act 5 scene 3", "act 5 scene 5"], "siward":["act 5 scene 4", "act 5 scene 6", "act 5 scene 7", "act 5 scene 8"], "soldiers":["act 5 scene 4"], "young siward":["act 5 scene 7"]]
}
package shakespartner.plays

import groovy.transform.CompileStatic
import shakespartner.Play
import shakespartner.Scene

@CompileStatic
class juliuscaesar extends Play {
   String getName() {
      "julius caesar"
   }

   Scene getScene(int act, int scene) {
      String key = act + "|" + scene
      (Scene)getClass().getClassLoader().loadClass(scenes[key])?.newInstance()
   }

   List<String> getScenes(String character) {
      characterData[character]
   }

   static Map<String,String> scenes = ["1|1":"shakespartner.plays.juliuscaesar.Act1Scene1", "1|2":"shakespartner.plays.juliuscaesar.Act1Scene2", "1|3":"shakespartner.plays.juliuscaesar.Act1Scene3", "2|1":"shakespartner.plays.juliuscaesar.Act2Scene1", "2|2":"shakespartner.plays.juliuscaesar.Act2Scene2", "2|3":"shakespartner.plays.juliuscaesar.Act2Scene3", "2|4":"shakespartner.plays.juliuscaesar.Act2Scene4", "3|1":"shakespartner.plays.juliuscaesar.Act3Scene1", "3|2":"shakespartner.plays.juliuscaesar.Act3Scene2", "3|3":"shakespartner.plays.juliuscaesar.Act3Scene3", "4|1":"shakespartner.plays.juliuscaesar.Act4Scene1", "4|2":"shakespartner.plays.juliuscaesar.Act4Scene2", "4|3":"shakespartner.plays.juliuscaesar.Act4Scene3", "5|1":"shakespartner.plays.juliuscaesar.Act5Scene1", "5|2":"shakespartner.plays.juliuscaesar.Act5Scene2", "5|3":"shakespartner.plays.juliuscaesar.Act5Scene3", "5|4":"shakespartner.plays.juliuscaesar.Act5Scene4", "5|5":"shakespartner.plays.juliuscaesar.Act5Scene5"]

   static Map<String,List<String>> characterData = ["flavius":["act 1 scene 1"], "first commoner":["act 1 scene 1"], "marullus":["act 1 scene 1"], "second commoner":["act 1 scene 1"], "caesar":["act 1 scene 2", "act 2 scene 2", "act 3 scene 1"], "casca":["act 1 scene 2", "act 1 scene 3", "act 2 scene 1", "act 3 scene 1"], "calpurnia":["act 1 scene 2", "act 2 scene 2"], "antony":["act 1 scene 2", "act 2 scene 2", "act 3 scene 1", "act 3 scene 2", "act 4 scene 1", "act 5 scene 1", "act 5 scene 4", "act 5 scene 5"], "soothsayer":["act 1 scene 2", "act 2 scene 4", "act 3 scene 1"], "brutus":["act 1 scene 2", "act 2 scene 1", "act 2 scene 2", "act 3 scene 1", "act 3 scene 2", "act 4 scene 2", "act 4 scene 3", "act 5 scene 1", "act 5 scene 3", "act 5 scene 4", "act 5 scene 5"], "cassius":["act 1 scene 2", "act 1 scene 3", "act 2 scene 1", "act 3 scene 1", "act 4 scene 2", "act 4 scene 3", "act 5 scene 1", "act 5 scene 3"], "cicero":["act 1 scene 3"], "cinna":["act 1 scene 3", "act 2 scene 1", "act 3 scene 1"], "lucius":["act 2 scene 1", "act 2 scene 4", "act 4 scene 3"], "decius brutus":["act 2 scene 1", "act 2 scene 2", "act 3 scene 1"], "metellus cimber":["act 2 scene 1", "act 3 scene 1"], "trebonius":["act 2 scene 1", "act 2 scene 2", "act 3 scene 1"], "portia":["act 2 scene 1", "act 2 scene 4"], "ligarius":["act 2 scene 1"], "servant":["act 2 scene 2", "act 3 scene 1", "act 3 scene 2"], "publius":["act 2 scene 2", "act 3 scene 1"], "artemidorus":["act 2 scene 3", "act 3 scene 1"], "popilius":["act 3 scene 1"], "citizens":["act 3 scene 2"], "first citizen":["act 3 scene 2", "act 3 scene 3"], "second citizen":["act 3 scene 2", "act 3 scene 3"], "third citizen":["act 3 scene 2", "act 3 scene 3"], "all":["act 3 scene 2"], "fourth citizen":["act 3 scene 2", "act 3 scene 3"], "several citizens":["act 3 scene 2"], "cinna the poet":["act 3 scene 3"], "octavius":["act 4 scene 1", "act 5 scene 1", "act 5 scene 5"], "lepidus":["act 4 scene 1"], "lucilius":["act 4 scene 2", "act 4 scene 3", "act 5 scene 1", "act 5 scene 4", "act 5 scene 5"], "pindarus":["act 4 scene 2", "act 5 scene 3"], "first soldier":["act 4 scene 2", "act 5 scene 4"], "second soldier":["act 4 scene 2", "act 5 scene 4"], "third soldier":["act 4 scene 2"], "poet":["act 4 scene 3"], "messala":["act 4 scene 3", "act 5 scene 1", "act 5 scene 3", "act 5 scene 5"], "varro":["act 4 scene 3"], "ghost":["act 4 scene 3"], "claudius":["act 4 scene 3"], "messenger":["act 5 scene 1"], "titinius":["act 5 scene 3"], "cato":["act 5 scene 3", "act 5 scene 4"], "clitus":["act 5 scene 5"], "dardanius":["act 5 scene 5"], "volumnius":["act 5 scene 5"], "strato":["act 5 scene 5"]]
}
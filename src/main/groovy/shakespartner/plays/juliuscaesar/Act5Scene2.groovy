package shakespartner.plays.juliuscaesar

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act5Scene2 extends Scene {
   String getLocation() {
      "The same. The field of battle."
   }

   int getScene() {
      2
   }

   int getAct() {
      5
   }

   List<Map<String,String>> getLines() {
      [[text:"Alarum. Enter BRUTUS and MESSALA"], [text:"Loud alarum"], [text:"Exeunt"]]
   }

}

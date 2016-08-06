package shakespartner.plays.antonyandcleopatra

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act2Scene4 extends Scene {
   String getLocation() {
      "The same. A street."
   }

   int getScene() {
      4
   }

   int getAct() {
      2
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter LEPIDUS, MECAENAS, and AGRIPPA"], [speaker:"lepidus", text:"Trouble yourselves no further: pray you, hasten Your generals after."], [speaker:"agrippa", text:"Sir, Mark Antony Will een but kiss Octavia, and well follow."], [speaker:"lepidus", text:"Till I shall see you in your soldiers dress, Which will become you both, farewell."], [speaker:"mecaenas", text:"We shall, As I conceive the journey, be at the Mount Before you, Lepidus."], [speaker:"lepidus", text:"Your way is shorter My purposes do draw me much about: Youll win two days upon me."], [speaker:"agrippa", text:"Sir, good success!"], [speaker:"lepidus", text:"Farewell."], [text:"Exeunt"]]
   }

}

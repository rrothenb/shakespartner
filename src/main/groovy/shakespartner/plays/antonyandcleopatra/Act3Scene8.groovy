package shakespartner.plays.antonyandcleopatra

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act3Scene8 extends Scene {
   String getLocation() {
      "A plain near Actium."
   }

   int getScene() {
      8
   }

   int getAct() {
      3
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter OCTAVIUS CAESAR, and TAURUS, with his army, marching"], [speaker:"octavius caesar", text:"Taurus!"], [speaker:"taurus", text:"My lord"], [speaker:"octavius caesar", text:"Strike not by land keep whole: provoke not battle, Till we have done at sea. Do not exceed The prescript of this scroll: our fortune lies Upon this jump."], [text:"Exeunt"]]
   }

}

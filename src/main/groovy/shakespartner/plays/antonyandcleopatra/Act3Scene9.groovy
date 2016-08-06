package shakespartner.plays.antonyandcleopatra

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act3Scene9 extends Scene {
   String getLocation() {
      "Another part of the plain."
   }

   int getScene() {
      9
   }

   int getAct() {
      3
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter MARK ANTONY and DOMITIUS ENOBARBUS"], [speaker:"mark antony", text:"Set we our squadrons on yond side o the hill, In eye of Caesars battle from which place We may the number of the ships behold, And so proceed accordingly."], [text:"Exeunt"]]
   }

}

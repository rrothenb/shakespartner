package shakespartner.plays.allswellthatendswell

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act3Scene3 extends Scene {
   String getLocation() {
      "Florence. Before the DUKEs palace."
   }

   int getScene() {
      3
   }

   int getAct() {
      3
   }

   List<Map<String,String>> getLines() {
      [[text:"Flourish. Enter the DUKE of Florence, BERTRAM, PAROLLES, Soldiers, Drum, and Trumpets"], [speaker:"duke", text:"The general of our horse thou art and we, Great in our hope, lay our best love and credence Upon thy promising fortune."], [speaker:"bertram", text:"Sir, it is A charge too heavy for my strength, but yet Well strive to bear it for your worthy sake To the extreme edge of hazard."], [speaker:"duke", text:"Then go thou forth And fortune play upon thy prosperous helm, As thy auspicious mistress!"], [speaker:"bertram", text:"This very day, Great Mars, I put myself into thy file: Make me but like my thoughts, and I shall prove A lover of thy drum, hater of love."], [text:"Exeunt"]]
   }

}

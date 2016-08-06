package shakespartner.plays.kingjohn

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act3Scene2 extends Scene {
   String getLocation() {
      "The same. Plains near Angiers."
   }

   int getScene() {
      2
   }

   int getAct() {
      3
   }

   List<Map<String,String>> getLines() {
      [[text:"Alarums, excursions. Enter the BASTARD, with AUSTRIAS head"], [speaker:"bastard", text:"Now, by my life, this day grows wondrous hot Some airy devil hovers in the sky And pours down mischief. Austrias head lie there, While Philip breathes."], [text:"Enter KING JOHN, ARTHUR, and HUBERT"], [speaker:"king john", text:"Hubert, keep this boy. Philip, make up: My mother is assailed in our tent, And taen, I fear."], [speaker:"bastard", text:"My lord, I rescued her Her highness is in safety, fear you not: But on, my liege for very little pains Will bring this labour to an happy end."], [text:"Exeunt"]]
   }

}

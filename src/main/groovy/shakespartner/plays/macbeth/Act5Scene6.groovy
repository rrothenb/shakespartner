package shakespartner.plays.macbeth

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act5Scene6 extends Scene {
   String getLocation() {
      "Dunsinane. Before the castle."
   }

   int getScene() {
      6
   }

   int getAct() {
      5
   }

   List<Map<String,String>> getLines() {
      [[text:"Drum and colours. Enter MALCOLM, SIWARD, MACDUFF, and their Army, with boughs"], [speaker:"malcolm", text:"Now near enough: your leafy screens throw down. And show like those you are. You, worthy uncle, Shall, with my cousin, your rightnoble son, Lead our first battle: worthy Macduff and we Shall take upon s what else remains to do, According to our order."], [speaker:"siward", text:"Fare you well. Do we but find the tyrants power tonight, Let us be beaten, if we cannot fight."], [speaker:"macduff", text:"Make all our trumpets speak give them all breath, Those clamorous harbingers of blood and death."], [text:"Exeunt"]]
   }

}

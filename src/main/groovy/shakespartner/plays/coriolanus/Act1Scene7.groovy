package shakespartner.plays.coriolanus

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act1Scene7 extends Scene {
   String getLocation() {
      "The gates of Corioli."
   }

   int getScene() {
      7
   }

   int getAct() {
      1
   }

   List<Map<String,String>> getLines() {
      [[text:"TITUS LARTIUS, having set a guard upon  Corioli, going with drum and trumpet toward  COMINIUS and CAIUS MARCIUS, enters with Lieutenant, other Soldiers, and a Scout"], [speaker:"lartius", text:"So, let the ports be guarded: keep your duties, As I have set them down. If I do send, dispatch Those centuries to our aid: the rest will serve For a short holding: if we lose the field, We cannot keep the town."], [speaker:"lieutenant", text:"Fear not our care, sir."], [speaker:"lartius", text:"Hence, and shut your gates upons. Our guider, come to the Roman camp conduct us."], [text:"Exeunt"]]
   }

}

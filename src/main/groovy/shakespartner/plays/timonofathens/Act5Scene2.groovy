package shakespartner.plays.timonofathens

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act5Scene2 extends Scene {
   String getLocation() {
      "Before the walls of Athens."
   }

   int getScene() {
      2
   }

   int getAct() {
      5
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter two Senators and a Messenger"], [speaker:"messenger", text:"have spoke the least: Besides, his expedition promises Present approach."], [speaker:"second senator", text:"We stand much hazard, if they bring not Timon."], [speaker:"messenger", text:"I met a courier, one mine ancient friend Whom, though in general part we were opposed, Yet our old love made a particular force, And made us speak like friends: this man was riding From Alcibiades to Timons cave, With letters of entreaty, which imported His fellowship i the cause against your city, In part for his sake moved."], [speaker:"first senator", text:"Here come our brothers."], [text:"Enter the Senators from TIMON"], [speaker:"third senator", text:"No talk of Timon, nothing of him expect. The enemies drum is heard, and fearful scouring Doth choke the air with dust: in, and prepare: Ours is the fall, I fear our foes the snare."], [text:"Exeunt"]]
   }

}

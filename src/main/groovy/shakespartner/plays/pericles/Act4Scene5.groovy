package shakespartner.plays.pericles

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act4Scene5 extends Scene {
   String getLocation() {
      "Mytilene. A street before the brothel."
   }

   int getScene() {
      5
   }

   int getAct() {
      4
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter, from the brothel, two Gentlemen"], [speaker:"first gentleman", text:"Did you ever hear the like"], [speaker:"second gentleman", text:"No, nor never shall do in such a place as this, she being once gone."], [speaker:"first gentleman", text:"But to have divinity preached there! did you ever dream of such a thing"], [speaker:"second gentleman", text:"No, no. Come, I am for no more bawdyhouses: shalls go hear the vestals sing"], [speaker:"first gentleman", text:"Ill do any thing now that is virtuous but I am out of the road of rutting for ever."], [text:"Exeunt"]]
   }

}

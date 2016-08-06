package shakespartner.plays.henrythesixthpart3

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act2Scene4 extends Scene {
   String getLocation() {
      "Another part of the field."
   }

   int getScene() {
      4
   }

   int getAct() {
      2
   }

   List<Map<String,String>> getLines() {
      [[text:"Excursions. Enter RICHARD and CLIFFORD"], [speaker:"richard", text:"Now, Clifford, I have singled thee alone: Suppose this arm is for the Duke of York, And this for Rutland both bound to revenge, Wert thou environd with a brazen wall."], [speaker:"clifford", text:"Now, Richard, I am with thee here alone: This is the hand that stabbd thy father York And this the hand that slew thy brother Rutland And heres the heart that triumphs in their death And cheers these hands that slew thy sire and brother To execute the like upon thyself And so, have at thee! They fight. WARWICK comes CLIFFORD flies"], [speaker:"richard", text:"Nay Warwick, single out some other chase For I myself will hunt this wolf to death."], [text:"Exeunt"]]
   }

}

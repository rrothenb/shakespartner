package shakespartner.plays.richardthethird

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act5Scene4 extends Scene {
   String getLocation() {
      "Another part of the field."
   }

   int getScene() {
      4
   }

   int getAct() {
      5
   }

   List<Map<String,String>> getLines() {
      [[text:"Alarum: excursions. Enter NORFOLK and forces fighting to him CATESBY"], [speaker:"catesby", text:"Rescue, my Lord of Norfolk, rescue, rescue! The king enacts more wonders than a man, Daring an opposite to every danger: His horse is slain, and all on foot he fights, Seeking for Richmond in the throat of death. Rescue, fair lord, or else the day is lost!"], [text:"Alarums. Enter KING RICHARD III"], [speaker:"king richard the third", text:"A horse! a horse! my kingdom for a horse!"], [speaker:"catesby", text:"Withdraw, my lord Ill help you to a horse."], [speaker:"king richard the third", text:"Slave, I have set my life upon a cast, And I will stand the hazard of the die: I think there be six Richmonds in the field Five have I slain today instead of him. A horse! a horse! my kingdom for a horse!"], [text:"Exeunt"]]
   }

}
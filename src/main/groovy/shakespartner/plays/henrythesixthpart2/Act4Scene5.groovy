package shakespartner.plays.henrythesixthpart2

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act4Scene5 extends Scene {
   String getLocation() {
      "London. The Tower."
   }

   int getScene() {
      5
   }

   int getAct() {
      4
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter SCALES upon the Tower, walking. Then enter two or three Citizens below"], [speaker:"scales", text:"How now! is Jack Cade slain"], [speaker:"first citizen", text:"No, my lord, nor likely to be slain for they have won the bridge, killing all those that withstand them: the lord mayor craves aid of your honour from the Tower, to defend the city from the rebels."], [speaker:"scales", text:"Such aid as I can spare you shall command But I am troubled here with them myself The rebels have assayd to win the Tower. But get you to Smithfield, and gather head, And thither I will send you Matthew Goffe Fight for your king, your country and your lives And so, farewell, for I must hence again."], [text:"Exeunt"]]
   }

}

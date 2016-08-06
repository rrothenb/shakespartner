package shakespartner.plays.kingjohn

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act5Scene3 extends Scene {
   String getLocation() {
      "The field of battle."
   }

   int getScene() {
      3
   }

   int getAct() {
      5
   }

   List<Map<String,String>> getLines() {
      [[text:"Alarums. Enter KING JOHN and HUBERT"], [speaker:"king john", text:"How goes the day with us O, tell me, Hubert."], [speaker:"hubert", text:"Badly, I fear. How fares your majesty"], [speaker:"king john", text:"This fever, that hath troubled me so long, Lies heavy on me O, my heart is sick!"], [text:"Enter a Messenger"], [speaker:"messenger", text:"My lord, your valiant kinsman, Faulconbridge, Desires your majesty to leave the field And send him word by me which way you go."], [speaker:"king john", text:"Tell him, toward Swinstead, to the abbey there."], [speaker:"messenger", text:"Be of good comfort for the great supply That was expected by the Dauphin here, Are wreckd three nights ago on Goodwin Sands. This news was brought to Richard but even now: The French fight coldly, and retire themselves."], [speaker:"king john", text:"Ay me! this tyrant fever burns me up, And will not let me welcome this good news. Set on toward Swinstead: to my litter straight Weakness possesseth me, and I am faint."], [text:"Exeunt"]]
   }

}

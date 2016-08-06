package shakespartner.plays.richardthethird

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act4Scene5 extends Scene {
   String getLocation() {
      "Lord Derbys house."
   }

   int getScene() {
      5
   }

   int getAct() {
      4
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter DERBY and SIR CHRISTOPHER URSWICK"], [speaker:"derby", text:"Sir Christopher, tell Richmond this from me: That in the sty of this most bloody boar My son George Stanley is frankd up in hold: If I revolt, off goes young Georges head The fear of that withholds my present aid. But, tell me, where is princely Richmond now"], [speaker:"christopher", text:"At Pembroke, or at Harfordwest, in Wales."], [speaker:"derby", text:"What men of name resort to him"], [speaker:"christopher", text:"Sir Walter Herbert, a renowned soldier Sir Gilbert Talbot, Sir William Stanley Oxford, redoubted Pembroke, Sir James Blunt, And Rice ap Thomas with a valiant crew And many more of noble fame and worth: And towards London they do bend their course, If by the way they be not fought withal."], [speaker:"derby", text:"Return unto thy lord commend me to him: Tell him the queen hath heartily consented He shall espouse Elizabeth her daughter. These letters will resolve him of my mind. Farewell."], [text:"Exeunt"]]
   }

}

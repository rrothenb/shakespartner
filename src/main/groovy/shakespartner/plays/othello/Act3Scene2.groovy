package shakespartner.plays.othello

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act3Scene2 extends Scene {
   String getLocation() {
      "A room in the castle."
   }

   int getScene() {
      2
   }

   int getAct() {
      3
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter OTHELLO, IAGO, and Gentlemen"], [speaker:"othello", text:"These letters give, Iago, to the pilot And by him do my duties to the senate: That done, I will be walking on the works Repair there to me."], [speaker:"iago", text:"Well, my good lord, Ill dot."], [speaker:"othello", text:"This fortification, gentlemen, shall we seet"], [speaker:"gentleman", text:"Well wait upon your lordship."], [text:"Exeunt"]]
   }

}

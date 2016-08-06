package shakespartner.plays.twogentlemenofverona

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act5Scene3 extends Scene {
   String getLocation() {
      "The frontiers of Mantua. The forest."
   }

   int getScene() {
      3
   }

   int getAct() {
      5
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter Outlaws with SILVIA"], [speaker:"first outlaw", text:"Come, come, Be patient we must bring you to our captain."], [speaker:"silvia", text:"A thousand more mischances than this one Have learnd me how to brook this patiently."], [speaker:"second outlaw", text:"Come, bring her away."], [speaker:"first outlaw", text:"Where is the gentleman that was with her"], [speaker:"third outlaw", text:"Being nimblefooted, he hath outrun us, But Moyses and Valerius follow him. Go thou with her to the west end of the wood There is our captain: well follow him thats fled The thicket is beset he cannot scape."], [speaker:"first outlaw", text:"Come, I must bring you to our captains cave: Fear not he bears an honourable mind, And will not use a woman lawlessly."], [speaker:"silvia", text:"O Valentine, this I endure for thee!"], [text:"Exeunt"]]
   }

}

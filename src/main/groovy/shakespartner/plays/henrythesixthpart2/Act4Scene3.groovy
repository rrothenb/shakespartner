package shakespartner.plays.henrythesixthpart2

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act4Scene3 extends Scene {
   String getLocation() {
      "Another part of Blackheath."
   }

   int getScene() {
      3
   }

   int getAct() {
      4
   }

   List<Map<String,String>> getLines() {
      [[text:"Alarums to the fight, wherein SIR HUMPHREY and WILLIAM STAFFORD are slain. Enter CADE and the rest"], [speaker:"dick", text:"Here, sir."], [speaker:"cade", text:"They fell before thee like sheep and oxen, and thou behavedst thyself as if thou hadst been in thine own slaughterhouse: therefore thus will I reward thee, the Lent shall be as long again as it is and thou shalt have a licence to kill for a hundred lacking one."], [speaker:"dick", text:"I desire no more."], [speaker:"cade", text:"And, to speak truth, thou deservest no less. This monument of the victory will I bear and the bodies shall be dragged at my horse heels till I do come to London, where we will have the mayors sword borne before us."], [text:"Putting on SIR HUMPHREYS brigandine"], [speaker:"dick", text:"If we mean to thrive and do good, break open the gaols and let out the prisoners."], [speaker:"cade", text:"Fear not that, I warrant thee. Come, lets march towards London."], [text:"Exeunt"]]
   }

}
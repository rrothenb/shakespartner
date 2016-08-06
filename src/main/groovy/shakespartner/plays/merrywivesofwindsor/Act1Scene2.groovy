package shakespartner.plays.merrywivesofwindsor

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act1Scene2 extends Scene {
   String getLocation() {
      "The same."
   }

   int getScene() {
      2
   }

   int getAct() {
      1
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter SIR HUGH EVANS and SIMPLE"], [speaker:"sir hugh evans", text:"Go your ways, and ask of Doctor Caius house which is the way: and there dwells one Mistress Quickly, which is in the manner of his nurse, or his dry nurse, or his cook, or his laundry, his washer, and his wringer."], [speaker:"simple", text:"Well, sir."], [speaker:"sir hugh evans", text:"Nay, it is petter yet. Give her this letter for it is a oman that altogethers acquaintance with Mistress Anne Page: and the letter is, to desire and require her to solicit your masters desires to Mistress Anne Page. I pray you, be gone: I will make an end of my dinner theres pippins and cheese to come."], [text:"Exeunt"]]
   }

}

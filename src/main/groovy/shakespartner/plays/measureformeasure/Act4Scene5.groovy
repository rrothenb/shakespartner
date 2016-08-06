package shakespartner.plays.measureformeasure

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act4Scene5 extends Scene {
   String getLocation() {
      "Fields without the town."
   }

   int getScene() {
      5
   }

   int getAct() {
      4
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter DUKE VINCENTIO in his own habit, and FRIAR PETER"], [speaker:"duke vincentio", text:"These letters at fit time deliver me The provost knows our purpose and our plot. The matter being afoot, keep your instruction, And hold you ever to our special drift Though sometimes you do blench from this to that, As cause doth minister. Go call at Flavius house, And tell him where I stay: give the like notice To Valentinus, Rowland, and to Crassus, And bid them bring the trumpets to the gate But send me Flavius first."], [text:"Giving letters"], [speaker:"friar peter", text:"It shall be speeded well."], [text:"Exit"], [text:"Enter VARRIUS"], [speaker:"duke vincentio", text:"I thank thee, Varrius thou hast made good haste: Come, we will walk. Theres other of our friends Will greet us here anon, my gentle Varrius."], [text:"Exeunt"]]
   }

}

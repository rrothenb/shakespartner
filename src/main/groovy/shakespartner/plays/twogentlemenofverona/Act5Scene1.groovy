package shakespartner.plays.twogentlemenofverona

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act5Scene1 extends Scene {
   String getLocation() {
      "Milan. An abbey."
   }

   int getScene() {
      1
   }

   int getAct() {
      5
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter EGLAMOUR"], [speaker:"eglamour", text:"The sun begins to gild the western sky And now it is about the very hour That Silvia, at Friar Patricks cell, should meet me. She will not fail, for lovers break not hours, Unless it be to come before their time So much they spur their expedition. See where she comes. Lady, a happy evening!"], [text:"Enter SILVIA"], [speaker:"silvia", text:"Amen, amen! Go on, good Eglamour, Out at the postern by the abbeywall: I fear I am attended by some spies."], [speaker:"eglamour", text:"Fear not: the forest is not three leagues off If we recover that, we are sure enough."], [text:"Exeunt"]]
   }

}

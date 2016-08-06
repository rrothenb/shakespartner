package shakespartner.plays.twogentlemenofverona

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act2Scene2 extends Scene {
   String getLocation() {
      "Verona. JULIAS house."
   }

   int getScene() {
      2
   }

   int getAct() {
      2
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter PROTEUS and JULIA"], [speaker:"proteus", text:"Have patience, gentle Julia."], [speaker:"julia", text:"I must, where is no remedy."], [speaker:"proteus", text:"When possibly I can, I will return."], [speaker:"julia", text:"If you turn not, you will return the sooner. Keep this remembrance for thy Julias sake."], [text:"Giving a ring"], [speaker:"proteus", text:"Why then, well make exchange here, take you this."], [speaker:"julia", text:"And seal the bargain with a holy kiss."], [speaker:"proteus", text:"Here is my hand for my true constancy And when that hour oerslips me in the day Wherein I sigh not, Julia, for thy sake, The next ensuing hour some foul mischance Torment me for my loves forgetfulness! My father stays my coming answer not The tide is now: nay, not thy tide of tears That tide will stay me longer than I should. Julia, farewell! What, gone without a word Ay, so true love should do: it cannot speak For truth hath better deeds than words to grace it."], [text:"Exit JULIA"], [text:"Enter PANTHINO"], [speaker:"panthino", text:"Sir Proteus, you are stayd for."], [speaker:"proteus", text:"Go I come, I come. Alas! this parting strikes poor lovers dumb."], [text:"Exeunt"]]
   }

}

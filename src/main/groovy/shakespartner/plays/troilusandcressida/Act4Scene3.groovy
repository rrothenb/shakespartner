package shakespartner.plays.troilusandcressida

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act4Scene3 extends Scene {
   String getLocation() {
      "The same. Street before Pandarus house."
   }

   int getScene() {
      3
   }

   int getAct() {
      4
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter PARIS, TROILUS, AENEAS, DEIPHOBUS, ANTENOR, and DIOMEDES"], [speaker:"paris", text:"It is great morning, and the hour prefixd Of her delivery to this valiant Greek Comes fast upon. Good my brother Troilus, Tell you the lady what she is to do, And haste her to the purpose."], [speaker:"troilus", text:"Walk into her house Ill bring her to the Grecian presently: And to his hand when I deliver her, Think it an altar, and thy brother Troilus A priest there offering to it his own heart."], [text:"Exit"], [speaker:"paris", text:"I know what tis to love And would, as I shall pity, I could help! Please you walk in, my lords."], [text:"Exeunt"]]
   }

}

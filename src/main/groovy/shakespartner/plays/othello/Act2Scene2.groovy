package shakespartner.plays.othello

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act2Scene2 extends Scene {
   String getLocation() {
      "A street."
   }

   int getScene() {
      2
   }

   int getAct() {
      2
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter a Herald with a proclamation People following"], [speaker:"herald", text:"It is Othellos pleasure, our noble and valiant general, that, upon certain tidings now arrived, importing the mere perdition of the Turkish fleet, every man put himself into triumph some to dance, some to make bonfires, each man to what sport and revels his addiction leads him: for, besides these beneficial news, it is the celebration of his nuptial. So much was his pleasure should be proclaimed. All offices are open, and there is full liberty of feasting from this present hour of five till the bell have told eleven. Heaven bless the isle of Cyprus and our noble general Othello!"], [text:"Exeunt"]]
   }

}
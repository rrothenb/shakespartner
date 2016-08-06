package shakespartner.plays.henrythefifth

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act4Scene5 extends Scene {
   String getLocation() {
      "Another part of the field."
   }

   int getScene() {
      5
   }

   int getAct() {
      4
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter Constable, ORLEANS, BOURBON, DAUPHIN, and RAMBURES"], [speaker:"constable", text:"O diable!"], [speaker:"orleans", text:"O seigneur! le jour est perdu, tout est perdu!"], [speaker:"dauphin", text:"Mort de ma vie! all is confounded, all! Reproach and everlasting shame Sits mocking in our plumes. O merchante fortune! Do not run away."], [text:"A short alarum"], [speaker:"constable", text:"Why, all our ranks are broke."], [speaker:"dauphin", text:"O perdurable shame! lets stab ourselves. Be these the wretches that we playd at dice for"], [speaker:"orleans", text:"Is this the king we sent to for his ransom"], [speaker:"bourbon", text:"Shame and eternal shame, nothing but shame! Let us die in honour: once more back again And he that will not follow Bourbon now, Let him go hence, and with his cap in hand, Like a base pander, hold the chamberdoor Whilst by a slave, no gentler than my dog, His fairest daughter is contaminated."], [speaker:"constable", text:"Disorder, that hath spoild us, friend us now! Let us on heaps go offer up our lives."], [speaker:"orleans", text:"We are enow yet living in the field To smother up the English in our throngs, If any order might be thought upon."], [speaker:"bourbon", text:"The devil take order now! Ill to the throng: Let life be short else shame will be too long."], [text:"Exeunt"]]
   }

}
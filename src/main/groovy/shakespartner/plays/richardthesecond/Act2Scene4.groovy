package shakespartner.plays.richardthesecond

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act2Scene4 extends Scene {
   String getLocation() {
      "A camp in Wales."
   }

   int getScene() {
      4
   }

   int getAct() {
      2
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter EARL OF SALISBURY and a Welsh Captain"], [speaker:"captain", text:"My lord of Salisbury, we have stayd ten days, And hardly kept our countrymen together, And yet we hear no tidings from the king Therefore we will disperse ourselves: farewell."], [speaker:"earl of salisbury", text:"Stay yet another day, thou trusty Welshman: The king reposeth all his confidence in thee."], [speaker:"captain", text:"Tis thought the king is dead we will not stay. The baytrees in our country are all witherd And meteors fright the fixed stars of heaven The palefaced moon looks bloody on the earth And leanlookd prophets whisper fearful change Rich men look sad and ruffians dance and leap, The one in fear to lose what they enjoy, The other to enjoy by rage and war: These signs forerun the death or fall of kings. Farewell: our countrymen are gone and fled, As well assured Richard their king is dead."], [text:"Exit"], [speaker:"earl of salisbury", text:"Ah, Richard, with the eyes of heavy mind I see thy glory like a shooting star Fall to the base earth from the firmament. Thy sun sets weeping in the lowly west, Witnessing storms to come, woe and unrest: Thy friends are fled to wait upon thy foes, And crossly to thy good all fortune goes."], [text:"Exit"]]
   }

}

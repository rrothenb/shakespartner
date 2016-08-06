package shakespartner.plays.antonyandcleopatra

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act4Scene13 extends Scene {
   String getLocation() {
      "Alexandria. Cleopatras palace."
   }

   int getScene() {
      13
   }

   int getAct() {
      4
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter CLEOPATRA, CHARMIAN, IRAS, and MARDIAN"], [speaker:"cleopatra", text:"Help me, my women! O, he is more mad Than Telamon for his shield the boar of Thessaly Was never so embossd."], [speaker:"charmian", text:"To the monument! There lock yourself, and send him word you are dead. The soul and body rive not more in parting Than greatness going off."], [speaker:"cleopatra", text:"To the monument! Mardian, go tell him I have slain myself Say, that the last I spoke was Antony, And word it, prithee, piteously: hence, Mardian, And bring me how he takes my death. To the monument!"], [text:"Exeunt"]]
   }

}

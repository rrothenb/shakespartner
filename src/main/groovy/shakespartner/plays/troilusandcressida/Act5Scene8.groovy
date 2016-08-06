package shakespartner.plays.troilusandcressida

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act5Scene8 extends Scene {
   String getLocation() {
      "Another part of the plains."
   }

   int getScene() {
      8
   }

   int getAct() {
      5
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter HECTOR"], [speaker:"hector", text:"Most putrefied core, so fair without, Thy goodly armour thus hath cost thy life. Now is my days work done Ill take good breath: Rest, sword thou hast thy fill of blood and death."], [text:"Puts off his helmet and hangs his shield behind him"], [text:"Enter ACHILLES and Myrmidons"], [speaker:"achilles", text:"Look, Hector, how the sun begins to set How ugly night comes breathing at his heels: Even with the vail and darking of the sun, To close the day up, Hectors life is done."], [speaker:"hector", text:"I am unarmd forego this vantage, Greek."], [speaker:"achilles", text:"Strike, fellows, strike this is the man I seek. So, Ilion, fall thou next! now, Troy, sink down! Here lies thy heart, thy sinews, and thy bone. On, Myrmidons, and cry you all amain, Achilles hath the mighty Hector slain. Hark! a retire upon our Grecian part."], [text:"HECTOR falls"], [text:"A retreat sounded"], [speaker:"myrmidons", text:"The Trojan trumpets sound the like, my lord."], [speaker:"achilles", text:"The dragon wing of night oerspreads the earth, And, sticklerlike, the armies separates. My halfsuppd sword, that frankly would have fed, Pleased with this dainty bait, thus goes to bed. Come, tie his body to my horses tail Along the field I will the Trojan trail."], [text:"Sheathes his sword"], [text:"Exeunt"]]
   }

}

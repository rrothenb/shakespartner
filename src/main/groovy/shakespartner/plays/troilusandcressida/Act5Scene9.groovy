package shakespartner.plays.troilusandcressida

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act5Scene9 extends Scene {
   String getLocation() {
      "Another part of the plains."
   }

   int getScene() {
      9
   }

   int getAct() {
      5
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter AGAMEMNON, AJAX, MENELAUS, NESTOR, DIOMEDES, and others, marching. Shouts within"], [speaker:"agamemnon", text:"Hark! hark! what shout is that"], [speaker:"nestor", text:"Peace, drums! Achilles! Achilles! Hectors slain! Achilles."], [text:"Within"], [speaker:"diomedes", text:"The bruit is, Hectors slain, and by Achilles."], [speaker:"ajax", text:"If it be so, yet bragless let it be Great Hector was a man as good as he."], [speaker:"agamemnon", text:"March patiently along: let one be sent To pray Achilles see us at our tent. If in his death the gods have us befriended, Great Troy is ours, and our sharp wars are ended."], [text:"Exeunt, marching"]]
   }

}

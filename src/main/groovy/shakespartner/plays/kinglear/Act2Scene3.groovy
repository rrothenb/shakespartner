package shakespartner.plays.kinglear

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act2Scene3 extends Scene {
   String getLocation() {
      "A wood."
   }

   int getScene() {
      3
   }

   int getAct() {
      2
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter EDGAR"], [speaker:"edgar", text:"I heard myself proclaimd And by the happy hollow of a tree Escaped the hunt. No port is free no place, That guard, and most unusual vigilance, Does not attend my taking. Whiles I may scape, I will preserve myself: and am bethought To take the basest and most poorest shape That ever penury, in contempt of man, Brought near to beast: my face Ill grime with filth Blanket my loins: elf all my hair in knots And with presented nakedness outface The winds and persecutions of the sky. The country gives me proof and precedent Of Bedlam beggars, who, with roaring voices, Strike in their numbd and mortified bare arms Pins, wooden pricks, nails, sprigs of rosemary And with this horrible object, from low farms, Poor pelting villages, sheepcotes, and mills, Sometime with lunatic bans, sometime with prayers, Enforce their charity. Poor Turlygod! poor Tom! Thats something yet: Edgar I nothing am."], [text:"Exit"]]
   }

}

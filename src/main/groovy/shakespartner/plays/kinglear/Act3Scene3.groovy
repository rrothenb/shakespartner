package shakespartner.plays.kinglear

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act3Scene3 extends Scene {
   String getLocation() {
      "Gloucesters castle."
   }

   int getScene() {
      3
   }

   int getAct() {
      3
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter GLOUCESTER and EDMUND"], [speaker:"gloucester", text:"Alack, alack, Edmund, I like not this unnatural dealing. When I desire their leave that I might pity him, they took from me the use of mine own house charged me, on pain of their perpetual displeasure, neither to speak of him, entreat for him, nor any way sustain him."], [speaker:"edmund", text:"Most savage and unnatural!"], [speaker:"gloucester", text:"Go to say you nothing. Theres a division betwixt the dukes and a worse matter than that: I have received a letter this night tis dangerous to be spoken I have locked the letter in my closet: these injuries the king now bears will be revenged home theres part of a power already footed: we must incline to the king. I will seek him, and privily relieve him: go you and maintain talk with the duke, that my charity be not of him perceived: if he ask for me. I am ill, and gone to bed. Though I die for it, as no less is threatened me, the king my old master must be relieved. There is some strange thing toward, Edmund pray you, be careful."], [text:"Exit"], [speaker:"edmund", text:"This courtesy, forbid thee, shall the duke Instantly know and of that letter too: This seems a fair deserving, and must draw me That which my father loses no less than all: The younger rises when the old doth fall."], [text:"Exit"]]
   }

}
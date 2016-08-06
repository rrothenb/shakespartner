package shakespartner.plays.henrythesixthpart2

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act5Scene3 extends Scene {
   String getLocation() {
      "Fields near St. Albans."
   }

   int getScene() {
      3
   }

   int getAct() {
      5
   }

   List<Map<String,String>> getLines() {
      [[text:"Alarum. Retreat. Enter YORK, RICHARD, WARWICK, and Soldiers, with drum and colours"], [speaker:"york", text:"Of Salisbury, who can report of him, That winter lion, who in rage forgets Aged contusions and all brush of time, And, like a gallant in the brow of youth, Repairs him with occasion This happy day Is not itself, nor have we won one foot, If Salisbury be lost."], [speaker:"richard", text:"My noble father, Three times today I holp him to his horse, Three times bestrid him thrice I led him off, Persuaded him from any further act: But still, where danger was, still there I met him And like rich hangings in a homely house, So was his will in his old feeble body. But, noble as he is, look where he comes."], [text:"Enter SALISBURY"], [speaker:"salisbury", text:"Now, by my sword, well hast thou fought today By the mass, so did we all. I thank you, Richard: God knows how long it is I have to live And it hath pleased him that three times today You have defended me from imminent death. Well, lords, we have not got that which we have: Tis not enough our foes are this time fled, Being opposites of such repairing nature."], [speaker:"york", text:"I know our safety is to follow them For, as I hear, the king is fled to London, To call a present court of parliament. Let us pursue him ere the writs go forth. What says Lord Warwick shall we after them"], [speaker:"warwick", text:"After them! nay, before them, if we can. Now, by my faith, lords, twas a glorious day: Saint Albans battle won by famous York Shall be eternized in all age to come. Sound drums and trumpets, and to London all: And more such days as these to us befall! I wonder how the king escaped our hands."], [text:"Exeunt"]]
   }

}
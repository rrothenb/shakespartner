package shakespartner.plays.henrytheeighth

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act5Scene2 extends Scene {
   String getLocation() {
      "Before the councilchamber. Pursuivants, Pages,  and c."
   }

   int getScene() {
      2
   }

   int getAct() {
      5
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter CRANMER"], [speaker:"cranmer", text:"I hope I am not too late and yet the gentleman, That was sent to me from the council, prayd me To make great haste. All fast what means this Ho! Who waits there Sure, you know me"], [text:"Enter Keeper"], [speaker:"keeper", text:"Yes, my lord But yet I cannot help you."], [speaker:"cranmer", text:"Why"], [text:"Enter DOCTOR BUTTS"], [speaker:"keeper", text:"Your grace must wait till you be calld for."], [speaker:"cranmer", text:"So."], [speaker:"doctor butts", text:"[Aside]  This is a piece of malice. I am glad I came this way so happily: the king Shall understand it presently."], [text:"Exit"], [speaker:"cranmer", text:"[Aside]Tis Butts, The kings physician: as he passd along, How earnestly he cast his eyes upon me! Pray heaven, he sound not my disgrace! For certain, This is of purpose laid by some that hate me God turn their hearts! I never sought their malice To quench mine honour: they would shame to make me Wait else at door, a fellowcounsellor, Mong boys, grooms, and lackeys. But their pleasures Must be fulfilld, and I attend with patience."], [text:"Enter the KING HENRY VIII and DOCTOR BUTTS at a window above"], [speaker:"doctor butts", text:"Ill show your grace the strangest sight"], [speaker:"king henry the eighth", text:"Whats that, Butts"], [speaker:"doctor butts", text:"I think your highness saw this many a day."], [speaker:"king henry the eighth", text:"Body o me, where is it"], [speaker:"doctor butts", text:"There, my lord: The high promotion of his grace of Canterbury Who holds his state at door, mongst pursuivants, Pages, and footboys."], [speaker:"king henry the eighth", text:"Ha! tis he, indeed: Is this the honour they do one another Tis well theres one above em yet. I had thought They had parted so much honesty among em At least, good manners, as not thus to suffer A man of his place, and so near our favour, To dance attendance on their lordships pleasures, And at the door too, like a post with packets. By holy Mary, Butts, theres knavery: Let em alone, and draw the curtain close: We shall hear more anon."], [text:"Exeunt"]]
   }

}

package shakespartner.plays.asyoulikeit

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act3Scene1 extends Scene {
   String getLocation() {
      "A room in the palace."
   }

   int getScene() {
      1
   }

   int getAct() {
      3
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter DUKE FREDERICK, Lords, and OLIVER"], [speaker:"duke frederick", text:"Not see him since Sir, sir, that cannot be: But were I not the better part made mercy, I should not seek an absent argument Of my revenge, thou present. But look to it: Find out thy brother, wheresoeer he is Seek him with candle bring him dead or living Within this twelvemonth, or turn thou no more To seek a living in our territory. Thy lands and all things that thou dost call thine Worth seizure do we seize into our hands, Till thou canst quit thee by thy brothers mouth Of what we think against thee."], [speaker:"oliver", text:"O that your highness knew my heart in this! I never loved my brother in my life."], [speaker:"duke frederick", text:"More villain thou. Well, push him out of doors And let my officers of such a nature Make an extent upon his house and lands: Do this expediently and turn him going."], [text:"Exeunt"]]
   }

}
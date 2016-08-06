package shakespartner.plays.henrythesixthpart3

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act4Scene2 extends Scene {
   String getLocation() {
      "A plain in Warwickshire."
   }

   int getScene() {
      2
   }

   int getAct() {
      4
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter WARWICK and OXFORD, with French soldiers"], [speaker:"warwick", text:"Trust me, my lord, all hitherto goes well The common people by numbers swarm to us. But see where Somerset and Clarence come! Speak suddenly, my lords, are we all friends"], [text:"Enter CLARENCE and SOMERSET"], [speaker:"clarence", text:"Fear not that, my lord."], [speaker:"warwick", text:"Then, gentle Clarence, welcome unto Warwick And welcome, Somerset: I hold it cowardice To rest mistrustful where a noble heart Hath pawnd an open hand in sign of love Else might I think that Clarence, Edwards brother, Were but a feigned friend to our proceedings: But welcome, sweet Clarence my daughter shall be thine. And now what rests but, in nights coverture, Thy brother being carelessly encampd, His soldiers lurking in the towns about, And but attended by a simple guard, We may surprise and take him at our pleasure Our scouts have found the adventure very easy: That as Ulysses and stout Diomede With sleight and manhood stole to Rhesus tents, And brought from thence the Thracian fatal steeds, So we, well coverd with the nights black mantle, At unawares may beat down Edwards guard And seize himself I say not, slaughter him, For I intend but only to surprise him. You that will follow me to this attempt, Applaud the name of Henry with your leader. They all cry, Henry! Why, then, lets on our way in silent sort: For Warwick and his friends, God and Saint George!"], [text:"Exeunt"]]
   }

}
package shakespartner.plays.merrywivesofwindsor

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act5Scene2 extends Scene {
   String getLocation() {
      "Windsor Park."
   }

   int getScene() {
      2
   }

   int getAct() {
      5
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter PAGE, SHALLOW, and SLENDER"], [speaker:"page", text:"Come, come well couch i the castleditch till we see the light of our fairies. Remember, son Slender, my daughter."], [speaker:"slender", text:"Ay, forsooth I have spoke with her and we have a nayword how to know one another: I come to her in white, and cry mum she cries budget and by that we know one another."], [speaker:"shallow", text:"Thats good too: but what needs either your mum or her budget the white will decipher her well enough. It hath struck ten oclock."], [speaker:"page", text:"The night is dark light and spirits will become it well. Heaven prosper our sport! No man means evil but the devil, and we shall know him by his horns. Lets away follow me."], [text:"Exeunt"]]
   }

}

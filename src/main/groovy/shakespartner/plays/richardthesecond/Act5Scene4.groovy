package shakespartner.plays.richardthesecond

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act5Scene4 extends Scene {
   String getLocation() {
      "The same."
   }

   int getScene() {
      4
   }

   int getAct() {
      5
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter EXTON and Servant"], [speaker:"exton", text:"Didst thou not mark the king, what words he spake, Have I no friend will rid me of this living fear Was it not so"], [speaker:"servant", text:"These were his very words."], [speaker:"exton", text:"Have I no friend quoth he: he spake it twice, And urged it twice together, did he not"], [speaker:"servant", text:"He did."], [speaker:"exton", text:"And speaking it, he wistly lookd on me, And who should say, I would thou wert the man That would divorce this terror from my heart Meaning the king at Pomfret. Come, lets go: I am the kings friend, and will rid his foe."], [text:"Exeunt"]]
   }

}
package shakespartner.plays.asyoulikeit

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act4Scene2 extends Scene {
   String getLocation() {
      "The forest."
   }

   int getScene() {
      2
   }

   int getAct() {
      4
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter JAQUES, Lords, and Foresters"], [speaker:"jaques", text:"Which is he that killed the deer"], [speaker:"a lord", text:"Sir, it was I."], [speaker:"jaques", text:"Lets present him to the duke, like a Roman conqueror and it would do well to set the deers horns upon his head, for a branch of victory. Have you no song, forester, for this purpose"], [speaker:"forester", text:"Yes, sir."], [speaker:"jaques", text:"Sing it: tis no matter how it be in tune, so it make noise enough. SONG."], [speaker:"forester", text:"What shall he have that killd the deer His leather skin and horns to wear. Then sing him home Take thou no scorn to wear the horn It was a crest ere thou wast born: Thy fathers father wore it, And thy father bore it: The horn, the horn, the lusty horn Is not a thing to laugh to scorn."], [text:"The rest shall bear this burden"], [text:"Exeunt"]]
   }

}

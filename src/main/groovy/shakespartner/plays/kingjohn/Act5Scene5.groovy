package shakespartner.plays.kingjohn

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act5Scene5 extends Scene {
   String getLocation() {
      "The French camp."
   }

   int getScene() {
      5
   }

   int getAct() {
      5
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter LEWIS and his train"], [speaker:"lewis", text:"The sun of heaven methought was loath to set, But stayd and made the western welkin blush, When English measure backward their own ground In faint retire. O, bravely came we off, When with a volley of our needless shot, After such bloody toil, we bid good night And wound our tattering colours clearly up, Last in the field, and almost lords of it!"], [text:"Enter a Messenger"], [speaker:"messenger", text:"Where is my prince, the Dauphin"], [speaker:"lewis", text:"Here: what news"], [speaker:"messenger", text:"The Count Melun is slain the English lords By his persuasion are again falln off, And your supply, which you have wishd so long, Are cast away and sunk on Goodwin Sands."], [speaker:"lewis", text:"Ah, foul shrewd news! beshrew thy very heart! I did not think to be so sad tonight As this hath made me. Who was he that said King John did fly an hour or two before The stumbling night did part our weary powers"], [speaker:"messenger", text:"Whoever spoke it, it is true, my lord."], [speaker:"lewis", text:"Well keep good quarter and good care tonight: The day shall not be up so soon as I, To try the fair adventure of tomorrow."], [text:"Exeunt"]]
   }

}

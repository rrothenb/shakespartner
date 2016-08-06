package shakespartner.plays.merrywivesofwindsor

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act5Scene3 extends Scene {
   String getLocation() {
      "A street leading to the Park."
   }

   int getScene() {
      3
   }

   int getAct() {
      5
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter MISTRESS PAGE, MISTRESS FORD, and DOCTOR CAIUS"], [speaker:"mistress page", text:"Master doctor, my daughter is in green: when you see your time, take her by the band, away with her to the deanery, and dispatch it quickly. Go before into the Park: we two must go together."], [speaker:"doctor caius", text:"I know vat I have to do. Adieu."], [speaker:"mistress page", text:"Fare you well, sir. My husband will not rejoice so much at the abuse of Falstaff as he will chafe at the doctors marrying my daughter: but tis no matter better a little chiding than a great deal of heartbreak."], [text:"Exit DOCTOR CAIUS"], [speaker:"mistress ford", text:"Where is Nan now and her troop of fairies, and the Welsh devil Hugh"], [speaker:"mistress page", text:"They are all couched in a pit hard by Hernes oak, with obscured lights which, at the very instant of Falstaffs and our meeting, they will at once display to the night."], [speaker:"mistress ford", text:"That cannot choose but amaze him."], [speaker:"mistress page", text:"If he be not amazed, he will be mocked if he be amazed, he will every way be mocked."], [speaker:"mistress ford", text:"Well betray him finely."], [speaker:"mistress page", text:"Against such lewdsters and their lechery Those that betray them do no treachery."], [speaker:"mistress ford", text:"The hour draws on. To the oak, to the oak!"], [text:"Exeunt"]]
   }

}
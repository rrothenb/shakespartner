package shakespartner.plays.cymbeline

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act3Scene7 extends Scene {
   String getLocation() {
      "Rome. A public place."
   }

   int getScene() {
      7
   }

   int getAct() {
      3
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter two Senators and Tribunes"], [speaker:"first senator", text:"This is the tenor of the emperors writ: That since the common men are now in action Gainst the Pannonians and Dalmatians, And that the legions now in Gallia are Full weak to undertake our wars against The fallnoff Britons, that we do incite The gentry to this business. He creates Lucius preconsul: and to you the tribunes, For this immediate levy, he commends His absolute commission. Long live Caesar!"], [speaker:"first tribune", text:"Is Lucius general of the forces"], [speaker:"second senator", text:"Ay."], [speaker:"first tribune", text:"Remaining now in Gallia"], [speaker:"first senator", text:"With those legions Which I have spoke of, whereunto your levy Must be supplyant: the words of your commission Will tie you to the numbers and the time Of their dispatch."], [speaker:"first tribune", text:"We will discharge our duty."], [text:"Exeunt"]]
   }

}

package shakespartner.plays.kinglear

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act5Scene2 extends Scene {
   String getLocation() {
      "A field between the two camps."
   }

   int getScene() {
      2
   }

   int getAct() {
      5
   }

   List<Map<String,String>> getLines() {
      [[text:"Alarum within. Enter, with drum and colours,  KING LEAR, CORDELIA, and Soldiers, over the stage and exeunt"], [text:"Enter EDGAR and GLOUCESTER"], [speaker:"edgar", text:"Here, father, take the shadow of this tree For your good host pray that the right may thrive: If ever I return to you again, Ill bring you comfort."], [speaker:"gloucester", text:"Grace go with you, sir!"], [text:"Exit EDGAR"], [text:"Alarum and retreat within. Reenter EDGAR"], [speaker:"edgar", text:"Away, old man give me thy hand away! King Lear hath lost, he and his daughter taen: Give me thy hand come on."], [speaker:"gloucester", text:"No farther, sir a man may rot even here."], [speaker:"edgar", text:"What, in ill thoughts again Men must endure Their going hence, even as their coming hither Ripeness is all: come on."], [speaker:"gloucester", text:"And thats true too."], [text:"Exeunt"]]
   }

}

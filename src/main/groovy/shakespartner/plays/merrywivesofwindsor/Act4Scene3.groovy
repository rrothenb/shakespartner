package shakespartner.plays.merrywivesofwindsor

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act4Scene3 extends Scene {
   String getLocation() {
      "A room in the Garter Inn."
   }

   int getScene() {
      3
   }

   int getAct() {
      4
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter Host and BARDOLPH"], [speaker:"bardolph", text:"Sir, the Germans desire to have three of your horses: the duke himself will be tomorrow at court, and they are going to meet him."], [speaker:"host", text:"What duke should that be comes so secretly I hear not of him in the court. Let me speak with the gentlemen: they speak English"], [speaker:"bardolph", text:"Ay, sir Ill call them to you."], [speaker:"host", text:"They shall have my horses but Ill make them pay Ill sauce them: they have had my house a week at command I have turned away my other guests: they must come off Ill sauce them. Come."], [text:"Exeunt"]]
   }

}

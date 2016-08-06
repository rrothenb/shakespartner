package shakespartner.plays.kinglear

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act3Scene5 extends Scene {
   String getLocation() {
      "Gloucesters castle."
   }

   int getScene() {
      5
   }

   int getAct() {
      3
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter CORNWALL and EDMUND"], [speaker:"cornwall", text:"I will have my revenge ere I depart his house."], [speaker:"edmund", text:"How, my lord, I may be censured, that nature thus gives way to loyalty, something fears me to think of."], [speaker:"cornwall", text:"I now perceive, it was not altogether your brothers evil disposition made him seek his death but a provoking merit, set awork by a reprovable badness in himself."], [speaker:"edmund", text:"How malicious is my fortune, that I must repent to be just! This is the letter he spoke of, which approves him an intelligent party to the advantages of France: O heavens! that this treason were not, or not I the detector!"], [speaker:"cornwall", text:"o with me to the duchess."], [speaker:"edmund", text:"If the matter of this paper be certain, you have mighty business in hand."], [speaker:"cornwall", text:"True or false, it hath made thee earl of Gloucester. Seek out where thy father is, that he may be ready for our apprehension."], [speaker:"edmund", text:"[Aside]  If I find him comforting the king, it will stuff his suspicion more fully.I will persevere in my course of loyalty, though the conflict be sore between that and my blood."], [speaker:"cornwall", text:"I will lay trust upon thee and thou shalt find a dearer father in my love."], [text:"Exeunt"]]
   }

}

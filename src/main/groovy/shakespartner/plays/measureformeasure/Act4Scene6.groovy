package shakespartner.plays.measureformeasure

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act4Scene6 extends Scene {
   String getLocation() {
      "Street near the city gate."
   }

   int getScene() {
      6
   }

   int getAct() {
      4
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter ISABELLA and MARIANA"], [speaker:"isabella", text:"To speak so indirectly I am loath: I would say the truth but to accuse him so, That is your part: yet I am advised to do it He says, to veil full purpose."], [speaker:"mariana", text:"Be ruled by him."], [speaker:"isabella", text:"Besides, he tells me that, if peradventure He speak against me on the adverse side, I should not think it strange for tis a physic Thats bitter to sweet end."], [speaker:"mariana", text:"I would Friar Peter"], [speaker:"isabella", text:"O, peace! the friar is come."], [text:"Enter FRIAR PETER"], [speaker:"friar peter", text:"Come, I have found you out a stand most fit, Where you may have such vantage on the duke, He shall not pass you. Twice have the trumpets sounded The generous and gravest citizens Have hent the gates, and very near upon The duke is entering: therefore, hence, away!"], [text:"Exeunt"]]
   }

}

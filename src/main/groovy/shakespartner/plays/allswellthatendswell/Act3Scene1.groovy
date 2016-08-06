package shakespartner.plays.allswellthatendswell

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act3Scene1 extends Scene {
   String getLocation() {
      "Florence. The DUKEs palace."
   }

   int getScene() {
      1
   }

   int getAct() {
      3
   }

   List<Map<String,String>> getLines() {
      [[text:"Flourish. Enter the DUKE of Florence attended the two Frenchmen, with a troop of soldiers."], [speaker:"duke", text:"So that from point to point now have you heard The fundamental reasons of this war, Whose great decision hath much blood let forth And more thirsts after."], [speaker:"first lord", text:"Holy seems the quarrel Upon your graces part black and fearful On the opposer."], [speaker:"duke", text:"Therefore we marvel much our cousin France Would in so just a business shut his bosom Against our borrowing prayers."], [speaker:"second lord", text:"Good my lord, The reasons of our state I cannot yield, But like a common and an outward man, That the great figure of a council frames By selfunable motion: therefore dare not Say what I think of it, since I have found Myself in my incertain grounds to fail As often as I guessd."], [speaker:"duke", text:"Be it his pleasure."], [speaker:"first lord", text:"But I am sure the younger of our nature, That surfeit on their ease, will day by day Come here for physic."], [speaker:"duke", text:"Welcome shall they be And all the honours that can fly from us Shall on them settle. You know your places well When better fall, for your avails they fell: Tomorrow to the field."], [text:"Flourish. Exeunt"]]
   }

}

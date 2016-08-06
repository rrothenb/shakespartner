package shakespartner.plays.coriolanus

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act4Scene4 extends Scene {
   String getLocation() {
      "Antium. Before Aufidiuss house."
   }

   int getScene() {
      4
   }

   int getAct() {
      4
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter CORIOLANUS in mean apparel, disguised and muffled"], [speaker:"coriolanus", text:"A goodly city is this Antium. City, Tis I that made thy widows: many an heir Of these fair edifices fore my wars Have I heard groan and drop: then know me not, Lest that thy wives with spits and boys with stones In puny battle slay me. Save you, sir."], [text:"Enter a Citizen"], [speaker:"citizen", text:"And you."], [speaker:"coriolanus", text:"Direct me, if it be your will, Where great Aufidius lies: is he in Antium"], [speaker:"citizen", text:"He is, and feasts the nobles of the state At his house this night."], [speaker:"coriolanus", text:"Which is his house, beseech you"], [speaker:"citizen", text:"This, here before you."], [speaker:"coriolanus", text:"Thank you, sir: farewell. O world, thy slippery turns! Friends now fast sworn, Whose double bosoms seem to wear one heart, Whose house, whose bed, whose meal, and exercise, Are still together, who twin, as twere, in love Unseparable, shall within this hour, On a dissension of a doit, break out To bitterest enmity: so, fellest foes, Whose passions and whose plots have broke their sleep, To take the one the other, by some chance, Some trick not worth an egg, shall grow dear friends And interjoin their issues. So with me: My birthplace hate I, and my loves upon This enemy town. Ill enter: if he slay me, He does fair justice if he give me way, Ill do his country service."], [text:"Exit Citizen"], [text:"Exit"]]
   }

}
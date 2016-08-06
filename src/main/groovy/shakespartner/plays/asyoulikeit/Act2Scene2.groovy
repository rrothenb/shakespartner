package shakespartner.plays.asyoulikeit

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act2Scene2 extends Scene {
   String getLocation() {
      "A room in the palace."
   }

   int getScene() {
      2
   }

   int getAct() {
      2
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter DUKE FREDERICK, with Lords"], [speaker:"duke frederick", text:"Can it be possible that no man saw them It cannot be: some villains of my court Are of consent and sufferance in this."], [speaker:"first lord", text:"I cannot hear of any that did see her. The ladies, her attendants of her chamber, Saw her abed, and in the morning early They found the bed untreasured of their mistress."], [speaker:"second lord", text:"My lord, the roynish clown, at whom so oft Your grace was wont to laugh, is also missing. Hisperia, the princess gentlewoman, Confesses that she secretly oerheard Your daughter and her cousin much commend The parts and graces of the wrestler That did but lately foil the sinewy Charles And she believes, wherever they are gone, That youth is surely in their company."], [speaker:"duke frederick", text:"Send to his brother fetch that gallant hither If he be absent, bring his brother to me Ill make him find him: do this suddenly, And let not search and inquisition quail To bring again these foolish runaways."], [text:"Exeunt"]]
   }

}

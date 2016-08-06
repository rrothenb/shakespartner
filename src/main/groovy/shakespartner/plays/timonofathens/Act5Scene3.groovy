package shakespartner.plays.timonofathens

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act5Scene3 extends Scene {
   String getLocation() {
      "The woods. Timons cave, and a rude tomb seen."
   }

   int getScene() {
      3
   }

   int getAct() {
      5
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter a Soldier, seeking TIMON"], [speaker:"soldier", text:"By all description this should be the place. Whos here speak, ho! No answer! What is this Timon is dead, who hath outstretchd his span: Some beast reard this there does not live a man. Dead, sure and this his grave. Whats on this tomb I cannot read the character Ill take with wax: Our captain hath in every figure skill, An aged interpreter, though young in days: Before proud Athens hes set down by this, Whose fall the mark of his ambition is."], [text:"Exit"]]
   }

}

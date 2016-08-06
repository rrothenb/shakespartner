package shakespartner.plays.antonyandcleopatra

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act4Scene1 extends Scene {
   String getLocation() {
      "Before Alexandria. OCTAVIUS CAESARs camp."
   }

   int getScene() {
      1
   }

   int getAct() {
      4
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter OCTAVIUS CAESAR, AGRIPPA, and MECAENAS, with his Army OCTAVIUS CAESAR reading a letter"], [speaker:"octavius caesar", text:"He calls me boy and chides, as he had power To beat me out of Egypt my messenger He hath whippd with rods dares me to personal combat, Caesar to Antony: let the old ruffian know I have many other ways to die meantime Laugh at his challenge."], [speaker:"mecaenas", text:"Caesar must think, When one so great begins to rage, hes hunted Even to falling. Give him no breath, but now Make boot of his distraction: never anger Made good guard for itself."], [speaker:"octavius caesar", text:"Let our best heads Know, that tomorrow the last of many battles We mean to fight: within our files there are, Of those that served Mark Antony but late, Enough to fetch him in. See it done: And feast the army we have store to dot, And they have earnd the waste. Poor Antony!"], [text:"Exeunt"]]
   }

}

package shakespartner.plays.coriolanus

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act5Scene5 extends Scene {
   String getLocation() {
      "The same. A street near the gate."
   }

   int getScene() {
      5
   }

   int getAct() {
      5
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter two Senators with VOLUMNIA, VIRGILIA,  VALERIA,  and c. passing over the stage, followed by Patricians and others"], [speaker:"first senator", text:"Behold our patroness, the life of Rome! Call all your tribes together, praise the gods, And make triumphant fires strew flowers before them: Unshout the noise that banishd Marcius, Repeal him with the welcome of his mother Cry Welcome, ladies, welcome!"], [speaker:"all", text:"Welcome, ladies, Welcome!"], [text:"A flourish with drums and trumpets. Exeunt"]]
   }

}

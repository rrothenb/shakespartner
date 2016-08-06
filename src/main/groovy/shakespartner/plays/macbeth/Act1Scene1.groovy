package shakespartner.plays.macbeth

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act1Scene1 extends Scene {
   String getLocation() {
      "A desert place."
   }

   int getScene() {
      1
   }

   int getAct() {
      1
   }

   List<Map<String,String>> getLines() {
      [[text:"Thunder and lightning. Enter three Witches"], [speaker:"first witch", text:"When shall we three meet again In thunder, lightning, or in rain"], [speaker:"second witch", text:"When the hurlyburlys done, When the battles lost and won."], [speaker:"third witch", text:"That will be ere the set of sun."], [speaker:"first witch", text:"Where the place"], [speaker:"second witch", text:"Upon the heath."], [speaker:"third witch", text:"There to meet with Macbeth."], [speaker:"first witch", text:"I come, Graymalkin!"], [speaker:"second witch", text:"Paddock calls."], [speaker:"third witch", text:"Anon."], [speaker:"all", text:"Fair is foul, and foul is fair: Hover through the fog and filthy air."], [text:"Exeunt"]]
   }

}

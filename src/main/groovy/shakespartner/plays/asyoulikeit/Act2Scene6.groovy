package shakespartner.plays.asyoulikeit

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act2Scene6 extends Scene {
   String getLocation() {
      "The forest."
   }

   int getScene() {
      6
   }

   int getAct() {
      2
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter ORLANDO and ADAM"], [speaker:"adam", text:"Dear master, I can go no further. O, I die for food! Here lie I down, and measure out my grave. Farewell, kind master."], [speaker:"orlando", text:"Why, how now, Adam! no greater heart in thee Live a little comfort a little cheer thyself a little. If this uncouth forest yield any thing savage, I will either be food for it or bring it for food to thee. Thy conceit is nearer death than thy powers. For my sake be comfortable hold death awhile at the arms end: I will here be with thee presently and if I bring thee not something to eat, I will give thee leave to die: but if thou diest before I come, thou art a mocker of my labour. Well said! thou lookest cheerly, and Ill be with thee quickly. Yet thou liest in the bleak air: come, I will bear thee to some shelter and thou shalt not die for lack of a dinner, if there live any thing in this desert. Cheerly, good Adam!"], [text:"Exeunt"]]
   }

}

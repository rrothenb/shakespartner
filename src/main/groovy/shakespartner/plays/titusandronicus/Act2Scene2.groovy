package shakespartner.plays.titusandronicus

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act2Scene2 extends Scene {
   String getLocation() {
      "A forest near Rome. Horns and cry of hounds heard."
   }

   int getScene() {
      2
   }

   int getAct() {
      2
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter TITUS ANDRONICUS, with Hunters,  and c., MARCUS, LUCIUS, QUINTUS, and MARTIUS"], [speaker:"titus andronicus", text:"The hunt is up, the morn is bright and grey, The fields are fragrant and the woods are green: Uncouple here and let us make a bay And wake the emperor and his lovely bride And rouse the prince and ring a hunters peal, That all the court may echo with the noise. Sons, let it be your charge, as it is ours, To attend the emperors person carefully: I have been troubled in my sleep this night, But dawning day new comfort hath inspired. Many good morrows to your majesty Madam, to you as many and as good: I promised your grace a hunters peal."], [text:"A cry of hounds and horns, winded in a peal. Enter  SATURNINUS, TAMORA, BASSIANUS, LAVINIA, DEMETRIUS, CHIRON, and Attendants"], [speaker:"saturninus", text:"And you have rung it lustily, my lord Somewhat too early for newmarried ladies."], [speaker:"bassianus", text:"Lavinia, how say you"], [speaker:"lavinia", text:"I say, no I have been broad awake two hours and more."], [speaker:"saturninus", text:"Come on, then horse and chariots let us have, And to our sport. Madam, now shall ye see Our Roman hunting."], [text:"To TAMORA"], [speaker:"marcus andronicus", text:"I have dogs, my lord, Will rouse the proudest panther in the chase, And climb the highest promontory top."], [speaker:"titus andronicus", text:"And I have horse will follow where the game Makes way, and run like swallows oer the plain."], [speaker:"demetrius", text:"Chiron, we hunt not, we, with horse nor hound, But hope to pluck a dainty doe to ground."], [text:"Exeunt"]]
   }

}

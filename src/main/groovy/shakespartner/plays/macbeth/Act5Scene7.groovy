package shakespartner.plays.macbeth

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act5Scene7 extends Scene {
   String getLocation() {
      "Another part of the field."
   }

   int getScene() {
      7
   }

   int getAct() {
      5
   }

   List<Map<String,String>> getLines() {
      [[text:"Alarums. Enter MACBETH"], [speaker:"macbeth", text:"They have tied me to a stake I cannot fly, But, bearlike, I must fight the course. Whats he That was not born of woman Such a one Am I to fear, or none."], [text:"Enter YOUNG SIWARD"], [speaker:"young siward", text:"What is thy name"], [speaker:"macbeth", text:"Thoult be afraid to hear it."], [speaker:"young siward", text:"No though thou callst thyself a hotter name Than any is in hell."], [speaker:"macbeth", text:"My names Macbeth."], [speaker:"young siward", text:"The devil himself could not pronounce a title More hateful to mine ear."], [speaker:"macbeth", text:"No, nor more fearful."], [speaker:"young siward", text:"Thou liest, abhorred tyrant with my sword Ill prove the lie thou speakst."], [text:"They fight and YOUNG SIWARD is slain"], [speaker:"macbeth", text:"Thou wast born of woman But swords I smile at, weapons laugh to scorn, Brandishd by man thats of a woman born."], [text:"Exit"], [text:"Alarums. Enter MACDUFF"], [speaker:"macduff", text:"That way the noise is. Tyrant, show thy face! If thou best slain and with no stroke of mine, My wife and childrens ghosts will haunt me still. I cannot strike at wretched kerns, whose arms Are hired to bear their staves: either thou, Macbeth, Or else my sword with an unbatterd edge I sheathe again undeeded. There thou shouldst be By this great clatter, one of greatest note Seems bruited. Let me find him, fortune! And more I beg not."], [text:"Exit. Alarums"], [text:"Enter MALCOLM and SIWARD"], [speaker:"siward", text:"This way, my lord the castles gently renderd: The tyrants people on both sides do fight The noble thanes do bravely in the war The day almost itself professes yours, And little is to do."], [speaker:"malcolm", text:"We have met with foes That strike beside us."], [speaker:"siward", text:"Enter, sir, the castle."], [text:"Exeunt. Alarums"]]
   }

}

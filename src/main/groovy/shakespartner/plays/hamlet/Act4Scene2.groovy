package shakespartner.plays.hamlet

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act4Scene2 extends Scene {
   String getLocation() {
      "Another room in the castle."
   }

   int getScene() {
      2
   }

   int getAct() {
      4
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter HAMLET"], [speaker:"hamlet", text:"Safely stowed. ROSENCRANTZ: GUILDENSTERN: [Within]  Hamlet! Lord Hamlet! What noise who calls on Hamlet O, here they come."], [text:"Enter ROSENCRANTZ and GUILDENSTERN"], [speaker:"rosencrantz", text:"What have you done, my lord, with the dead body"], [speaker:"hamlet", text:"Compounded it with dust, whereto tis kin."], [speaker:"rosencrantz", text:"Tell us where tis, that we may take it thence And bear it to the chapel."], [speaker:"hamlet", text:"Do not believe it."], [speaker:"rosencrantz", text:"Believe what"], [speaker:"hamlet", text:"That I can keep your counsel and not mine own. Besides, to be demanded of a sponge! what replication should be made by the son of a king"], [speaker:"rosencrantz", text:"Take you me for a sponge, my lord"], [speaker:"hamlet", text:"Ay, sir, that soaks up the kings countenance, his rewards, his authorities. But such officers do the king best service in the end: he keeps them, like an ape, in the corner of his jaw first mouthed, to be last swallowed: when he needs what you have gleaned, it is but squeezing you, and, sponge, you shall be dry again."], [speaker:"rosencrantz", text:"I understand you not, my lord."], [speaker:"hamlet", text:"I am glad of it: a knavish speech sleeps in a foolish ear."], [speaker:"rosencrantz", text:"My lord, you must tell us where the body is, and go with us to the king."], [speaker:"hamlet", text:"The body is with the king, but the king is not with the body. The king is a thing"], [speaker:"guildenstern", text:"A thing, my lord!"], [speaker:"hamlet", text:"Of nothing: bring me to him. Hide fox, and all after."], [text:"Exeunt"]]
   }

}
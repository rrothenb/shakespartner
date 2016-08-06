package shakespartner.plays.hamlet

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act4Scene6 extends Scene {
   String getLocation() {
      "Another room in the castle."
   }

   int getScene() {
      6
   }

   int getAct() {
      4
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter HORATIO and a Servant"], [speaker:"horatio", text:"What are they that would speak with me"], [speaker:"servant", text:"Sailors, sir: they say they have letters for you."], [speaker:"horatio", text:"Let them come in. I do not know from what part of the world I should be greeted, if not from Lord Hamlet."], [text:"Exit Servant"], [text:"Enter Sailors"], [speaker:"first sailor", text:"God bless you, sir."], [speaker:"horatio", text:"Let him bless thee too."], [speaker:"first sailor", text:"He shall, sir, ant please him. Theres a letter for you, sir it comes from the ambassador that was bound for England if your name be Horatio, as I am let to know it is."], [speaker:"horatio", text:"[Reads]  Horatio, when thou shalt have overlooked this, give these fellows some means to the king: they have letters for him. Ere we were two days old at sea, a pirate of very warlike appointment gave us chase. Finding ourselves too slow of sail, we put on a compelled valour, and in the grapple I boarded them: on the instant they got clear of our ship so I alone became their prisoner. They have dealt with me like thieves of mercy: but they knew what they did I am to do a good turn for them. Let the king have the letters I have sent and repair thou to me with as much speed as thou wouldst fly death. I have words to speak in thine ear will make thee dumb yet are they much too light for the bore of the matter. These good fellows will bring thee where I am. Rosencrantz and Guildenstern hold their course for England: of them I have much to tell thee. Farewell. He that thou knowest thine, HAMLET. Come, I will make you way for these your letters And dot the speedier, that you may direct me To him from whom you brought them."], [text:"Exeunt"]]
   }

}
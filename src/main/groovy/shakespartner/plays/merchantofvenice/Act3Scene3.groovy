package shakespartner.plays.merchantofvenice

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act3Scene3 extends Scene {
   String getLocation() {
      "Venice. A street."
   }

   int getScene() {
      3
   }

   int getAct() {
      3
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter SHYLOCK, SALARINO, ANTONIO, and Gaoler"], [speaker:"shylock", text:"Gaoler, look to him: tell not me of mercy This is the fool that lent out money gratis: Gaoler, look to him."], [speaker:"antonio", text:"Hear me yet, good Shylock."], [speaker:"shylock", text:"Ill have my bond speak not against my bond: I have sworn an oath that I will have my bond. Thou calldst me dog before thou hadst a cause But, since I am a dog, beware my fangs: The duke shall grant me justice. I do wonder, Thou naughty gaoler, that thou art so fond To come abroad with him at his request."], [speaker:"antonio", text:"I pray thee, hear me speak."], [speaker:"shylock", text:"Ill have my bond I will not hear thee speak: Ill have my bond and therefore speak no more. Ill not be made a soft and dulleyed fool, To shake the head, relent, and sigh, and yield To Christian intercessors. Follow not Ill have no speaking: I will have my bond."], [text:"Exit"], [speaker:"salarino", text:"It is the most impenetrable cur That ever kept with men."], [speaker:"antonio", text:"Let him alone: Ill follow him no more with bootless prayers. He seeks my life his reason well I know: I oft deliverd from his forfeitures Many that have at times made moan to me Therefore he hates me."], [speaker:"salarino", text:"I am sure the duke Will never grant this forfeiture to hold."], [speaker:"antonio", text:"The duke cannot deny the course of law: For the commodity that strangers have With us in Venice, if it be denied, Will much impeach the justice of his state Since that the trade and profit of the city Consisteth of all nations. Therefore, go: These griefs and losses have so bated me, That I shall hardly spare a pound of flesh Tomorrow to my bloody creditor. Well, gaoler, on. Pray God, Bassanio come To see me pay his debt, and then I care not!"], [text:"Exeunt"]]
   }

}

package shakespartner.plays.twelfthnight

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act2Scene1 extends Scene {
   String getLocation() {
      "The seacoast."
   }

   int getScene() {
      1
   }

   int getAct() {
      2
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter ANTONIO and SEBASTIAN"], [speaker:"antonio", text:"Will you stay no longer nor will you not that I go with you"], [speaker:"sebastian", text:"By your patience, no. My stars shine darkly over me: the malignancy of my fate might perhaps distemper yours therefore I shall crave of you your leave that I may bear my evils alone: it were a bad recompense for your love, to lay any of them on you. ANTONIO: Let me yet know of you whither you are bound. No, sooth, sir: my determinate voyage is mere extravagancy. But I perceive in you so excellent a touch of modesty, that you will not extort from me what I am willing to keep in therefore it charges me in manners the rather to express myself. You must know of me then, Antonio, my name is Sebastian, which I called Roderigo. My father was that Sebastian of Messaline, whom I know you have heard of. He left behind him myself and a sister, both born in an hour: if the heavens had been pleased, would we had so ended! but you, sir, altered that for some hour before you took me from the breach of the sea was my sister drowned."], [speaker:"antonio", text:"Alas the day!"], [speaker:"sebastian", text:"A lady, sir, though it was said she much resembled me, was yet of many accounted beautiful: but, though I could not with such estimable wonder overfar believe that, yet thus far I will boldly publish her she bore a mind that envy could not but call fair. She is drowned already, sir, with salt water, though I seem to drown her remembrance again with more."], [speaker:"antonio", text:"Pardon me, sir, your bad entertainment."], [speaker:"sebastian", text:"O good Antonio, forgive me your trouble."], [speaker:"antonio", text:"If you will not murder me for my love, let me be your servant."], [speaker:"sebastian", text:"If you will not undo what you have done, that is, kill him whom you have recovered, desire it not. Fare ye well at once: my bosom is full of kindness, and I am yet so near the manners of my mother, that upon the least occasion more mine eyes will tell tales of me. I am bound to the Count Orsinos court: farewell."], [text:"Exit"], [speaker:"antonio", text:"The gentleness of all the gods go with thee! I have many enemies in Orsinos court, Else would I very shortly see thee there. But, come what may, I do adore thee so, That danger shall seem sport, and I will go."], [text:"Exit"]]
   }

}

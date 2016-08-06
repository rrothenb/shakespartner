package shakespartner.plays.kinglear

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act1Scene3 extends Scene {
   String getLocation() {
      "The Duke of Albanys palace."
   }

   int getScene() {
      3
   }

   int getAct() {
      1
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter GONERIL, and OSWALD, her steward"], [speaker:"goneril", text:"Did my father strike my gentleman for chiding of his fool"], [speaker:"oswald", text:"Yes, madam."], [speaker:"goneril", text:"By day and night he wrongs me every hour He flashes into one gross crime or other, That sets us all at odds: Ill not endure it: His knights grow riotous, and himself upbraids us On every trifle. When he returns from hunting, I will not speak with him say I am sick: If you come slack of former services, You shall do well the fault of it Ill answer."], [speaker:"oswald", text:"Hes coming, madam I hear him."], [text:"Horns within"], [speaker:"goneril", text:"Put on what weary negligence you please, You and your fellows Ill have it come to question: If he dislike it, let him to our sister, Whose mind and mine, I know, in that are one, Not to be overruled. Idle old man, That still would manage those authorities That he hath given away! Now, by my life, Old fools are babes again and must be used With cheques as flatteries,when they are seen abused. Remember what I tell you."], [speaker:"oswald", text:"Well, madam."], [speaker:"goneril", text:"And let his knights have colder looks among you What grows of it, no matter advise your fellows so: I would breed from hence occasions, and I shall, That I may speak: Ill write straight to my sister, To hold my very course. Prepare for dinner."], [text:"Exeunt"]]
   }

}

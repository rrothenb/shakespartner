package shakespartner.plays.merrywivesofwindsor

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act5Scene1 extends Scene {
   String getLocation() {
      "A room in the Garter Inn."
   }

   int getScene() {
      1
   }

   int getAct() {
      5
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter FALSTAFF and MISTRESS QUICKLY"], [speaker:"falstaff", text:"Prithee, no more prattling go. Ill hold. This is the third time I hope good luck lies in odd numbers. Away I go. They say there is divinity in odd numbers, either in nativity, chance, or death. Away!"], [speaker:"mistress quickly", text:"Ill provide you a chain and Ill do what I can to get you a pair of horns."], [speaker:"falstaff", text:"Away, I say time wears: hold up your head, and mince. How now, Master Brook! Master Brook, the matter will be known tonight, or never. Be you in the Park about midnight, at Hernes oak, and you shall see wonders."], [text:"Exit MISTRESS QUICKLY"], [text:"Enter FORD"], [speaker:"ford", text:"Went you not to her yesterday, sir, as you told me you had appointed"], [speaker:"falstaff", text:"I went to her, Master Brook, as you see, like a poor old man: but I came from her, Master Brook, like a poor old woman. That same knave Ford, her husband, hath the finest mad devil of jealousy in him, Master Brook, that ever governed frenzy. I will tell you: he beat me grievously, in the shape of a woman for in the shape of man, Master Brook, I fear not Goliath with a weavers beam because I know also life is a shuttle. I am in haste go along with me: Ill tell you all, Master Brook. Since I plucked geese, played truant and whipped top, I knew not what twas to be beaten till lately. Follow me: Ill tell you strange things of this knave Ford, on whom tonight I will be revenged, and I will deliver his wife into your hand. Follow. Strange things in hand, Master Brook! Follow."], [text:"Exeunt"]]
   }

}

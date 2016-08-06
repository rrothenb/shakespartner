package shakespartner.plays.richardthethird

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act3Scene3 extends Scene {
   String getLocation() {
      "Pomfret Castle."
   }

   int getScene() {
      3
   }

   int getAct() {
      3
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter RATCLIFF, with halberds, carrying RIVERS, GREY, and VAUGHAN to death"], [speaker:"ratcliff", text:"Come, bring forth the prisoners."], [speaker:"rivers", text:"Sir Richard Ratcliff, let me tell thee this: Today shalt thou behold a subject die For truth, for duty, and for loyalty."], [speaker:"grey", text:"God keep the prince from all the pack of you! A knot you are of damned bloodsuckers!"], [speaker:"vaughan", text:"You live that shall cry woe for this after."], [speaker:"ratcliff", text:"Dispatch the limit of your lives is out."], [speaker:"rivers", text:"O Pomfret, Pomfret! O thou bloody prison, Fatal and ominous to noble peers! Within the guilty closure of thy walls Richard the second here was hackd to death And, for more slander to thy dismal seat, We give thee up our guiltless blood to drink."], [speaker:"grey", text:"Now Margarets curse is falln upon our heads, For standing by when Richard stabbd her son."], [speaker:"rivers", text:"Then cursed she Hastings, then cursed she Buckingham, Then cursed she Richard. O, remember, God To hear her prayers for them, as now for us And for my sister and her princely sons, Be satisfied, dear God, with our true blood, Which, as thou knowst, unjustly must be spilt."], [speaker:"ratcliff", text:"Make haste the hour of death is expiate."], [speaker:"rivers", text:"Come, Grey, come, Vaughan, let us all embrace: And take our leave, until we meet in heaven."], [text:"Exeunt"]]
   }

}
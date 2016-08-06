package shakespartner.plays.macbeth

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act3Scene3 extends Scene {
   String getLocation() {
      "A park near the palace."
   }

   int getScene() {
      3
   }

   int getAct() {
      3
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter three Murderers"], [speaker:"first murderer", text:"But who did bid thee join with us"], [speaker:"third murderer", text:"Macbeth."], [speaker:"second murderer", text:"He needs not our mistrust, since he delivers Our offices and what we have to do To the direction just."], [speaker:"first murderer", text:"Then stand with us. The west yet glimmers with some streaks of day: Now spurs the lated traveller apace To gain the timely inn and near approaches The subject of our watch."], [speaker:"third murderer", text:"Hark! I hear horses."], [speaker:"banquo", text:"[Within]  Give us a light there, ho!"], [speaker:"second murderer", text:"Then tis he: the rest That are within the note of expectation Already are i the court."], [speaker:"first murderer", text:"His horses go about."], [speaker:"third murderer", text:"Almost a mile: but he does usually, So all men do, from hence to the palace gate Make it their walk."], [speaker:"second murderer", text:"A light, a light!"], [text:"Enter BANQUO, and FLEANCE with a torch"], [speaker:"third murderer", text:"Tis he."], [speaker:"first murderer", text:"Stand tot."], [speaker:"banquo", text:"It will be rain tonight."], [speaker:"first murderer", text:"Let it come down."], [text:"They set upon BANQUO"], [speaker:"banquo", text:"O, treachery! Fly, good Fleance, fly, fly, fly! Thou mayst revenge. O slave!"], [text:"Dies. FLEANCE escapes"], [speaker:"third murderer", text:"Who did strike out the light"], [speaker:"first murderer", text:"Wast not the way"], [speaker:"third murderer", text:"Theres but one down the son is fled."], [speaker:"second murderer", text:"We have lost Best half of our affair."], [speaker:"first murderer", text:"Well, lets away, and say how much is done."], [text:"Exeunt"]]
   }

}

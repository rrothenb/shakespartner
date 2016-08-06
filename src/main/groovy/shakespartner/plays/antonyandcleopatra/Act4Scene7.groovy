package shakespartner.plays.antonyandcleopatra

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act4Scene7 extends Scene {
   String getLocation() {
      "Field of battle between the camps."
   }

   int getScene() {
      7
   }

   int getAct() {
      4
   }

   List<Map<String,String>> getLines() {
      [[text:"Alarum. Drums and trumpets. Enter AGRIPPA and others"], [speaker:"agrippa", text:"Retire, we have engaged ourselves too far: Caesar himself has work, and our oppression Exceeds what we expected."], [text:"Exeunt"], [text:"Alarums. Enter MARK ANTONY and SCARUS wounded"], [speaker:"scarus", text:"O my brave emperor, this is fought indeed! Had we done so at first, we had droven them home With clouts about their heads."], [speaker:"mark antony", text:"Thou bleedst apace."], [speaker:"scarus", text:"I had a wound here that was like a T, But now tis made an H."], [speaker:"mark antony", text:"They do retire."], [speaker:"scarus", text:"Well beat em into benchholes: I have yet Room for six scotches more."], [text:"Enter EROS"], [speaker:"eros", text:"They are beaten, sir, and our advantage serves For a fair victory."], [speaker:"scarus", text:"Let us score their backs, And snatch em up, as we take hares, behind: Tis sport to maul a runner."], [speaker:"mark antony", text:"I will reward thee Once for thy spritely comfort, and tenfold For thy good valour. Come thee on."], [speaker:"scarus", text:"Ill halt after."], [text:"Exeunt"]]
   }

}
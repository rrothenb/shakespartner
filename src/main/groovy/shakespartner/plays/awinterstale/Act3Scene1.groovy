package shakespartner.plays.awinterstale

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act3Scene1 extends Scene {
   String getLocation() {
      "A seaport in Sicilia."
   }

   int getScene() {
      1
   }

   int getAct() {
      3
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter CLEOMENES and DION"], [speaker:"cleomenes", text:"The climates delicate, the air most sweet, Fertile the isle, the temple much surpassing The common praise it bears."], [speaker:"dion", text:"I shall report, For most it caught me, the celestial habits, Methinks I so should term them, and the reverence Of the grave wearers. O, the sacrifice! How ceremonious, solemn and unearthly It was i the offering!"], [speaker:"cleomenes", text:"But of all, the burst And the eardeafening voice o the oracle, Kin to Joves thunder, so surprised my sense. That I was nothing."], [speaker:"dion", text:"If the event o the journey Prove as successful to the queen,O bet so! As it hath been to us rare, pleasant, speedy, The time is worth the use ont."], [speaker:"cleomenes", text:"Great Apollo Turn all to the best! These proclamations, So forcing faults upon Hermione, I little like."], [speaker:"dion", text:"The violent carriage of it Will clear or end the business: when the oracle, Thus by Apollos great divine seald up, Shall the contents discover, something rare Even then will rush to knowledge. Go: fresh horses! And gracious be the issue!"], [text:"Exeunt"]]
   }

}
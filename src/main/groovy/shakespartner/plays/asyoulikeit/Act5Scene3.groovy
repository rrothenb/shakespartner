package shakespartner.plays.asyoulikeit

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act5Scene3 extends Scene {
   String getLocation() {
      "The forest."
   }

   int getScene() {
      3
   }

   int getAct() {
      5
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter TOUCHSTONE and AUDREY"], [speaker:"touchstone", text:"Tomorrow is the joyful day, Audrey tomorrow will we be married."], [speaker:"audrey", text:"I do desire it with all my heart and I hope it is no dishonest desire to desire to be a woman of the world. Here comes two of the banished dukes pages."], [text:"Enter two Pages"], [speaker:"first page", text:"Well met, honest gentleman."], [speaker:"touchstone", text:"By my troth, well met. Come, sit, sit, and a song."], [speaker:"second page", text:"We are for you: sit i the middle."], [speaker:"first page", text:"Shall we clap intot roundly, without hawking or spitting or saying we are hoarse, which are the only prologues to a bad voice"], [speaker:"second page", text:"Ifaith, ifaith and both in a tune, like two gipsies on a horse. SONG. It was a lover and his lass, With a hey, and a ho, and a hey nonino, That oer the green cornfield did pass In the spring time, the only pretty ring time, When birds do sing, hey ding a ding, ding: Sweet lovers love the spring. Between the acres of the rye, With a hey, and a ho, and a hey nonino These pretty country folks would lie, In spring time,  and c. This carol they began that hour, With a hey, and a ho, and a hey nonino, How that a life was but a flower In spring time,  and c. And therefore take the present time, With a hey, and a ho, and a hey nonino For love is crowned with the prime In spring time,  and c."], [speaker:"touchstone", text:"Truly, young gentlemen, though there was no great matter in the ditty, yet the note was very untuneable."], [speaker:"first page", text:"You are deceived, sir: we kept time, we lost not our time."], [speaker:"touchstone", text:"By my troth, yes I count it but time lost to hear such a foolish song. God be wi you and God mend your voices! Come, Audrey."], [text:"Exeunt"]]
   }

}

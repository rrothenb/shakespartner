package shakespartner.plays.hamlet

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act4Scene1 extends Scene {
   String getLocation() {
      "A room in the castle."
   }

   int getScene() {
      1
   }

   int getAct() {
      4
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter KING CLAUDIUS, QUEEN GERTRUDE, ROSENCRANTZ, and GUILDENSTERN"], [speaker:"king claudius", text:"Theres matter in these sighs, these profound heaves: You must translate: tis fit we understand them. Where is your son"], [speaker:"queen gertrude", text:"Bestow this place on us a little while. Ah, my good lord, what have I seen tonight!"], [text:"Exeunt ROSENCRANTZ and GUILDENSTERN"], [speaker:"king claudius", text:"What, Gertrude How does Hamlet"], [speaker:"queen gertrude", text:"Mad as the sea and wind, when both contend Which is the mightier: in his lawless fit, Behind the arras hearing something stir, Whips out his rapier, cries, A rat, a rat! And, in this brainish apprehension, kills The unseen good old man."], [speaker:"king claudius", text:"O heavy deed! It had been so with us, had we been there: His liberty is full of threats to all To you yourself, to us, to every one. Alas, how shall this bloody deed be answerd It will be laid to us, whose providence Should have kept short, restraind and out of haunt, This mad young man: but so much was our love, We would not understand what was most fit But, like the owner of a foul disease, To keep it from divulging, let it feed Even on the pith of Life. Where is he gone"], [speaker:"queen gertrude", text:"To draw apart the body he hath killd: Oer whom his very madness, like some ore Among a mineral of metals base, Shows itself pure he weeps for what is done."], [speaker:"king claudius", text:"O Gertrude, come away! The sun no sooner shall the mountains touch, But we will ship him hence: and this vile deed We must, with all our majesty and skill, Both countenance and excuse. Ho, Guildenstern! Friends both, go join you with some further aid: Hamlet in madness hath Polonius slain, And from his mothers closet hath he draggd him: Go seek him out speak fair, and bring the body Into the chapel. I pray you, haste in this. Come, Gertrude, well call up our wisest friends And let them know, both what we mean to do, And whats untimely done. O, come away! My soul is full of discord and dismay."], [text:"Reenter ROSENCRANTZ and GUILDENSTERN"], [text:"Exeunt ROSENCRANTZ and GUILDENSTERN"], [text:"Exeunt"]]
   }

}
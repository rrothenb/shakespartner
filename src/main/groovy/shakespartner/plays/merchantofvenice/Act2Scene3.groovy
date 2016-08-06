package shakespartner.plays.merchantofvenice

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act2Scene3 extends Scene {
   String getLocation() {
      "The same. A room in SHYLOCKS house."
   }

   int getScene() {
      3
   }

   int getAct() {
      2
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter JESSICA and LAUNCELOT"], [speaker:"jessica", text:"I am sorry thou wilt leave my father so: Our house is hell, and thou, a merry devil, Didst rob it of some taste of tediousness. But fare thee well, there is a ducat for thee: And, Launcelot, soon at supper shalt thou see Lorenzo, who is thy new masters guest: Give him this letter do it secretly And so farewell: I would not have my father See me in talk with thee."], [speaker:"launcelot", text:"Adieu! tears exhibit my tongue. Most beautiful pagan, most sweet Jew! if a Christian did not play the knave and get thee, I am much deceived. But, adieu: these foolish drops do something drown my manly spirit: adieu."], [speaker:"jessica", text:"Farewell, good Launcelot. Alack, what heinous sin is it in me To be ashamed to be my fathers child! But though I am a daughter to his blood, I am not to his manners. O Lorenzo, If thou keep promise, I shall end this strife, Become a Christian and thy loving wife."], [text:"Exit Launcelot"], [text:"Exit"]]
   }

}
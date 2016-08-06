package shakespartner.plays.juliuscaesar

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act3Scene3 extends Scene {
   String getLocation() {
      "A street."
   }

   int getScene() {
      3
   }

   int getAct() {
      3
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter CINNA the poet"], [speaker:"cinna the poet", text:"I dreamt tonight that I did feast with Caesar, And things unlucky charge my fantasy: I have no will to wander forth of doors, Yet something leads me forth."], [text:"Enter Citizens"], [speaker:"first citizen", text:"What is your name"], [speaker:"second citizen", text:"Whither are you going"], [speaker:"third citizen", text:"Where do you dwell"], [speaker:"fourth citizen", text:"Are you a married man or a bachelor"], [speaker:"second citizen", text:"Answer every man directly."], [speaker:"first citizen", text:"Ay, and briefly."], [speaker:"fourth citizen", text:"Ay, and wisely."], [speaker:"third citizen", text:"Ay, and truly, you were best."], [speaker:"cinna the poet", text:"What is my name Whither am I going Where do I dwell Am I a married man or a bachelor Then, to answer every man directly and briefly, wisely and truly: wisely I say, I am a bachelor."], [speaker:"second citizen", text:"Thats as much as to say, they are fools that marry: youll bear me a bang for that, I fear. Proceed directly."], [speaker:"cinna the poet", text:"Directly, I am going to Caesars funeral."], [speaker:"first citizen", text:"As a friend or an enemy"], [speaker:"cinna the poet", text:"As a friend."], [speaker:"second citizen", text:"That matter is answered directly."], [speaker:"fourth citizen", text:"For your dwelling,briefly."], [speaker:"cinna the poet", text:"Briefly, I dwell by the Capitol."], [speaker:"third citizen", text:"Your name, sir, truly."], [speaker:"cinna the poet", text:"Truly, my name is Cinna."], [speaker:"first citizen", text:"Tear him to pieces hes a conspirator."], [speaker:"cinna the poet", text:"I am Cinna the poet, I am Cinna the poet."], [speaker:"fourth citizen", text:"Tear him for his bad verses, tear him for his bad verses."], [speaker:"cinna the poet", text:"I am not Cinna the conspirator."], [speaker:"fourth citizen", text:"It is no matter, his names Cinna pluck but his name out of his heart, and turn him going."], [speaker:"third citizen", text:"Tear him, tear him! Come, brands ho! firebrands: to Brutus, to Cassius burn all: some to Decius house, and some to Cascas some to Ligarius: away, go!"], [text:"Exeunt"]]
   }

}

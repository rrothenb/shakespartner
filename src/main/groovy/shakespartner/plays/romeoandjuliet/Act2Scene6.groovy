package shakespartner.plays.romeoandjuliet

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act2Scene6 extends Scene {
   String getLocation() {
      "Friar Laurences cell."
   }

   int getScene() {
      6
   }

   int getAct() {
      2
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter FRIAR LAURENCE and ROMEO"], [speaker:"friar laurence", text:"So smile the heavens upon this holy act, That after hours with sorrow chide us not!"], [speaker:"romeo", text:"Amen, amen! but come what sorrow can, It cannot countervail the exchange of joy That one short minute gives me in her sight: Do thou but close our hands with holy words, Then lovedevouring death do what he dare It is enough I may but call her mine."], [speaker:"friar laurence", text:"These violent delights have violent ends And in their triumph die, like fire and powder, Which as they kiss consume: the sweetest honey Is loathsome in his own deliciousness And in the taste confounds the appetite: Therefore love moderately long love doth so Too swift arrives as tardy as too slow. Here comes the lady: O, so light a foot Will neer wear out the everlasting flint: A lover may bestride the gossamer That idles in the wanton summer air, And yet not fall so light is vanity."], [text:"Enter JULIET"], [speaker:"juliet", text:"Good even to my ghostly confessor."], [speaker:"friar laurence", text:"Romeo shall thank thee, daughter, for us both."], [speaker:"juliet", text:"As much to him, else is his thanks too much."], [speaker:"romeo", text:"Ah, Juliet, if the measure of thy joy Be heapd like mine and that thy skill be more To blazon it, then sweeten with thy breath This neighbour air, and let rich musics tongue Unfold the imagined happiness that both Receive in either by this dear encounter."], [speaker:"juliet", text:"Conceit, more rich in matter than in words, Brags of his substance, not of ornament: They are but beggars that can count their worth But my true love is grown to such excess I cannot sum up sum of half my wealth."], [speaker:"friar laurence", text:"Come, come with me, and we will make short work For, by your leaves, you shall not stay alone Till holy church incorporate two in one."], [text:"Exeunt"]]
   }

}
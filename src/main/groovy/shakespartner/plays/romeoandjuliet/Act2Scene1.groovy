package shakespartner.plays.romeoandjuliet

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act2Scene1 extends Scene {
   String getLocation() {
      "A lane by the wall of Capulets orchard."
   }

   int getScene() {
      1
   }

   int getAct() {
      2
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter ROMEO"], [speaker:"romeo", text:"Can I go forward when my heart is here Turn back, dull earth, and find thy centre out."], [text:"He climbs the wall, and leaps down within it"], [text:"Enter BENVOLIO and MERCUTIO"], [speaker:"benvolio", text:"Romeo! my cousin Romeo!"], [speaker:"mercutio", text:"He is wise And, on my lie, hath stoln him home to bed."], [speaker:"benvolio", text:"He ran this way, and leapd this orchard wall: Call, good Mercutio."], [speaker:"mercutio", text:"Nay, Ill conjure too. Romeo! humours! madman! passion! lover! Appear thou in the likeness of a sigh: Speak but one rhyme, and I am satisfied Cry but Ay me! pronounce but love and dove Speak to my gossip Venus one fair word, One nickname for her purblind son and heir, Young Adam Cupid, he that shot so trim, When King Cophetua loved the beggarmaid! He heareth not, he stirreth not, he moveth not The ape is dead, and I must conjure him. I conjure thee by Rosalines bright eyes, By her high forehead and her scarlet lip, By her fine foot, straight leg and quivering thigh And the demesnes that there adjacent lie, That in thy likeness thou appear to us!"], [speaker:"benvolio", text:"And if he hear thee, thou wilt anger him."], [speaker:"mercutio", text:"This cannot anger him: twould anger him To raise a spirit in his mistress circle Of some strange nature, letting it there stand Till she had laid it and conjured it down That were some spite: my invocation Is fair and honest, and in his mistres s name I conjure only but to raise up him."], [speaker:"benvolio", text:"Come, he hath hid himself among these trees, To be consorted with the humorous night: Blind is his love and best befits the dark."], [speaker:"mercutio", text:"If love be blind, love cannot hit the mark. Now will he sit under a medlar tree, And wish his mistress were that kind of fruit As maids call medlars, when they laugh alone. Romeo, that she were, O, that she were An open et caetera, thou a poperin pear! Romeo, good night: Ill to my trucklebed This fieldbed is too cold for me to sleep: Come, shall we go"], [speaker:"benvolio", text:"Go, then for tis in vain To seek him here that means not to be found."], [text:"Exeunt"]]
   }

}

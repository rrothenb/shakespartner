package shakespartner.plays.twelfthnight

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class Act1Scene1 extends Scene {
   String getLocation() {
      "DUKE ORSINOs palace."
   }

   int getScene() {
      1
   }

   int getAct() {
      1
   }

   List<Map<String,String>> getLines() {
      [[text:"Enter DUKE ORSINO, CURIO, and other Lords Musicians attending"], [speaker:"duke orsino", text:"If music be the food of love, play on Give me excess of it, that, surfeiting, The appetite may sicken, and so die. That strain again! it had a dying fall: O, it came oer my ear like the sweet sound, That breathes upon a bank of violets, Stealing and giving odour! Enough no more: Tis not so sweet now as it was before. O spirit of love! how quick and fresh art thou, That, notwithstanding thy capacity Receiveth as the sea, nought enters there, Of what validity and pitch soeer, But falls into abatement and low price, Even in a minute: so full of shapes is fancy That it alone is high fantastical."], [speaker:"curio", text:"Will you go hunt, my lord"], [speaker:"duke orsino", text:"What, Curio"], [speaker:"curio", text:"The hart."], [speaker:"duke orsino", text:"Why, so I do, the noblest that I have: O, when mine eyes did see Olivia first, Methought she purged the air of pestilence! That instant was I turnd into a hart And my desires, like fell and cruel hounds, Eer since pursue me. How now! what news from her"], [text:"Enter VALENTINE"], [speaker:"valentine", text:"So please my lord, I might not be admitted But from her handmaid do return this answer: The element itself, till seven years heat, Shall not behold her face at ample view But, like a cloistress, she will veiled walk And water once a day her chamber round With eyeoffending brine: all this to season A brothers dead love, which she would keep fresh And lasting in her sad remembrance."], [speaker:"duke orsino", text:"O, she that hath a heart of that fine frame To pay this debt of love but to a brother, How will she love, when the rich golden shaft Hath killd the flock of all affections else That live in her when liver, brain and heart, These sovereign thrones, are all supplied, and filld Her sweet perfections with one self king! Away before me to sweet beds of flowers: Lovethoughts lie rich when canopied with bowers."], [text:"Exeunt"]]
   }

}
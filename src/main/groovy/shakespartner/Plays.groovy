package shakespartner

import groovy.transform.CompileStatic
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@CompileStatic
class Plays {
   static final Logger log = LoggerFactory.getLogger(Plays);
   static Play getPlay(String play) {
      log.info(play)
      log.info(plays[play])
      (Play)Plays.class.getClassLoader().loadClass(plays[play])?.newInstance()

   }

   static Map<String,String> plays = ["henry the fourth":"shakespartner.plays.henrythefourth", "henry the sixth part 1":"shakespartner.plays.henrythesixthpart1", "henry the sixth part 2":"shakespartner.plays.henrythesixthpart2", "henry the sixth part 3":"shakespartner.plays.henrythesixthpart3", "alls well that ends well":"shakespartner.plays.allswellthatendswell", "as you like it":"shakespartner.plays.asyoulikeit", "antony and cleopatra":"shakespartner.plays.antonyandcleopatra", "a comedy of errors":"shakespartner.plays.acomedyoferrors", "coriolanus":"shakespartner.plays.coriolanus", "cymbeline":"shakespartner.plays.cymbeline", "hamlet":"shakespartner.plays.hamlet", "henry the fifth":"shakespartner.plays.henrythefifth", "henry the eighth":"shakespartner.plays.henrytheeighth", "king john":"shakespartner.plays.kingjohn", "julius caesar":"shakespartner.plays.juliuscaesar", "king lear":"shakespartner.plays.kinglear", "loves labours lost":"shakespartner.plays.loveslabourslost", "macbeth":"shakespartner.plays.macbeth", "measure for measure":"shakespartner.plays.measureformeasure", "merchant of venice":"shakespartner.plays.merchantofvenice", "merry wives of windsor":"shakespartner.plays.merrywivesofwindsor", "a midsummer nights dream":"shakespartner.plays.amidsummernightsdream", "much ado about nothing":"shakespartner.plays.muchadoaboutnothing", "othello":"shakespartner.plays.othello", "pericles":"shakespartner.plays.pericles", "richard the second":"shakespartner.plays.richardthesecond", "richard the third":"shakespartner.plays.richardthethird", "romeo and juliet":"shakespartner.plays.romeoandjuliet", "taming of the shrew":"shakespartner.plays.tamingoftheshrew", "the tempest":"shakespartner.plays.thetempest", "timon of athens":"shakespartner.plays.timonofathens", "titus andronicus":"shakespartner.plays.titusandronicus", "troilus and cressida":"shakespartner.plays.troilusandcressida", "twelfth night":"shakespartner.plays.twelfthnight", "two gentlemen of verona":"shakespartner.plays.twogentlemenofverona", "a winters tale":"shakespartner.plays.awinterstale"]
}
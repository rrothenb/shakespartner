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

   static Map<String,String> plays = $plays
}
package shakespartner

import groovy.transform.CompileStatic
import org.apache.commons.codec.language.DoubleMetaphone
import org.apache.commons.lang3.StringUtils

@CompileStatic
class Characters {
   static List<Play> getPlays(String character) {
      characters[character]?.collect {playName -> Plays.getPlay(playName)}
   }

   static String getPossilblePlays(String character) {
      getPlays(character)*.name.join(" or ")
   }

   static String getClosestCharacters(String character) {
      DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
      doubleMetaphone.setMaxCodeLen(64);
      String given = doubleMetaphone.encode(character)
      def sortedCharacters = characters.keySet().toSorted { a, b ->
         def aDistance = StringUtils.getLevenshteinDistance(doubleMetaphone.encode(a),given)
         def bDistance = StringUtils.getLevenshteinDistance(doubleMetaphone.encode(b),given)
         aDistance <=> bDistance
      }
      sortedCharacters[0] + ", " + sortedCharacters[1] + ", and " + sortedCharacters[2]
   }

   static boolean isValid(String character, String play) {
      getPlays(character)*.name.contains(play)
   }
   static Map<String,List<String>> characters = $characters
}
package shakespartner;

import com.amazon.speech.speechlet.SpeechletException;
import org.apache.commons.codec.language.DoubleMetaphone;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

class Characters {
   static List<String> getPossiblePlayNames(String character) {
      return getCharactersToPlays().get(character);
   }

   static String getClosestCharacters(String character) {
      DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
      doubleMetaphone.setMaxCodeLen(64);
      String given = doubleMetaphone.encode(character);
      List<String> sortedCharacters = new ArrayList<String>(getCharactersToPlays().keySet());
      Collections.sort(sortedCharacters, (a, b) -> {
         int aDistance = StringUtils.getLevenshteinDistance(doubleMetaphone.encode(a),given);
         int bDistance = StringUtils.getLevenshteinDistance(doubleMetaphone.encode(b),given);
         return Integer.compare(aDistance, bDistance);
      });
      return sortedCharacters.get(0) + ", " + sortedCharacters.get(1) + ", and " + sortedCharacters.get(2);
   }

   static boolean isValid(String character, String play) {
      return getPossiblePlayNames(character).contains(play);
   }

   static Map<String,List<String>> getCharactersToPlays() {
      return (Map<String,List<String>>)Data.getData("charactersToPlays");
   }

}
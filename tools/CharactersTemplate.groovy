package shakespartner

import groovy.transform.CompileStatic

@CompileStatic
class Characters {
   static List<Play> getPlays(String character) {
      characters[character].collect {playName -> Plays.getPlay(playName)}
   }

   static String getPossilblePlays(String character) {
      getPlays(character)*.name.join(" or ")
   }

   static boolean isValid(String character, String play) {
      getPlays(character)*.name.contains(play)
   }
   static Map<String,List<String>> characters = $characters
}
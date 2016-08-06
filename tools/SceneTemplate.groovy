package shakespartner.plays.$playPackageName

import groovy.transform.CompileStatic
import shakespartner.Scene

@CompileStatic
class $sceneName extends Scene {
   String getLocation() {
      "$location"
   }

   int getScene() {
      $sceneNumber
   }

   int getAct() {
      $actNumber
   }

   List<Map<String,String>> getLines() {
      $lines
   }

}

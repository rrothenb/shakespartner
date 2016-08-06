package shakespartner

import groovy.transform.CompileStatic

@CompileStatic
abstract class Scene implements Comparable<Scene> {
   abstract String getLocation()
   abstract int getScene()
   abstract int getAct()
   abstract List<Map<String,String>> getLines()

   int compareTo(Scene other) {
      if (getAct() == other.getAct()) {
         getScene() - other.getScene()
      }
      else {
         getAct() - other.getAct()
      }
   }
}
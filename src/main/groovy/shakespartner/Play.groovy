package shakespartner

import groovy.transform.CompileStatic

@CompileStatic
abstract class Play {
   abstract String getName()
   abstract Scene getScene(int act, int scene)
   abstract List<String> getScenes(String character)
}
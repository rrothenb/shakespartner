package shakespartner;

import java.util.List;
import java.util.Map;

public class Scenes {
    static List<String> getScenes(String play, String character) {
        return getCharactersToScenesForPlay(play).get(character);
    }

    static String  getLocation(String play, String scene) {
        return (String)getSceneDefinition(play, scene).get("location");
    }

    static List<Map<String,String>> getLines(String play, String scene) {
        return (List<Map<String,String>>)getSceneDefinition(play, scene).get("lines");
    }

    static Map<String,List<String>> getCharactersToScenesForPlay(String play) {
        return (Map<String,List<String>>)Data.getData(play + "/charactersToScenes");
    }

    static Map<String,Object> getSceneDefinition(String play, String scene) {
        return (Map<String,Object>)Data.getData(play + "/" + scene);
    }
}

package shakespartner;

import org.json.simple.parser.JSONParser;

import java.io.InputStreamReader;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Data {
    static class DataException extends RuntimeException {
        public DataException(Throwable cause) {
            super(cause);
        }
    }
    static Map<String,Object> cache = new ConcurrentHashMap<String,Object>();

    static Object getData(String path) {
        path += ".json";
        if (cache.containsKey(path)) {
            return cache.get(path);
        }
        try {
            ClassLoader classLoader = Data.class.getClassLoader();
            InputStreamReader reader = new InputStreamReader(classLoader.getResource(path).openStream());
            Object result = new JSONParser().parse(reader);
            cache.putIfAbsent(path, result);
            return result;
        }
        catch (Exception e) {
            throw new DataException(e);
        }
    }
}

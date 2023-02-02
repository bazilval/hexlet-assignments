package exercise;

import java.util.*;
import java.util.stream.Stream;

// BEGIN
class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> map1, Map<String, Object> map2) {
        LinkedHashMap<String, String> result = new LinkedHashMap<>();
        TreeSet<String> keys = new TreeSet<>(map1.keySet());
        keys.addAll(map2.keySet());

        for (var key : keys) {
            var value = getMapDiff(key, map1, map2);
            result.put(key, value);
        }

        return result;
    }
    private static String getMapDiff(String key, Map<String, Object> map1, Map<String, Object> map2) {
        if (map1.containsKey(key)) {
            if (map2.containsKey(key)) {
                return map1.get(key).equals(map2.get(key)) ? "unchanged" : "changed";
            }
            return "deleted";
        }
        return "added";
    }
}
//END

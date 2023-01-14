package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App{
    public static Map<String, Integer> getWordCount(String text) {
        Map<String, Integer> wordsMap = new HashMap<String, Integer>();
        var wordsArray = text.split(" ");
        
        for(String word : wordsArray) {
            if (!word.equals("")) {
                var oldValue = wordsMap.putIfAbsent(word, 1);
                if (oldValue != null) {
                    wordsMap.put(word, ++oldValue);
                }
            }
        }

        return wordsMap;
    }
    public static String toString(Map<String, Integer> wordMap) {
        if (wordMap.isEmpty()) {
            return "{}";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for(Map.Entry<String, Integer> wordAndCount : wordMap.entrySet()) {
            var line = String.format("\n  %s: %d", wordAndCount.getKey(), wordAndCount.getValue());
            sb.append(line);
        }
        sb.append("\n}");

        return sb.toString();
    }
}
//END

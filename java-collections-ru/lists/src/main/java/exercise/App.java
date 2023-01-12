package exercise;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// BEGIN
    class App {
        public static boolean scrabble(String symbols, String word) {
            var symbolsArray = symbols.split("");
            var wordArray = word.toLowerCase().split("");
            List<String> symbolsList = new LinkedList<>(Arrays.asList(symbolsArray));

            for(String s: wordArray) {
                var index = symbolsList.indexOf(s);
                if (index != -1) {
                    symbolsList.remove(index);
                } else {
                    return false;
                }
            }

            return true;
        }
}
//END

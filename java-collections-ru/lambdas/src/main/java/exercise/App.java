package exercise;

import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
class App {
    public static String[][] enlargeArrayImage(String[][] matrix) {
        return Arrays.stream(matrix)
                .map(line -> new String[][]{line, line})
                .flatMap(Arrays::stream)
                .map(line -> {
                    return Arrays.stream(line)
                            .map(symbol -> new String[]{symbol, symbol})
                            .flatMap(Arrays::stream)
                            .toArray(String[]::new);
                    }
                )
                .toArray(String[][]::new);
    }
}
// END

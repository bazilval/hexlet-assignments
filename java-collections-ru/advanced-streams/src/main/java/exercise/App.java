package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {
    public static String getForwardedVariables(String data) {
        return Arrays.stream(data.split("\n"))
                .filter(line -> line.startsWith("environment="))
                .map(line -> line.replaceAll("environment=", ""))
                .map(line -> line.replaceAll("\"", ""))
                .flatMap(line -> Arrays.stream(line.split(",")))
                .filter(var -> var.startsWith("X_FORWARDED_"))
                .map(var -> var.replaceAll("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
    }
}
//END

package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static int getCountOfFreeEmails(List<String> emails) {
        return (int) emails.stream()
                .filter(email -> email.endsWith("@gmail.com") || email.endsWith("@yandex.ru") || email.endsWith("@hotmail.com"))
                .count();
    }
}
// END

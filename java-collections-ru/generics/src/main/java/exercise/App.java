package exercise;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
    public static <T> List<Map<T, T>> findWhere(List<Map<T, T>> books, Map<T, T> requests) {
        List<Map<T, T>> result = new LinkedList<>(List.copyOf(books));
        for (Entry<T, T> request : requests.entrySet()) {
            result.removeIf(book -> book.get(request.getKey()) != request.getValue());
        }

        return result;
    }
}
//END

package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        int count = 3;
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        var actual = App.take(numbers, count);
        assertThat(actual).containsExactly(1, 2, 4);
        // END
    }
}

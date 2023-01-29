package exercise;

import org.junit.jupiter.api.Test;

import static exercise.App.enlargeArrayImage;
import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
class AppTest {
    @Test
    void testWithImage1() {
        String[][] image = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };

        String[][] actual = enlargeArrayImage(image);
        String[][] expected = {
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
        };
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void testWithImage2() {
        String[][] image = {
                {"*"}
        };

        String[][] actual = enlargeArrayImage(image);
        String[][] expected = {
                {"*", "*"},
                {"*", "*"},
        };
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void testWithEmpty() {
        String[][] image = {};

        String[][] actual = enlargeArrayImage(image);
        String[][] expected = {};
        assertThat(actual).isEqualTo(expected);
    }
}
// END

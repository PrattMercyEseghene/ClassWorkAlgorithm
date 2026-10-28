
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayAlgorithmTest {

    @Test
    public void testSquareNumbers() {
        int[] input = {3, 2, 7, 1, 4};
        int[] expected = {1, 4, 9, 16, 49};

        assertArrayEquals(expected, ArrayAlgorithm.squareNumbers(input));
    }

    @Test
    public void testNegativeNumbers() {
        int[] input = {-4, 2, -1, 3};
        int[] expected = {1, 4, 9, 16};

        assertArrayEquals(expected, ArrayAlgorithm.squareNumbers(input));
    }

    @Test
    public void testSingleNumber() {
        int[] input = {5};
        int[] expected = {25};

        assertArrayEquals(expected, ArrayAlgorithm.squareNumbers(input));
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        int[] expected = {};

        assertArrayEquals(expected, ArrayAlgorithm.squareNumbers(input));
    }
}


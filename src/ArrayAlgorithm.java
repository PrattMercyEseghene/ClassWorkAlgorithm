
import java.util.Arrays;

public class ArrayAlgorithm {

    public static int[] squareNumbers(int[] numbers) {
        int[] squares = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            squares[i] = numbers[i] * numbers[i];
        }

        Arrays.sort(squares);
        return squares;
    }
}
package lambdas;
import java.util.Arrays;

public class Average {

    public double averageOfOddSquares(int[] inputArray) {
        return Arrays.stream(inputArray)
                .filter(n -> n % 2 != 0) // Filter odd numbers
                .mapToDouble(n -> Math.pow(n, 2)) // Square the odd numbers
                .average() // Calculate average
                .orElse(0); // Return 0 if no odd numbers found
    }
}
package lambdas;
import java.util.List;
public class SumOfSquares {

    public int calculateSumOfSquares(List<Integer> numbers) {
        return numbers.stream()                           // Step 1: Create a stream of elements from the input list
                .filter(num -> num > 0)                   // Step 2: Filter out positive integers
                .mapToInt(num -> num * num)               // Step 3: Map each positive integer to its square
                .sum();                                   // Step 4: Sum up the squares
    }
}

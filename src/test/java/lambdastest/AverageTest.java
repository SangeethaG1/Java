package lambdastest;
import lambdas.Average;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AverageTest {

    @Test
    public void testAverageOfOddSquares() {
        Average m = new Average();
        int[] inputArray = {1, 2, 3, 4, 5};
        double expected = (1 * 1 + 3 * 3 + 5 * 5) / 3.0; // (1^2 + 3^2 + 5^2) / 3
        double result = m.averageOfOddSquares(inputArray);
        assertEquals(expected, result, 0.0001);
    }
}

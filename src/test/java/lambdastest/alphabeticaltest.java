package lambdastest;
import lambdas.alphabetical;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class alphabeticaltest {

    @Test
    public void testCapitalizeAndSort() {
        alphabetical x = new alphabetical();
        String[] inputArray = {"banana", "apple", "Cherry"};
        String[] expected = {"Apple", "Banana", "Cherry"};
        String[] result = x.capitalizeAndSort(inputArray);
        assertArrayEquals(expected, result);
    }
}
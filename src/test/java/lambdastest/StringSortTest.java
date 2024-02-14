package lambdastest;

import lambdas.StringSort;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class StringSortTest {

    @Test
    public void testSortStrings() {
        StringSort sorter = new StringSort();
        String[] inputArray = {"apple", "banana", "cherry", "kiwi", "orange"};
        String[] expected = {"kiwi", "apple", "cherry", "orange", "banana"};
        String[] result = sorter.sortStrings(inputArray);
        assertArrayEquals(expected, result);
    }
}

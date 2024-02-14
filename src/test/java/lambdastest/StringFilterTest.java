package lambdastest;

import lambdas.StringFilter;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class StringFilterTest {

    @Test
    public void testFilterStringsStartingWithA() {
        StringFilter stringFilter = new StringFilter();
        List<String> inputList = Arrays.asList("Apple", "Banana", "Apricot", "Grape", "Avocado");
        List<String> expected = Arrays.asList("Banana", "Grape");

        List<String> filteredList = stringFilter.filterStringsStartingWithA(inputList);

        assertEquals(expected, filteredList);
    }

    @Test
    public void testFilterStringsWithEmptyList() {
        StringFilter stringFilter = new StringFilter();
        List<String> inputList = new ArrayList<>();
        List<String> expected = new ArrayList<>();

        List<String> filteredList = stringFilter.filterStringsStartingWithA(inputList);

        assertEquals(expected, filteredList);
    }

    @Test
    public void testFilterStringsWithNoStringsStartingWithA() {
        StringFilter stringFilter = new StringFilter();
        List<String> inputList = Arrays.asList("Banana", "Grape", "Orange");
        List<String> expected = Arrays.asList("Banana", "Grape", "Orange");

        List<String> filteredList = stringFilter.filterStringsStartingWithA(inputList);

        assertEquals(expected, filteredList);
    }
}

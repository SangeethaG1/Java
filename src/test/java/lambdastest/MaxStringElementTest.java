package lambdastest;


import lambdas.MaxStringElement;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MaxStringElementTest {

    @Test
    public void testFindMaxStringElement() {
        MaxStringElement finder = new MaxStringElement();
        List<String> inputStrings = Arrays.asList("apple", "banana", "grape", "orange", "pineapple");
        assertEquals("pineapple", finder.findMaxStringElement(inputStrings));
    }

    @Test
    public void testFindMaxStringElementWithEmptyList() {
        MaxStringElement finder = new MaxStringElement();
        List<String> inputStrings = Arrays.asList();
        assertNull(finder.findMaxStringElement(inputStrings));
    }
}
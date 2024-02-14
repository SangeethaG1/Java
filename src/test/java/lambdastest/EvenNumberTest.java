package lambdastest;
import lambdas.EvenNumber;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class EvenNumberTest {

    @Test
    public void testFilterAndDoubleEvenNumbers() {
        EvenNumber evenNumberFilter = new EvenNumber();
        List<Integer> inputNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expectedOutput = Arrays.asList(4, 8, 12, 16, 20);

        List<Integer> result = evenNumberFilter.filterAndDoubleEvenNumbers(inputNumbers);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void testFilterAndDoubleEvenNumbersWithEmptyList() {
        EvenNumber evenNumberFilter = new EvenNumber();
        List<Integer> inputNumbers = Arrays.asList();
        List<Integer> expectedOutput = Arrays.asList();

        List<Integer> result = evenNumberFilter.filterAndDoubleEvenNumbers(inputNumbers);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void testFilterAndDoubleEvenNumbersWithNoEvenNumbers() {
        EvenNumber evenNumberFilter = new EvenNumber();
        List<Integer> inputNumbers = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> expectedOutput = Arrays.asList();

        List<Integer> result = evenNumberFilter.filterAndDoubleEvenNumbers(inputNumbers);

        assertEquals(expectedOutput, result);
    }
}

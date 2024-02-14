package lambdastest;
import lambdas.RemoveDuplicates;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        RemoveDuplicates remover = new RemoveDuplicates();
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 2, 3, 5, 6, 1, 7);
        List<Integer> expectedDistinctList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        List<Integer> result = remover.removeDuplicates(inputList);

        assertEquals(expectedDistinctList, result);
    }

    @Test
    public void testRemoveDuplicatesWithEmptyList() {
        RemoveDuplicates remover = new RemoveDuplicates();
        List<Integer> inputList = Arrays.asList();
        List<Integer> expectedDistinctList = Arrays.asList();

        List<Integer> result = remover.removeDuplicates(inputList);

        assertEquals(expectedDistinctList, result);
    }

    @Test
    public void testRemoveDuplicatesWithSingleElement() {
        RemoveDuplicates remover = new RemoveDuplicates();
        List<Integer> inputList = Arrays.asList(1);
        List<Integer> expectedDistinctList = Arrays.asList(1);

        List<Integer> result = remover.removeDuplicates(inputList);

        assertEquals(expectedDistinctList, result);
    }
}

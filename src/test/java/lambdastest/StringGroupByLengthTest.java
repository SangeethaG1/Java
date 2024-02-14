package lambdastest;
import lambdas.StringGroupByLength;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringGroupByLengthTest {

    @Test
    public void testGroupByLength() {
        StringGroupByLength groupByLength = new StringGroupByLength();
        List<String> inputStrings = Arrays.asList("apple", "banana", "grape", "orange", "kiwi", "pear");
        Map<Integer, List<String>> groupedMap = groupByLength.groupByLength(inputStrings);

        assertEquals(3, groupedMap.size());
        assertTrue(groupedMap.containsKey(5));
        assertTrue(groupedMap.containsKey(6));
        assertTrue(groupedMap.containsKey(4));
        assertTrue(groupedMap.get(5).containsAll(Arrays.asList("apple", "grape")));
        assertTrue(groupedMap.get(6).contains("banana"));
        assertTrue(groupedMap.get(4).containsAll(Arrays.asList("kiwi", "pear")));
    }

    @Test
    public void testGroupByLengthWithEmptyList() {
        StringGroupByLength groupByLength = new StringGroupByLength();
        List<String> inputStrings = Arrays.asList();
        Map<Integer, List<String>> groupedMap = groupByLength.groupByLength(inputStrings);

        assertTrue(groupedMap.isEmpty());
    }
}

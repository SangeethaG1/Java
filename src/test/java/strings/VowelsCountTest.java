package strings;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class VowelsCountTest {

    @Test
    public void testCountVowels() {
        // Test case 1: Valid input with vowels
        assertEquals(3, VowelsCount.countVowels("Hello World"));

        // Test case 2: Valid input with no vowels
        assertEquals(0, VowelsCount.countVowels("BCDFG"));

        // Test case 3: Empty string
        assertEquals(0, VowelsCount.countVowels(""));

        // Test case 4: Null input
        assertEquals(0, VowelsCount.countVowels(null));

        // Test case 5: Valid input with mixed characters
        assertEquals(4, VowelsCount.countVowels("Programming"));

        // Test case 6: Valid input with uppercase vowels
        assertEquals(3, VowelsCount.countVowels("Java Programming"));

        // Test case 7: Valid input with numbers and special characters
        assertEquals(3, VowelsCount.countVowels("123!@#"));

    }
}
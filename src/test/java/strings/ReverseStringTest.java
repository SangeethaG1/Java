package strings;

import org.junit.Test;
//import strings.ReverseString;
import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    @Test
    public void testReverseWords() {
        // Test case 1: Basic reversal
        assertEquals("123!@# dcba", ReverseString.reverseWords("123!@# abcd"));

        assertEquals("avaJ E2J Reverse eM", ReverseString.reverseWords("Java J2EE Reverse Me"));

        // Test case 2: Reversal with different lengths and spaces
        assertEquals("edoc taht a peek I", ReverseString.reverseWords("code that a keep I"));

        // Test case 3: Reversal with numbers and special characters

        // Test case 4: Empty input
        assertEquals("", ReverseString.reverseWords(""));

        // Test case 5: Null input
        assertEquals("", ReverseString.reverseWords(null));

        // Add more test cases as needed
    }
}
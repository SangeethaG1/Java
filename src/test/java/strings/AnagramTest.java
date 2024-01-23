package strings;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class AnagramTest {

    @Test
    public void testCheckAnagrams() {
        // Test case 1: Anagrams
        assertTrue(Anagram.checkAnagrams("listen", "silent"));

        // Test case 2: Not Anagrams
        assertFalse(Anagram.checkAnagrams("hello", "world"));

        // Test case 3: Anagrams with different case
        assertTrue(Anagram.checkAnagrams("Triangle", "Integral"));

        // Test case 4: Anagrams with spaces
        assertTrue(Anagram.checkAnagrams("astronomer", "moon starer"));

        // Test case 5: Anagrams with special characters
        assertTrue(Anagram.checkAnagrams("debit card", "bad credit"));

        // Test case 6: Not Anagrams with different lengths
        assertFalse(Anagram.checkAnagrams("cat", "tacooo"));

        // Test case 7: Anagrams with repeated characters
        assertTrue(Anagram.checkAnagrams("aab", "aba"));

        // Add more test cases as needed
    }
}
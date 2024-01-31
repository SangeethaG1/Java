package additionaltest;
import org.junit.Test;
import static org.junit.Assert.*;
public class PalinTest {

    @Test
    public void testIsPalindromeTrue() {
        assertTrue(additional.Palin.isPalindrome(1221));
    }

    @Test
    public void testIsPalindromeFalse() {
        assertFalse(additional.Palin.isPalindrome(12345));
    }
}

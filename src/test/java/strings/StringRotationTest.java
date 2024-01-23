package strings;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class StringRotationTest {

    @Test
    public void testIsRotation() {
        // Test case 1: Rotated string
        assertTrue(StringRotation.isRotation("JavaJ2eeStrutsHibernate", "StrutsHibernateJavaJ2ee"));

        // Test case 2: Not a rotated string
        assertFalse(StringRotation.isRotation("HelloWorld", "WorldHello"));

        // Test case 3: Empty strings
        assertFalse(StringRotation.isRotation("", ""));

        // Test case 4: Unequal lengths
        assertFalse(StringRotation.isRotation("abc", "abcd"));

        // Test case 5: Null strings
        assertFalse(StringRotation.isRotation(null, "test"));

        // Test case 6: Null strings
        assertFalse(StringRotation.isRotation("test", null));
    }
}
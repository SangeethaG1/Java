package exceptionhandlingtest;
import exceptionhandling.Exception;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionTest {

    @Test
    public void testValidIntegerString() {
        assertEquals(23, Exception.convertStringToInteger("23"));
    }

    @Test
    public void testFloatingPointString() {
        assertThrows(IllegalArgumentException.class, () -> {
            Exception.convertStringToInteger("45.67");
        });
    }

    @Test
    public void testNonNumericString() {
        assertThrows(IllegalArgumentException.class, () -> {
            Exception.convertStringToInteger("test");
        });
    }

    @Test
    public void testAlphaNumericString() {
        assertThrows(IllegalArgumentException.class, () -> {
            Exception.convertStringToInteger("123f");
        });
    }
}

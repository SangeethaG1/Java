package additionaltest;
import additional.Swap;
import org.junit.Test;
import static org.junit.Assert.*;

public class SwapTest {

    @Test
    public void testSwapIntegers() {
        Swap integerSwap = new Swap();

        int a = 5;
        int b = 10;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swapping without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Verify the result
        assertEquals(10, a);
        assertEquals(5, b);
    }
}
package additionaltest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import additional.Factorial;

public class FactorialTest {

    @Test
    public void find() {

        assertEquals(1, Factorial.findfactorial(0));
        assertEquals(1, Factorial.findfactorial(1));
        assertEquals(2, Factorial.findfactorial(2));
        assertEquals(6, Factorial.findfactorial(3));
        assertEquals(24, Factorial.findfactorial(4));
        assertEquals(120, Factorial.findfactorial(5));
        assertEquals(720, Factorial.findfactorial(6));

        //System.out.println(Factorial.findfactorial(5));
    }
}
package additional;


public class Swap {

        public void swapIntegers(int a, int b) {
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
        }
    }
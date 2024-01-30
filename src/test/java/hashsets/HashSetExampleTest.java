package hashsets;


public class HashSetExampleTest {
    public static void main(String[] args) {
        HashSetExample example = new HashSetExample();

        // Add 10 strings to the HashSet
        example.addStrings();

        // Iterate using Iterator
        System.out.println("Iterating using Iterator:");
        example.iterateUsingIterator();
        System.out.println();

        // Iterate using for loop
        System.out.println("Iterating using for loop:");
        example.iterateUsingForLoop();
        System.out.println();

        // Iterate using enhanced for loop
        System.out.println("Iterating using enhanced for loop:");
        example.iterateUsingEnhancedForLoop();
    }
}
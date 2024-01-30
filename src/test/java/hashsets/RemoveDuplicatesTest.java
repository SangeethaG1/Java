package hashsets;

public class RemoveDuplicatesTest {
    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();

        // Test the removeDuplicateCharacters method
        String inputString = "programming";
        String resultString = removeDuplicates.removeDuplicateCharacters(inputString);

        // Print the original and result strings
        System.out.println("Original String: " + inputString);
        System.out.println("String after removing duplicates: " + resultString);
    }
}
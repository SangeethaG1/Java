package hashsets;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public String removeDuplicateCharacters(String input) {
        // Using LinkedHashSet to maintain order of characters
        LinkedHashSet<Character> uniqueCharacters = new LinkedHashSet<>();

        // Iterate through each character in the input string
        for (char ch : input.toCharArray()) {
            // Add the character to the set (duplicates will be automatically ignored)
            uniqueCharacters.add(ch);
        }

        // Construct the resulting string without duplicate characters
        StringBuilder result = new StringBuilder();
        for (Character ch : uniqueCharacters) {
            result.append(ch);
        }

        return result.toString();
    }
}
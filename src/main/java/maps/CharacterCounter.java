package maps;

import java.util.HashMap;

public class CharacterCounter{

    public static void printCharacterCount(String inputString) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through each character in the input string
        for (char c : inputString.toCharArray()) {
            // Update the count in the HashMap
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print the results
        System.out.print("Output: ");
        for (char c : charCountMap.keySet()) {
            System.out.print(c + "-" + charCountMap.get(c) + ", ");
        }
    }
}

package lambdas;

import java.util.Arrays;

public class vowels {

    public void printStringsWithVowels(String[] inputArray) {
        Arrays.stream(inputArray)
                .filter(s -> s.toLowerCase().matches(".[aeiou].")) // Filter strings containing vowels
                .forEach(s -> {
                    long vowelCount = s.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count(); // Count vowels
                    System.out.println("String: " + s + ", Number of Vowels: " + vowelCount);
                });
    }
}

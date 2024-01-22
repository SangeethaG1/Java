package Strings;

public class ReverseString {
    public static void main(String[] args) {

        String inputSentence = "Java J2EE Reverse Me";

        String reversedSentence = reverseWords(inputSentence);
        System.out.println("Original Sentence: " + inputSentence);
        System.out.println("Reversed Sentence: " + reversedSentence);
    }
    private static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedSentence.append(reversedWord).append(" ");
        }
        return reversedSentence.toString().trim();
    }
}

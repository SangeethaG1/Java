package lambdas;
import java.util.Arrays;
import java.util.Comparator;

public class StringSort {

    public String[] sortStrings(String[] inputArray) {
        return Arrays.stream(inputArray)
                .sorted(Comparator.comparingInt(String::length)
                        .thenComparing((s1, s2) -> {
                            if (s1.length() == s2.length()) {
                                return Character.compare(s2.charAt(s2.length() - 1), s1.charAt(s1.length() - 1)); // Sort by last character in descending order
                            }
                            return 0; //
                        }))
                .toArray(String[]::new);
    }
}
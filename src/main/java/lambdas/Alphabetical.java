package lambdas;
import java.util.Arrays;

public class Alphabetical {

    public String[] capitalizeAndSort(String[] inputArray) {
        return Arrays.stream(inputArray)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .sorted()
                .toArray(String[]::new);
    }
}
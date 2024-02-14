package lambdas;
import java.util.List;
import java.util.Optional;

public class MaxStringElement {

    public String findMaxStringElement(List<String> strings) {
        Optional<String> maxElement = strings.stream()
                .max(String::compareTo); // Using natural ordering

        // If maxElement is present, return it. Otherwise, return null.
        return maxElement.orElse(null);
    }
}
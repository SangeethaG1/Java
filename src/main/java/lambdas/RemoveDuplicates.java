package lambdas;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public List<Integer> removeDuplicates(List<Integer> numbers) {
        return numbers.stream()                     // Step 1: Create a stream of elements from the input list
                .distinct()                         // Step 2: Remove duplicate elements from the stream
                .collect(Collectors.toList());      // Step 3: Collect the distinct elements into a new list
    }
}

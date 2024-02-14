package lambdas;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

    public List<Integer> filterAndDoubleEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num % 2 == 0) // Filter out even numbers
                .map(num -> num * 2) // Double each remaining number
                .collect(Collectors.toList());
    }
}

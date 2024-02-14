package lambdas;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StringFilter {

    public List<String> filterStringsStartingWithA(List<String> inputList) {
        Predicate<String> startsWithA = str -> str.startsWith("A");
        List<String> filteredList = new ArrayList<>();
        for (String str : inputList) {
            if (!startsWithA.test(str)) {
                filteredList.add(str);
            }
        }
        return filteredList;
    }
}
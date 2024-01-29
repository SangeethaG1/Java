package hashsets;


import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    private HashSet<String> stringHashSet;

    public HashSetExample() {
        stringHashSet = new HashSet<>();
    }

    public void addStrings() {
        // Add 10 strings to the HashSet
        stringHashSet.add("One");
        stringHashSet.add("Two");
        stringHashSet.add("Three");
        stringHashSet.add("Four");
        stringHashSet.add("Five");
        stringHashSet.add("Six");
        stringHashSet.add("Seven");
        stringHashSet.add("Eight");
        stringHashSet.add("Nine");
        stringHashSet.add("Ten");
    }

    public void iterateUsingIterator() {
        // Iterate HashSet using Iterator
        Iterator<String> iterator = stringHashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }

    public void iterateUsingForLoop() {
        // Iterate HashSet using for loop
        for (String element : stringHashSet) {
            System.out.println(element);
        }
    }

    public void iterateUsingEnhancedForLoop() {
        // Iterate HashSet using enhanced for loop
        stringHashSet.forEach(element -> System.out.println(element));
    }
}

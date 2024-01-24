package arraylists;
import java.util.ArrayList;

public class ArrayListTraversal {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Basic");
        stringList.add("Acoustic");
        stringList.add("Electric");

        // Traversing using a standard for loop
        System.out.println("Traversing using a standard for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            System.out.println("Index " + i + ": " + element);
        }

        // Traversing using an enhanced for loop
        System.out.println("\nTraversing using an enhanced for loop:");
        for (String element : stringList) {
            System.out.println("Element: " + element);
        }
    }
}
package arraylists;

import java.util.ArrayList;

public class RemoveLastElement {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Basic");
        stringList.add("Acoustic");
        stringList.add("Electric");

        // Displaying the ArrayList before removal
        System.out.println("ArrayList before removal: " + stringList);

        // Removing the last object using basic method
        int lastIndex = stringList.size() - 1;
        String removedElement = stringList.remove(lastIndex);

        // Displaying the ArrayList after removal
        System.out.println("ArrayList after removal: " + stringList);

        // Displaying the removed element
        System.out.println("Removed Element: " + removedElement);
    }
}
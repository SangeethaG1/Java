package arraylists;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Basic");
        stringList.add("Acoustic");
        stringList.add("Electric");

        // Displaying the ArrayList before conversion
        System.out.println("ArrayList before conversion: " + stringList);

        // Converting ArrayList to Array
        String[] stringArray = new String[stringList.size()];
        stringArray = stringList.toArray(stringArray);

        // Displaying the Array after conversion
        System.out.print("Array after conversion: [");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print("\"" + stringArray[i] + "\"");
            if (i < stringArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

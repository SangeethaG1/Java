package arraylists;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class ArrayListToArrayTest {

    @Test
    public void testArrayListToArrayConversion() {
        // Creating an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Basic");
        stringList.add("Acoustic");
        stringList.add("Electric");

        // Converting ArrayList to Array
        String[] stringArray = ArrayListToArray.convertToArray(stringList);

        // Checking the size of the array
        assertEquals(stringList.size(), stringArray.length);

        // Checking each element of the array
        for (int i = 0; i < stringArray.length; i++) {
            assertEquals(stringList.get(i), stringArray[i]);
        }
    }

    @Test
    public void testArrayListWithEmptyList() {
        // Creating an empty ArrayList of Strings
        ArrayList<String> emptyList = new ArrayList<>();

        // Converting empty ArrayList to Array
        String[] stringArray = ArrayListToArray.convertToArray(emptyList);

        // The resulting array should also be empty
        assertEquals(0, stringArray.length);
    }
}
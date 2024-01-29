package arraylists;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class RemoveLastElementTest {

    @Test
    public void testRemoveLastElement() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Basic");
        stringList.add("Acoustic");
        stringList.add("Electric");

        // Call the method to be tested
        String removedElement = RemoveLastElement.removeLastElement(stringList);

        // Check the size of the ArrayList after removal
        assertEquals(2, stringList.size());

        // Check the value of the removed element
        assertEquals("Electric", removedElement);
    }

    @Test
    public void testRemoveLastElementEmptyList() {
        ArrayList<String> emptyList = new ArrayList<>();

        // Call the method to be tested on an empty list
        String removedElement = RemoveLastElement.removeLastElement(emptyList);

        // The result should be null (or handle it according to your requirements)
        assertNull(removedElement);
    }
}
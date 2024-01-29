package arraylists;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class RemoveLowGPAStudentsTest {

    @Test
    public void testRemoveLowGPAStudents() {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Geetha", "G", 3.8));
        studentList.add(new Student("Siva", "V", 3.5));
        studentList.add(new Student("Siva", "B", 2.9));
        studentList.add(new Student("Tarun", "K", 4.0));

        // Call the method to be tested
        List<Student> remainingStudents = RemoveLowGPAStudents.removeLowGPAStudents(studentList);

        // Check the size of the ArrayList after removal
        assertEquals(2, remainingStudents.size());

        // Check that all remaining students have GPA greater than or equal to the average
        for (Student student : remainingStudents) {
            assertTrue(student.gpa >= 3.4); // Assuming an average GPA of 3.4 for this test
        }
    }
}
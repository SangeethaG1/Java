package maps;

public class StudentManagerTest {

    public static void main(String[] args) {
        // Instantiate the StudentManager
        StudentManager studentManager = new StudentManager();

        // Test getting a student by name
        testGetStudentByName(studentManager, "Alice");
        testGetStudentByName(studentManager, "John");
        testGetStudentByName(studentManager, "Eva");
        testGetStudentByName(studentManager, "Nonexistent"); // Testing for a nonexistent student
    }

    private static void testGetStudentByName(StudentManager studentManager, String studentName) {
        Student student = studentManager.getStudentByName(studentName);
        if (student != null) {
            System.out.println("Student found: " + student.firstName + " " + student.lastName + " (GPA: " + student.GPA + ")");
        } else {
            System.out.println("Student not found for name: " + studentName);
        }
    }
}

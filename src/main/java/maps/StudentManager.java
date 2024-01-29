package maps;

import java.util.HashMap;

class Student {
    String firstName;
    String lastName;
    double GPA;

    public Student(String firstName, String lastName, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }
}

public class StudentManager {

    private HashMap<String, Student> map;

    public StudentManager() {
        map = new HashMap<>();

        // Initialize the HashMap with 8 students (you can add your own data)
        map.put("John", new Student("John", "Doe", 3.8));
        map.put("Alice", new Student("Alice", "Smith", 3.9));
        map.put("Bob", new Student("Bob", "Johnson", 3.5));
        map.put("Eva", new Student("Eva", "Williams", 3.7));
        map.put("Charlie", new Student("Charlie", "Brown", 3.6));
        map.put("Olivia", new Student("Olivia", "Davis", 3.4));
        map.put("Daniel", new Student("Daniel", "Martin", 3.2));
        map.put("Sophia", new Student("Sophia", "Taylor", 3.9));
    }

    public Student getStudentByName(String studentName) {
        return map.get(studentName);
    }
}


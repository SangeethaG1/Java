package arraylists;

import java.util.ArrayList;

class Student {
    String firstName;
    String lastName;
    double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }
}

public class RemoveLowGPAStudents {
    public static void main(String[] args) {
        // Creating an ArrayList of Students
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Geetha", "G", 3.8));
        studentList.add(new Student("Siva", "V", 3.5));
        studentList.add(new Student("Siva", "B", 2.9));
        studentList.add(new Student("Tarun", "K", 4.0));

        // Displaying the ArrayList before removal
        System.out.println("Students before removal:");
        for (Student student : studentList) {
            System.out.println(student.firstName + " " + student.lastName + " - GPA: " + student.gpa);
        }

        // Removing students with GPA less than the average GPA
        double totalGPA = 0;
        for (Student student : studentList) {
            totalGPA += student.gpa;
        }
        double averageGPA = totalGPA / studentList.size();

        ArrayList<Student> remainingStudents = new ArrayList<>();
        for (Student student : studentList) {
            if (student.gpa >= averageGPA) {
                remainingStudents.add(student);
            }
        }

        // Displaying the ArrayList after removal
        System.out.println("\nStudents after removal:");
        for (Student student : remainingStudents) {
            System.out.println(student.firstName + " " + student.lastName + " - GPA: " + student.gpa);
        }
    }
}

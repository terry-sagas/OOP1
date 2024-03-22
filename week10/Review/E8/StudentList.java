package week10.Review.E8;
import java.util.ArrayList;
public class StudentList {

    private ArrayList<String> studentNames;

    public StudentList(){
        this.studentNames = new ArrayList<>();
    }
    // Add a student
    public void addStudent(String studentName) {
        studentNames.add(studentName);
    }

    // Remove a student
    public void removeStudent(String studentName) {
        studentNames.remove(studentName);
    }

    // Display all students
    public void displayStudents() {
        System.out.println("List of Students:");
        for (String studentName : studentNames) {
            System.out.println(studentName);
        }
    }
}

package week10.Review.E8;

public class Exercise_8_Collections {
    public static void main(String[] args) {
        // Creating a StudentList object
        StudentList studentList = new StudentList();

        // Adding students
        studentList.addStudent("Terry");
        studentList.addStudent("Kanav");
        studentList.addStudent("Jon");

        // Displaying students
        studentList.displayStudents();

        // Removing a student
        studentList.removeStudent("Jon");

        // Displaying students after removal
        studentList.displayStudents();
    }
}

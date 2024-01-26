public class oops_concepts {
    public static void main(String args[]){
        Student student = new Student("Terry", "Sagas", 20);
        student.setAge(20);
        System.out.println("First Name: " + student.getFName());
        System.out.println("Last Name: " + student.getLName());
        System.out.println("Age: " + student.getAge());

        // Modify the students info
        Student student2 = new Student("Theodore", "Sagas", 210);
        student2.setAge(210);
        System.out.println("Student 2 Name: " + student2.getFName());
        System.out.println("Last Name: " + student2.getLName());
        System.out.println("Student 2 Age: " + student2.getAge());
    }
}
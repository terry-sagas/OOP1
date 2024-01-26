public class oops_concepts {
    public static void main(String args[]){
        // Creating the instance of student
        // Access the methods
        Studnet studnet = new Studnet("terry", 20);
        System.out.println("Name: " + studnet.getName());
        System.out.println("Age: " + studnet.getAge());

        // Modify the students info
        Studnet studnet2 = new Studnet("Theodore", 210);
        System.out.println("Student 2 Name: " + studnet2.getName());
        System.out.println("Student 2 Age: " + studnet2.getAge());


    }
}

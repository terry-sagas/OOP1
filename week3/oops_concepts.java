public class oops_concepts {
/*
 * For part 5 i inserted the function in my code, in this case i could only set the name unless i changed the age in the 
 * oops_concept.java file because the parameters are different and i cant use it when i call it instead i use student.setAge(20); 
 * or else the age will appear as zero. this can be useful when i don't&nbsp;need the age for everything.&nbsp;i think the oop 
 * concept is Polymorphism
 */
    public static void main(String args[]){
        // Creating the instance of student
        // Access the methods
        Student student = new Student("Terry");
        // I have to set the age here V
        student.setAge(20);
        System.out.println("First Name: " + student.getFName());
        //System.out.println("Last Name: " + student.getLName());
        System.out.println("Age: " + student.getAge());

//         // Modify the students info
//         Student student2 = new Student("Theodore", "Sagas", 210);
//         student2.setAge(210);
//         System.out.println("Student 2 Name: " + student2.getFName());
//         System.out.println("Last Name: " + student2.getLName());
//         System.out.println("Student 2 Age: " + student2.getAge());
    }
}

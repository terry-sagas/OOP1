

/*
 * Name:        Terry Sagas
 * Date:        1/31/2024
 * Description: This is assignmet 1 part 1, in this assignment i needed to take 3 user
 *              input of their name, age and gender, and display it in a specific format.
 */
import java.util.Scanner;

public class Person {
    private String name;        // Variable for name
    private int age;            // Variable for age
    private char gender;        // Variable for age

    public Person() {
        
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge(Scanner scanner) {
        return age;
    }

    public char getGender(Scanner scanner) {

        return gender;
    }

    // Setters
    public void setName(Scanner scanner) {
        // Asking user for name and returning the name
        System.out.print("Enter your name: ");
        this.name = scanner.nextLine();
    }
    public void setAge(Scanner scanner) {
        System.out.print("Enter your age: ");
        this.age = scanner.nextInt();
    }
    public void setGender(Scanner scanner) {
        System.out.print("Enter your gender (M/F): ");
        this.gender = scanner.nextLine().charAt(0);
    }
    // Method to introduce
    public void Introduce() {
        // Printing out users name age and gender
        System.out.println("\nName: " + name);              // Name
        System.out.println("Age: " + age);                  // Age
        System.out.println("Gender: " + gender + "\n");     // Gender
        System.out.println();
    }
    

       
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        
        // Asking user for name
        person.setName(scanner);
        // Asking user for age
        person.setAge(scanner);
        scanner.nextLine();
        // Asking user for gender
        person.setGender(scanner);
        // Displaying information
        person.Introduce();
        // Closing scanner
        scanner.close();
    }
    
}



import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person() {
        
    }

    // Getters
    public String getName(Scanner scanner) {
        // Asking user for name and returning the name
        System.out.print("Enter your name: ");
        this.name = scanner.nextLine();
        return name;
    }

    public int getAge(Scanner scanner) {
        System.out.print("Enter your age: ");
        this.age = scanner.nextInt();
        scanner.nextLine(); 
        return age;
    }

    public char getGender(Scanner scanner) {
        System.out.print("Enter your gender (M/F): ");
        this.gender = scanner.nextLine().charAt(0);
        return gender;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    // Method to introduce
    public void Introduce() {
        // Printing out message
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender + "\n");
        System.out.println();
    }
    

       
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        
        person.getName(scanner);
        person.getAge(scanner);
        person.getGender(scanner);
        
        person.Introduce();
        
        scanner.close();
    }
    
}
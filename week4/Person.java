package week4;


import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(Scanner scanner) {
        

        System.out.print("Enter your name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter your age: ");
        this.age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter your gender (M/F): ");
        this.gender = scanner.nextLine().charAt(0);
        
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public void Introduce(){
        System.out.println("\nName: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender() + "\n");
        System.out.println();
    }
    

       
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person(scanner);
        Person person2 = new Person(scanner);
        person.Introduce();
        person2.Introduce();

        scanner.close();


    }
    
}
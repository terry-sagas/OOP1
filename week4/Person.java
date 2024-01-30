package week4;


import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter your age: ");
        this.age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter your gender (M/F): ");
        this.gender = scanner.nextLine().charAt(0);
        scanner.close();
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
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
    }
    

       
    public static void main(String[] args) {
        Person person = new Person();
        person.Introduce();


    }
    
}
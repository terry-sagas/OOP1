
// This is a java program for lab 1 by Terry Sagas
// File name is lab1.java
// Description: in this lab i asked the user for their age and name and i output a string based on their age
// Date: 1/19/24


import java.util.Scanner;

public class lab1 {

    public static void main(String args[]){
        
        final int retirement = 65;  // Setting the retirement age constant to 65
        int age = 0;                // Setting the age variable to 0
        String name = "";           // Setting the name variable to blank
        int retirementYears = 0;    // Setting the years to retirement to 0

        // Setting the scanner varable to gain a input
        Scanner scanner = new Scanner(System.in);

        // Asking user for name
        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        // Asking the user for age
        System.out.println("Enter your age: ");
        // Setting the user input to age
        age = scanner.nextInt();

        // Checking if the age is less then 25
        if (age < 25 ){
            // Output message
            System.out.println("Hey there "+ name + ". Welcome to Durham College class on OOPS. You are young and full of possibilites!");
        }
        // Checking if the age is greater then or equal to 25 and less then 45
        else if (age >= 25 && age < 45) {
            // Output message
            System.out.println("Hey there "+ name + " Welcome to Durham College class on OOPS. 40s and 30s is the new 20s!");
        } 
        // Checking if the age is greater then and equal to 45 and less then 60
        else if (age >= 45 && age < 60) {
            // Output message
            System.out.println("hey there " + name + "welcome to durham college! this is aa great oop class!");
        } 
        // When all else does not pass (60+)
        else {
            // Output message
            System.out.println("Hey there " + name + " its never too late to start!");
        }
        retirementYears = retirement - age;
        System.out.println("you are: "+ retirementYears  + " year(s) away from retirement\n");
        // Closing the scanner
        scanner.close();
        
    }

    
}
package week3;

import java.util.Scanner;

public class task {
    
    public static void main(String args[]){
        String name = "";
        int student_number = 0;
        
        Scanner scanner = new Scanner(System.in);
        // Code to ask the durham id number
        // Asking user for name
        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        // Asking the user for age
        System.out.println("Enter your age: ");
        // Setting the user input to age
        student_number = scanner.nextInt();
        
        System.out.println(student_number + " " + name);
        scanner.close();
    }
}

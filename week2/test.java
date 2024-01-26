import java.util.Scanner;

public class test {
        public static void main(String args[]){
        
        int age = 0;                // Setting the age variable to 0
        String name = "";           // Setting the name variable to blank


        // Setting the scanner varable to gain a input
        Scanner scanner = new Scanner(System.in);

        // Asking user for name
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("whats your age");
        age = scanner.nextInt();
        System.out.println("age: " + age + "\nName: " + name);

        
        // Closing the scanner
        scanner.close();
        
    }
}


import java.util.Scanner;

public class test {
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
        System.out.println("whats your age");
        age = scanner.nextInt();
        System.out.println("age: " + age + "\nName: " + name);

        
        // Closing the scanner
        scanner.close();
        
    }
}

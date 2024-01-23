import java.util.Scanner;

public class input_and_print {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, World " + name + ". Welcome to Durham College class on OOPS");
        scanner.close();
    }
    
}

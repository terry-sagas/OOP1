package week10.Review.E7;

import java.util.Scanner;

public class Exercise_7_Exception_Handling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numerator:");
        int numerator = scanner.nextInt();

        System.out.println("Enter the denominator:");
        int denominator = scanner.nextInt();

        DivideByZero.divide(numerator, denominator);

        scanner.close();
    }
}

import java.util.Scanner;
/*
 * Name:        Terry Sagas
 * Date:        1/31/2024
 * Description: This is assignmet 1 part 3, in this assignment i needed to take 2 user
 *              input of two values, and calculate the sum, difference, product,
 *              quotient, and remainder then display it in the console.
 */
public class Calculator {
    private double input_one;       // Variable for the first input
    private double input_two;       // Variable for the second input
    private double sum;             // Variable for the sum
    private double difference;      // Variable for the difference
    private double product;         // Variable for the product
    private double quotient;        // Variable for the quotient
    private double remainder;       // Variable for the remainder

    public Calculator() {
        
    }

    // Getters
    public double getInput_one() {
        return input_one;
    }

    public double getInput_two() {
        return input_two;
    }

    public double getSum() {
        return sum;
    }

    public double getDifference() {
        return difference;
    }

    public double getProduct() {
        return product;
    }

    public double getQuotient() {
        return quotient;
    }

    public double getRemainder() {
        return remainder;
    }

    // Setters
    public void setInput_one(Scanner scanner) {
        System.out.print("Enter the first decimal number: ");
        this.input_one = scanner.nextDouble();
        
    }

    public void setInput_two(Scanner scanner) {
        System.out.print("Enter the second decimal number: ");
        this.input_two = scanner.nextDouble();
    }

    // Setters for calculations
    public double setSum() {
        sum = input_one + input_two;
        return sum;
    }

    public double setDifference() {
        difference = input_one - input_two;
        return difference;
    }

    public double setProduct() {
        product = input_one * input_two;
        return product;
    }

    public double setQuotient() {
        quotient = input_one / input_two;
        return quotient;
    }

    public double setRemainder() {
        remainder = input_one % input_two;
        return remainder;
    }

    public void calculations() {
        // Displaying the calcualtions
        System.out.println("Sum: " + setSum());                 // Sum
        System.out.println("Difference: " + setDifference());   // Difference
        System.out.println("Product: " + setProduct());         // Product
        System.out.println("Quotient: " + setQuotient());       // Quotient
        System.out.println("Remainder: " + setRemainder());     // Remainder
    }

    public static void main(String[] args) {
        // opening the scanner
        Scanner scanner = new Scanner(System.in);

        // Creating calculator object
        Calculator newCalculator = new Calculator();

        // Asking the user for the first input and setting it to the input one
        newCalculator.setInput_one(scanner);

        // Buffer
        scanner.nextLine();

        // Asking the user for the second input and setting it to the input two
        newCalculator.setInput_two(scanner);

        // Displaying the calculations
        newCalculator.calculations();

        // Closing the scanner
        scanner.close();
    }
}
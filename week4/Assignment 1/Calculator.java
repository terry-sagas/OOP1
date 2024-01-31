import java.util.Scanner;

public class Calculator {
    private double input_one;
    private double input_two;
    private double sum;
    private double difference;
    private double product;
    private double quotient;
    private double remainder;

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
    public void setInput_one(double input_one) {
        this.input_one = input_one;
    }

    public void setInput_two(double input_two) {
        this.input_two = input_two;
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
        System.out.println("Sum: " + setSum());
        System.out.println("Difference: " + setDifference());
        System.out.println("Product: " + setProduct());
        System.out.println("Quotient: " + setQuotient());
        System.out.println("Remainder: " + setRemainder());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator newCalculator = new Calculator();

        System.out.print("Enter the first decimal number: ");
        newCalculator.setInput_one(scanner.nextDouble());

        // Buffer
        scanner.nextLine();

        System.out.print("Enter the second decimal number: ");
        newCalculator.setInput_two(scanner.nextDouble());

        newCalculator.calculations();

        scanner.close();
    }
}
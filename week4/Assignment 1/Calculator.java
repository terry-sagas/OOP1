

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
        // Empty constructor
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

    // Methods for calculations
    public double add() {
        sum = input_one + input_two;
        return sum;
    }

    public double subtract() {
        difference = input_one - input_two;
        return difference;
    }

    public double multiply() {
        product = input_one * input_two;
        return product;
    }

    public double divide() {
        quotient = input_one / input_two;
        return quotient;
    }

    public double modulus() {
        remainder = input_one % input_two;
        return remainder;
    }

    public void calculations() {
        System.out.println("Sum: " + add());
        System.out.println("Difference: " + subtract());
        System.out.println("Product: " + multiply());
        System.out.println("Quotient: " + divide());
        System.out.println("Remainder: " + modulus());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator newCalculator = new Calculator();

        System.out.print("The first decimal number: ");
        
        newCalculator.setInput_one(scanner.nextDouble());
        newCalculator.setInput_two(scanner.nextDouble());

        newCalculator.calculations();

        scanner.close();
    }
}

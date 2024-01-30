package week4;

import java.util.Scanner;

public class Calculator {
        double input_one;
        double input_two;
        double sum;
        double difference;
        double product;
        double quotient;
        double remainder;


        public Calculator(Scanner scanner) {
            

            System.out.print("The first decimal number: ");
            this.input_one = scanner.nextDouble();

            System.out.print("The second decimal number: ");
            this.input_two = scanner.nextDouble();
            
        }

        public double add(){
            sum = input_one + input_two;
            return sum;
        }

        public double subtract(){
            difference = input_one - input_two;
            return difference;
        }

        public double multiply(){
            product = input_one * input_two;
            return product;
        }

        public double divide(){
            quotient = input_one / input_two;
            return quotient;
        }

        public double modulus(){
            remainder = input_one % input_two;
            return remainder;
        }

        public void calculations()
        {
            System.out.println("Sum: " + add());
            System.out.println("Difference: " + subtract());
            System.out.println("Product: " + multiply());
            System.out.println("Quotient: " + divide());
            System.out.println("Remainder: " + modulus());
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Calculator newCalculator = new Calculator(scanner);
            newCalculator.calculations();

            scanner.close();

        }

}

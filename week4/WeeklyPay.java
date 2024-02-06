package week4;
import java.util.Scanner;

public class WeeklyPay {
    public static double calculatePay(double wage, double hours) {
        // Calculate weekly pay with time and a half for overtime
        double amount;
        if (hours <= 40) {
            amount = wage * hours;
        } else {
            amount = (wage * 40) + (1.5 * wage * (hours - 40));
        }
        return amount;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter wage per hour: ");
        double wage = input.nextDouble();
        System.out.print("Enter number of hours worked: ");
        double hours = input.nextDouble();
        input.nextLine();

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        

        double weeklyPay = calculatePay(wage, hours);
        System.out.println("Weekly Pay of " + name +" : $" + weeklyPay);

        input.close();

    }
}



import java.util.Scanner;

/*
 * Name:        Terry Sagas
 * Date:        1/30/2024
 * Description: This is assignmet 1 part 2, in this assignment i needed to take a 
 *              users input of their name, and quantity of burgers they want, 
 *              and i needed to print a recept based on the numbers provided.
 */

public class BurgerShop {
    private String name;            // Private variable to hold the users name 
    private int quantity;           // Private variable to hold the quantity of burgers
    private double burger_price;    // Private variable to hold the burger price
    private double total_cost;      // Private variable to hold the total cost
    private double tax_amount;      // Private variable to hold the tax amount
    private double grand_total;     // Private variable to hold the grand total
    private double tax_percent;     // Private variable to hold the tax percent

    public BurgerShop() {
        
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getQuantity() {

        return quantity;
    }

    public double getBurgerPrice() {
        return burger_price;
    }

    public double getTaxPercent() {
        return tax_percent;
    }

    // Setters
    public void setName(Scanner scanner) {
        System.out.print("Enter Customer Name: ");
        this.name = scanner.nextLine();
    }

    public void setQuantity(Scanner scanner) {
        System.out.print("Quantity of burgers: ");
        this.quantity = scanner.nextInt();
    }

    public void setBurgerPrice(double burger_price) {
        this.burger_price = burger_price;
    }

    public void setTaxPercent(double tax_percent) {
        this.tax_percent = tax_percent;
    }


    public void Recept() {
        // Calculations to calculate tax amount, total cost without tax and the grand total
        total_cost = burger_price * quantity;
        tax_amount = total_cost * tax_percent;
        grand_total = total_cost + tax_amount;

        // Displaying the Receipt
        System.out.println("------- Receipt -------");
        System.out.println("Customer: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per Burger: " + burger_price);
        System.out.println("Total Cost: $" + total_cost);
        System.out.println("Tax Amount: $" + tax_amount);
        System.out.println("Grand Total: $" + grand_total);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        // Variables
        double burger_price = 5.99;     // Burger price
        double tax_percent = 0.07;      // tax percentage

        // Creating the scanner
        Scanner scanner = new Scanner(System.in);

        // Creating a new receipt object
        BurgerShop new_receipt = new BurgerShop();
        
        // Asking user for name
        new_receipt.setName(scanner);

        // Asking user for amount of burgers
        new_receipt.setQuantity(scanner);

        // Setting the burger price
        new_receipt.setBurgerPrice(burger_price);
        // Setting the tax percent
        new_receipt.setTaxPercent(tax_percent);

        // Calling the recept function to print recept
        new_receipt.Recept();

        // Closing scanner
        scanner.close();
    }
}
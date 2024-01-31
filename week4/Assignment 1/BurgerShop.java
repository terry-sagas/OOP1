

import java.util.Scanner;

public class BurgerShop {
    private String name;
    private int quantity;
    private double burger_price;
    private double total_cost;
    private double tax_amount;
    private double grand_total;
    private double tax_percent;

    public BurgerShop() {
        
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setBurgerPrice(double burger_price) {
        this.burger_price = burger_price;
    }

    public void setTaxPercent(double tax_percent) {
        this.tax_percent = tax_percent;
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

    public void Recept() {
        total_cost = burger_price * quantity;
        tax_amount = total_cost * tax_percent;
        grand_total = total_cost + tax_amount;

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
        double burger_price = 5.99;
        double tax_percent = 0.07;

        Scanner scanner = new Scanner(System.in);

        BurgerShop new_receipt = new BurgerShop();

        System.out.print("Enter Customer Name: ");
        new_receipt.setName(scanner.nextLine());

        System.out.print("Quantity of burgers: ");
        new_receipt.setQuantity(scanner.nextInt());

        new_receipt.setBurgerPrice(burger_price);
        new_receipt.setTaxPercent(tax_percent);

        new_receipt.Recept();

        scanner.close();
    }
}
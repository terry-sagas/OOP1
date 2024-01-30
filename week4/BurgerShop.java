package week4;

import java.util.Scanner;

public class BurgerShop {
    private String name;
    private int quantity;
    private double burger_price;
    private double total_cost;
    private double tax_amount;
    private double grand_total;
    private double tax_percent;

    public BurgerShop(double burger_price, double tax_percent){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        name = scanner.nextLine();

        System.out.print("Quantity of burgers: ");
        quantity = scanner.nextInt();

        total_cost = burger_price * quantity;

        tax_amount = total_cost * tax_percent;

        grand_total = tax_amount + total_cost;

        scanner.close();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTaxAmount() {
        return tax_amount;
    }
    public void setTaxAmount(double tax_amount) {
        this.tax_amount = tax_amount;
    }

    public double getTotalCost() {
        return total_cost;
    }

    public void setTotalCost(double total_cost) {
        this.total_cost = total_cost;
    }

    public double getBurgerPrice() {
        return burger_price;
    }
    public void setBurgerPrice(double burger_price) {
        this.burger_price = burger_price;
    }

    public double getGrandTotal() {
        return grand_total;
    }
    public void setGrandTotal(double grand_total) {
        this.grand_total = grand_total;
    }

    public double getTaxPercent() {
        return tax_percent;
    }
    public void setTaxPercent(double tax_percent) {
        this.tax_percent = tax_percent;
    }

    public void Recept(){
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
        BurgerShop new_recept = new BurgerShop(5.99, 0.07);
        new_recept.Recept();
    }
}
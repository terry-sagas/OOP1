package week10.lab3;
import java.util.Scanner;
/*
 * Name:        Terry Sagas
 * File:        lab3.java
 * Date:        2024/03/21
 * Description: Class File for the lab3.java
 */

abstract class Account {
    // Variables
    protected String accountType = "";      // String to hold account type
    protected long balance = 0;             // Long to hold Balance
    protected long accountNumber = 0;       // Long to hold account number
    protected long amountOwed = 0;          // Long for the amount owned
    

    // Getters
    public String getaccountType() {
        return accountType;
    }
    public long getBalance() {
        return balance;
    }
    public long getAccountNumber() {
        return accountNumber;
    }
    public long getAmountOwed() {
        return amountOwed;
    }
    // Setters
    public void setaccountType(String accountType) {
        this.accountType = accountType;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAmountOwed(long amountOwed) {
        this.amountOwed = amountOwed;
    }

    // Displaying info method
    public void printAccountDetails() {
        System.out.println("Account Details:");
        System.out.println("Account type: " + getaccountType());
        System.out.println("Balance: $" + getBalance());
        System.out.println("Account number: " + getAccountNumber());
        System.out.println("Amount Owed: $" + getAmountOwed());
        System.out.println("\n");
    }

    // Deposit method
    public void Deposit(Scanner scanner) {
        // Asking the user how much they want to deposit
        System.out.print("How much do you want to deposit?: ");
        long amount = Long.parseLong(scanner.nextLine());
        // Adding it to the amount
        balance += amount;
        // Printing it to the user
        System.out.println("Account number " + accountNumber + " \nDeposited $" + amount + "\nNew balance: $" + balance + "\n");
    }
    // Withdraw method
    public void Withdraw(Scanner scanner){
        System.out.print("How much do you want to withdraw?: ");
        long amount = Long.parseLong(scanner.nextLine());
        balance -= amount;
        // Checking the overdraft
        if (balance < 0){
            amountOwed = balance * -1;
            // Printing it to the user
            System.out.println("Overdraft!\n");
            // Printing it to the user
            System.out.println("Account number " + accountNumber + " \nWithdrawed $" + amount + "\nNew balance: $" + balance + "\nAmount owed: $" + amountOwed + "\n");
        }
        else{
            // Printing it to the user
            System.out.println("Account number " + accountNumber + " \nWithdrawed $" + amount + "\nNew balance: $" + balance + "\n");
        }

    }
}

// Basic account class
class BasicAccount extends Account{
    
}

// Savings account class
class SavingsAccount extends Account{
    private double intrestAmount = 0.02;    // Double for the intrest amount
    private double withdrawFee = 3;         // Double for the withdraw fee
    // Overriding Deposit
    @Override public void Deposit(Scanner scanner){
        // Asking users
        System.out.print("How much do you want to deposit? (+2% intrest on deposit): \n");
        long amount = Long.parseLong(scanner.nextLine());
        // Adding the intrest
        balance += amount * intrestAmount;
        balance += amount;
        // Displaying info
        System.out.println("Account number " + accountNumber + " \nDeposited $" + amount + "\nNew balance: $" + balance + "\nPlus 2% intrest" + "\n");
    }
    // Overriding withdraw
    @Override public void Withdraw(Scanner scanner){
        System.out.print("How much do you want to withdraw? (3$ fees on withdraw in savings accounts): ");
        long amount = Long.parseLong(scanner.nextLine());
        // Subtracting the ammount and the fee
        balance -= amount;
        balance -= withdrawFee;
        // Checking for overdraft
        if (balance < 0){
            // Making the amount owned positive
            amountOwed = balance * -1;
            // Displaying the overdraft amount
            System.out.println("Overdraft!\n");
            System.out.println("Account number " + accountNumber + " \nWithdrawed $" + amount + "\nNew balance: $" + balance + "\nAmount owed: $" + amountOwed + "\n");
        }
        else{
            System.out.println("Account number " + accountNumber + " \nWithdrawed $" + amount + "\nNew balance: $" + balance + "\n");
        }
    }


}

// Checking account class
class CheckingAccount extends Account{
    // Overriding the Withdraw method
    @Override public void Withdraw(Scanner scanner){
        // Asking user
        System.out.print("How much do you want to withdraw? (No Overdraft!): ");
        long amount = Long.parseLong(scanner.nextLine());
        // Checking for the overdraft without touching balance
        double tempCheckbalance = balance - amount;
        if (tempCheckbalance < 0){
            // telling user that they have been protected
            System.out.println("Overdraft Protection! You dont Have enough money to withdraw That amount \n");
            System.out.println("Account number " + accountNumber + " \nWithdrawed $" + amount + "\nNew balance: $" + balance + "\nAmount owed: $" + amountOwed + "\n");
        }
        else{
            // Subtracting the amount by the balance
            balance -= amount;
            System.out.println("Account number " + accountNumber + " \nWithdrawed $" + amount + "\nNew balance: $" + balance + "\n");
        }
    }
}

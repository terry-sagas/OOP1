package week10.lab3;
import java.util.Scanner;

/*
 * Name:        Terry Sagas
 * File:        lab3.java
 * Date:        2024/03/21
 * Description: Practice using polymorphism and overriding by creating a bank account class
 *              and inherit it using 3 child classes (Basic, checking, and savings)
 */

public class lab3 {
    public static void main(String[] args) {
        // Creating the scanner
        Scanner scanner = new Scanner(System.in);
        // Variables
        boolean continueProcessing = true;          // Bool for the while loop
        String userInput = "";                      // String for the user input
        
        // Creating the bank accounts
        BasicAccount basicAccount = new BasicAccount();
        SavingsAccount savingsAccount = new SavingsAccount();
        CheckingAccount checkingAccount = new CheckingAccount();

        // Setting the account number
        basicAccount.setAccountNumber(1000);
        // Setting the Balance
        basicAccount.setBalance(100);
        // Setting hte account type
        basicAccount.setaccountType("Basic");
        // Setting the amount owned
        basicAccount.setAmountOwed(0);

        // Setting the account number
        savingsAccount.setAccountNumber(1001);
        // Setting the Balance      
        savingsAccount.setBalance(500);
        // Setting hte account type
        savingsAccount.setaccountType("Savings Account");
        // Setting the amount owned
        savingsAccount.setAmountOwed(0);

        // Setting the account number
        checkingAccount.setAccountNumber(1002);
        // Setting the Balance 
        checkingAccount.setBalance(1000);
        // Setting hte account type
        checkingAccount.setaccountType("Checking Account");
        // Setting the amount owned
        checkingAccount.setAmountOwed(0);

        // While loop for the program
        while (continueProcessing) {
            // Asking for the user input
            System.out.println("------------------");
            System.out.println("Select Account:\n1 for basic\n2 for savings\n3 for checkings\n4 for all \nType anything else to exit");
            userInput = scanner.nextLine();
            System.out.println("------------------");
            // Switch case for each of the users choices 
            switch (userInput) {
                // Case for the basic account
                case "1":
                    System.out.println("Basic Account: \n");
                    // Calling the Withdraw method
                    basicAccount.Withdraw(scanner);
                    // Calling the Deposit method
                    basicAccount.Deposit(scanner);
                    // Displaying details
                    basicAccount.printAccountDetails();
                    break;
                // Case for the saving account
                case "2":
                    System.out.println("Savings Account: \n");
                    // Calling the Withdraw method
                    savingsAccount.Withdraw(scanner);
                    // Calling the Deposit method
                    savingsAccount.Deposit(scanner);
                    // Displaying details
                    savingsAccount.printAccountDetails();
                    break;
                // Case for the checkings account
                case "3":
                    System.out.println("Checkings Account: \n");
                    // Calling the Withdraw method
                    checkingAccount.Withdraw(scanner);
                    // Calling the Deposit method
                    checkingAccount.Deposit(scanner);
                    // Displaying details
                    checkingAccount.printAccountDetails();
                    break;
                // Case for all accounts
                case "4":
                    // Basic account
                    System.out.println("Basic Account: \n");
                    basicAccount.Withdraw(scanner);
                    basicAccount.Deposit(scanner);
                    basicAccount.printAccountDetails();
                    // Savings account
                    System.out.println("Savings Account: \n");
                    savingsAccount.Withdraw(scanner);
                    savingsAccount.Deposit(scanner);
                    savingsAccount.printAccountDetails();
                    // Checkings account
                    System.out.println("Checkings Account: \n");
                    checkingAccount.Withdraw(scanner);
                    checkingAccount.Deposit(scanner);
                    checkingAccount.printAccountDetails();
                    break;

                default:
                    // Breaking the loop
                    continueProcessing = false;
                    break;
            }

        }
        // Closing scanner
        scanner.close();
    }
}

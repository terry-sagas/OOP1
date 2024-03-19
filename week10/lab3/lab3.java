package week10.lab3;

import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //
        boolean continueProcessing = true;
        String userInput = "";
        

        BasicAccount basicAccount = new BasicAccount();
        SavingsAccount savingsAccount = new SavingsAccount();
        CheckingAccount checkingAccount = new CheckingAccount();

        basicAccount.setAccountNumber(1000);
        basicAccount.setBalance(100);
        basicAccount.setaccountType("Basic");
        basicAccount.setAmountOwed(0);

        savingsAccount.setAccountNumber(1001);
        savingsAccount.setBalance(500);
        savingsAccount.setaccountType("Savings Account");
        savingsAccount.setAmountOwed(0);

        checkingAccount.setAccountNumber(1002);
        checkingAccount.setBalance(1000);
        checkingAccount.setaccountType("Checking Account");
        checkingAccount.setAmountOwed(0);

        while (continueProcessing) {
            System.out.println("------------------");
            System.out.println("Select Account:\n1 for basic\n2 for savings\n3 for checkings\n4 for all \nType anything else to exit");
            userInput = scanner.nextLine();
            System.out.println("------------------");
            switch (userInput) {
                case "1":
                    System.out.println("Basic Account: \n");
                    basicAccount.Withdraw(scanner);
                    basicAccount.Deposit(scanner);
                    basicAccount.printAccountDetails();
                    break;
                case "2":
                    System.out.println("Savings Account: \n");
                    savingsAccount.Withdraw(scanner);
                    savingsAccount.Deposit(scanner);
                    savingsAccount.printAccountDetails();
                    break;
                case "3":
                    System.out.println("Checkings Account: \n");
                    checkingAccount.Withdraw(scanner);
                    checkingAccount.Deposit(scanner);
                    checkingAccount.printAccountDetails();
                    break;
                case "4":
                    System.out.println("Basic Account: \n");
                    basicAccount.Withdraw(scanner);
                    basicAccount.Deposit(scanner);
                    basicAccount.printAccountDetails();
                    System.out.println("Savings Account: \n");
                    savingsAccount.Withdraw(scanner);
                    savingsAccount.Deposit(scanner);
                    savingsAccount.printAccountDetails();
                    System.out.println("Checkings Account: \n");
                    checkingAccount.Withdraw(scanner);
                    checkingAccount.Deposit(scanner);
                    checkingAccount.printAccountDetails();
                    break;

                default:
                    continueProcessing = false;
                    break;
            }

        }
        scanner.close();
    }
}

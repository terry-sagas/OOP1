package week10.lab3;
import java.util.Scanner;
public class Account {
    protected String accountType = "";
    protected long balance = 0;
    protected long accountNumber = 0;
    protected long amountOwed = 0;
    


    public String getaccountType() {
        return accountType;
    }

    public void setaccountType(String accountType) {
        this.accountType = accountType;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAmountOwed() {
        return amountOwed;
    }

    public void setAmountOwed(long amountOwed) {
        this.amountOwed = amountOwed;
    }

    public void printAccountDetails() {
        System.out.println("Account Details:");
        System.out.println("Account type: " + getaccountType());
        System.out.println("Balance: $" + getBalance());
        System.out.println("Account number: " + getAccountNumber());
        System.out.println("Amount Owed: $" + getAmountOwed());
        System.out.println("\n");
    }

    public long BalanceChanges(){
        return balance;
    }

    public void Deposit(Scanner scanner) {
        System.out.print("How much do you want to deposit?: ");
        long amount = Long.parseLong(scanner.nextLine());
        balance += amount;
        System.out.println("Account number " + accountNumber + " \nDeposited $" + amount + "\nNew balance: $" + balance + "\n");
    }

    public void Withdraw(Scanner scanner){
        System.out.print("How much do you want to withdraw?: ");
        long amount = Long.parseLong(scanner.nextLine());
        balance -= amount;
        if (balance < 0){
            amountOwed = balance * -1;
            
            System.out.println("Overdraft!\n");
            System.out.println("Account number " + accountNumber + " \nWithdrawed $" + amount + "\nNew balance: $" + balance + "\nAmount owed: $" + amountOwed + "\n");
        }
        else{
            System.out.println("Account number " + accountNumber + " \nWithdrawed $" + amount + "\nNew balance: $" + balance + "\n");
        }

    }
}

class BasicAccount extends Account{
    
}

class SavingsAccount extends Account{
    private double intrestAmount = 0.02;
    private double withdrawFee = 3;

    @Override public void Deposit(Scanner scanner){
        System.out.print("How much do you want to deposit? (+2% intrest on deposit): \n");
        long amount = Long.parseLong(scanner.nextLine());
        balance += amount * intrestAmount;
        balance += amount;
        System.out.println("Account number " + accountNumber + " \nDeposited $" + amount + "\nNew balance: $" + balance + "\nPlus 2% intrest" + "\n");
    }

    @Override public void Withdraw(Scanner scanner){
        System.out.print("How much do you want to withdraw? (3$ fees on withdraw in savings accounts): ");
        long amount = Long.parseLong(scanner.nextLine());
        balance -= amount;
        balance -= withdrawFee;
        if (balance < 0){
            amountOwed = balance * -1;
            
            System.out.println("Overdraft!\n");
            System.out.println("Account number " + accountNumber + " \nWithdrawed $" + amount + "\nNew balance: $" + balance + "\nAmount owed: $" + amountOwed + "\n");
        }
        else{
            System.out.println("Account number " + accountNumber + " \nWithdrawed $" + amount + "\nNew balance: $" + balance + "\n");
        }
    }


}

class CheckingAccount extends Account{

    @Override public void Withdraw(Scanner scanner){
        System.out.print("How much do you want to withdraw? (No Overdraft!): ");
        long amount = Long.parseLong(scanner.nextLine());
        double tempCheckbalance = balance - amount;
        if (tempCheckbalance < 0){
            System.out.println("Overdraft Protection! You dont Have enough money to withdraw That amount \n");
            System.out.println("Account number " + accountNumber + " \nWithdrawed $" + amount + "\nNew balance: $" + balance + "\nAmount owed: $" + amountOwed + "\n");
        }
        else{
            balance -= amount;
            System.out.println("Account number " + accountNumber + " \nWithdrawed $" + amount + "\nNew balance: $" + balance + "\n");
        }
    }
}

class Main {
    public static void main(String[] args) {
        boolean continueProcessing = true;
        String userInput = "";
        Scanner scanner = new Scanner(System.in);

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
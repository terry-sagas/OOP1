package week10;

import java.io.*;

// Serializable class representing a bank account
class Bank implements Serializable {
    private int accountNumber;
    private String accountName;

    public Bank(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Account Name: " + accountName;
    }
}

public class BankSerializationDemo {
    public static void main(String[] args) {
        // Create a Bank object
        Bank account = new Bank(12345, "John Doe");

        // Write the Bank object to a file using object stream
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bank.ser"))) {
            oos.writeObject(account);
            System.out.println("Bank object written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Read the Bank object from the file using object stream
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bank.ser"))) {
            Bank restoredAccount = (Bank) ois.readObject();
            System.out.println("Bank object read from file: " + restoredAccount);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}

package Project;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


/*
 * Name: Terry Sagas
 * Date: 24/04/05
 * File: BookStore.java
 * Description:         This is my final project for my OOP1 class (i think) in this project i needed
 *                      to create a book store, i created a customer class, order class, 
 *                      storage class, and book class, to hold info. i ask the user for thier info
 *                      and create a order with thier info, they can pick many books and add them to 
 *                      a order, then the user gets a recipt
 */

public class BookStore {
    // Function for creating a new customer and returns the customer object created
    public static Customer enterInfo(Scanner scanner){
        // Creating new customer object
        Customer customer = new Customer();
        // Asking user for name
        System.out.println("Please enter your name: ");
        customer.setName(scanner.next());
        // Asking user for address
        System.out.println("Please enter your address: ");
        customer.setAddress(scanner.next());
        // Creating a loop to ensure that the user enters correct values
        while (true) {
            // Try Catch to ensure the user enters a number
            try{
                System.out.println("Please enter a Phone number");
                customer.setPhoneNumber(Long.parseLong(scanner.next()));
                break;
            } catch(NumberFormatException e){
                System.out.println("Not a number");
            }
        }
        // Asking user for email
        System.out.println("Please enter your email: ");
        customer.setEmail(scanner.next());
        return customer;
        
    }



    public static void orderBooks(Customer customer, BookStorage bookStorage, Scanner scanner , Order order){
        // Bool for loop
        boolean continueProcessing = true;
        while (continueProcessing) {
            // Try catch to give correct errors
            try{
                // Asking the user what books they want
                System.out.println("Please enter the id of the book you want. \nhere is your selection: ");
                for (int i = 0; i < bookStorage.getStorage().size(); i++){
                    System.out.println(i + " " + bookStorage.getStorage().get(i).getTitle());
                }
                System.out.println("");
                int userInput = scanner.nextInt();

                // Asking the user The Quantity of books they want
                System.out.println("Quantity?: ");
                int quantity = scanner.nextInt();
                // Checking if the store has the amout of books the user entered
                if(bookStorage.getStorage().get(userInput).getQuantity() < quantity){
                    System.out.println("Theres not enough books for you!");
                }else{
                    // Removing the specified amount of books from the store
                    bookStorage.removeBookQuantity(bookStorage.getStorage().get(userInput), quantity);
                    // Adding the book to the order
                    order.addBook(bookStorage.getStorage().get(userInput), quantity);
                    // Breaking the loop
                    continueProcessing = false;
                    break;
                }
            // Catch for the wrong input
            } catch(InputMismatchException e){
                System.out.println("Not a number!");
                scanner.next();
            // Catch for when the user enters a number out of the bounds of the list
            } catch(IndexOutOfBoundsException e){
                System.out.println("Not in Range!");
            }
        }
        continueProcessing = true;
        while (continueProcessing) {
            try{
            // Asking the user if they want to order a other book, or remove a book
            System.out.println("Would you like to order a other book? Or remove book Y/N/R");
            String userSelection = scanner.next().toUpperCase();
            switch (userSelection) {
                case "Y":
                    // Calling the order books to allow the user to input more books
                    orderBooks(customer, bookStorage, scanner, order);
                    break;
                case "R":
                    // Asking the user what book they want to remove 
                    System.out.println("Please enter the id of the book you want to remove:");
                    // Displaying books the user has in order
                    for (int i = 0; i < order.getOrder().size(); i++){
                        System.out.println(i + " " + bookStorage.getStorage().get(i).getTitle());
                    }
                    int userInput = scanner.nextInt();
                    // Removing book
                    order.removeBook(userInput);
                    break;
                case "N":
                    continueProcessing = false;
                    break;
            }
        // Catch for the wrong input
        } catch(InputMismatchException e){
            System.out.println("Not a number!");
            scanner.next();
        // Catch for when the user enters a number out of the bounds of the list
        } catch(IndexOutOfBoundsException e){
            System.out.println("Not in Range!");
        }
        }

    }
    public static void main(String[] args) {
        // Creating a book storage object
        BookStorage bookStorage = new BookStorage();
        Scanner scanner = new Scanner(System.in);
        // List for the books
        List<Book> books = new ArrayList<>();
        // Creating books and adding them to the list of books
        books.add(new Book("The Da Vinci Code", 9780307474278L, "Dan Brown", "Doubleday", 35.99f, 30));
        books.add(new Book("The Hunger Games", 9780439023481L, "Suzanne Collins", "Scholastic Press", 17.99f, 40));
        books.add(new Book("Harry Potter and the Deathly Hallows", 9780545010221L, "J.K. Rowling", "Bloomsbury", 24.99f, 50));
        books.add(new Book("The Fault in Our Stars", 9780142424179L, "John Green", "Dutton Books", 12.99f, 20));
        books.add(new Book("Twilight", 9780316015844L, "Stephenie Meyer", "Little, Brown and Company", 19.99f, 35));
        books.add(new Book("The Kite Runner", 9781594480003L, "Khaled Hosseini", "Riverhead Books", 25.99f, 20));
        books.add(new Book("The Girl with the Dragon Tattoo", 9780307269751L, "Stieg Larsson", "Knopf", 29.99f, 30));
        books.add(new Book("The Night Circus", 9780307744432L, "Erin Morgenstern", "Doubleday", 26.99f, 25));
        books.add(new Book("Gone Girl", 9780307588371L, "Gillian Flynn", "Crown Publishing Group", 24.99f, 30));
        books.add(new Book("Shatter Me", 9780062085481L, "Tahereh Mafi", "HarperCollins", 15.99f, 35));
        // Adding the list of books to the storage
        bookStorage.setStorage(books);

        // Input for the users selection
        String userSelection;
        // Bool to ensure the user enters the correct input
        boolean continueProcessing = true;
        
        
        // Loop for asking the user what selection
        while (continueProcessing == true) {
            // Asking user what they want to do
            System.out.println("Hello, welcome to the book store would you like to place a order? Y/N");
            userSelection = scanner.next().toUpperCase();
            // Switch case for each input
            switch (userSelection) {
                case "Y":
                    // Creating the customer
                    Customer customer = enterInfo(scanner);
                    // Creating the order
                    Order order = new Order(customer);
                    // Calling the order books to populate the order object
                    orderBooks(customer, bookStorage, scanner, order);
                    // Displaying recipt
                    order.Recipt();
                    // Breaking loop
                    continueProcessing = false;
                    break;
                case "N":
                    // Breaking loop
                    continueProcessing = false;
                    break;
            }
        }
        
        scanner.close();
    }
}

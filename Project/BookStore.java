package Project;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BookStore {
    public static Customer enterInfo(Scanner scanner){
        Customer customer = new Customer();
        System.out.println("Please enter your name: ");
        customer.setName(scanner.next());
        System.out.println("Please enter your address: ");
        customer.setAddress(scanner.next());
        while (true) {
            try{
                System.out.println("Please enter a Phone number");
                customer.setPhoneNumber(Long.parseLong(scanner.next()));
                break;
            } catch(NumberFormatException e){
                System.out.println("Not a number");
            }
        }
        System.out.println("Please enter your email: ");
        customer.setEmail(scanner.next());
        return customer;
        
    }



    public static void orderBooks(Customer customer, BookStorage bookStorage, Scanner scanner , Order order){
        while (true) {
            try{
                System.out.println("Please enter the id of the book you want. \nhere is your selection: ");
                for (int i = 0; i < bookStorage.getStorage().size(); i++){
                    System.out.println(i + " " + bookStorage.getStorage().get(i).getTitle());
                }
                int userInput = scanner.nextInt();
                System.out.println("Quantity?: ");
                int quantity = scanner.nextInt();
                bookStorage.removeBookQuantity(bookStorage.getStorage().get(userInput), quantity);
                order.addBook(bookStorage.getStorage().get(userInput), quantity);
                
                break;
            } catch(NumberFormatException e){
                System.out.println("Not a number!");
            } catch(IndexOutOfBoundsException e){
                System.out.println("Not in Range!");
            }
        }
        boolean continueProcessing = true;
        while (continueProcessing) {
            try{
            System.out.println("Would you like to order a other book? Or remove book Y/N/R");
            String userSelection = scanner.next().toUpperCase();
            switch (userSelection) {
                case "Y":
                    orderBooks(customer, bookStorage, scanner, order);
                    break;
                case "R":
                    System.out.println("Please enter the id of the book you want to remove:");
                    for (int i = 0; i < order.getOrder().size(); i++){
                        System.out.println(i + " " + bookStorage.getStorage().get(i).getTitle());
                    }
                    int userInput = scanner.nextInt();
                    order.removeBook(userInput);
                    break;
                case "N":
                    continueProcessing = false;
                    break;
            }
            } catch(NumberFormatException e){
                System.out.println("Not a number!");
            } catch(IndexOutOfBoundsException e){
                System.out.println("Not in Range!");
            }
        }

    }
    public static void main(String[] args) {
        
        BookStorage bookStorage = new BookStorage();
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
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
        bookStorage.setStorage(books);

        String userSelection;
        boolean continueProcessing = true;
        
        

        while (continueProcessing == true) {
            System.out.println("Hello, welcome to the book store would you like to place a order? Y/N");
            userSelection = scanner.next().toUpperCase();
            switch (userSelection) {
                case "Y":
                    Customer customer = enterInfo(scanner);
                    Order order = new Order(customer);
                    orderBooks(customer, bookStorage, scanner, order);
                    order.Recipt();
                    continueProcessing = false;
                    break;
                case "N":
                    continueProcessing = false;
                    break;
            }
        }
        scanner.close();
    }
}

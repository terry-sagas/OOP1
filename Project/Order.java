package Project;
import java.time.LocalDate;
import java.util.*; 

/*
 * Name: Terry Sagas
 * Date: 24/04/05
 * File: Order.java
 * Description: Class for creating the order
 */

public class Order {

    static private int orderID;                                     // Order id
    private Customer customer;                                      // Customer
    private List<Book> order = new ArrayList<Book>();               // List for storing the list of books the user wants to order
    private List<Integer> bookQuantity = new ArrayList<Integer>();  // List for the quantity for each book they order

    // Constuctor for the customer
    Order(Customer customer){
        // Adding to the order ID
        orderID ++;
        this.customer = customer;
    }


    // Getters
    public int getOrderID(){
        return orderID;
    }
    public List<Book> getOrder() {
        return order;
    }


    // Setters
    public void setOrder(List<Book> order) {
        this.order = order;
    }

    // Method to add book to order with its quantity
    public void addBook(Book book, int quantity){
        // Adding book to order
        order.add(book);
        bookQuantity.add(quantity);
    }
    // Method to remove book from order
    public void removeBook(int index){
        // Removing book from inputed index
        order.remove(index);
        // Removing quantity from inputed index
        bookQuantity.remove(index);
    }
    // Method for recipt
    public void Recipt(){
        // Flaot for the total price of everything 
        float total = 0; 
        // Displaying info
        LocalDate currentDate = LocalDate.now();
        System.out.println("------------------------------");
        System.out.println("          BOOKSTORE           ");
        System.out.println("        Order Receipt         ");
        System.out.println("------------------------------");
        System.out.println("Order ID: " + orderID);
        System.out.println("Date: " + currentDate);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Phone Number: " + customer.getPhoneNumber());
        System.out.println("Books Purchased:");
        // Displaying each book
        for (int i = 0; i < order.size(); i++){
            System.out.println(order.get(i).getTitle() + " - $" + order.get(i).getPrice() * bookQuantity.get(i) + " Quantity: " + bookQuantity.get(i));
            total += order.get(i).getPrice() * bookQuantity.get(i);
        }
        // displaying total cost
        System.out.println("Total Cost: $" + total);
        System.out.println("Thank you!");
    }
}

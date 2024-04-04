package Project;
import java.time.LocalDate;
import java.util.*; 
public class Order {
    static private int orderID;
    private Customer customer;
    private List<Book> order = new ArrayList<Book>();
    private List<Integer> bookQuantity = new ArrayList<Integer>();

    Order(Customer customer){
        orderID ++;
        this.customer = customer;
    }


    public int getOrderID(){
        return orderID;
    }



    public void setOrder(List<Book> order) {
        this.order = order;
    }
    public List<Book> getOrder() {
        return order;
    }

    public void addBook(Book book, int quantity){
        order.add(book);
        bookQuantity.add(quantity);
    }
    public void removeBook(int index){
        order.remove(index);
        bookQuantity.remove(index);
    }
    public void Recipt(){
        float total = 0; 
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
        for (int i = 0; i < order.size(); i++){
            System.out.println(order.get(i).getTitle() + " - $" + order.get(i).getPrice() * bookQuantity.get(i) + " Quantity: " + bookQuantity.get(i));
            total += order.get(i).getPrice() * bookQuantity.get(i);
        }
        System.out.println("Total Cost: $" + total);

        System.out.println("Thank you!");
    }
}

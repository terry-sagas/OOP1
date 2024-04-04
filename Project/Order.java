package Project;
import java.time.LocalDate;
import java.util.*; 
public class Order {
    private int orderID;
    private Customer customer;
    private List<Book> order = new ArrayList<Book>();



    public void setOrderID(int orderID){
        this.orderID = orderID;
    }
    public int getOrderID(){
        return orderID;
    }


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Customer getCustomer() {
        return customer;
    }


    public void setOrder(List<Book> order) {
        this.order = order;
    }
    public List<Book> getOrder() {
        return order;
    }

    public void AddBook(Book book){
        order.add(book);
    }
    public void RemoveBook(int index){
        order.remove(index);
    }
    public void Recipt(){
        LocalDate currentDate = LocalDate.now();
        System.out.println("------------------------------");
        System.out.println("          BOOKSTORE           ");
        System.out.println("        Order Receipt         ");
        System.out.println("------------------------------");
        System.out.println("Order ID: " + orderID);
        System.out.println("Date: " + currentDate);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Books Purchased:");
        for (int i = 0; i < order.size(); i++){
            System.out.println(order.get(i).getTitle() + " - $" + order.get(i).getPrice());
        }
    }
}

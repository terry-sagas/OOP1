package Project;
/*
 * Name: Terry Sagas
 * Date: 24/04/05
 * File: Book.java
 * Description: Class for a book
 */
public class Book {
    private String title;
    private long ISBN;
    private String author;
    private String publisher;
    private float price;
    private int quantity;

    // Creating the book
    public Book(String title, long ISBN, String author, String publisher, float price, int quantity) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getTitle() {
        return title;
    }
    public long getISBN() {
        return ISBN;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublisher() {
        return publisher;
    }
    public float getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

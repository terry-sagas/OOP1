package Project;

import java.util.ArrayList;
import java.util.List;

/*
 * Name: Terry Sagas
 * Date: 24/04/05
 * File: BookStorage.java
 * Description: Class for storing all the books in the store
 */

public class BookStorage {
    private List<Book> Storage = new ArrayList<Book>();     // List for all the books

    // Setters and getters for getting all books in the storage
    public void setStorage(List<Book> storage) {
        Storage = storage;
    }
    public List<Book> getStorage() {
        return Storage;
    }

    // Method to add a book to the storage
    public void addBook(Book book){
        Storage.add(book);
    }
    // Method to remove a book from the storage (I did not use this i just wanted to have this included)
    public void removeBookQuantity(Book book, int userQuantity){
        int quantity = book.getQuantity();
        quantity -= userQuantity;
        book.setQuantity(quantity);
    }

}

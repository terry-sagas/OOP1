package Project;

import java.util.ArrayList;
import java.util.List;

public class BookStorage {
    private List<Book> Storage = new ArrayList<Book>();

    public void setStorage(List<Book> storage) {
        Storage = storage;
    }
    public List<Book> getStorage() {
        return Storage;
    }
    public void addBook(Book book){

        Storage.add(book);
    }
    public void removeBookQuantity(Book book, int userQuantity){
        int quantity = book.getQuantity();
        quantity -= userQuantity;
        book.setQuantity(quantity);
    }

}

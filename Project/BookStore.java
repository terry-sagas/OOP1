package Project;


import java.util.Scanner;
public class BookStore {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);
        Book book1 = new Book("The Da Vinci Code", 9780307474278l, "Dan Brown", "Doubleday", 35.99f, 30);
        Book book2 = new Book("The Hunger Games", 9780439023481l, "Suzanne Collins", "Scholastic Press", 17.99f, 40);
        Book book3 = new Book("Harry Potter and the Deathly Hallows", 9780545010221l, "J.K. Rowling", "Bloomsbury", 24.99f, 50);
        Book book4 = new Book("The Fault in Our Stars", 9780142424179l, "John Green", "Dutton Books", 12.99f, 20);
        Book book5 = new Book("Twilight", 9780316015844l, "Stephenie Meyer", "Little, Brown and Company", 19.99f, 35);

        System.out.println("Hello, welcome to the book store would you like to place a order? Y/N");
        scanner.next();
    }
}

package week5.assignment2;
import java.util.List;
import java.util.ArrayList;

public class exercise4 {
    public static void main(String[] args) {
        // Creating the list
        List<Integer> myList = new ArrayList<>(List.of(20, 30, 25, 35, -16, 60, -100));
        // Displaying old list
        System.out.println("Old List: " + myList);
        // Adding 80 to the list
        myList.add(80);
        // Renoving index 4
        myList.remove(4);
        // Printing new list
        System.out.println("New List: " + myList);

    }

}

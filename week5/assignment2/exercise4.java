package week5.assignment2;
import java.util.List;
import java.util.ArrayList;

public class exercise4 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(List.of(20, 30, 25, 35, -16, 60, -100));
        System.out.println("Old List: " + myList);
        myList.add(80);
        myList.remove(4);
        System.out.println("New List: " + myList);

    }

}

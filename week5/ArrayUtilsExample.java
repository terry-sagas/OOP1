package week5;
import java.util.Arrays;

public class ArrayUtilsExample {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {5, 2, 8, 1, 9};

        // Sorting the array
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // Binary search
        int key = 8;
        int index = Arrays.binarySearch(numbers, key);
        System.out.println("Index of " + key + " in the sorted array: " + index);

        // Filling array with a specific value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Filled Array: " + Arrays.toString(filledArray));

        // Copying array
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        // Checking array equality
        int[] equalArray = {1, 2, 5, 8, 9};
        boolean isEqual = Arrays.equals(numbers, equalArray);
        System.out.println("Are arrays equal? " + isEqual);

        int s[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int d[] = { 15, 25, 35, 45, 55, 65, 75, 85, 95, 105};
        int sourcePos = 3;
        int destPos = 5;
        int len = 4;
        System.out.println("source_array : " + Arrays.toString(s));
        System.out.println("sourcePos : " + sourcePos);
        System.out.println("dest_array : " + Arrays.toString(d));
        System.out.println("destPos : " + destPos); 
        System.out.println("len : " + len);
        // Use of arraycopy() method
        System.arraycopy(s, sourcePos, d, destPos, len);
        System.out.println("final dest_array : " + Arrays.toString(d));   }
}

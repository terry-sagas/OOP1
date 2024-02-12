package week5.assignment2;

import java.util.Arrays;

public class exercise3 {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 3, 1, 11}; 
        int[] squaredArray = squareValue(array);
        Arrays.sort(squaredArray);
        System.out.println("Sorted Squared Array:");
        printArray(squaredArray);
    }

    // Function to square the values of the array
    public static int[] squareValue(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * array[i];
        }
        return result;
    }

    // Function to print the elements of the array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

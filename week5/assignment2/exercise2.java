package week5.assignment2;

public class exercise2 {
    public static void main(String[] args) {
        // Creating the array 
        int[] array = {2, 18, 6, -4, 5, 1};
        for (int i = 0; i < array.length; i++) {
            // Changing the value of the array to the value at this current index plus the same value divided by the 1st index
            array[i] = array[i] + (array[i] / array[0]);
        }


        // Printing data
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}

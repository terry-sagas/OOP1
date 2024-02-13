package week5.assignment2;



public class exercise1 {
    public static void main(String[] args) {
        // Creating new array
        int[] data = new int[8];
        // Inputing values into array
        data[0] = 3;
        data[7] = -18;
        data[4] = 5;
        data[1] = data[0];
        
        // Setting x to whats stored in the 4th index
        int x = data[4];
        data[4] = 6;
        data[x] = data[0] * data[1];
        // Printing data
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }
        


    }


}

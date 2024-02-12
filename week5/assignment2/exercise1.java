package week5.assignment2;



public class exercise1 {
    public static void main(String[] args) {
        int[] data = new int[8];
        data[0] = 3;
        data[7] = -18;
        data[4] = 5;
        data[1] = data[0];
    
        int x = data[4];
        data[4] = 6;
        data[x] = data[0] * data[1];
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }
        


    }


}

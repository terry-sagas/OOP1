package week5.assignment2;

public class exercise2 {
    public static void main(String[] args) {
        int[] list = {2, 18, 6, -4, 5, 1};
        for (int i = 0; i < list.length; i++) {
            list[i] = list[i] + (list[i] / list[0]);
        }



        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }

    }
}

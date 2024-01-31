package week4;
public class Square {
    public static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        System.out.println(square(3)); // 9
        System.out.println(square(4)); // 16
        
        int x = 5;
        int y = square(x);
        System.out.println(y); // 25
        
        System.out.println(square(x) + square(3)); // 34
    }
}
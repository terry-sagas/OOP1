package week6;

public class strings_example4 {
    public static void main(String[] args) {
        String a = "banana";
        String b = "apple";

        int result = a.compareTo(b);

        if (result == 0) {
            System.out.println("a and b are the same");
        } else if (result < 0) {
            System.out.println("a is lexicographically less than b");
        } else {
            System.out.println("a is lexicographically greater than b");
        }
    }
}

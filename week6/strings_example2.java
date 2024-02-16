package week6;

public class strings_example2 {
    public static void main(String[] args) {
        String s1 = "hello there";
        char charArray[] = new char[5];

        String output = "s1: " + s1;

        // test length method
        output += "\nLength of s1: " + s1.length();

        // loop through characters in s1 and display reversed
        output += "\nThe string reversed is: ";

        for (int count = s1.length() - 1; count >= 0; count--) {
            output += s1.charAt(count) + " ";
        }

        // Copy characters from s1 to charArray using getChars()
        s1.getChars(6, 11, charArray, 0);

        // Display the final output
        System.out.println(output);
        System.out.println("Copied characters: " + new String(charArray));
    }
}

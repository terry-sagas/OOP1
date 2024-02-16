package week6;

public class strings_example3 {
    public static void main(String[] args) {
        String s1 = new String("hello"); // s1 is a copy of "hello"
        String s2 = "goodbye";
        String s3 = "Happy Birthday";
        String s4 = "happy birthday";

        String output = "s1 = " + s1 + "\ns2 = " + s2 + "\ns3 = " + s3 + "\ns4 = " + s4 + "\n\n";

        // test for equality
        if (s1.equals("hello")) // true
            output += "s1 equals \"hello\"\n";
        else
            output += "s1 does not equal \"hello\"\n";

        // test for equality with ==
        if (s1 == "hello") // false; they are not the same object
            output += "s1 equals \"hello\"\n";
        else
            output += "s1 does not equal \"hello\"\n";

        // test for equality (ignore case)
        if (s3.equalsIgnoreCase(s4)) // true
            output += "s3 equals s4\n";
        else
            output += "s3 does not equal s4\n";

        System.out.println(output);
    }
}

package week6;

public class call_string_processes {
    public static void main(String[] args) {
        // 1) String concatenation
        System.out.println(StringProcesses.concatenate("Hello", "World"));

        // 2) Substring search
        System.out.println(StringProcesses.containsSubstring("HelloWorld", "World"));

        // 3) Case changes
        System.out.println(StringProcesses.changeCase("HelloWorld"));

        // 4) Substring search ignoring case
        System.out.println(StringProcesses.containsSubstringIgnoreCase("HelloWorld", "world"));

        // 5) Replace characters
        System.out.println(StringProcesses.replace("Hello-World", "-", "_"));

        // 6) Convert string to integer
        System.out.println(StringProcesses.stringToInt("123"));

        // 7) Convert integer to string
        System.out.println(StringProcesses.intToString(123));

        // 8) Find character at a given index
        System.out.println(StringProcesses.charAt("Hello", 1));

        // 9) Find all indices of a character
        System.out.println(StringProcesses.allIndicesOfChar("Hello", 'l'));

        // 10) Get string length
        System.out.println(StringProcesses.length("Hello"));

        // 11) Tokenize a string given a delimiter
        System.out.println(StringProcesses.tokenize("Hello,World", ","));
    }
}
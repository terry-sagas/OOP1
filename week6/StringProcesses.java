package week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringProcesses {

    // 1) String concatenation
    public static String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    // 2) Substring search
    public static boolean containsSubstring(String str, String substr) {
        return str.contains(substr);
    }

    // 3) Case changes
    public static String changeCase(String str) {
        return str.toUpperCase();
    }

    // 4) Case insensitive search
    public static boolean containsSubstringIgnoreCase(String str, String substr) {
        return str.toLowerCase().contains(substr.toLowerCase());
    }

    // 5) String replacement
    public static String replace(String str, String oldChar, String newChar) {
        return str.replace(oldChar, newChar);
    }

    // 6) String to int conversion
    public static int stringToInt(String str) {
        return Integer.parseInt(str);
    }

    // 7) Int to string conversion
    public static String intToString(int num) {
        return Integer.toString(num);
    }

    //8 Finding character at a specific index
    public static char charAt(String str, int index) {
        return str.charAt(index);
    }

    // 9) Find all indices of a character
    public static List<Integer> allIndicesOfChar(String str, char c) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                indices.add(i);
            }
        }
        return indices;
    }
    
    // 10) Get string length
    public static int length(String str) {
        return str.length();
    }

    // 11) Tokenize a string given a delimiter
    public static List<String> tokenize(String str, String delimiter) {
        return new ArrayList<>(Arrays.asList(str.split(delimiter)));
    }
}

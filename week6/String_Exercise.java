package week6;
/*
 * Name:            Terry Sagas
 * FileName:        String_Exercise.java
 * Description:     I had to take a string and use functions to manipulate them
 * Date:            24/02/15
 */
public class String_Exercise {
    public static void main(String[] args) {
        // Creating the String
        String str = "Java is awesome!";
        // Printing the string
        System.out.println("String: " + str);
        // Printing out the string at index 5
        System.out.println("String at index 5 is: " + str.charAt(5));
        // Printing out the length of string
        System.out.println("The characters in the string are: " + str.length());
        // Printing substring after index 5
        System.out.println("The substring from index 5 is: " + str.substring(5));
        // Printing the string in all uppercase
        System.out.println("The string in upper case is: " + str.toUpperCase());
        // Printing the string in all lowercase
        System.out.println("The string in lower case is: " + str.toLowerCase());
        // Replacing awesome with amazing
        System.out.println("Replacing the word 'Awesome': " + str.replace("awesome", "amazing"));
        
    }
}

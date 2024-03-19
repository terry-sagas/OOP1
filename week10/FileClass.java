package week10;


import java.io.File;
import java.util.Scanner;

public class FileClass{
    public static void main(String[] args) {
        // Get a filename to write from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a filename: ");
        String filename = input.nextLine();

        // Create a file object
        File file = new File(filename);

        // Create a file with this name
        try {
            file.createNewFile();
            System.out.println("File created: " + file.getName());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        String directoryPath = "C:\\Users\\jedit\\Desktop\\java files";
        // Save this file in a folder
        File folder = new File(directoryPath);

        // Save the file in the folder
        File newFile = new File(folder, filename);
    }
}

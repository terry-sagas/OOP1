package week10;

import java.io.*;

public class FileClassMethods {

    public static void main(String args[]) {
        // Define the directory path
        String directoryPath = "C:\\Users\\jedit\\Desktop\\java_files";

        // Define the file name
        String fileName = "hi.txt";

        // Create a File object representing the file
        File f = new File(directoryPath, fileName);

        // Print file information
        System.out.println("Executable File : " + f.canExecute());
        System.out.println("Name of the file : " + f.getName());
        System.out.println("Path of the file : " + f.getAbsolutePath());
        System.out.println("Parent name :  " + f.getParent());
        System.out.println("Write mode :  " + f.canWrite());
        System.out.println("Read mode : " + f.canRead());
        System.out.println("Existence : " + f.exists());
        System.out.println("Last Modified : " + f.lastModified());
        System.out.println("Length : " + f.length());

        try {
            if (!f.exists()) {
                if (f.createNewFile()) {
                    System.out.println("File created successfully.");
                } else {
                    System.out.println("Failed to create the file.");
                }
            }

            if (f.exists()) {
                if (f.delete()) {
                    System.out.println("File deleted successfully.");
                } else {
                    System.out.println("Failed to delete the file.");
                }
            }

            // Set the file as read-only
            if (!f.exists()) {
                f.createNewFile();
            }
            f.setReadOnly();
            System.out.println("File set as read-only.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

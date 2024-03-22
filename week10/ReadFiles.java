package week10;



import java.io.File;
import java.util.Scanner;

public class ReadFiles {
    public static void main(String[] args) {
        // Open the file
        String filename = "hi.txt";
        try {
            File file = new File(filename);
            // Create a Scanner for the file
            Scanner inputFile = new Scanner(file);

            // Read lines from the file until no more are left
            while (inputFile.hasNext()) {
                // Read the next line
                String line = inputFile.nextLine();
                // Display the line
                System.out.println(line);
            }
        } catch (Exception e) {
            // Handle any exceptions
        }
        
    }
}


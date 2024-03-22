package week10.Review.E6;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFromFile {

    public static void readDataFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Data read from the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
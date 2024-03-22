package week10.Review.E5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class WriteToFile {

    public static void writeToFile(String fileName, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
            System.out.println("Data has been written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }


}
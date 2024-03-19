package week10;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LineNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Input file: ");
        String inFile = console.next();

        System.out.print("Output file: ");
        String outFile = console.next();

        try {
            FileReader reader = new FileReader(inFile);
            Scanner in = new Scanner(reader);
            FileWriter writer = new FileWriter(outFile);

            int lineNumber = 1;

            while (in.hasNextLine()) {
                String line = in.nextLine();
                writer.write("/* " + lineNumber + " */ " + line + "\n");
                lineNumber++;
            }

            writer.close(); // Close the FileWriter
            in.close();
        } catch (IOException exception) {
            System.out.println("Error processing file: " + exception);
        }
    }
}

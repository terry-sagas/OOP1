package week10;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.NoSuchElementException;

public class GradeProcessor {
    public static void main(String[] args) {
        // Read comma-separated integers from user input
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter a line with comma-separated integers (no space): ");
        String input = stdin.nextLine();

        // Write input to scores.txt
        try (PrintWriter writer = new PrintWriter("scores.txt")) {
            writer.println(input);
            System.out.println("Numbers written to scores.txt successfully.");
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found - " + e.getMessage());
        }

        // Process data from scores.txt file
        File gradeFile = new File("scores.txt");
        if (gradeFile.exists()) {
            try (Scanner inFile = new Scanner(gradeFile)) {
                while (inFile.hasNextLine()) {
                    String line = inFile.nextLine();
                    StringTokenizer tokenizer = new StringTokenizer(line, ",");
                    if (tokenizer.hasMoreTokens()) {
                        System.out.print(" Name: " + tokenizer.nextToken());

                        int num = 0;
                        double sum = 0;

                        while (tokenizer.hasMoreTokens()) {
                            num++;
                            sum += Integer.parseInt(tokenizer.nextToken());
                        }
                        System.out.println(" average = " + sum / num);
                    }
                }
            } catch (FileNotFoundException e) {
                System.err.println("Error: File not found - " + e.getMessage());
            } catch (NoSuchElementException | NumberFormatException e) {
                System.err.println("Error: Invalid data format - " + e.getMessage());
            }
        } else {
            System.err.println("Error: File not found - scores.txt");
        }
    }
}



package week10.Review.E5;

import java.util.Scanner;

public class Exercise_5_File_Handling_Writing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        String fileName = "Hello_World.txt";
    
        System.out.println("Enter the data to be written to the file:");
        String data = scanner.nextLine();
    
        WriteToFile.writeToFile(fileName, data);
    
        scanner.close();
    }
}
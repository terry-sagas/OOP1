package week5;

import java.util.Scanner;

public class ICE2 {
    public static void main(String[] args) {
        int N = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("how many students");
        N = scanner.nextInt();
        double[][] student_marks = new double[N][3];
        double [] total_student_marks = new double[N];
        double total_marks_class = 0;
        for (int row = 0; row < student_marks.length; row++){
            System.out.print("enter marks for student: " + row + "");
            for (int col = 0; col <student_marks[0].length; col++){
                student_marks[row][col] = scanner.nextDouble();
                total_student_marks[row] += student_marks[row][col];
            }
        total_marks_class += total_student_marks[row];
        }
        for (double[] row : student_marks){
            for (double element : row){
                System.out.print(element + " ");
            }
            System.out.println("the total marks for student is: " + total_marks_class);
        }



        scanner.close();
    }
}

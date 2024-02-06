package week5;

import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] A1 = new int[] {34, 45, 67, 89, 23};
        String [] A2 = new String[] {"hello", "hello", "hello", "hello",};
        //System.out.print(A1);
        for(int i = 0; i < A1.length; i++){
            System.out.println(A1[i]);
        }
        for(int i = 0; i < A2.length; i++){
            System.out.println(A2[i]);
        }
        
        int[] intArray2 = new int [] {1,2,3,4};
        int[] squares = new int [4];
        System.out.println("printing squares: ");
        for (int i = 0; i < intArray2.length; i++){
            squares[i] = intArray2[i] * intArray2[i];
            System.out.println( squares[i] + " ");
        }

        int[] intArray3 = new int [] {1,2,3,4,5};
        System.out.println("Reversed: ");
        for (int i = intArray3.length-1; i >= 0; i--) {
            System.out.println(intArray3[i] + " ");
        }

        
        
        // System.out.println("Enter size of the array:");
        // int N = input.nextInt();
        // int[] array3 = new int[N];
        // for (int i = 0; i < N; i++) {
        //     System.out.println("Enter a Number: ");
        //     array3[i] = input.nextInt();
        // }


        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        for (String day : days) {
            System.out.println(day);
        }
        
        /*
         * for (int dailysteps: stepcount){
         * dailysteps = scanner.nextInt()
         * totalsteps+= dailysteps[]
         *}
         */
        // Getting all steps
        // int[] steps = new int[7];
        // for (int i = 0; i < steps.length; i++) {
        //     System.out.println("Enter a Number of steps: ");
        //     steps[i] = input.nextInt();
        // }


        // // Printing all steps
        // for (int i = steps.length - 1; i >= 0; i--) {
        //     System.out.println(days[i] + ": " + steps[i]);
        // }

        // int totalSteps = 0;
        // int avSteps = 0;

        // // Adding all steps
        // for (int i = 0; i < steps.length; i++) {
        //     totalSteps += steps[i];
        // }
        // avSteps = totalSteps/steps.length;

        // System.out.println("the total steps are: " + totalSteps);
        // System.out.println("the average steps are: " +  avSteps);

        
        

        input.close();

        }

        
    }


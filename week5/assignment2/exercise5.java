package week5.assignment2;


public class exercise5 {
    public static void main(String[] args) {
        // Creating the multi array
        int[][] data = {{45,20, 40}, {30,40,60}, {34,67,78}};

        int largestAverageIndex = 0;
        double largestAverage = 0;

        for (int i = 0; i < data.length; i++) {
            int sum = 0;
            // Calculate sum of elements in current row
            for (int j = 0; j < data[i].length; j++) {
                sum += data[i][j];
            }
            // Calculate average of current row
            double average = sum / data[i].length;

            // Update largest average and check if its index current average is larger then the old one
            if (average > largestAverage) {
                largestAverage = average;
                largestAverageIndex = i;
            }
        }

        // Printing the index and value of row with largest average
        System.out.println("Row with largest average: " + largestAverageIndex);
        System.out.println("Value of largest average: " + largestAverage);

    }
}

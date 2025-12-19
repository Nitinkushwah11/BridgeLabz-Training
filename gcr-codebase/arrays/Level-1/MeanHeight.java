import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create a double array of size 11
        double[] heights = new double[11];
        double sum = 0;

        // Take input from the user
        System.out.println("Enter the heights of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i]; // add each height to sum
        }

        // Calculate mean height
        double mean = sum / heights.length;

        // Display the result
        System.out.println("Mean height of the football team is: " + mean);

        sc.close();
    }
}

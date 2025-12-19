import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check for positive integer
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        // Create String array to store results
        String[] result = new String[number + 1];

        // Loop from 0 to number and save values
        for (int i = 0; i <= number; i++) {
            if (i == 0) {
                result[i] = "0";
            } else if (i % 3 == 0 && i % 5 == 0) {
                result[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i] = "Fizz";
            } else if (i % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = String.valueOf(i);
            }
        }

        // Print the array results with index position
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }

        sc.close();
    }
}


import java.util.Scanner;

class FactorFinderWhile {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Get input value for number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is a positive integer
        if (number >= 1) {

            // Print factors of the number
            System.out.println("Factors of " + number + " are:");

            int counter = 1;

            // Use while loop to find factors
            while (counter < number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }

        } else {
            System.out.println("The number " + number + " is not a positive integer");
        }
    }
}

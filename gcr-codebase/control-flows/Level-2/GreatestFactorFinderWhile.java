import java.util.Scanner;

class GreatestFactorFinderWhile {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Get integer input and assign it to number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is a positive integer
        if (number >= 1) {

            // Define greatestFactor variable and initialize it to 1
            int greatestFactor = 1;

            // Create counter variable starting from number - 1
            int counter = number - 1;

            // Use while loop to find the greatest factor
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }

            // Display the greatest factor
            System.out.println("The greatest factor of " + number +
                    " beside itself is " + greatestFactor);

        } else {
            System.out.println("The number " + number + " is not a positive integer");
        }
    }
}

import java.util.Scanner;

class GreatestFactorFinder {
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

            // Run loop from number-1 down to 1
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }

            // Display the greatest factor
            System.out.println("The greatest factor of " + number +
                    " beside itself is " + greatestFactor);

        } else {
            System.out.println("The number " + number + " is not a positive integer");
        }
    }
}

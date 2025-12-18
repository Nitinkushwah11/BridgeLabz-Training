import java.util.Scanner;

class PrimeNumberCheck {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Take integer input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if number is greater than 1
        if (number > 1) {

            // Boolean variable to store prime status
            boolean isPrime = true;

            // Loop through numbers from 2 to number-1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Display result
            if (isPrime) {
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + " is not a prime number");
            }

        } else {
            System.out.println(number + " is not a prime number (Prime numbers are greater than 1)");
        }
    }
}

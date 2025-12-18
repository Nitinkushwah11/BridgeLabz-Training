import java.util.Scanner;

class FactorialCalculatorFor {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Take integer input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check whether the number is a natural number
        if (number >= 0) {

            // Compute factorial using for loop
            long factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }

            // Print the factorial
            System.out.println("The factorial of " + number + " is " + factorial);

        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}

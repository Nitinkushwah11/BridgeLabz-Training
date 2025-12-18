import java.util.Scanner;

class FactorialCalculatorWhile {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Take integer input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check whether the number is a positive integer
        if (number >= 0) {

            // Compute factorial using while loop
            long factorial = 1;
            int counter = 1;

            while (counter <= number) {
                factorial = factorial * counter;
                counter++;
            }

            // Print the factorial
            System.out.println("The factorial of " + number + " is " + factorial);

        } else {
            System.out.println("The number " + number + " is not a positive integer");
        }
    }
}

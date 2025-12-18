import java.util.Scanner;

class FactorFinder {
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

            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("The number " + number + " is not a positive integer");
        }
    }
}

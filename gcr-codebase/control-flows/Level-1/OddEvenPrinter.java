import java.util.Scanner;

class OddEvenPrinter {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Get integer input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check whether the number is a natural number
        if (number >= 1) {

            // Iterate from 1 to the given number
            for (int i = 1; i <= number; i++) {

                // Check if the number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is even number");
                } else {
                    System.out.println(i + " is odd number");
                }
            }

        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}

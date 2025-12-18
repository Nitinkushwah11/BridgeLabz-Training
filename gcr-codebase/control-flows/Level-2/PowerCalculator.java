import java.util.Scanner;

class PowerCalculator {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Get integer input for number
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        // Get integer input for power
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Check for positive integers
        if (number > 0 && power >= 0) {

            // Create result variable and initialize it to 1
            int result = 1;

            // Calculate power using for loop
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }

            // Print the result
            System.out.println(number + " raised to the power " + power + " is " + result);

        } else {
            System.out.println("Please enter positive integers for number and power");
        }
    }
}

import java.util.Scanner;

class PowerUsingWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get integer input for number and power
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Create result variable
        int result = 1;

        // Create temp counter variable
        int counter = 0;

        // Use while loop
        while (counter == power ? false : counter < power) {
            result = result * number;
            counter++;
        }

        // Print the result
        System.out.println("The result of " + number + " raised to the power " + power + " is " + result);
    }
}

// Creating Class with name BasicCalculator indicating the purpose is to perform
// basic arithmetic operations. Notice the class name is a Noun.
import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create a double variable number1 and take input
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        // Create a double variable number2 and take input
        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        // Perform addition and store the result
        double addition = number1 + number2;

        // Perform subtraction and store the result
        double subtraction = number1 - number2;

        // Perform multiplication and store the result
        double multiplication = number1 * number2;

        // Perform division and store the result
        double division = number1 / number2;

        // Display the results
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + addition + ", " + subtraction + ", " + multiplication + ", and " + division);

        // Close the scanner
        sc.close();
    }
}

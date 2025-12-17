// Creating Class with name DoubleOperation indicating the purpose is to perform
// double operations and understand operator precedence. Notice the class name is a Noun.
import java.util.Scanner;

class DoubleOperation {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create double variable a and take input
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        // Create double variable b and take input
        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        // Create double variable c and take input
        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        // Perform double operation a + b * c
        double result1 = a + b * c;

        // Perform double operation a * b + c
        double result2 = a * b + c;

        // Perform double operation c + a / b
        double result3 = c + a / b;

        // Perform double operation a % b + c
        double result4 = a % b + c;

        // Display the result
        System.out.println("The results of Double Operations are " +
                result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}

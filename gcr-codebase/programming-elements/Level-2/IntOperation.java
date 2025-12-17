// Creating Class with name IntOperation indicating the purpose is to perform
// integer operations and understand operator precedence. Notice the class name is a Noun.
import java.util.Scanner;

class IntOperation {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create int variable a and take input
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        // Create int variable b and take input
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        // Create int variable c and take input
        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        // Perform integer operation a + b * c
        int result1 = a + b * c;

        // Perform integer operation a * b + c
        int result2 = a * b + c;

        // Perform integer operation c + a / b
        int result3 = c + a / b;

        // Perform integer operation a % b + c
        int result4 = a % b + c;

        // Display the result
        System.out.println("The results of Int Operations are " +
                result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}

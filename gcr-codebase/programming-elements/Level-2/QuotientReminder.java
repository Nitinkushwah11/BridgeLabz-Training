// Creating Class with name QuotientReminder indicating the purpose is to
// calculate quotient and reminder of two numbers. Notice the class name is a Noun.
import java.util.Scanner;

class QuotientReminder {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create an int variable number1 and take input
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        // Create an int variable number2 and take input
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        // Calculate quotient using division operator
        int quotient = number1 / number2;

        // Calculate reminder using moduli operator
        int reminder = number1 % number2;

        // Display the result
        System.out.println("The Quotient is " + quotient +
                " and Reminder is " + reminder +
                " of two number " + number1 + " and " + number2);
    }
}

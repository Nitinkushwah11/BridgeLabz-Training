// Creating Class with name SmallestNumberCheck indicating the purpose is to
// check whether the first number is the smallest among three numbers.
// Notice the class name is a Noun.
import java.util.Scanner;

class SmallestNumberCheck {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create an int variable number1 and take input
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        // Create an int variable number2 and take input
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        // Create an int variable number3 and take input
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        // Check if the first number is the smallest
        boolean isFirstSmallest = (number1 < number2) && (number1 < number3);

        // Display the result
        System.out.println("Is the first number the smallest? " + isFirstSmallest);
    }
}

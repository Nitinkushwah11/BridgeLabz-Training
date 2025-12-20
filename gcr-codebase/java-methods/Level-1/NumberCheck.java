import java.util.Scanner;

public class NumberCheck {

    // Method to check the number
    static int checkNumber(int num) {
        if (num > 0) {
            return 1;    // positive
        } else if (num < 0) {
            return -1;   // negative
        } else {
            return 0;    // zero
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Method call
        int result = checkNumber(number);

        // Display result
        if (result == 1) {
            System.out.println("The number is Positive");
        } else if (result == -1) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("The number is Zero");
        }

        sc.close();
    }
}

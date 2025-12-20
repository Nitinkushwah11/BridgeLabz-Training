import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Method call
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display result
        System.out.println("Quotient = " + result[0]);
        System.out.println("Remainder = " + result[1]);

        sc.close();
    }
}

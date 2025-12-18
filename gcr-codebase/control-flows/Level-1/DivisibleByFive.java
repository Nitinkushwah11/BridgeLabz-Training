import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create an int variable number and take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is divisible by 5
        boolean isDivisible = (number % 5 == 0);

        // Display the result
        System.out.println("Is the number " + number +
                " divisible by 5? " + isDivisible);
    }
}

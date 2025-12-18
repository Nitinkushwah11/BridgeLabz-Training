import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Step 1: Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = sc.nextInt();

        // Step 2: Initialize sum to 0 and store original number
        int sum = 0;
        int originalNumber = number;

        // Step 3: Use while loop to extract each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10;  // get last digit
            sum += digit * digit * digit;      // add cube of digit to sum
            originalNumber /= 10;              // remove last digit
        }

        // Step 4: Check if sum of cubes is equal to original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        sc.close();
    }
}

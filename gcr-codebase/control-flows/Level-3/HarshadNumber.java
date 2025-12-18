import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize sum variable and store original number
        int sum = 0;
        int tempNumber = number; // to preserve original number for later

        // Step 3: Use while loop to calculate sum of digits
        while (tempNumber != 0) {
            int digit = tempNumber % 10; // get last digit
            sum += digit;                // add digit to sum
            tempNumber /= 10;            // remove last digit
        }

        // Step 4: Check divisibility
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }

        sc.close();
    }
}

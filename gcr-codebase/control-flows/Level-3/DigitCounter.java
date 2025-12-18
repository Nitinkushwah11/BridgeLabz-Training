import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        // Step 1: Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize count variable
        int count = 0;
        int tempNumber = number; // use a temporary variable to preserve original number

        // Step 3: Loop to count digits
        while (tempNumber != 0) {
            tempNumber /= 10; // remove last digit
            count++;          // increase count by 1
        }

        // Step 4: Display the number of digits
        System.out.println("The number of digits in " + number + " is: " + count);

        sc.close();
    }
}

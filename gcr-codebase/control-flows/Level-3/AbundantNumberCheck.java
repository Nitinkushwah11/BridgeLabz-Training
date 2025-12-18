import java.util.Scanner;

public class AbundantNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int sum = 0; // Initialize sum of divisors
        
        // Loop to find divisors and calculate their sum
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i; // Add divisor to sum
            }
        }
        
        // Check if the number is abundant
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }
        
        sc.close();
    }
}

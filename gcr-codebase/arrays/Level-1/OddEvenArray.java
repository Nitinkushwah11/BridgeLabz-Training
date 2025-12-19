import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check for natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number.");
            return; // exit the program
        }

        // Create arrays for odd and even numbers
        int size = number / 2 + 1;
        int[] odd = new int[size];
        int[] even = new int[size];

        // Index variables
        int oddIndex = 0;
        int evenIndex = 0;

        // Loop from 1 to number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }

        // Print odd numbers array
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        // Print even numbers array
        System.out.print("\nEven Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        sc.close();
    }
}

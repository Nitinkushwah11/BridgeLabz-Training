import java.util.Scanner;

public class NumberCheckArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Define an integer array of size 5
        int[] arr = new int[5];

        // Take user input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                // Positive number
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i] + " is Positive and Even");
                } else {
                    System.out.println(arr[i] + " is Positive and Odd");
                }

            } else if (arr[i] < 0) {
                // Negative number
                System.out.println(arr[i] + " is Negative");

            } else {
                // Zero
                System.out.println(arr[i] + " is Zero");
            }
        }

        // Compare first and last elements
        if (arr[0] == arr[arr.length - 1]) {
            System.out.println("First and last elements are Equal");
        } else if (arr[0] > arr[arr.length - 1]) {
            System.out.println("First element is Greater than last element");
        } else {
            System.out.println("First element is Less than last element");
        }

        sc.close();
    }
}

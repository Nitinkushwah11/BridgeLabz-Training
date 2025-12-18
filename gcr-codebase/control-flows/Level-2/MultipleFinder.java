import java.util.Scanner;

class MultipleFinder {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Get input value for number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is a positive integer and less than 100
        if (number > 0 && number < 100) {

            // Print multiples of the number below 100
            System.out.println("Multiples of " + number + " below 100 are:");

            // Run loop backward from 100 to 1
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("The number " + number + " is not a positive integer less than 100");
        }
    }
}

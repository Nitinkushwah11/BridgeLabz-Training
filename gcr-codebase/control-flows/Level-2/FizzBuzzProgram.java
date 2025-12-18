import java.util.Scanner;

class FizzBuzzProgram {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Take integer input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check whether the number is a positive integer
        if (number >= 1) {

            // Loop from 1 to the given number
            for (int i = 1; i <= number; i++) {

                // Check for multiples of 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("The number " + number + " is not a positive integer");
        }
    }
}

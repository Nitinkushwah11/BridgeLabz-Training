import java.util.Scanner;

class FizzBuzzWhile {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Take integer input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check whether the number is a positive integer
        if (number >= 1) {

            int counter = 1;

            // Use while loop from 1 to the given number
            while (counter <= number) {

                // Check for multiples of 3 and 5
                if (counter % 3 == 0 && counter % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (counter % 3 == 0) {
                    System.out.println("Fizz");
                } else if (counter % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(counter);
                }

                counter++;
            }

        } else {
            System.out.println("The number " + number + " is not a positive integer");
        }
    }
}

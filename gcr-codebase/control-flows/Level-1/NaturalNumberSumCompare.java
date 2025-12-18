import java.util.Scanner;

class NaturalNumberSumCompare {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check whether the number is a natural number
        if (number >= 1) {

            // Compute sum using formula n*(n+1)/2
            int sumByFormula = number * (number + 1) / 2;

            // Compute sum using while loop
            int sumByLoop = 0;
            int counter = 1;

            while (counter <= number) {
                sumByLoop = sumByLoop + counter;
                counter++;
            }

            // Compare the two results
            boolean isSame = (sumByFormula == sumByLoop);

            // Display the results
            System.out.println("Sum using formula is " + sumByFormula);
            System.out.println("Sum using while loop is " + sumByLoop);
            System.out.println("Both computations are correct? " + isSame);

        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}

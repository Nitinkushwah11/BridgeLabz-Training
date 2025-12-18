import java.util.Scanner;

class MultiplesBelowHundred {
    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Get input value for number
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        // Check if number is positive and less than 100
        if (number > 0 && number < 100) {

            // Create counter variable
            int counter = number - 1;

            // Use while loop
            while (counter > 1) {

                // Check if counter perfectly divides the number
                if (number % counter == 0) {
                    System.out.println(counter);
                }

                counter--;
            }

        } else {
            System.out.println("Please enter a positive integer less than 100");
        }
    }
}

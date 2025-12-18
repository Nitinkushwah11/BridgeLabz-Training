import java.util.Scanner;

class LargestNumberCheck {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create an int variable number1 and take input
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        // Create an int variable number2 and take input
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        // Create an int variable number3 and take input
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        // Check if the first number is the largest
        boolean isFirstLargest = (number1 > number2) && (number1 > number3);

        // Check if the second number is the largest
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);

        // Check if the third number is the largest
        boolean isThirdLargest = (number3 > number1) && (number3 > number2);

        // Display the result
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
    }
}

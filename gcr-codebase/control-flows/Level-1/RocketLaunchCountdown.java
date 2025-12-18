import java.util.Scanner;

class RocketLaunchCountdown {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create an int variable counter and take input
        System.out.print("Enter the countdown starting number: ");
        int counter = sc.nextInt();

        // Use while loop to count down to 1
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }
}

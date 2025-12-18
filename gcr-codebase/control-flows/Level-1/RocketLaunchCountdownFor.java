import java.util.Scanner;

class RocketLaunchCountdownFor {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create an int variable counter and take input
        System.out.print("Enter the countdown starting number: ");
        int counter = sc.nextInt();

        // Use for loop to count down to 1
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

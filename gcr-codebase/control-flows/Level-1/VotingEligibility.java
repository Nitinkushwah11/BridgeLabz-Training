import java.util.Scanner;

class VotingEligibility {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create an int variable age and take input
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        // Check voting eligibility
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}

import java.util.Scanner;

public class ElectionBoothManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vote1 = 0, vote2 = 0, vote3 = 0;
        int age;

        System.out.println("---- Welcome to Election Booth ----");
        System.out.println("Enter -1 as age to stop voting.");

        while (true) {

            System.out.print("\nEnter your age: ");
            age = sc.nextInt();

            // Exit condition
            if (age == -1) {
                break;
            }

            // Eligibility check
            if (age >= 18) {

                System.out.println("You are eligible to vote.");
                System.out.println("Vote for Candidate:");
                System.out.println("1. Candidate A");
                System.out.println("2. Candidate B");
                System.out.println("3. Candidate C");
                System.out.print("Enter your choice (1/2/3): ");

                int choice = sc.nextInt();

                if (choice == 1) {
                    vote1++;
                } 
                else if (choice == 2) {
                    vote2++;
                } 
                else if (choice == 3) {
                    vote3++;
                } 
                else {
                    System.out.println("Invalid Vote!");
                }

            } else {
                System.out.println("Sorry, you are not eligible to vote.");
            }
        }

        // Final Result
        System.out.println("\n---- Voting Result ----");
        System.out.println("Candidate A Votes: " + vote1);
        System.out.println("Candidate B Votes: " + vote2);
        System.out.println("Candidate C Votes: " + vote3);

        sc.close();
    }
}

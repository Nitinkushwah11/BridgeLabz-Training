/* Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.*/

import java.util.Scanner;

public class PhoneRechargeSimulator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 0;
        char choice;

        System.out.println("------ Phone Recharge Simulator ------");

        do {
            System.out.print("Enter your Mobile Operator (Jio / Airtel / VI): ");
            String operator = sc.next();

            System.out.print("Enter recharge amount: ");
            double amount = sc.nextDouble();

            balance += amount;

            // Offers using switch-case
            switch (operator.toLowerCase()) {
                case "jio":
                    System.out.println("Jio Offer: Get 1GB Extra Data");
                    break;
                case "airtel":
                    System.out.println("Airtel Offer: 100 SMS Free");
                    break;
                case "vi":
                    System.out.println("VI Offer: Unlimited Night Data");
                    break;
                default:
                    System.out.println("Invalid Operator. No offer available.");
            }

            System.out.println("Recharge Successful");
            System.out.println("Current Balance: " + balance);

            System.out.print("Do you want to recharge again? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you for using Phone Recharge Simulator");
    }
}

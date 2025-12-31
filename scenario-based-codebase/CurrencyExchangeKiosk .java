/*18. Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).*/

import java.util.Scanner;

public class CurrencyExchangeKiosk {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("\nEnter amount in INR: ");
            double inr = sc.nextDouble();

            System.out.println("\nChoose Target Currency:");
            System.out.println("1. USD (US Dollar)");
            System.out.println("2. EUR (Euro)");
            System.out.println("3. GBP (British Pound)");
            System.out.println("4. JPY (Japanese Yen)");

            System.out.print("Enter option: ");
            int option = sc.nextInt();

            double result = 0;

            switch (option) {

                case 1:
                    result = inr * 0.012;   // INR to USD
                    System.out.println("Converted Amount in USD: " + result);
                    break;

                case 2:
                    result = inr * 0.011;   // INR to EUR
                    System.out.println("Converted Amount in EUR: " + result);
                    break;

                case 3:
                    result = inr * 0.010;   // INR to GBP
                    System.out.println("Converted Amount in GBP: " + result);
                    break;

                case 4:
                    result = inr * 1.78;    // INR to JPY
                    System.out.println("Converted Amount in JPY: " + result);
                    break;

                default:
                    System.out.println("Invalid currency option!");
            }

            System.out.print("\nDo you want another conversion? (y/n): ");
            choice = sc.next().toLowerCase().charAt(0);

        } while (choice == 'y');

        System.out.println("\nThank you for using Currency Exchange Kiosk!");
        sc.close();
    }
}

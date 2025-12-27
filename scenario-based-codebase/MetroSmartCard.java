import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 200;   // Initial Smart Card Balance
        int distance;
        double fare;

        System.out.println("---- Delhi Metro Smart Card System ----");
        System.out.println("Initial Balance: ₹" + balance);
        System.out.println("Enter -1 to exit.");

        while (balance > 0) {

            System.out.print("\nEnter distance travelled in KM: ");
            distance = sc.nextInt();

            // Exit condition
            if (distance == -1) {
                break;
            }

            // Fare calculation using ternary operator
            fare = (distance <= 5) ? 10 :
                   (distance <= 15) ? 20 : 30;

            // Check sufficient balance
            if (fare <= balance) {
                balance -= fare;
                System.out.println("Fare: ₹" + fare);
                System.out.println("Remaining Balance: ₹" + balance);
            } else {
                System.out.println("Insufficient Balance! Please recharge.");
                break;
            }
        }

        System.out.println("\n---- Journey Ended ----");
        System.out.println("Final Balance: ₹" + balance);
        sc.close();
    }
}

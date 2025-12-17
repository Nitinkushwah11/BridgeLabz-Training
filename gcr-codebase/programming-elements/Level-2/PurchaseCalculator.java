// Creating Class with name PurchaseCalculator indicating the purpose is to
// calculate the total purchase price. Notice the class name is a Noun.
import java.util.Scanner;

public class PurchaseCalculator {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create a double variable unitPrice and take input
        System.out.print("Enter the unit price of the item: ");
        double unitPrice = sc.nextDouble();

        // Create an int variable quantity and take input
        System.out.print("Enter the quantity to be bought: ");
        int quantity = sc.nextInt();

        // Calculate the total purchase price
        double totalPrice = unitPrice * quantity;

        // Display the result
        System.out.println("The total purchase price is INR " + totalPrice +
                " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}

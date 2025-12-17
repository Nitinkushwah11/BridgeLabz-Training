// Creating Class with name DistanceConverter indicating the purpose is to convert
// distance from feet to yards and miles. Notice the class name is a Noun.
import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create a double variable distanceInFeet and take input
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Convert distance from feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;

        // Convert distance from yards to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760;

        // Display the result
        System.out.println("The distance in yards is " + distanceInYards +
                " while the distance in miles is " + distanceInMiles);
    }
}

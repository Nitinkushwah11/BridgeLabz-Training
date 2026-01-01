import java.util.Scanner;
/*19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.*/


public class BusRouteDistanceTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalDistance = 0;
        double stopDistance = 2.5;   // distance between stops (km)
        char choice = 'n';

        while (choice != 'y') {

            totalDistance = totalDistance + stopDistance;

            System.out.println("\nBus stopped at next stop.");
            System.out.println("Distance covered so far: " + totalDistance + " km");

            System.out.print("Do you want to get off here? (y/n): ");
            choice = sc.next().toLowerCase().charAt(0);
        }

        System.out.println("\nYou got off the bus.");
        System.out.println("Total Distance Travelled: " + totalDistance + " km");

        sc.close();
    }
}

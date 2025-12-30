import java.util.Scanner;
public class SmartParkingSystem
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

        int capacity = 5;   // Total parking slots
        int occupied = 0;
        int choice;

        System.out.println("---- Smart Parking Lot System ----");

        while (occupied < capacity) {

            System.out.println("\n1. Park Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Exit System");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (occupied < capacity) {
                        occupied++;
                        System.out.println("Vehicle Parked Successfully.");
                    } else {
                        System.out.println("Parking Full!");
                    }
                    break;

                case 2:
                    if (occupied > 0) {
                        occupied--;
                        System.out.println("Vehicle Exited Successfully.");
                    } else {
                        System.out.println("Parking is already empty.");
                    }
                    break;

                case 3:
                    System.out.println("Occupied Slots: " + occupied + "/" + capacity);
                    break;

                case 4:
                    System.out.println("Exiting System...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }

        System.out.println("\nParking Lot is Full! No more entries allowed.");
        sc.close();

		
	}
}
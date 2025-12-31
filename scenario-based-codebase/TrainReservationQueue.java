/*12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).*/

import java.util.Scanner;

public class TrainReservationQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalSeats = 5;
        int front = 0, rear = -1;
        String[] queue = new String[totalSeats];

        int choice;

        while (true) {

            System.out.println("\n===== TRAIN RESERVATION SYSTEM =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Booked Passengers");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (rear == totalSeats - 1) {
                        System.out.println("All seats are full. Booking stopped.");
                        break;
                    }

                    System.out.print("Enter Passenger Name: ");
                    String name = sc.nextLine();

                    rear++;
                    queue[rear] = name;
                    System.out.println("Ticket booked for " + name);
                    System.out.println("Remaining Seats: " + (totalSeats - (rear + 1)));
                    break;

                case 2:
                    if (front > rear) {
                        System.out.println("No bookings yet.");
                    } else {
                        System.out.println("Booked Passengers List:");
                        for (int i = front; i <= rear; i++) {
                            System.out.println((i + 1) + ". " + queue[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using Train Reservation System.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }

            if (rear == totalSeats - 1) {
                System.out.println("\nTrain is fully booked. Booking closed.");
                break;
            }
        }

        sc.close();
    }
}

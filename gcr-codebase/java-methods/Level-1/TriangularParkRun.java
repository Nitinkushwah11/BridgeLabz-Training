import java.util.Scanner;

public class TriangularParkRun {

    // Method to calculate number of rounds
    static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;   // perimeter in meters
        double totalDistance = 5000;                 // 5 km = 5000 meters
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sides of the triangular park
        System.out.print("Enter side 1 (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double side3 = sc.nextDouble();

        // Method call
        double rounds = calculateRounds(side1, side2, side3);

        // Display result
        System.out.println("Number of rounds required to complete 5 km = " + rounds);

        sc.close();
    }
}

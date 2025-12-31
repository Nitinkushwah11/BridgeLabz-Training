/*12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).*/

import java.util.Scanner;

public class TemperatureLogger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] temperatures = new double[7];

        inputTemperatures(scanner, temperatures);
        double averageTemp = calculateAverage(temperatures);
        double maxTemp = findMaximum(temperatures);

        printReport(temperatures, averageTemp, maxTemp);
    }

    // Method to take input temperatures
    public static void inputTemperatures(Scanner scanner, double[] temps) {
        for (int day = 0; day < temps.length; day++) {
            System.out.print("Enter temperature for Day " + (day + 1) + ": ");
            temps[day] = scanner.nextDouble();
        }
    }

    // Method to calculate average temperature
    public static double calculateAverage(double[] temps) {
        double sum = 0;
        for (double temp : temps) {
            sum += temp;
        }
        return sum / temps.length;
    }

    // Method to find maximum temperature using if
    public static double findMaximum(double[] temps) {
        double max = temps[0];
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] > max) {
                max = temps[i];
            }
        }
        return max;
    }

    // Method to print final report
    public static void printReport(double[] temps, double avg, double max) {
        System.out.println("\n------ 7 Day Temperature Report ------");
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + temps[i]);
        }
        System.out.println("-------------------------------------");
        System.out.println("Average Temperature: " + avg);
        System.out.println("Maximum Temperature: " + max);
    }
}

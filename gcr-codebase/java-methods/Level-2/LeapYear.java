import java.util.Scanner;

public class LeapYear {

    // Method to check leap year
    public static boolean isLeapYear(int year) {

        // Condition for Gregorian calendar
        if (year < 1582) {
            return false;
        }

        // Leap year conditions
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Method call
        boolean result = isLeapYear(year);

        // Display result
        if (year < 1582) {
            System.out.println("Leap Year calculation is valid only for year >= 1582");
        } else if (result) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }

        sc.close();
    }
}

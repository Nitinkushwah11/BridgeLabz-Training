import java.util.Scanner;

class LeapYearSingleIf {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Take year input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check if year is valid for Gregorian calendar
        if (year >= 1582) {

            // Single if statement with logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }

        } else {
            System.out.println("Year must be >= 1582 for Gregorian calendar");
        }
    }
}

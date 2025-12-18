import java.util.Scanner;

class LeapYearCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check if year is valid for Gregorian calendar
        if (year >= 1582) {

            // Part 1: Using multiple if-else statements
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year (Multiple if-else)");
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year (Multiple if-else)");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year (Multiple if-else)");
            } else {
                System.out.println(year + " is not a Leap Year (Multiple if-else)");
            }

            // Part 2: Using single if statement with multiple logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year (Single if)");
            } else {
                System.out.println(year + " is not a Leap Year (Single if)");
            }

        } else {
            System.out.println("Year must be >= 1582 for Gregorian calendar");
        }
    }
}

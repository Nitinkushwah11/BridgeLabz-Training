import java.util.Scanner;

public class UnitConvertorUtility {

    // Convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter yards: ");
        double yards = sc.nextDouble();
        System.out.println("Yards to Feet = " + convertYardsToFeet(yards));

        System.out.print("\nEnter feet: ");
        double feet = sc.nextDouble();
        System.out.println("Feet to Yards = " + convertFeetToYards(feet));

        System.out.print("\nEnter meters: ");
        double meters = sc.nextDouble();
        System.out.println("Meters to Inches = " + convertMetersToInches(meters));

        System.out.print("\nEnter inches: ");
        double inches = sc.nextDouble();
        System.out.println("Inches to Meters = " + convertInchesToMeters(inches));
        System.out.println("Inches to Centimeters = " + convertInchesToCentimeters(inches));

        sc.close();
    }
}

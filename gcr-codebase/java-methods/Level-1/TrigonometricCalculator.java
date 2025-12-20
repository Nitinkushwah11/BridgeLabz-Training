import java.util.Scanner;

public class TrigonometricCalculator {

    // Method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {

        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        // Return results as an array
        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        // Method call
        double[] result = calculateTrigonometricFunctions(angle);

        // Display result
        System.out.println("Sine(" + angle + ") = " + result[0]);
        System.out.println("Cosine(" + angle + ") = " + result[1]);
        System.out.println("Tangent(" + angle + ") = " + result[2]);

        sc.close();
    }
}

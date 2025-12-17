// Creating Class with name TriangleArea indicating the purpose is to calculate
// the area of a triangle. Notice the class name is a Noun.
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create a double variable base and take input in centimeters
        System.out.print("Enter base of the triangle in cm: ");
        double base = sc.nextDouble();

        // Create a double variable height and take input in centimeters
        System.out.print("Enter height of the triangle in cm: ");
        double height = sc.nextDouble();

        // Calculate area of triangle in square centimeters
        double areaSqCm = 0.5 * base * height;

        // Convert centimeters to inches (1 inch = 2.54 cm)
        double baseInInches = base / 2.54;
        double heightInInches = height / 2.54;

        // Calculate area of triangle in square inches
        double areaSqIn = 0.5 * baseInInches * heightInInches;

        // Display the result
        System.out.println("The Area of the triangle in sq in is " 
                + areaSqIn + " and sq cm is " + areaSqCm);

        
    }
}

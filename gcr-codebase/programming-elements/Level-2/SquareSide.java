// Creating Class with name SquareSide indicating the purpose is to find
// the side of a square using its perimeter. Notice the class name is a Noun.
import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create a double variable perimeter and take input
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        // Calculate the side of the square
        double side = perimeter / 4;

        // Display the result
        System.out.println("The length of the side is " + side +
                " whose perimeter is " + perimeter);
    }
}

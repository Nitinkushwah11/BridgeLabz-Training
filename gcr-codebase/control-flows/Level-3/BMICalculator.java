import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a: Take user input for weight and height
        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height in cm: ");
        double heightCm = sc.nextDouble();

        // Convert height from cm to meters
        double heightM = heightCm / 100;

        // Step b: Calculate BMI
        double bmi = weight / (heightM * heightM);

        // Step c: Determine weight status
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display results
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);

        sc.close();
    }
}

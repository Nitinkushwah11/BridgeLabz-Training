import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and populate the 2D array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0]; // kg
            double heightInMeters = data[i][1] / 100; // convert cm to meters
            double bmi = weight / (heightInMeters * heightInMeters);
            data[i][2] = bmi; // store BMI in 3rd column
        }
    }

    // Method to determine BMI status
    public static String[] determineStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] personData = new double[10][3]; // weight, height, BMI

        // Input weight and height for 10 members
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        calculateBMI(personData);

        // Determine BMI status
        String[] bmiStatus = determineStatus(personData);

        // Display results
        System.out.println("\nPerson\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n", 
                              i + 1, personData[i][0], personData[i][1], personData[i][2], bmiStatus[i]);
        }

        sc.close();
    }
}

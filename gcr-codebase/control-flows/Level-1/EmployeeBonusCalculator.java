import java.util.Scanner;

class EmployeeBonusCalculator {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Take salary input from the user
        System.out.print("Enter the salary: ");
        double salary = sc.nextDouble();

        // Take years of service input from the user
        System.out.print("Enter years of service: ");
        int yearsOfService = sc.nextInt();

        // Check eligibility and calculate bonus
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is " + bonus);
        } else {
            System.out.println("The bonus amount is 0");
        }
    }
}

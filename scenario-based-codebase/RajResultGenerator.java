import java.util.Scanner;

public class RajResultGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        double average;
        int[] marks = new int[5];

        System.out.println("---- Raj's Result Generator ----");

        // Input marks using for-loop
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        // Calculate average
        average = total / 5.0;

        // Convert average to grade category
        int gradeKey;

        if (average >= 90)
            gradeKey = 1;
        else if (average >= 75)
            gradeKey = 2;
        else if (average >= 60)
            gradeKey = 3;
        else if (average >= 40)
            gradeKey = 4;
        else
            gradeKey = 5;

        // Assign grade using switch
        switch (gradeKey) {
            case 1:
                System.out.println("Grade: A+");
                break;
            case 2:
                System.out.println("Grade: A");
                break;
            case 3:
                System.out.println("Grade: B");
                break;
            case 4:
                System.out.println("Grade: C");
                break;
            case 5:
                System.out.println("Grade: Fail");
                break;
        }

        System.out.println("Average Marks: " + average);
        sc.close();
    }
}

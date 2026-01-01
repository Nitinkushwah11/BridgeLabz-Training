/*20. Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.*/

import java.util.Scanner;

public class FestivalLuckyDraw {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of visitors today: ");
        int visitors = sc.nextInt();

        for (int i = 1; i <= visitors; i++) {

            System.out.print("\nVisitor " + i + " - Enter your lucky number: ");
            int num = sc.nextInt();

            if (num <= 0) {
                System.out.println("Invalid number! Please enter a positive number.");
                continue;   // skip to next visitor
            }

            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("Congratulations! You win a gift!");
            } else {
                System.out.println("Sorry, better luck next time.");
            }
        }

        System.out.println("\nDiwali Lucky Draw Finished!");
        sc.close();
    }
}

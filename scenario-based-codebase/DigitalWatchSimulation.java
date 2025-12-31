/*16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements */

public class DigitalWatchSimulation {

    public static void main(String[] args) {

        for (int hour = 0; hour < 24; hour++) {

            for (int minute = 0; minute < 60; minute++) {

                // Power cut at 13:00
                if (hour == 13 && minute == 0) {
                    System.out.println("\n Power Cut! Watch stopped at 13:00");
                    return;   // exits both loops
                }

                // Formatting HH:MM
                if (hour < 10)
                    System.out.print("0" + hour + ":");
                else
                    System.out.print(hour + ":");

                if (minute < 10)
                    System.out.println("0" + minute);
                else
                    System.out.println(minute);
            }
        }
    }
}


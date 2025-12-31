/*School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.*/


import java.util.Scanner;

public class SchoolBusAttendanceSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of 10 students
        String[] students = {
            "Amit", "Nitin", "Rahul", "Priya", "Rohit",
            "Neha", "Karan", "Pooja", "Anjali", "Vikas"
        };

        int presentCount = 0;
        int absentCount = 0;

        System.out.println("------ School Bus Attendance System 🚍 ------");

        // for-each loop
        for (String name : students) {

            System.out.print("Is " + name + " Present or Absent? (P/A): ");
            char status = sc.next().charAt(0);

            if (status == 'P' || status == 'p') {
                presentCount++;
            } else {
                absentCount++;
            }
        }

        // Result
        System.out.println("\n-------- Attendance Report --------");
        System.out.println("Total Present Students : " + presentCount);
        System.out.println("Total Absent Students  : " + absentCount);
    }
}

public class SpringSeason {

    // Method to check valid date
    static boolean isValidDate(int month, int day) {
        if (month < 1 || month > 12 || day < 1) {
            return false;
        }

        switch (month) {
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                return day <= 31;

            case 4: case 6: case 9: case 11:
                return day <= 30;

            case 2:
                return day <= 28; // ignoring leap year

            default:
                return false;
        }
    }

    // Method to check Spring Season
    static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) ||
               (month == 4) ||
               (month == 5) ||
               (month == 6 && day <= 20);
    }

    public static void main(String[] args) {

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        if (!isValidDate(month, day)) {
            System.out.println("Invalid Date");
        } else if (isSpringSeason(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}

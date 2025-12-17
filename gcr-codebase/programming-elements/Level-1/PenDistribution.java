public class PenDistribution {
    public static void main(String[] args) {

        int totalPens = 14;
        int students = 3;

        // Division operator
        int pensPerStudent = totalPens / students;

        // Modulus operator   
        int remainingPens = totalPens % students;    

        System.out.println("The Pen Per Student is " + pensPerStudent +
                           " and the remaining pen not distributed is " + remainingPens);
    }
}

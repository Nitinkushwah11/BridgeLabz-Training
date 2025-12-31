/*17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.*/
import java.util.Scanner;

public class OnlineQuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. Which keyword is used to create an object in Java?",
            "2. Which method is used to start a thread?",
            "3. Which loop is best when number of iterations is known?",
            "4. Which operator is used for logical AND?",
            "5. Which data type is used to store decimal values?"
        };

        String[][] options = {
            {"a) new", "b) create", "c) object", "d) class"},
            {"a) run()", "b) start()", "c) execute()", "d) begin()"},
            {"a) while", "b) do-while", "c) for", "d) switch"},
            {"a) &", "b) |", "c) &&", "d) ||"},
            {"a) int", "b) float", "c) char", "d) boolean"}
        };

        char[] correctAnswers = {'a', 'b', 'c', 'c', 'b'};
        int score = 0;

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer: ");
            char userAnswer = sc.next().toLowerCase().charAt(0);

            switch (userAnswer) {

                case 'a':
                case 'b':
                case 'c':
                case 'd':
                    if (userAnswer == correctAnswers[i]) {
                        System.out.println("Correct!");
                        score++;
                    } else {
                        System.out.println("Wrong!");
                    }
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        }

        System.out.println("\n----------------------------------");
        System.out.println("Quiz Finished!");
        System.out.println("Your Score: " + score + " / " + questions.length);
        System.out.println("----------------------------------");

        sc.close();
    }
}

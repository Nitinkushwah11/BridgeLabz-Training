package com.edumentor;

public class EduMentorApp {

    public static void main(String[] args) {

        Learner l1 = new Learner("Nitin", "nitin@gmail.com", 101, "FullTime");

        String[] q = {"Java is OOP language? (yes/no)", "2+2 = ?"};
        String[] a = {"yes", "4"};

        Quiz quiz = new Quiz("Medium", q, a);

        String[] userAns = {"yes", "4"};
        quiz.evaluate(userAns);

        System.out.println("Score Percentage: " + quiz.getPercentage() + "%");

        l1.generateCertificate();  // Polymorphism
    }
}

package com.edumentor;

public class Quiz {

    private String[] questions;          // private internal bank
    private final String[] answers;      // can't modify once set
    private int score;
    private String difficulty;

    // Constructor Overloading (Variable Difficulty)
    public Quiz(String difficulty, String[] questions, String[] answers) {
        this.difficulty = difficulty;
        this.questions = questions;
        this.answers = answers;
    }

    public String[] getQuestions() {
        return questions;
    }

    public String[] getAnswers() {
        return answers;     // Only read access
    }

    // Operator usage for scoring
    public void evaluate(String[] userAnswers) {
        score = 0;
        for(int i = 0; i < answers.length; i++) {
            if(userAnswers[i].equalsIgnoreCase(answers[i])) {
                score++;   // operator ++
            }
        }
    }

    public double getPercentage() {
        return (score * 100.0) / answers.length;
    }
}

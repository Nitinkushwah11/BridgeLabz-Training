package com.universitycourseenrollmentsystem;

abstract class Student {

    private int studentId;
    private String name;
    private double totalPoints = 0;
    private int totalSubjects = 0;

    public Student(int id, String name) {
        this.studentId = id;
        this.name = name;
    }

    // Encapsulation – GPA hidden
    protected void addGrade(double gp) {
        totalPoints += gp;
        totalSubjects++;
    }

    public double getGPA() {
        if (totalSubjects == 0) return 0;
        return totalPoints / totalSubjects;
    }

    public void showTranscript() {
        System.out.println("Student: " + name);
        System.out.println("GPA: " + getGPA());
    }
}

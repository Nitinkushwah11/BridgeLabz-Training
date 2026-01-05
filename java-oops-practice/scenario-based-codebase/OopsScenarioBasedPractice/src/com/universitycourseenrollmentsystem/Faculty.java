package com.universitycourseenrollmentsystem;

class Faculty implements Graded {

    private Student student;

    public Faculty(Student student) {
        this.student = student;
    }

    @Override
    public void assignGrade(double gradePoint) {
        student.addGrade(gradePoint);
    }
}

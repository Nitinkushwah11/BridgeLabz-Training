package com.campusconnect;

import java.util.ArrayList;

class Student extends Person implements ICourseActions {

    private ArrayList<Double> grades ;
    private ArrayList<Course> courses;

    public Student(int id, String name, String email) {
        super(id, name, email);
        grades  = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addGrade(double g) {
        grades.add(g);
    }

    public double calculateGPA() {
        double sum = 0;
        for (double g : grades)
            sum += g;

        return grades.size() == 0 ? 0 : sum / grades.size();   // Operator usage
    }

    @Override
    public void enrollCourse(Course c) {
        courses.add(c);
        c.addStudent(this);
    }

    @Override
    public void dropCourse(Course c) {
        courses.remove(c);
        c.removeStudent(this);
    }

    @Override
    public void printDetails() {
        System.out.println("Student: " + name + " | GPA: " + calculateGPA());
    }
}

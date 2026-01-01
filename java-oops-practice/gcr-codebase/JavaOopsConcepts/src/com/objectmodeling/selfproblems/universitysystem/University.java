package com.objectmodeling.selfproblems.universitysystem;


import java.util.ArrayList;

public class University {

    private String name;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Professor> professors = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    // Aggregation
    public void addStudent(Student s) {
        students.add(s);
    }

    public void addProfessor(Professor p) {
        professors.add(p);
    }

    public void addCourse(Course c) {
        courses.add(c);
    }
}


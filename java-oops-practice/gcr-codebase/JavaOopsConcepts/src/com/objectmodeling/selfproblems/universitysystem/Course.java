package com.objectmodeling.selfproblems.universitysystem;


import java.util.ArrayList;

public class Course {

    private String courseName;
    private Professor professor;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void setProfessor(Professor p) {
        this.professor = p;
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + professor.getName());

        System.out.println("Students:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

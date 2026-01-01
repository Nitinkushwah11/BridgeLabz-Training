package com.objectmodeling.selfproblems.universitysystem;


import java.util.ArrayList;

public class Professor {

    private String name;
    private ArrayList<Course> courses = new ArrayList<>();

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Communication
    public void assignCourse(Course c) {
        courses.add(c);
        c.setProfessor(this);
        System.out.println("Professor " + name + " is assigned to " + c.getCourseName());
    }
}

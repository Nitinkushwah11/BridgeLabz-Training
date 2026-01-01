package com.objectmodeling.selfproblems.associationandaggregation;


import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Association method
    public void enrollCourse(Course c) {
        courses.add(c);
        c.addStudent(this);   // link both sides
    }

    public void showMyCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

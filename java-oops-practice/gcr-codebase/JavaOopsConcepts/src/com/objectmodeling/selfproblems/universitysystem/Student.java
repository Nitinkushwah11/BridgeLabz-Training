package com.objectmodeling.selfproblems.universitysystem;


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

    // Communication + Association
    public void enrollCourse(Course c) {
        courses.add(c);
        c.addStudent(this);
        System.out.println(name + " enrolled in " + c.getCourseName());
    }

    public void showMyCourses() {
        System.out.println(name + "'s Courses:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

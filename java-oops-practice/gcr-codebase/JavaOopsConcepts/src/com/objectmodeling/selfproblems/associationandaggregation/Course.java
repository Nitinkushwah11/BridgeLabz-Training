package com.objectmodeling.selfproblems.associationandaggregation;



import java.util.ArrayList;

public class Course {
    private String courseName;
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

    public void showStudents() {
        System.out.println("Students in " + courseName + ":");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

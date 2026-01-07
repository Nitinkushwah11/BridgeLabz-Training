package com.campusconnect;

import java.util.ArrayList;

class Course {

    private String courseName;
    private Faculty faculty;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void removeStudent(Student s) {
        students.remove(s);
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Faculty: " + faculty.name);
        System.out.println("Enrolled Students: " + students.size());
    }
}

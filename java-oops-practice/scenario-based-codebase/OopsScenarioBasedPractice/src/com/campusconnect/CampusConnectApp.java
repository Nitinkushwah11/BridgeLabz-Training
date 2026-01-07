package com.campusconnect;

public class CampusConnectApp {

    public static void main(String[] args) {

        Faculty f1 = new Faculty(1, "Dr. Sharma", "sharma@college.edu");

        Student s1 = new Student(101, "Nitin", "nitin@college.edu");
        Student s2 = new Student(102, "Rohit", "rohit@college.edu");

        Course c1 = new Course("Java Programming", f1);

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);

        s1.addGrade(8.5);
        s1.addGrade(9.0);

        s2.addGrade(7.5);
        s2.addGrade(8.0);

        s1.printDetails();
        s2.printDetails();
        f1.printDetails();

        c1.showCourseDetails();
    }
}

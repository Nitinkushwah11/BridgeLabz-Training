package com.objectmodeling.selfproblems.universitysystem;

public class MainApp {
    public static void main(String[] args) {

        University uni = new University("Tech University");

        Student s1 = new Student("Nitin");
        Student s2 = new Student("Aman");

        Professor p1 = new Professor("Dr. Sharma");

        Course c1 = new Course("Java Programming");
        Course c2 = new Course("Data Structures");

        uni.addStudent(s1);
        uni.addStudent(s2);
        uni.addProfessor(p1);
        uni.addCourse(c1);
        uni.addCourse(c2);

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s1.enrollCourse(c2);

        p1.assignCourse(c1);

        System.out.println();
        c1.showCourseDetails();
    }
}

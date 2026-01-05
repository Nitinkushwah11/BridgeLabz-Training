package com.universitycourseenrollmentsystem;

public class UniversityAppMain {

    public static void main(String[] args) {

        Student s1 = new Undergraduate(101, "Nitin");
        Student s2 = new Postgraduate(102, "Rohit");

        Course c1 = new Course("CS101", "Java Programming");

        Faculty f1 = new Faculty(s1);
        Faculty f2 = new Faculty(s2);

        f1.assignGrade(8.5);
        f1.assignGrade(9.0);

        f2.assignGrade(9.2);
        f2.assignGrade(9.8);

        s1.showTranscript();
        s2.showTranscript();
    }
}

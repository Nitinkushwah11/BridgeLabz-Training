package com.inheritance.multilevelinheritance.educationalcourse;

public class MainCourseApp {
    public static void main(String[] args) {

        PaidOnlineCourse course = new PaidOnlineCourse(
                "Java Full Stack",
                120,
                "Udemy",
                true,
                5000,
                20
        );

        System.out.println("----- COURSE DETAILS -----\n");
        course.display();
    }
}

wwwwww
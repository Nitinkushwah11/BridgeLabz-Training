package com.constructors.level1;
/*
 * Program Name : Course
 * Description  : Online Course Management using static members.
 */
class Course {

    String courseName;
    int duration;
    double fee;
    static String instituteName = "CodInClub";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println(courseName + " | " + duration + " months | ₹" + fee + " | " + instituteName);
    }

    static void updateInstituteName(String name) {
        instituteName = name;
    }

    // ✅ main method
    public static void main(String[] args) {

        Course c1 = new Course("Java Full Stack", 6, 25000);
        Course c2 = new Course("Python Data Science", 5, 22000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // update static variable
        Course.updateInstituteName("CodeMaster Academy");

        System.out.println("\nAfter Updating Institute Name:\n");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}


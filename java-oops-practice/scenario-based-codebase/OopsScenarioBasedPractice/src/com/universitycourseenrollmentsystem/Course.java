package com.universitycourseenrollmentsystem;

class Course {
    private String courseId;
    private String courseName;

    public Course(String id, String name) {
        this.courseId = id;
        this.courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }
}

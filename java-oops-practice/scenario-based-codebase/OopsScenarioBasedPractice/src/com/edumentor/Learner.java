package com.edumentor;

public class Learner extends User implements ICertifiable {

    private String courseType;   // Short / FullTime

    public Learner(String name, String email, int userId, String courseType) {
        super(name, email, userId);
        this.courseType = courseType;
    }

    @Override
    public void generateCertificate() {
        if(courseType.equalsIgnoreCase("Short")) {
            System.out.println("Short Course Certificate issued to: " + name);
        } else {
            System.out.println("Full-Time Professional Certificate issued to: " + name);
        }
    }
}

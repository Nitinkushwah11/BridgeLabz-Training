package com.inheritance.multilevelinheritance.educationalcourse;

public class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;   // in %

    public PaidOnlineCourse(String courseName, int duration,
                            String platform, boolean isRecorded,
                            double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public String getCourseType() {
        return "Paid Online Course";
    }

    public double getFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Fee         : ₹" + fee);
        System.out.println("Discount    : " + discount + "%");
        System.out.println("Final Fee   : ₹" + getFinalFee());
    }
}


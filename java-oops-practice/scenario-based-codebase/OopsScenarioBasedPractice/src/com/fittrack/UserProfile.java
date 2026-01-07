package com.fittrack;

public class UserProfile {

    public String name;
    public int age;
    private double weight;   // health data protected
    public String goal;

    // Default goal constructor
    public UserProfile(String name, int age, double weight) {
        this(name, age, weight, "Stay Fit");
    }

    // Custom goal constructor
    public UserProfile(String name, int age, double weight, String goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight > 0)
            this.weight = weight;
    }
}

package com.inheritance.hybridinheritance.vehiclemanagementsystem;

class Vehicle 
{
    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed)
    {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayDetails()
    {
        System.out.println("Model : " + model);
        System.out.println("Max Speed : " + maxSpeed + " km/h");
    }
}

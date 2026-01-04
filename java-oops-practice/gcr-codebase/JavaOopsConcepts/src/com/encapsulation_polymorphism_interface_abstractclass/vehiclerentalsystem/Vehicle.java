package com.encapsulation_polymorphism_interface_abstractclass.vehiclerentalsystem;

abstract class Vehicle {

    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber;   // Encapsulated sensitive data

    public Vehicle(String vehicleNumber, String type, double rentalRate, String policyNo) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = policyNo;
    }

    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println("Vehicle No : " + vehicleNumber);
        System.out.println("Type       : " + type);
        System.out.println("Rate/Day   : ₹" + rentalRate);
    }

    // Encapsulation (no direct policy access)
    protected double getRentalRate() { return rentalRate; }

    public void updatePolicyNumber(String policyNo) {
        this.insurancePolicyNumber = policyNo;
    }
}

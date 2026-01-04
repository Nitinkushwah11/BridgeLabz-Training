package com.encapsulation_polymorphism_interface_abstractclass.ridehailingapplication;

abstract class Vehicle implements GPS {

    private int vehicleId;
    private String driverName;
    private double ratePerKm;
    private String location;

    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.location = "Unknown";
    }

    // Encapsulation - Getters & Setters
    public int getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    protected double getRatePerKm() {
        return ratePerKm;
    }

    // Concrete Method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: ₹" + ratePerKm);
        System.out.println("Current Location: " + location);
    }

    // GPS Methods
    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }

    // Abstract Method
    public abstract double calculateFare(double distance);
}

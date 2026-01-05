package com.vehiclerentalapplication;

class Vehicle implements Rentable {

    protected String vehicleNumber;
    protected String brand;
    protected double baseRate;

    public Vehicle(String vehicleNumber, String brand, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getBrand() {
        return brand;
    }

    public double getBaseRate() {
        return baseRate;
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days;
    }

    public void displayDetails() {
        System.out.println("Vehicle No: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Base Rate per Day: ₹" + baseRate);
    }
}

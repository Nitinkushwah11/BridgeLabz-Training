package com.vehiclerentalapplication;

class Bike extends Vehicle {

    public Bike(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days;   // No extra charge
    }
}

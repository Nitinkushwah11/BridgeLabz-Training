package com.vehiclerentalapplication;

class Car extends Vehicle {

    public Car(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + 500;   // Service charge
    }
}


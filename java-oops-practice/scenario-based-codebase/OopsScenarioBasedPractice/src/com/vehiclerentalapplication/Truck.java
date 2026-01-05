package com.vehiclerentalapplication;

class Truck extends Vehicle {

    public Truck(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + 1000;   // Heavy load charge
    }
}

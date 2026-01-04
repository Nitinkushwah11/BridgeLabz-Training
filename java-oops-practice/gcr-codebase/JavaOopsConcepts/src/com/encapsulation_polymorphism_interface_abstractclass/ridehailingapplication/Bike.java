package com.encapsulation_polymorphism_interface_abstractclass.ridehailingapplication;

class Bike extends Vehicle {

    public Bike(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();   // No extra charge
    }
}

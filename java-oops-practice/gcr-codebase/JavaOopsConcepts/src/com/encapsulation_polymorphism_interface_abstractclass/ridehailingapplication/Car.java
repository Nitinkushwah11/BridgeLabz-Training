package com.encapsulation_polymorphism_interface_abstractclass.ridehailingapplication;

class Car extends Vehicle {

    public Car(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 50;   // Base charge
    }
}

package com.encapsulation_polymorphism_interface_abstractclass.ridehailingapplication;

class Auto extends Vehicle {

    public Auto(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20;   // Small service charge
    }
}

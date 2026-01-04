package com.encapsulation_polymorphism_interface_abstractclass.vehiclerentalsystem;

class Bike extends Vehicle implements Insurable {

    public Bike(String number, double rate, String policy) {
        super(number, "Bike", rate, policy);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance(int days) {
        return 50 * days;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance: ₹50 per day";
    }
}

package com.encapsulation_polymorphism_interface_abstractclass.vehiclerentalsystem;

class Car extends Vehicle implements Insurable {

    public Car(String number, double rate, String policy) {
        super(number, "Car", rate, policy);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance(int days) {
        return 150 * days;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: ₹150 per day";
    }
}

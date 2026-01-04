package com.encapsulation_polymorphism_interface_abstractclass.vehiclerentalsystem;

class Truck extends Vehicle implements Insurable {

    public Truck(String number, double rate, String policy) {
        super(number, "Truck", rate, policy);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2; // 20% heavy vehicle charge
    }

    @Override
    public double calculateInsurance(int days) {
        return 300 * days;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: ₹300 per day";
    }
}

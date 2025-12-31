package com.constructors.level1;
/*
 * Program Name : Vehicle
 * Description  : Vehicle Registration with static fee.
 */
class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 2500;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println(ownerName + " | " + vehicleType + " | Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}

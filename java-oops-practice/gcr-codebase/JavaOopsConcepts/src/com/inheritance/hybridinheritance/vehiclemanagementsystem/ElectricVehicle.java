package com.inheritance.hybridinheritance.vehiclemanagementsystem;

class ElectricVehicle extends Vehicle
{
    int batteryCapacity;

    ElectricVehicle(String model, int maxSpeed, int batteryCapacity)
    {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    void charge()
    {
        System.out.println("Electric Vehicle is charging...");
    }

    void displayEV()
    {
        displayDetails();
        System.out.println("Battery Capacity : " + batteryCapacity + " kWh");
    }
}

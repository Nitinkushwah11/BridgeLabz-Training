package com.inheritance.hybridinheritance.vehiclemanagementsystem;

class PetrolVehicle extends Vehicle implements Refuelable
{
    int fuelCapacity;

    PetrolVehicle(String model, int maxSpeed, int fuelCapacity)
    {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    public void refuel()
    {
        System.out.println("Petrol Vehicle is refueling...");
    }

    void displayPV()
    {
        displayDetails();
        System.out.println("Fuel Capacity : " + fuelCapacity + " liters");
    }
}

package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class Main
{
    public static void main(String[] args)
    {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200, 75);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180, 45);

        System.out.println("---- Electric Vehicle Details ----");
        ev.displayEV();
        ev.charge();

        System.out.println("\n---- Petrol Vehicle Details ----");
        pv.displayPV();
        pv.refuel();
    }
}


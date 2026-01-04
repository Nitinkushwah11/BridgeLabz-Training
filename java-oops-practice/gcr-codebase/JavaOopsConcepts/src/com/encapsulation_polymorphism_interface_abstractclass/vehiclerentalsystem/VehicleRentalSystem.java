package com.encapsulation_polymorphism_interface_abstractclass.vehiclerentalsystem;

import java.util.*;

public class VehicleRentalSystem {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("MP09-2345", 1000, "CAR123"));
        vehicles.add(new Bike("MP09-8765", 300, "BIKE456"));
        vehicles.add(new Truck("MP09-1122", 2500, "TRUCK789"));

        int days = 3;

        for(Vehicle v : vehicles) {

            v.displayDetails();
            double rent = v.calculateRentalCost(days);

            if(v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println(ins.getInsuranceDetails());
                System.out.println("Insurance Cost: ₹" + ins.calculateInsurance(days));
            }

            System.out.println("Rental Cost  : ₹" + rent);
            System.out.println("------------------------------");
        }
    }
}

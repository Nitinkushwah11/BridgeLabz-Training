package com.encapsulation_polymorphism_interface_abstractclass.ridehailingapplication;

public class RideHailingAppMain {

    public static void main(String[] args) {

        Vehicle v1 = new Car(1, "Ramesh", 15);
        Vehicle v2 = new Bike(2, "Amit", 8);
        Vehicle v3 = new Auto(3, "Suresh", 10);

        v1.updateLocation("MG Road");
        v2.updateLocation("Bus Stand");
        v3.updateLocation("Railway Station");

        calculateRideFare(v1, 10);
        calculateRideFare(v2, 10);
        calculateRideFare(v3, 10);
    }

    // Polymorphic Method
    public static void calculateRideFare(Vehicle v, double distance) {
        v.getVehicleDetails();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: ₹" + v.calculateFare(distance));
        System.out.println("----------------------------------");
    }
}

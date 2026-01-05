package com.vehiclerentalapplication;

public class VehicleRentalAppMain {

    public static void main(String[] args) {

        Customer c1 = new Customer("Nitin", "9876543210");

        Vehicle v1 = new Bike("MP09B1234", "Honda", 300);
        Vehicle v2 = new Car("MP04C5678", "Hyundai", 800);
        Vehicle v3 = new Truck("MP20T9999", "Tata", 1500);

        calculateBill(v1, 3);
        calculateBill(v2 , 3);
        calculateBill(v3, 3);
    }

    public static void calculateBill(Vehicle v, int days) {
        v.displayDetails();
        System.out.println("Total Rent for " + days + " days: ₹" + v.calculateRent(days));
        System.out.println("----------------------------------");
    }
}

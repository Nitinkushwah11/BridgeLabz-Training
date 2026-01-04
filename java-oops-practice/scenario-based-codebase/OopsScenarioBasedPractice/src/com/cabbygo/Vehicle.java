package com.cabbygo;

abstract class Vehicle implements IRideService {

    private String vehicleNumber;
    private int capacity;
    private String type;
    private double ratePerKm;
    private double baseFare = 50;

    protected double fare;   // hidden from user

    protected Driver driver;

    public Vehicle(String vehicleNumber, int capacity, String type, double ratePerKm, Driver driver) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
        this.ratePerKm = ratePerKm;
        this.driver = driver;
    }

    public void showDetails() {
        System.out.println(type + " - " + vehicleNumber +
                " | Driver: " + driver.getName() +
                " | Rating: " + driver.getRating());
    }

    protected double calculateFare(double distance) {
        return baseFare + distance * ratePerKm;   // Operator usage
    }

    @Override
    public void bookRide(double distance) {
        fare = calculateFare(distance);
        System.out.println(type + " ride booked for " + distance + " km");
        System.out.println("Fare: ₹" + fare);
    }

    @Override
    public void endRide() {
        System.out.println(type + " ride ended. Total Fare: ₹" + fare);
    }
}

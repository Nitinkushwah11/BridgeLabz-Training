package com.cabbygo;

public class CabbyGoApp {

    public static void main(String[] args) {

        Driver d1 = new Driver("Rohit", "DL12345", 4.7);
        Driver d2 = new Driver("Amit", "MP98765", 4.9);

        Vehicle v1 = new Mini("MP09AB1234", d1);
        Vehicle v2 = new SUV("DL01XY4567", d2);

        startRide(v1, 10);
        System.out.println();
        startRide(v2, 10);
    }

    public static void startRide(Vehicle v, double distance) {
        v.showDetails();
        v.bookRide(distance);
        v.endRide();
        System.out.println("-----------------------------");
    }
}

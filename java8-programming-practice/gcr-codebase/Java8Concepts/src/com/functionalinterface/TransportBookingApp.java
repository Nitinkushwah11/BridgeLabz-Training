package com.functionalinterface;

// Interface (renamed)
interface TransportService {
    void book(String customerName);
    void release();
}

// Sedan implementation (renamed from Car)
class Sedan implements TransportService {
    private String modelName;
    private boolean booked;

    public Sedan(String modelName) {
        this.modelName = modelName;
        this.booked = false;
    }

    @Override
    public void book(String customerName) {
        if (!booked) {
            booked = true;
            System.out.println("Sedan " + modelName + " booked for " + customerName);
        } else {
            System.out.println("Sedan " + modelName + " is already booked");
        }
    }

    @Override
    public void release() {
        if (booked) {
            booked = false;
            System.out.println("Sedan " + modelName + " released successfully");
        } else {
            System.out.println("Sedan " + modelName + " was not booked");
        }
    }
}

// TwoWheeler implementation (renamed from Bike)
class TwoWheeler implements TransportService {
    private String brand;
    private boolean booked;

    public TwoWheeler(String brand) {
        this.brand = brand;
        this.booked = false;
    }

    @Override
    public void book(String customerName) {
        if (!booked) {
            booked = true;
            System.out.println("Two-wheeler " + brand + " booked for " + customerName);
        } else {
            System.out.println("Two-wheeler " + brand + " is already booked");
        }
    }

    @Override
    public void release() {
        if (booked) {
            booked = false;
            System.out.println("Two-wheeler " + brand + " released successfully");
        } else {
            System.out.println("Two-wheeler " + brand + " was not booked");
        }
    }
}

// Coach implementation (renamed from Bus)
class Coach implements TransportService {
    private int seatCount;
    private boolean booked;

    public Coach(int seatCount) {
        this.seatCount = seatCount;
        this.booked = false;
    }

    @Override
    public void book(String customerName) {
        if (!booked) {
            booked = true;
            System.out.println("Coach (Seats: " + seatCount + ") booked for " + customerName);
        } else {
            System.out.println("Coach is already booked");
        }
    }

    @Override
    public void release() {
        if (booked) {
            booked = false;
            System.out.println("Coach released successfully");
        } else {
            System.out.println("Coach was not booked");
        }
    }
}

// Main class (renamed)
public class TransportBookingApp {
    public static void main(String[] args) {

        TransportService sedan = new Sedan("Honda City");
        TransportService bike = new TwoWheeler("Royal Enfield");
        TransportService coach = new Coach(50);

        // Booking
        sedan.book("John");
        bike.book("Alice");
        coach.book("Tour Company");

        System.out.println();

        // Releasing
        sedan.release();
        bike.release();
        coach.release();
    }
}

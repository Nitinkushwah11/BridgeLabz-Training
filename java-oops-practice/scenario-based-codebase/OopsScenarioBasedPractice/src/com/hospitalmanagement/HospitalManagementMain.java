package com.hospitalmanagement;

public class HospitalManagementMain {

    public static void main(String[] args) {

        Patient p = new InPatient(101, "Amit", "Fever", 3);
        Patient p2 = new OutPatient(102, "Neha", "Cold");

        Doctor d1 = new Doctor(201, "Dr. Sharma", "Cardiology");

        Bill b1 = new Bill(500, 1200);

        p.displayInfo();
        p2.displayInfo();
        d1.displayInfo();

        System.out.println("Total Bill: ₹" + b1.calculatePayment());
    }
}

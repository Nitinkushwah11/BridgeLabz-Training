package com.encapsulation_polymorphism_interface_abstractclass.hospitalpatientmanagement;

public class HospitalAppMain {

    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Rahul", 30, "Fracture", 5, 2000);
        Patient p2 = new OutPatient(102, "Anjali", 25, "Fever", 500);

        p1.addRecord("X-Ray taken");
        p2.addRecord("Blood test done");

        displayPatientBill(p1);
        displayPatientBill(p2);
    }

    // Polymorphic Method
    public static void displayPatientBill(Patient p) {
        p.getPatientDetails();
        p.viewRecords();
        System.out.println("Total Bill: ₹" + p.calculateBill());
        System.out.println("-----------------------------");
    }
}

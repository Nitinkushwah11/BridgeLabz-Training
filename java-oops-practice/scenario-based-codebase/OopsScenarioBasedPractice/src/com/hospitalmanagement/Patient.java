package com.hospitalmanagement;

class Patient {

    protected int patientId;
    protected String name;
    private String medicalHistory;   // Sensitive data

    // Normal admission
    public Patient(int id, String name, String history) {
        this.patientId = id;
        this.name = name;
        this.medicalHistory = history;
    }

    // Emergency admission
    public Patient(int id, String name) {
        this.patientId = id;
        this.name = name;
        this.medicalHistory = "Emergency Case";
    }

    public String getSummary() {
        return "Patient ID: " + patientId + ", Name: " + name;
    }

    public void displayInfo() {
        System.out.println(getSummary());
    }
}

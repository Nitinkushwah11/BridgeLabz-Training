package com.encapsulation_polymorphism_interface_abstractclass.hospitalpatientmanagement;

abstract class Patient implements MedicalRecord {

    private int patientId;
    private String name;
    private int age;
    private String diagnosis;
    private String medicalHistory = "";

    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    // Encapsulation – Getters & Setters
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    // Concrete Method
    public void getPatientDetails() {
        System.out.println("ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Diagnosis: " + diagnosis);
    }

    // MedicalRecord Interface Methods
    public void addRecord(String record) {
        medicalHistory += record + "\n";
    }

    public void viewRecords() {
        System.out.println("Medical History:\n" + medicalHistory);
    }

    // Abstract Method
    public abstract double calculateBill();
}

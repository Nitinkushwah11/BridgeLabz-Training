package com.objectmodeling.selfproblems.hospital;

import java.util.ArrayList;

public class Doctor {

    private String name;
    private ArrayList<Patient> patients = new ArrayList<>();

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Association + Communication
    public void consult(Patient p) {
        patients.add(p);
        p.addDoctor(this);   // link both sides

        System.out.println("Doctor " + name + " is consulting Patient " + p.getName());
    }

    public void showMyPatients() {
        System.out.println("Patients treated by Dr. " + name + ":");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}

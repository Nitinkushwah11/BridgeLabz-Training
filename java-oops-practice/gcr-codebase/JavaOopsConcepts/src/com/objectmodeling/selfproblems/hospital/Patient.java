package com.objectmodeling.selfproblems.hospital;

import java.util.ArrayList;

public class Patient {

    private String name;
    private ArrayList<Doctor> doctors = new ArrayList<>();

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public void showMyDoctors() {
        System.out.println(name + " consulted with:");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.getName());
        }
    }
}

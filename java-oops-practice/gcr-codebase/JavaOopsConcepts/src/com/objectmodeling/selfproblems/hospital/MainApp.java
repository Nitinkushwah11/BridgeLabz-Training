package com.objectmodeling.selfproblems.hospital;


public class MainApp {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Care Hospital");

        Doctor d1 = new Doctor("Sharma");
        Doctor d2 = new Doctor("Verma");

        Patient p1 = new Patient("Nitin");
        Patient p2 = new Patient("Aman");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatient(p1);
        hospital.addPatient(p2);

        // Communication
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        System.out.println();
        d1.showMyPatients();
        System.out.println();
        p1.showMyDoctors();
    }
}

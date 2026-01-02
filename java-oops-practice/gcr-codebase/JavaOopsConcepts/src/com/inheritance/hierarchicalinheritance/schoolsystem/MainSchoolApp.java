package com.inheritance.hierarchicalinheritance.schoolsystem;

public class MainSchoolApp {
    public static void main(String[] args) {

        Teacher t = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student s = new Student("Anita", 15, "10th");
        Staff st = new Staff("Ramesh", 35, "Administration");

        System.out.println("----- TEACHER DETAILS -----");
        t.displayRole();
        t.showDetails();

        System.out.println("\n----- STUDENT DETAILS -----");
        s.displayRole();
        s.showDetails();

        System.out.println("\n----- STAFF DETAILS -----");
        st.displayRole();
        st.showDetails();
    }
}

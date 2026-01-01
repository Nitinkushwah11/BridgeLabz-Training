package com.objectmodeling.selfproblems.university;

public class MainApp {
    public static void main(String[] args) {

        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Mehta");

        University uni = new University("ABC University");

        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showDetails();

        System.out.println("\nDeleting University...\n");
        uni.deleteUniversity();

        System.out.println("\nFaculty still exists:");
        System.out.println(f1.getName());
        System.out.println(f2.getName());
    }
}
package com.objectmodeling.selfproblems.university;
import java.util.ArrayList;
public class University {

    private String uniName;
    private ArrayList<Department> departments = new ArrayList<>();
    private ArrayList<Faculty> faculties = new ArrayList<>();

    public University(String uniName) {
        this.uniName = uniName;
    }

    // Composition
    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // Aggregation
    public void addFaculty(Faculty f) {
        faculties.add(f);
    }

    public void showDetails() {
        System.out.println("University: " + uniName);

        System.out.println("Departments:");
        for (Department d : departments) {
            System.out.println("- " + d.getDeptName());
        }

        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            System.out.println("- " + f.getName());
        }
    }

    public void deleteUniversity() {
        departments.clear();   // Composition: departments destroyed
        System.out.println("University " + uniName + " is deleted");
    }
}
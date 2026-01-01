package com.objectmodeling.companyanddepartments;

import java.util.ArrayList;

public class Company {

    String companyName;
    ArrayList<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showCompanyDetails() {
        System.out.println("\nCompany: " + companyName);
        for (Department d : departments) {
            d.showEmployees();
        }
    }

    void deleteCompany() {
        departments.clear();   // All departments & employees destroyed
        System.out.println("\nCompany closed. All departments and employees removed.");
    }
}

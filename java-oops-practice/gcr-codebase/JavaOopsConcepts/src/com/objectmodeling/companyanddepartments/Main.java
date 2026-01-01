package com.objectmodeling.companyanddepartments;

public class Main {

    public static void main(String[] args) {

        Company comp = new Company("TechSoft Pvt Ltd");

        Department dev = new Department("Development");
        dev.addEmployee("Nitin");
        dev.addEmployee("Aman");

        Department hr = new Department("HR");
        hr.addEmployee("Riya");

        comp.addDepartment(dev);
        comp.addDepartment(hr);

        comp.showCompanyDetails();

        // Deleting company
        comp.deleteCompany();
        comp.showCompanyDetails();
    }
}


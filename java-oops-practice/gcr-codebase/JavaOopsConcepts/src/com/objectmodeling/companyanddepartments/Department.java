package com.objectmodeling.companyanddepartments;

import java.util.ArrayList;

public class Department {

    String deptName;
    ArrayList<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        employees = new ArrayList<>();
    }

    void addEmployee(String name) {
        employees.add(new Employee(name));   // Created inside Department
    }

    void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.showEmployee();
        }
    }
}

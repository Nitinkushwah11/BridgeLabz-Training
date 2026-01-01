package com.objectmodeling.companyanddepartments;

public class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    void showEmployee() {
        System.out.println("Employee: " + name);
    }
}

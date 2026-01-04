package com.encapsulation_polymorphism_interface_abstractclass.employeemanagementsystem;

class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();  // fixed salary
    }
}

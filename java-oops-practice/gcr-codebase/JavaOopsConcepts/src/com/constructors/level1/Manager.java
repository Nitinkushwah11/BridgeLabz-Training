package com.constructors.level1;
/*
 * Program Name : Manager
 * Description  : Subclass demonstrating inheritance.
 */
class Manager extends Employee {
    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    void display() {
        System.out.println(employeeID + " | " + department + " | " + getSalary());
    }
}

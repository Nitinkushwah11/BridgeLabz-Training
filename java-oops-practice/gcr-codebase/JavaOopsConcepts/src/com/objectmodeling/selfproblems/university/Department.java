package com.objectmodeling.selfproblems.university;

public class Department {
    private String deptName;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    protected void finalize() {
        System.out.println("Department " + deptName + " is deleted");
    }
}
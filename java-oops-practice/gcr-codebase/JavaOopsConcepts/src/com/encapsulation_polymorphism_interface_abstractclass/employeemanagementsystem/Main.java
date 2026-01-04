package com.encapsulation_polymorphism_interface_abstractclass.employeemanagementsystem;
import java.util.*;
public class Main 
{
	
	    public static void main(String[] args) 
	    {

	        List<Employee> employees = new ArrayList<>();

	        Employee e1 = new FullTimeEmployee(101, "Amit", 45000);
	        Employee e2 = new PartTimeEmployee(102, "Neha", 500, 40);
	        Employee e3 = new FullTimeEmployee(103, "Rohit", 55000);

	        e1.assignDepartment("HR");
	        e2.assignDepartment("IT Support");
	        e3.assignDepartment("Finance");

	        employees.add(e1);
	        employees.add(e2);
	        employees.add(e3);

	        for(Employee emp : employees) 
	        {
	            emp.displayDetails();  // Polymorphism
	        }
	    }
}
	



package com.constructors.level1;

public class Circle {

	    double radius;

	    // Default Constructor
	    Circle() {
	        this(1.0);   // Calls parameterized constructor
	    }

	    // Parameterized Constructor
	    Circle(double radius) {
	        this.radius = radius;
	    }

	    void display() {
	        System.out.println("Radius: " + radius);
	        System.out.println("Area: " + (Math.PI * radius * radius));
	    }

	    // Main method in same file
	    public static void main(String[] args) {

	        Circle c1 = new Circle();       // Uses default radius 1.0
	        Circle c2 = new Circle(5.5);    // Uses user provided radius

	        c1.display();
	        System.out.println("----------------");
	        c2.display();
	    }
	}




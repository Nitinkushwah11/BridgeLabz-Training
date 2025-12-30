package com.constructors.level1;

class Circle {

    double radius;

    // ✅ Default constructor (calls parameterized constructor)
    Circle() {
        this(1.0);   // constructor chaining
    }

    // ✅ Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + (Math.PI * radius * radius));
        System.out.println("Circumference = " + (2 * Math.PI * radius));
        System.out.println("-------------------------");
    }

    // main method
    public static void main(String[] args) {

        Circle c1 = new Circle();        // default radius = 1.0
        Circle c2 = new Circle(5.5);     // user-provided radius

        c1.display();
        c2.display();
    }
}

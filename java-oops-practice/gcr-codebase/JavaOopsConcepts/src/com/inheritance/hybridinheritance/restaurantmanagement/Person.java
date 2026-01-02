package com.inheritance.hybridinheritance.restaurantmanagement;

public class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void showDetails() {
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
    }
}

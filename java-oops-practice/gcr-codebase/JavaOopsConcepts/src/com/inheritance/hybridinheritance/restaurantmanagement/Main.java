package com.inheritance.hybridinheritance.restaurantmanagement;

public class Main {
    public static void main(String[] args) {

        Chef chef = new Chef("Rahul", 101);
        Waiter waiter = new Waiter("Amit", 201);

        System.out.println("----- CHEF DETAILS -----");
        chef.showDetails();
        chef.performDuties();

        System.out.println("\n----- WAITER DETAILS -----");
        waiter.showDetails();
        waiter.performDuties();
    }
}

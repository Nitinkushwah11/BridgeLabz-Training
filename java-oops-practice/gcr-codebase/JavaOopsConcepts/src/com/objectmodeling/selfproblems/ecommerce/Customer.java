package com.objectmodeling.selfproblems.ecommerce;


import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Order> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    // Communication with Order
    public void placeOrder(Order o) {
        orders.add(o);
        System.out.println(name + " placed Order ID: " + o);
    }

    public String getName() {
        return name;
    }

    public void showMyOrders() {
        System.out.println(name + "'s Orders:");
        for (Order o : orders) {
            o.showOrderDetails();
            System.out.println();
        }
    }
}

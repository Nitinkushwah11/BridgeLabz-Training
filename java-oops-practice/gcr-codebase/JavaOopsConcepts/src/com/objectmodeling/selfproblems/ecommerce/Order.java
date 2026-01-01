package com.objectmodeling.selfproblems.ecommerce;


import java.util.ArrayList;

public class Order {

    private int orderId;
    private ArrayList<Product> products = new ArrayList<>();

    public Order(int orderId) {
        this.orderId = orderId;
    }

    // Aggregation
    public void addProduct(Product p) {
        products.add(p);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        double total = 0;

        for (Product p : products) {
            System.out.println("- " + p.getName() + " : ₹" + p.getPrice());
            total += p.getPrice();
        }

        System.out.println("Total Bill: ₹" + total);
    }
}

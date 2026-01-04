package com.encapsulation_polymorphism_interface_abstractclass.onlinefooddeliverysystem;

import java.util.*;

public class OnlineFoodDelivery {

    public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Pizza", 250, 2));
        order.add(new NonVegItem("Chicken Burger", 180, 3));

        processOrder(order);
    }

    public static void processOrder(List<FoodItem> order) {

        double grandTotal = 0;

        for(FoodItem item : order) {

            item.getItemDetails();
            double total = item.calculateTotalPrice();

            if(item instanceof Discountable) {
                Discountable d = (Discountable) item;
                System.out.println(d.getDiscountDetails());
                total -= d.applyDiscount();
            }

            System.out.println("Total Price: ₹" + total);
            System.out.println("---------------------------");
            grandTotal += total;
        }

        System.out.println("Grand Total Bill: ₹" + grandTotal);
    }
}

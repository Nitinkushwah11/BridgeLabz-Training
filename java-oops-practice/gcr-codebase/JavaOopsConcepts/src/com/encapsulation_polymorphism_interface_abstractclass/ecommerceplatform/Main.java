package com.encapsulation_polymorphism_interface_abstractclass.ecommerceplatform;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Electronics(1, "Laptop", 50000));
        list.add(new Clothing(2, "Jacket", 2000));
        list.add(new Groceries(3, "Rice", 1000));

        for(Product p : list) {
            printFinalPrice(p);
        }
    }

    public static void printFinalPrice(Product p) {

        double tax = 0;

        if(p instanceof Taxable) {
            tax = ((Taxable)p).calculateTax();
            System.out.println(((Taxable)p).getTaxDetails());
        }

        double discount = p.calculateDiscount();
        double finalPrice = p.getPrice() + tax - discount;

        System.out.println("Product Name : " + p.getName());
        System.out.println("Final Price  : ₹" + finalPrice);
        System.out.println("--------------------------------");
    }
}

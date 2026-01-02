package com.inheritance.multilevelinheritance.onlineretailmanagement;

public class Main {
    public static void main(String[] args) {
    	
    	
    	Order o1 = new Order(201,
                "02-Jan-2026");
    	System.out.println("----- ORDER DETAILS -----\n");
    	o1.display();
    	
    	System.out.println("----- ORDER DETAILS -----\n");
    	ShippedOrder s = new ShippedOrder(201,
                "02-Jan-2026",
                "TRK556677");
    	s.display();

        DeliveredOrder order = new DeliveredOrder(
                201,
                "02-Jan-2026",
                "TRK556677",
                "05-Jan-2026"
        );

        System.out.println("----- ORDER DETAILS -----\n");
        order.display();
    }
}

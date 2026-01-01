package com.objectmodeling.selfproblems.ecommerce;



public class MainApp {
    public static void main(String[] args) {

        Customer c1 = new Customer("Nitin");

        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mouse", 700);
        Product p3 = new Product("Keyboard", 1200);

        Order o1 = new Order(101);
        o1.addProduct(p1);
        o1.addProduct(p2);

        Order o2 = new Order(102);
        o2.addProduct(p3);

        c1.placeOrder(o1);
        c1.placeOrder(o2);

        System.out.println();
        c1.showMyOrders();
    }
}

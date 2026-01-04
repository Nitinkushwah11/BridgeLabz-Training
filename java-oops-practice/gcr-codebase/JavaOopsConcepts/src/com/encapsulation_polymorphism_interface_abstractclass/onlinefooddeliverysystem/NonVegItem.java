package com.encapsulation_polymorphism_interface_abstractclass.onlinefooddeliverysystem;

class NonVegItem extends FoodItem {

    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() {
        double base = getPrice() * getQuantity();
        return base + (base * 0.05);   // 5% extra charge
    }
}

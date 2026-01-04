package com.encapsulation_polymorphism_interface_abstractclass.onlinefooddeliverysystem;

class VegItem extends FoodItem implements Discountable {

    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;   // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "10% Veg Discount";
    }
}

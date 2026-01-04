package com.encapsulation_polymorphism_interface_abstractclass.librarymanagementsystem;

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

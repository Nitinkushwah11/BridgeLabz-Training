package com.encapsulation_polymorphism_interface_abstractclass.librarymanagementsystem;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book(1, "Java Basics", "James"));
        items.add(new Magazine(2, "Tech Today", "Editorial"));
        items.add(new DVD(3, "Inception", "Nolan"));

        for(LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("----------------------");
        }

        items.get(0).reserveItem("Amit");

        System.out.println("\nAfter Reservation:\n");

        for(LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("----------------------");
        }
    }
}

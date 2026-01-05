package com.linkedlist.singlylinkedlist.inventorymanagement;

public class InventoryAppMain {

    public static void main(String[] args) {

        InventoryLinkedList inv = new InventoryLinkedList();

        inv.addLast(101, "Laptop", 5, 50000);
        inv.addLast(102, "Mouse", 20, 500);
        inv.addLast(103, "Keyboard", 10, 1200);

        System.out.println("Inventory:");
        inv.display();

        System.out.println("\nTotal Inventory Value: ₹" + inv.totalValue());

        System.out.println("\nAfter Sorting by Name Ascending:");
        inv.sortByName(true);
        inv.display();

        System.out.println("\nAfter Sorting by Price Descending:");
        inv.sortByPrice(false);
        inv.display();
    }
}

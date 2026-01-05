package com.linkedlist.singlylinkedlist.inventorymanagement;

class ItemNode {
    int itemId;
    String name;
    int quantity;
    double price;
    ItemNode next;

    public ItemNode(int itemId, String name, int quantity, double price) {
        this.itemId = itemId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

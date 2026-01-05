package com.linkedlist.singlylinkedlist.inventorymanagement;

class InventoryLinkedList {

    private ItemNode head;

    // Add at Beginning
    public void addFirst(int id, String name, int qty, double price) {
        ItemNode node = new ItemNode(id, name, qty, price);
        node.next = head;
        head = node;
    }

    // Add at End
    public void addLast(int id, String name, int qty, double price) {
        ItemNode node = new ItemNode(id, name, qty, price);

        if (head == null) {
            head = node;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = node;
    }

    // Add at Position
    public void addAtPosition(int pos, int id, String name, int qty, double price) {
        if (pos == 1) {
            addFirst(id, name, qty, price);
            return;
        }

        ItemNode node = new ItemNode(id, name, qty, price);
        ItemNode temp = head;

        for (int i = 1; temp != null && i < pos - 1; i++)
            temp = temp.next;

        if (temp == null) return;

        node.next = temp.next;
        temp.next = node;
    }

    // Remove by ID
    public void remove(int id) {
        if (head == null) return;

        if (head.itemId == id) {
            head = head.next;
            return;
        }

        ItemNode prev = head, curr = head.next;

        while (curr != null && curr.itemId != id) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null)
            prev.next = curr.next;
    }

    // Update Quantity
    public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    // Search by ID or Name
    public void search(String key) {
        ItemNode temp = head;
        while (temp != null) {
            if (String.valueOf(temp.itemId).equals(key) || temp.name.equalsIgnoreCase(key)) {
                displayNode(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found!");
    }

    // Total Inventory Value
    public double totalValue() {
        double sum = 0;
        ItemNode temp = head;

        while (temp != null) {
            sum += temp.price * temp.quantity;
            temp = temp.next;
        }
        return sum;
    }

    // Display All
    public void display() {
        ItemNode temp = head;
        while (temp != null) {
            displayNode(temp);
            temp = temp.next;
        }
    }

    private void displayNode(ItemNode i) {
        System.out.println(i.itemId + " | " + i.name + " | " + i.quantity + " | ₹" + i.price);
    }

    // ===== Merge Sort by Name or Price =====

    public void sortByName(boolean asc) {
        head = mergeSort(head, asc, true);
    }

    public void sortByPrice(boolean asc) {
        head = mergeSort(head, asc, false);
    }

    private ItemNode mergeSort(ItemNode h, boolean asc, boolean byName) {
        if (h == null || h.next == null)
            return h;

        ItemNode mid = getMiddle(h);
        ItemNode next = mid.next;
        mid.next = null;

        ItemNode left = mergeSort(h, asc, byName);
        ItemNode right = mergeSort(next, asc, byName);

        return sortedMerge(left, right, asc, byName);
    }

    private ItemNode sortedMerge(ItemNode a, ItemNode b, boolean asc, boolean byName) {
        if (a == null) return b;
        if (b == null) return a;

        boolean condition = byName ?
                (asc ? a.name.compareToIgnoreCase(b.name) <= 0 : a.name.compareToIgnoreCase(b.name) > 0)
                :
                (asc ? a.price <= b.price : a.price > b.price);

        ItemNode result;
        if (condition) {
            result = a;
            result.next = sortedMerge(a.next, b, asc, byName);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next, asc, byName);
        }
        return result;
    }

    private ItemNode getMiddle(ItemNode h) {
        if (h == null) return h;

        ItemNode slow = h, fast = h.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

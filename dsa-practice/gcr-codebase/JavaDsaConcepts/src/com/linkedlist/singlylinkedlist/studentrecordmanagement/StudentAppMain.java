package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentAppMain {

    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addFirst(101, "Nitin", 20, "A");
        list.addLast(102, "Rohit", 21, "B");
        list.addAtPosition(2, 103, "Amit", 22, "C");

        System.out.println("All Students:");
        list.display();

        System.out.println("\nSearch Roll No 102:");
        list.search(102);

        System.out.println("\nUpdate Grade Roll No 103:");
        list.updateGrade(103, "A");

        System.out.println("\nAfter Update:");
        list.display();

        System.out.println("\nDelete Roll No 101:");
        list.delete(101);

        System.out.println("\nAfter Deletion:");
        list.display();
    }
}

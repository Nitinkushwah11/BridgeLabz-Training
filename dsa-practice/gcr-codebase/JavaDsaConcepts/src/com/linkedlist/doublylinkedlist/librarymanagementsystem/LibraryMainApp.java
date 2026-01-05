package com.linkedlist.doublylinkedlist.librarymanagementsystem;

public class LibraryMainApp {

    public static void main(String[] args) {

        Library lib = new Library();

        lib.addFirst(101, "Java Basics", "James", "Programming", true);
        lib.addLast(102, "Python Guide", "Rossum", "Programming", true);
        lib.addLast(103, "DBMS", "Korth", "Database", false);
        lib.addAtPosition(2, 104, "C++", "Bjarne", "Programming", true);

        System.out.println("All Books (Forward):");
        lib.displayForward();

        System.out.println("\nSearch by Author 'James':");
        lib.searchBook("James");

        lib.updateStatus(103, true);

        System.out.println("\nAll Books (Reverse):");
        lib.displayReverse();

        lib.removeBook(102);

        System.out.println("\nTotal Books: " + lib.countBooks());
    }
}

package com.objectmodeling.libraryandbooks;

public class Main {

    public static void main(String[] args) {

        // Independent Book objects
        Book b1 = new Book("Java Basics", "James Gosling");
        Book b2 = new Book("Python Guide", "Guido van Rossum");
        Book b3 = new Book("C++ Handbook", "Bjarne Stroustrup");

        // Libraries
        Library central = new Library("Central Library");
        Library city = new Library("City Library");

        // Aggregating books into libraries
        central.addBook(b1);
        central.addBook(b2);

        city.addBook(b2);  // same book can be in another library
        city.addBook(b3);

        // Display books
        central.showBooks();
        city.showBooks();
    }
}

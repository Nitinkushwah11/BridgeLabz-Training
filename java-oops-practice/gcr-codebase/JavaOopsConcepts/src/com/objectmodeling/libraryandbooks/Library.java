package com.objectmodeling.libraryandbooks;

import java.util.ArrayList;

public class Library {

    String libraryName;
    ArrayList<Book> books;   // Aggregation

    Library(String libraryName) {
        this.libraryName = libraryName;
        books = new ArrayList<>();
    }

    void addBook(Book b) {
        books.add(b);
    }

    void showBooks() {
        System.out.println("\nLibrary: " + libraryName);
        for (Book b : books) {
            b.displayBook();
        }
    }
}


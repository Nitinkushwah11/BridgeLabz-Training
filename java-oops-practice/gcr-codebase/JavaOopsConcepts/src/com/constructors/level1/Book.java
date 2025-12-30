package com.constructors.level1;

public class Book {

    protected String ISBN;     // accessible to subclass
    protected String title;    // accessible to subclass
    private String author;     // private, accessed via getter

    // Parameterized constructor
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter for private variable
    public String getAuthor() {
        return author;
    }
}

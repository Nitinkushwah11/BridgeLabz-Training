package com.encapsulation_polymorphism_interface_abstractclass.librarymanagementsystem;

class Book extends LibraryItem {

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;   // 14 days
    }
}

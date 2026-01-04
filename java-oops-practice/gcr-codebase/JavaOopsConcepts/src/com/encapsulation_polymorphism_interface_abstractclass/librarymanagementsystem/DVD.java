package com.encapsulation_polymorphism_interface_abstractclass.librarymanagementsystem;

class DVD extends LibraryItem {

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;   // 3 days
    }
}

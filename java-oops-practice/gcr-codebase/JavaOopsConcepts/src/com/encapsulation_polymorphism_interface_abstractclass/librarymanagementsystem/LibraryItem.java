package com.encapsulation_polymorphism_interface_abstractclass.librarymanagementsystem;

abstract class LibraryItem implements Reservable {

    private int itemId;
    private String title;
    private String author;

    // Sensitive borrower data (Encapsulation)
    private String borrowerName;
    private boolean isAvailable = true;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("ID    : " + itemId);
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    // Interface methods
    @Override
    public void reserveItem(String borrower) {
        if(isAvailable) {
            this.borrowerName = borrower;
            this.isAvailable = false;
            System.out.println(title + " reserved by " + borrower);
        } else {
            System.out.println(title + " is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

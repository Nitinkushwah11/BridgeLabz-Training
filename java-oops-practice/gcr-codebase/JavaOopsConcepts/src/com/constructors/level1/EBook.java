package com.constructors.level1;

class EBook extends Book {

    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void display() {
        System.out.println(ISBN + " | " + title + " | " + getAuthor());
    }

    public static void main(String[] args) {
        EBook ebook = new EBook("978-9384567890", "Java Mastery", "Nitin Kushwah");
        ebook.display();
    }
}

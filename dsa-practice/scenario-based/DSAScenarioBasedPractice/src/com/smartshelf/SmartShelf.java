package com.smartshelf;

class Book {
    String title;

    Book(String title) {
        this.title = title;
    }
}

public class SmartShelf {

    public static void insertionSort(Book[] books) {

        for (int i = 1; i < books.length; i++) {
            Book key = books[i];
            int j = i - 1;

            // Move books that are greater than key
            while (j >= 0 && books[j].title.compareToIgnoreCase(key.title) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        Book[] shelf = {
            new Book("Java"),
            new Book("Python"),
            new Book("C++"),
            new Book("Data Structures")
        };

        insertionSort(shelf);

        System.out.println("Sorted Book List:");
        for (Book b : shelf) {
            System.out.println(b.title);
        }
    }
}

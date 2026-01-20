package com.smartlibrary;

class SmartLibrary {

    public static void insertionSort(String[] books) {
        int n = books.length;

        for (int i = 1; i < n; i++) {
            String key = books[i];
            int j = i - 1;

            while (j >= 0 && books[j].compareToIgnoreCase(key) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        String[] borrowedBooks = {
            "C Programming",
            "Data Structures",
            "Java",
            "Algorithms"
        };

        insertionSort(borrowedBooks);

        System.out.println("Sorted Borrowed Books:");
        for (String book : borrowedBooks) {
            System.out.println(book);
        }
    }
}

package com.linkedlist.doublylinkedlist.moviemanagementsystem;

public class MovieAppMain {
    public static void main(String[] args) {

        MovieList list = new MovieList();

        list.addFirst("Inception", "Nolan", 2010, 9.0);
        list.addLast("Titanic", "Cameron", 1997, 8.8);
        list.addLast("Avatar", "Cameron", 2009, 8.5);
        list.addAtPosition(2, "Interstellar", "Nolan", 2014, 9.2);

        System.out.println("All Movies (Forward):");
        list.displayForward();

        System.out.println("\nSearch by Director Cameron:");
        list.searchMovie("Cameron");

        list.updateRating("Titanic", 9.1);

        System.out.println("\nAll Movies (Reverse):");
        list.displayReverse();

        list.removeMovie("Avatar");

        System.out.println("\nAfter Deletion:");
        list.displayForward();
    }
}

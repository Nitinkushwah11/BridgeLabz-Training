package com.linkedlist.doublylinkedlist.moviemanagementsystem;

class MovieList {

    private MovieNode head;
    private MovieNode tail;

    // Add at Beginning
    public void addFirst(String title, String director, int year, double rating) {
        MovieNode node = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }

    // Add at End
    public void addLast(String title, String director, int year, double rating) {
        MovieNode node = new MovieNode(title, director, year, rating);

        if (tail == null) {
            head = tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    // Add at Specific Position
    public void addAtPosition(int pos, String title, String director, int year, double rating) {
        if (pos == 1) {
            addFirst(title, director, year, rating);
            return;
        }

        MovieNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) return;

        MovieNode node = new MovieNode(title, director, year, rating);
        node.next = temp.next;
        node.prev = temp;

        if (temp.next != null)
            temp.next.prev = node;
        else
            tail = node;

        temp.next = node;
    }

    // Remove Movie by Title
    public void removeMovie(String title) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {

                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                }
                else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                }
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.println("Movie Removed: " + title);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie Not Found!");
    }

    // Search by Director or Rating
    public void searchMovie(String key) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(key) || String.valueOf(temp.rating).equals(key)) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No Movie Found!");
    }

    // Update Rating
    public void updateRating(String title, double newRating) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating Updated!");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie Not Found!");
    }

    // Display Forward
    public void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    // Display Reverse
    public void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    private void displayMovie(MovieNode m) {
        System.out.println(m.title + " | " + m.director + " | " + m.year + " | Rating: " + m.rating);
    }
}

package com.linkedlist.doublylinkedlist.librarymanagementsystem;

class Library {

    private BookNode head;
    private BookNode tail;

    // Add at Beginning
    public void addFirst(int id, String title, String author, String genre, boolean status) {
        BookNode node = new BookNode(id, title, author, genre, status);

        if (head == null) {
            head = tail = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }

    // Add at End
    public void addLast(int id, String title, String author, String genre, boolean status) {
        BookNode node = new BookNode(id, title, author, genre, status);

        if (tail == null) {
            head = tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    // Add at Specific Position
    public void addAtPosition(int pos, int id, String title, String author, String genre, boolean status) {
        if (pos == 1) {
            addFirst(id, title, author, genre, status);
            return;
        }

        BookNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) return;

        BookNode node = new BookNode(id, title, author, genre, status);

        node.next = temp.next;
        node.prev = temp;

        if (temp.next != null)
            temp.next.prev = node;
        else
            tail = node;

        temp.next = node;
    }

    // Remove Book by ID
    public void removeBook(int id) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {

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

                System.out.println("Book Removed Successfully!");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book Not Found!");
    }

    // Search Book by Title or Author
    public void searchBook(String key) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(key) || temp.author.equalsIgnoreCase(key)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No Book Found!");
    }

    // Update Availability Status
    public void updateStatus(int id, boolean status) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                temp.isAvailable = status;
                System.out.println("Status Updated!");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book Not Found!");
    }

    // Display Forward
    public void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    // Display Reverse
    public void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    // Count Total Books
    public int countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    private void displayBook(BookNode b) {
        System.out.println(b.bookId + " | " + b.title + " | " + b.author + " | " +
                b.genre + " | Available: " + b.isAvailable);
    }
}

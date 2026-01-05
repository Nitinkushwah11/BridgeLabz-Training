package com.linkedlist.doublylinkedlist.undoredofuncationality;

class TextEditor {

    private TextState head;
    private TextState tail;
    private TextState current;
    private int size = 0;
    private final int LIMIT = 10;

    // Add New State
    public void type(String text) {

        TextState node = new TextState(text);

        if (head == null) {
            head = tail = current = node;
            size++;
            return;
        }

        // Remove redo history if any
        if (current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
        current = node;
        size++;

        // Maintain history limit
        if (size > LIMIT) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Nothing to Undo!");
        }
    }

    // Redo
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Nothing to Redo!");
        }
    }

    // Display Current State
    public void display() {
        if (current != null)
            System.out.println("Current Text: " + current.content);
        else
            System.out.println("Editor is Empty!");
    }
}

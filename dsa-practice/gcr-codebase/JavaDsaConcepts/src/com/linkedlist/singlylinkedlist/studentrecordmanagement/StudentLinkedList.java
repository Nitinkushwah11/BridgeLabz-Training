package com.linkedlist.singlylinkedlist.studentrecordmanagement;

class StudentLinkedList {

    private StudentNode head;

    // Add at Beginning
    public void addFirst(int r, String n, int a, String g) {
        StudentNode node = new StudentNode(r, n, a, g);
        node.next = head;
        head = node;
    }

    // Add at End
    public void addLast(int r, String n, int a, String g) {
        StudentNode node = new StudentNode(r, n, a, g);

        if (head == null) {
            head = node;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = node;
    }

    // Add at Position (1-based)
    public void addAtPosition(int pos, int r, String n, int a, String g) {
        if (pos == 1) {
            addFirst(r, n, a, g);
            return;
        }

        StudentNode node = new StudentNode(r, n, a, g);
        StudentNode temp = head;

        for (int i = 1; temp != null && i < pos - 1; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Invalid Position!");
            return;
        }

        node.next = temp.next;
        temp.next = node;
    }

    // Delete by Roll No
    public void delete(int roll) {
        if (head == null) return;

        if (head.rollNo == roll) {
            head = head.next;
            return;
        }

        StudentNode prev = head;
        StudentNode curr = head.next;

        while (curr != null && curr.rollNo != roll) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null)
            prev.next = curr.next;
        else
            System.out.println("Student not found!");
    }

    // Search by Roll No
    public void search(int roll) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNo == roll) {
                displayNode(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found!");
    }

    // Update Grade
    public void updateGrade(int roll, String newGrade) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNo == roll) {
                temp.grade = newGrade;
                System.out.println("Grade updated!");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found!");
    }

    // Display All Records
    public void display() {
        StudentNode temp = head;
        while (temp != null) {
            displayNode(temp);
            temp = temp.next;
        }
    }

    private void displayNode(StudentNode s) {
        System.out.println(s.rollNo + " | " + s.name + " | " +
                s.age + " | " + s.grade);
    }
}

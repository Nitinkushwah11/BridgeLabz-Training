package com.linkedlist.circularlinkedlist.taskscheduler;

class TaskScheduler {

    private TaskNode head;
    private TaskNode current;

    // Add at Beginning
    public void addFirst(int id, String name, int priority, String date) {
        TaskNode node = new TaskNode(id, name, priority, date);

        if (head == null) {
            head = current = node;
            node.next = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        node.next = head;
        temp.next = node;
        head = node;
    }

    // Add at End
    public void addLast(int id, String name, int priority, String date) {
        TaskNode node = new TaskNode(id, name, priority, date);

        if (head == null) {
            head = current = node;
            node.next = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = node;
        node.next = head;
    }

    // Add at Position
    public void addAtPosition(int pos, int id, String name, int priority, String date) {
        if (pos == 1) {
            addFirst(id, name, priority, date);
            return;
        }

        TaskNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++)
            temp = temp.next;

        TaskNode node = new TaskNode(id, name, priority, date);
        node.next = temp.next;
        temp.next = node;
    }

    // Remove Task by ID
    public void removeTask(int id) {
        if (head == null) return;

        TaskNode temp = head, prev = null;

        do {
            if (temp.taskId == id) {

                if (temp == head) {
                    TaskNode last = head;
                    while (last.next != head)
                        last = last.next;

                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = temp.next;
                }
                System.out.println("Task Deleted!");
                return;
            }
            prev = temp;
            temp = temp.next;

        } while (temp != head);

        System.out.println("Task Not Found!");
    }

    // View Current Task & Move Next
    public void viewNextTask() {
        if (current == null) return;
        System.out.println(current.taskId + " - " + current.taskName);
        current = current.next;
    }

    // Search by Priority
    public void searchByPriority(int p) {
        if (head == null) return;

        TaskNode temp = head;
        do {
            if (temp.priority == p)
                System.out.println(temp.taskId + " " + temp.taskName);
            temp = temp.next;
        } while (temp != head);
    }

    // Display All Tasks
    public void displayAll() {
        if (head == null) return;

        TaskNode temp = head;
        do {
            System.out.println(temp.taskId + " | " + temp.taskName +
                    " | Priority: " + temp.priority +
                    " | Due: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }
}

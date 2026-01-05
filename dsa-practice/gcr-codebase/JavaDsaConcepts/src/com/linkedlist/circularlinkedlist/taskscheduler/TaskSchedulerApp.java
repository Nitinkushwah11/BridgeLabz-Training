package com.linkedlist.circularlinkedlist.taskscheduler;

public class TaskSchedulerApp {

    public static void main(String[] args) {

        TaskScheduler ts = new TaskScheduler();

        ts.addLast(1, "Design Module", 1, "05-Jan");
        ts.addLast(2, "Write Code", 2, "06-Jan");
        ts.addLast(3, "Testing", 1, "07-Jan");

        System.out.println("All Tasks:");
        ts.displayAll();

        System.out.println("\nCurrent Tasks Cycle:");
        ts.viewNextTask();
        ts.viewNextTask();
        ts.viewNextTask();
        ts.viewNextTask();

        System.out.println("\nHigh Priority Tasks:");
        ts.searchByPriority(1);

        ts.removeTask(2);

        System.out.println("\nAfter Deletion:");
        ts.displayAll();
    }
}

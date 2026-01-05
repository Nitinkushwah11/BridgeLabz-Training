package com.linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

public class RoundRobinAppMain {

    public static void main(String[] args) {

        RoundRobinScheduler rr = new RoundRobinScheduler(3);

        rr.addProcess(1, 10);
        rr.addProcess(2, 5);
        rr.addProcess(3, 8);

        System.out.println("Initial Queue:");
        rr.display();

        rr.execute();
    }
}

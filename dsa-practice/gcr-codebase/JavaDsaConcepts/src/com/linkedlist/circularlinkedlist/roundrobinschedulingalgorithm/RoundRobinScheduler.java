package com.linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

class RoundRobinScheduler {

    private ProcessNode head = null;
    private int timeQuantum;
    private int processCount = 0;

    public RoundRobinScheduler(int tq) {
        this.timeQuantum = tq;
    }

    // Add Process at End
    public void addProcess(int pid, int bt) {
        ProcessNode node = new ProcessNode(pid, bt);

        if (head == null) {
            head = node;
            node.next = head;
        } else {
            ProcessNode temp = head;
            while (temp.next != head)
                temp = temp.next;

            temp.next = node;
            node.next = head;
        }
        processCount++;
    }

    // Display Processes
    public void display() {
        if (head == null) return;

        ProcessNode temp = head;
        do {
            System.out.print("P" + temp.pid + "(RT:" + temp.remainingTime + ") -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Execute Round Robin
    public void execute() {

        int time = 0;
        ProcessNode curr = head;

        while (processCount > 0) {

            if (curr.remainingTime > 0) {

                if (curr.remainingTime > timeQuantum) {
                    time += timeQuantum;
                    curr.remainingTime -= timeQuantum;
                } else {
                    time += curr.remainingTime;
                    curr.remainingTime = 0;

                    curr.turnAroundTime = time;
                    curr.waitingTime = curr.turnAroundTime - curr.burstTime;

                    System.out.println("Process P" + curr.pid + " Completed!");

                    removeProcess(curr.pid);
                }
            }

            display();
            curr = curr.next;
        }

        System.out.println("\nScheduling Completed!");
    }

    // Remove Process
    private void removeProcess(int pid) {
        if (head == null) return;

        ProcessNode curr = head, prev = null;

        do {
            if (curr.pid == pid) {

                if (curr == head && curr.next == head) {
                    head = null;
                } 
                else if (curr == head) {
                    ProcessNode last = head;
                    while (last.next != head)
                        last = last.next;

                    head = head.next;
                    last.next = head;
                } 
                else {
                    prev.next = curr.next;
                }
                processCount--;
                return;
            }
            prev = curr;
            curr = curr.next;

        } while (curr != head);
    }

    // Calculate Average Times
    public void showAverages(ProcessNode[] finished) {
        double totalWT = 0, totalTAT = 0;

        for (ProcessNode p : finished) {
            totalWT += p.waitingTime;
            totalTAT += p.turnAroundTime;
        }

        System.out.println("\nAverage Waiting Time: " + totalWT / finished.length);
        System.out.println("Average Turnaround Time: " + totalTAT / finished.length);
    }
}

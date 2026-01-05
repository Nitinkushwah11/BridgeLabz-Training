package com.linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

class ProcessNode {
    int pid;
    int burstTime;
    int remainingTime;
    int waitingTime = 0;
    int turnAroundTime = 0;
    ProcessNode next;

    public ProcessNode(int pid, int burstTime) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.next = null;
    }
}

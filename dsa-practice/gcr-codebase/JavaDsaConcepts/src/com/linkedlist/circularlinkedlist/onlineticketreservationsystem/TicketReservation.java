package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

class TicketReservation {

    private TicketNode head;

    // Add Ticket at End
    public void addTicket(int id, String cname, String movie, String seat, String time) {
        TicketNode node = new TicketNode(id, cname, movie, seat, time);

        if (head == null) {
            head = node;
            node.next = head;
            return;
        }

        TicketNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = node;
        node.next = head;
    }

    // Remove Ticket by ID
    public void removeTicket(int id) {
        if (head == null) return;

        TicketNode curr = head, prev = null;

        do {
            if (curr.ticketId == id) {

                if (curr == head) {
                    TicketNode last = head;
                    while (last.next != head)
                        last = last.next;

                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                System.out.println("Ticket Cancelled!");
                return;
            }
            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println("Ticket Not Found!");
    }

    // Display Tickets
    public void displayTickets() {
        if (head == null) return;

        TicketNode temp = head;
        do {
            System.out.println(temp.ticketId + " | " + temp.customerName + " | "
                    + temp.movieName + " | Seat: " + temp.seatNumber +
                    " | Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    // Search Ticket
    public void searchTicket(String key) {
        if (head == null) return;

        TicketNode temp = head;
        do {
            if (temp.customerName.equalsIgnoreCase(key) ||
                temp.movieName.equalsIgnoreCase(key)) {
                System.out.println(temp.ticketId + " | " + temp.customerName + " | " + temp.movieName);
            }
            temp = temp.next;
        } while (temp != head);
    }

    // Count Tickets
    public int countTickets() {
        if (head == null) return 0;

        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }
}

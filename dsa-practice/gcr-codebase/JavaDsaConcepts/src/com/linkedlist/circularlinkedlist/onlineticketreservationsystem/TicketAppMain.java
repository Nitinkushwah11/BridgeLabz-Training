package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

public class TicketAppMain {

    public static void main(String[] args) {

        TicketReservation tr = new TicketReservation();

        tr.addTicket(1, "Nitin", "Avengers", "A1", "10:30 AM");
        tr.addTicket(2, "Rohit", "Avatar", "B3", "11:00 AM");
        tr.addTicket(3, "Amit", "Avengers", "C2", "12:00 PM");

        System.out.println("All Tickets:");
        tr.displayTickets();

        System.out.println("\nSearch Movie: Avengers");
        tr.searchTicket("Avengers");

        tr.removeTicket(2);

        System.out.println("\nAfter Cancellation:");
        tr.displayTickets();

        System.out.println("\nTotal Tickets: " + tr.countTickets());
    }
}

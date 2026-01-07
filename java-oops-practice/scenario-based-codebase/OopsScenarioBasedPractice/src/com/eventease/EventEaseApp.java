package com.eventease;

public class EventEaseApp {

    public static void main(String[] args) {

        User organizer = new User("Nitin", "nitin@gmail.com");

        Event e1 = new BirthdayEvent("Nitin Birthday", "Indore", "10-Feb-2026",
                50, 12000, 5000, 1000);

        Event e2 = new ConferenceEvent("Java Dev Conference", "Bhopal",
                "25-Mar-2026", 200, 30000);

        e1.schedule();
        e2.schedule();

        e1.reschedule("12-Feb-2026");
    }
}

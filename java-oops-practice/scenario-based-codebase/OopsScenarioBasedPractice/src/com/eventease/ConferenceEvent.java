package com.eventease;

public class ConferenceEvent extends Event {

    public ConferenceEvent(String name, String loc, String date, int attendees,
                           double venueCost) {
        super(name, loc, date, attendees, venueCost);
    }

    @Override
    public void schedule() {
        System.out.println("Conference scheduled with speaker arrangements.");
        System.out.println("Date: " + date + " | Total Cost: " + calculateTotalCost());
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Conference rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Conference booking cancelled.");
    }
}

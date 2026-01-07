package com.eventease;

public class BirthdayEvent extends Event {

    public BirthdayEvent(String name, String loc, String date, int attendees,
                         double venueCost, double serviceCost, double discount) {
        super(name, loc, date, attendees, venueCost, serviceCost, discount);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday Party scheduled on " + date +
                " | Total Cost: " + calculateTotalCost());
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Birthday Party rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday Party has been cancelled.");
    }
}

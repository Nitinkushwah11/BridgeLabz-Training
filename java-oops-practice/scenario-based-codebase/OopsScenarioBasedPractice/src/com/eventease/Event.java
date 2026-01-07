package com.eventease;

import java.util.UUID;

public abstract class Event implements ISchedulable {

    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private final String eventId;   // cannot be edited once assigned

    private double venueCost;
    private double serviceCost;
    private double discount;

    // Basic constructor
    public Event(String eventName, String location, String date, int attendees, double venueCost) {
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.eventId = UUID.randomUUID().toString();
    }

    // Overloaded constructor (with services)
    public Event(String eventName, String location, String date, int attendees,
                 double venueCost, double serviceCost, double discount) {
        this(eventName, location, date, attendees, venueCost);
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    protected double calculateTotalCost() {
        return venueCost + serviceCost - discount;   // operator usage
    }

    public String getEventId() {
        return eventId;
    }
}

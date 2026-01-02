package com.inheritance.singleinheritance.smarthomedevices;

public class Main {

    public static void main(String[] args) {

        Thermostat t1 = new Thermostat("TH1001", "ON", 24);
        t1.displayStatus();
    }
}

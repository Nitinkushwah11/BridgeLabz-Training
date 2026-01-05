package com.smarthomeautomationsystem;

public class UserController {

    public static void main(String[] args) {

        Appliance a1 = new Light(60);
        Appliance a2 = new Fan(80);
        Appliance a3 = new AC(1500);

        a1.turnOn();
        a2.turnOn();
        a3.turnOn();

        a1.showStatus();
        a2.showStatus();
        a3.showStatus();

        System.out.println("\nComparing Energy Usage:");

        if (a3.getEnergyUsage() > a1.getEnergyUsage())
            System.out.println("AC consumes more energy than Light");
    }
}

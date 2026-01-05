package com.smarthomeautomationsystem;

class AC extends Appliance {

    public AC(int energyUsage) {
        super(energyUsage);
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("AC cooling started");
    }

    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println("AC stopped");
    }
}

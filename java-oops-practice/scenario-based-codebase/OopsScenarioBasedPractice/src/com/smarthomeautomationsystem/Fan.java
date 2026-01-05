package com.smarthomeautomationsystem;

class Fan extends Appliance {

    public Fan(int energyUsage) {
        super(energyUsage);
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("Fan started spinning");
    }

    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println("Fan stopped");
    }
}

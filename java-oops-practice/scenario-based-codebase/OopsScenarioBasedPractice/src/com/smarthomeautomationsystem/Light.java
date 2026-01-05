package com.smarthomeautomationsystem;

class Light extends Appliance {

    public Light(int energyUsage) {
        super(energyUsage);
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("Light turned ON");
    }

    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println("Light turned OFF");
    }
}

package com.smarthomeautomationsystem;

abstract class Appliance implements Controllable {

    private boolean powerStatus;
    private int energyUsage;   // in watts

    public Appliance(int energyUsage) {
        this.energyUsage = energyUsage;
        this.powerStatus = false;
    }

    protected int getEnergyUsage() {
        return energyUsage;
    }

    protected boolean isPowerOn() {
        return powerStatus;
    }

    protected void setPowerStatus(boolean status) {
        this.powerStatus = status;
    }

    public void showStatus() {
        System.out.println(getClass().getSimpleName() +
                " Power: " + (powerStatus ? "ON" : "OFF") +
                " | Energy Usage: " + energyUsage + "W");
    }
}

package com.homenest;

abstract class Device implements IControllable {

    private String deviceId;
    private boolean status;
    protected double energyUsage;   // accessible to child classes

    protected String firmwareLog = "Firmware v1.0";

    public Device(String deviceId) {
        this.deviceId = deviceId;
        this.status = false;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public boolean getStatus() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    public double getEnergyUsage() {
        return energyUsage;
    }
}

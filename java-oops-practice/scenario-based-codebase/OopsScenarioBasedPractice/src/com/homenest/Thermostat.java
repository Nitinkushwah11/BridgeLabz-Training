package com.homenest;

class Thermostat extends Device {

    public Thermostat(String id) {
        super(id);
        energyUsage = 15;
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Thermostat ON");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Thermostat OFF");
    }

    public void reset() {
        System.out.println("Temperature settings reset.");
    }

	@Override
	public void trunOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		
	}
}


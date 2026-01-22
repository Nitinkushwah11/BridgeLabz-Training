package com.homenest;

class Camera extends Device {

    public Camera(String id) {
        super(id);
        energyUsage = 20;
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Camera activated");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Camera off");
    }

    public void reset() {
        System.out.println("Camera rebooting...");
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

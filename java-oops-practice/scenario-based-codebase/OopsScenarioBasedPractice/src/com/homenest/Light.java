package com.homenest;

class Light extends Device {

    public Light(String id) {
        super(id);
        energyUsage = 10;
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Light ON");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Light OFF");
    }

    public void reset() {
        System.out.println("Light brightness reset.");
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

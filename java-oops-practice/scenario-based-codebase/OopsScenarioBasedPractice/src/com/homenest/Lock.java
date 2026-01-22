package com.homenest;
class Lock extends Device {

    public Lock(String id) {
        super(id);
        energyUsage = 5;
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Lock engaged");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Lock disengaged");
    }

    public void reset() {
        System.out.println("Lock security reset.");
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

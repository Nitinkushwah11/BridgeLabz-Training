package com.cabbygo;

class Mini extends Vehicle {
    public Mini(String vNo, Driver d) {
        super(vNo, 4, "Mini", 8, d);
    }
}

class Sedan extends Vehicle {
    public Sedan(String vNo, Driver d) {
        super(vNo, 4, "Sedan", 12, d);
    }
}

class SUV extends Vehicle {
    public SUV(String vNo, Driver d) {
        super(vNo, 6, "SUV", 15, d);
    }
}

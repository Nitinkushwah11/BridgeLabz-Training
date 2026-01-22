package com.homenest;

public class HomeNestApp {
    public static void main(String[] args) {

        Device d1 = new Light("L101");
        Device d2 = new Camera("C202");

        d1.trunOn();
        d1.reset();

        d2.trunOn();
        d2.reset();

        double totalEnergy = d1.getEnergyUsage() + d2.getEnergyUsage();
        System.out.println("Total Energy Used: " + totalEnergy);
    }
}

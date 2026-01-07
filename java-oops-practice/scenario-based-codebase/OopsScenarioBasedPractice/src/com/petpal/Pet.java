package com.petpal;

import java.util.Random;

public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    private int hunger;   // 0 = full, 100 = very hungry
    private int energy;   // 0 = tired, 100 = full energy
    private String mood;

    // Random default constructor
    public Pet() {
        Random r = new Random();
        this.hunger = r.nextInt(60);
        this.energy = r.nextInt(60) + 40;
        updateMood();
    }

    // User specified constructor
    public Pet(String name, String type, int age) {
        this();
        this.name = name;
        this.type = type;
        this.age = age;
    }

    // Only internal modification allowed
    protected void updateMood() {
        if(hunger > 70)
            mood = "Hungry";
        else if(energy < 30)
            mood = "Tired";
        else
            mood = "Happy";
    }

    public String getMood() {
        return mood;
    }

    protected void changeHunger(int value) {
        hunger += value;        // operator usage
        if(hunger < 0) hunger = 0;
        if(hunger > 100) hunger = 100;
        updateMood();
    }

    protected void changeEnergy(int value) {
        energy += value;
        if(energy < 0) energy = 0;
        if(energy > 100) energy = 100;
        updateMood();
    }

    public abstract void makeSound();
}

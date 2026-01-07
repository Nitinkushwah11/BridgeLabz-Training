package com.petpal;

public class Bird extends Pet {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    public void feed() {
        changeHunger(-10);
        System.out.println(name + " is eating seeds.");
    }

    @Override
    public void play() {
        changeEnergy(-5);
        changeHunger(5);
        System.out.println(name + " is flying around!");
    }

    @Override
    public void sleep() {
        changeEnergy(20);
        System.out.println(name + " is resting in its nest.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet Tweet!");
    }
}


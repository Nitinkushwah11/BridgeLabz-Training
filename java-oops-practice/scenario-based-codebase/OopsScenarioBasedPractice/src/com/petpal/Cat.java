package com.petpal;

public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    @Override
    public void feed() {
        changeHunger(-15);
        System.out.println(name + " is eating fish.");
    }

    @Override
    public void play() {
        changeEnergy(-10);
        changeHunger(5);
        System.out.println(name + " is chasing a laser.");
    }

    @Override
    public void sleep() {
        changeEnergy(30);
        System.out.println(name + " is sleeping lazily.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

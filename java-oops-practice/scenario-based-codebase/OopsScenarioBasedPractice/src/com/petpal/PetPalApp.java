package com.petpal;

public class PetPalApp {

    public static void main(String[] args) {

        Pet p1 = new Dog("Bruno", 3);
        Pet p2 = new Cat("Kitty", 2);
        Pet p3 = new Bird("Tweety", 1);

        p1.makeSound();
        p1.play();
        p1.feed();
        System.out.println("Mood: " + p1.getMood());

        p2.makeSound();
        p3.makeSound();
    }
}

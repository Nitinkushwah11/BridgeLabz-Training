package com.icecreamrush;

class Flavor {
    String name;
    int sold;

    Flavor(String name, int sold) {
        this.name = name;
        this.sold = sold;
    }
}

public class IceCreamRush {

    public static void bubbleSort(Flavor[] flavors) {
        int n = flavors.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (flavors[j].sold > flavors[j + 1].sold) {
                    Flavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Flavor[] list = {
            new Flavor("Vanilla", 45),
            new Flavor("Chocolate", 60),
            new Flavor("Strawberry", 30),
            new Flavor("Mango", 20)
        };

        bubbleSort(list);

        System.out.println("Flavors sorted by popularity:");
        for (Flavor f : list) {
            System.out.println(f.name + " → " + f.sold);
        }
    }
}

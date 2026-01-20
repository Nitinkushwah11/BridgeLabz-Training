package com.robowarehouse;

class Package {
    int weight;

    Package(int weight) {
        this.weight = weight;
    }
}

public class RoboWarehouse {

    public static void insertionSort(Package[] arr) {

        for (int i = 1; i < arr.length; i++) {
            Package key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].weight > key.weight) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        Package[] packages = {
            new Package(15),
            new Package(5),
            new Package(25),
            new Package(10)
        };

        insertionSort(packages);

        System.out.println("Sorted Shelf (by weight):");
        for (Package p : packages) {
            System.out.println(p.weight + " kg");
        }
    }
}

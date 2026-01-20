package com.fleetmanager;

class Vehicle {
    String id;
    int mileage;

    Vehicle(String id, int mileage) {
        this.id = id;
        this.mileage = mileage;
    }
}

public class FleetManager {

    public static void mergeSort(Vehicle[] arr, int left, int right) {
        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(Vehicle[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Vehicle[] L = new Vehicle[n1];
        Vehicle[] R = new Vehicle[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i].mileage <= R[j].mileage) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Vehicle("V101", 25000),
            new Vehicle("V102", 12000),
            new Vehicle("V103", 30000),
            new Vehicle("V104", 18000)
        };

        mergeSort(vehicles, 0, vehicles.length - 1);

        System.out.println("Maintenance Schedule:");
        for (Vehicle v : vehicles) {
            System.out.println(v.id + " → " + v.mileage + " km");
        }
    }
}

package com.cropmonitor;

class SensorData {
    long timestamp;
    double temperature;

    SensorData(long timestamp, double temperature) {
        this.timestamp = timestamp;
        this.temperature = temperature;
    }
}

public class CropMonitor {

    public static void quickSort(SensorData[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(SensorData[] arr, int low, int high) {
        long pivot = arr[high].timestamp;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].timestamp < pivot) {
                i++;
                SensorData temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        SensorData temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        SensorData[] data = {
            new SensorData(1050, 26.5),
            new SensorData(1010, 25.8),
            new SensorData(1030, 26.1),
            new SensorData(1005, 25.2)
        };

        quickSort(data, 0, data.length - 1);

        System.out.println("Sorted Sensor Data:");
        for (SensorData s : data) {
            System.out.println("Time: " + s.timestamp + ", Temp: " + s.temperature);
        }
    }
}

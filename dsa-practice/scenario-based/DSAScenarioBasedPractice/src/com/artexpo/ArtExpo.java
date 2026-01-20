package com.artexpo;
class Artist {
    String name;
    int regTime; // time in minutes (e.g., 1030 = 10:30 AM)

    Artist(String name, int regTime) {
        this.name = name;
        this.regTime = regTime;
    }
}

public class ArtExpo {

    public static void insertionSort(Artist[] artists) {

        for (int i = 1; i < artists.length; i++) {
            Artist key = artists[i];
            int j = i - 1;

            while (j >= 0 && artists[j].regTime > key.regTime) {
                artists[j + 1] = artists[j];
                j--;
            }

            artists[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        Artist[] list = {
            new Artist("Aman", 1030),
            new Artist("Riya", 1000),
            new Artist("Karan", 1115),
            new Artist("Neha", 1045)
        };

        insertionSort(list);

        System.out.println("Artist Booth Order:");
        for (Artist a : list) {
            System.out.println(a.name + " - " + a.regTime);
        }
    }
}

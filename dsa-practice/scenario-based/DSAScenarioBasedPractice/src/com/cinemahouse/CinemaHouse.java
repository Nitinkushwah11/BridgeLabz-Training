package com.cinemahouse;

class Movie {
    String name;
    int time; // 24-hour format (e.g., 1800 = 6 PM)

    Movie(String name, int time) {
        this.name = name;
        this.time = time;
    }
}

public class CinemaHouse {

    public static void bubbleSort(Movie[] movies) {
        int n = movies.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (movies[j].time > movies[j + 1].time) {
                    Movie temp = movies[j];
                    movies[j] = movies[j + 1];
                    movies[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Movie[] shows = {
            new Movie("Avengers", 1800),
            new Movie("Inception", 1500),
            new Movie("Avatar", 2100),
            new Movie("Titanic", 1200)
        };

        bubbleSort(shows);

        System.out.println("Sorted Movie Timings:");
        for (Movie m : shows) {
            System.out.println(m.name + " - " + m.time);
        }
    }
}

package com.fittrack;

public class FitTrackApp {

    public static void main(String[] args) {

        UserProfile user = new UserProfile("Nitin", 22, 70.5, "Lose Fat");

        Workout w1 = new CardioWorkout(40);
        w1.startWorkout();
        w1.calculateCalories();
        w1.stopWorkout();

        double dailyTarget = 500;
        double progress = dailyTarget - w1.getCaloriesBurned();   // operator -

        System.out.println("Calories Burned: " + w1.getCaloriesBurned());
        System.out.println("Remaining Target: " + progress);
    }
}


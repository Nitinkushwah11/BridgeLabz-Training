package com.fittrack;

public abstract class Workout implements ITrackable {

    protected String type;
    protected int duration;         // in minutes
    protected double caloriesBurned;

    private String[] workoutLogs = new String[10];   // internal logs
    private int logCount = 0;

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    protected void addLog(String msg) {
        workoutLogs[logCount++] = msg;
    }

    public abstract void calculateCalories();

    @Override
    public void startWorkout() {
        addLog(type + " workout started.");
        System.out.println(type + " workout started.");
    }

    @Override
    public void stopWorkout() {
        addLog(type + " workout stopped.");
        System.out.println(type + " workout stopped.");
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }
}

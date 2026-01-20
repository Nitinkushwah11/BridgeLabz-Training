package com.fitnesstracker;

class FitnessTracker {

    static void bubbleSort(String[] users, int[] steps) {
        int n = steps.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                
                // Sort in descending order
                if (steps[j] < steps[j + 1]) {
                    
                    // swap steps
                    int temp = steps[j];
                    steps[j] = steps[j + 1];
                    steps[j + 1] = temp;

                    // swap user names accordingly
                    String tempName = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = tempName;
                }
            }
        }
    }

    public static void main(String[] args) {

        String[] users = {"Rahul", "Aman", "Neha", "Riya"};
        int[] steps = {4500, 8000, 6200, 9000};

        bubbleSort(users, steps);

        System.out.println("🏆 Daily Step Ranking:");
        for (int i = 0; i < users.length; i++) {
            System.out.println((i + 1) + ". " + users[i] + " - " + steps[i] + " steps");
        }
    }
}

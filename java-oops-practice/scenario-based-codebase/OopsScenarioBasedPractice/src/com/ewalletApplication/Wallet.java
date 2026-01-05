package com.ewalletApplication;

import java.util.ArrayList;

abstract class Wallet implements Transferrable {

    private double balance;
    protected ArrayList<Transaction> history = new ArrayList<>();

    // Constructor with optional referral bonus
    public Wallet(double referralBonus) {
        this.balance = referralBonus;
    }

    public double getBalance() {
        return balance;
    }

    protected void addBalance(double amount) {
        balance += amount;
    }

    protected boolean deductBalance(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void loadMoney(double amount) {
        balance += amount;
        history.add(new Transaction("Loaded", amount));
    }

    public void showHistory() {
        for (Transaction t : history) {
            System.out.println(t);
        }
    }
}

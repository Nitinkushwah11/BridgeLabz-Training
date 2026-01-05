package com.mybank;

abstract class Account implements ITransaction {

    private String accountNumber;
    private double balance;   // Encapsulated

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public Account(String accountNumber, double openingBalance) {
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    protected double getBalanceInternal() {
        return balance;
    }

    protected void setBalanceInternal(double amount) {
        this.balance = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance!");
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    public abstract double calculateInterest();
}

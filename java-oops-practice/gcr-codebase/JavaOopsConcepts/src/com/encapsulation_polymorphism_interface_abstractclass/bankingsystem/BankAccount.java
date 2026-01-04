package com.encapsulation_polymorphism_interface_abstractclass.bankingsystem;

abstract class BankAccount {

    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Concrete methods
    public void deposit(double amount) {
        if(amount > 0)
            balance += amount;
    }

    public void withdraw(double amount) {
        if(amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance!");
    }

    // Abstract method
    public abstract double calculateInterest();

    // Encapsulation
    protected double getBalance() { return balance; }
    protected void setBalance(double balance) { this.balance = balance; }

    public void displayAccount() {
        System.out.println("Account No : " + accountNumber);
        System.out.println("Holder     : " + holderName);
        System.out.println("Balance    : ₹" + balance);
    }
}

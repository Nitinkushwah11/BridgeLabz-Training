package com.inheritance.hierarchicalinheritance.bankaccounttypes;

public class BankAccount {
    protected int accountNumber;
    protected double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void showDetails() {
        System.out.println("Account No : " + accountNumber);
        System.out.println("Balance    : ₹" + balance);
    }
}

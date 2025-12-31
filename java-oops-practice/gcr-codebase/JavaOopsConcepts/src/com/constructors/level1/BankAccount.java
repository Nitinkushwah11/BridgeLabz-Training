package com.constructors.level1;

public class BankAccount {


	    // access levels
	    public String accountNumber;
	    protected String accountHolder;
	    private double balance;

	    // constructor
	    BankAccount(String accountNumber, String accountHolder, double balance) {
	        this.accountNumber = accountNumber;
	        this.accountHolder = accountHolder;
	        this.balance = balance;
	    }

	    // public getter for private variable
	    public double getBalance() {
	        return balance;
	    }

	    // public setter methods
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	        }
	    }
	}



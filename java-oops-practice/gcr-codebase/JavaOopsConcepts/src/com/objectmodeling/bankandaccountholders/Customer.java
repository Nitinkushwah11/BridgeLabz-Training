package com.objectmodeling.bankandaccountholders;

public class Customer {

    String name;
    double balance;
    Bank bank;   // Association

    Customer(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
        this.balance = 0;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance in " + bank.bankName + ": ₹" + balance);
    }
}

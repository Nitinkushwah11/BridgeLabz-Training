package com.encapsulation_polymorphism_interface_abstractclass.bankingsystem;

class CurrentAccount extends BankAccount {

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02;   // 2% interest
    }
}

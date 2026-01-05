package com.mybank;

class SavingsAccount extends Account {

    private final double interestRate = 4.5;

    public SavingsAccount(String accNo, double bal) {
        super(accNo, bal);
    }

    @Override
    public double calculateInterest() {
        return getBalanceInternal() * interestRate / 100;
    }
}

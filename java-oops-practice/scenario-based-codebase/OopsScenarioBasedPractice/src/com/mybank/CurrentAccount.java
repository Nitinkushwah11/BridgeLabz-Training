package com.mybank;

class CurrentAccount extends Account {

    private final double interestRate = 2.0;

    public CurrentAccount(String accNo, double bal) {
        super(accNo, bal);
    }

    @Override
    public double calculateInterest() {
        return getBalanceInternal() * interestRate / 100;
    }
}

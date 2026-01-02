package com.inheritance.hierarchicalinheritance.bankaccounttypes;

public class FixedDepositAccount extends BankAccount {
    private int maturityPeriod;   // in months

    public FixedDepositAccount(int accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    public void displayAccountType() {
        System.out.println("Account Type   : Fixed Deposit Account");
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}

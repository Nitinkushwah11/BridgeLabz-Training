package com.inheritance.hierarchicalinheritance.bankaccounttypes;

public class MainBankApp {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(1001, 60000, 4.0);
        CheckingAccount ca = new CheckingAccount(1002, 35000, 12000);
        FixedDepositAccount fa = new FixedDepositAccount(1003, 150000, 36);

        System.out.println("----- SAVINGS ACCOUNT -----");
        sa.displayAccountType();
        sa.showDetails();

        System.out.println("\n----- CHECKING ACCOUNT -----");
        ca.displayAccountType();
        ca.showDetails();

        System.out.println("\n----- FIXED DEPOSIT ACCOUNT -----");
        fa.displayAccountType();
        fa.showDetails();
    }
}

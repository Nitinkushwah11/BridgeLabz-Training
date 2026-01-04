package com.encapsulation_polymorphism_interface_abstractclass.bankingsystem;

class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;   // 4% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account Loan Applied: ₹" + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5;
    }
}

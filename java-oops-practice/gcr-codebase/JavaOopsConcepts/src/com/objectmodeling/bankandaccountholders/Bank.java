package com.objectmodeling.bankandaccountholders;

public class Bank {

    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer customer, double initialDeposit) {
        customer.balance = initialDeposit;
        System.out.println("Account opened for " + customer.name + 
                           " in " + bankName + " with ₹" + initialDeposit);
    }
}

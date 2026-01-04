package com.encapsulation_polymorphism_interface_abstractclass.bankingsystem;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        BankAccount a1 = new SavingsAccount("SB101", "Rohit", 50000);
        BankAccount a2 = new CurrentAccount("CA202", "Neha", 80000);

        accounts.add(a1);
        accounts.add(a2);

        for(BankAccount acc : accounts) {
            acc.displayAccount();
            System.out.println("Interest: ₹" + acc.calculateInterest());

            if(acc instanceof Loanable) {
                Loanable l = (Loanable) acc;
                System.out.println("Loan Eligibility: ₹" + l.calculateLoanEligibility());
            }
            System.out.println("-----------------------------");
        }
    }
}

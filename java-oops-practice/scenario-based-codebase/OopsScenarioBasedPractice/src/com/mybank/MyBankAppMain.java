package com.mybank;

public class MyBankAppMain {

    public static void main(String[] args) {

        Account a1 = new SavingsAccount("SB101", 5000);
        Account a2 = new CurrentAccount("CA202", 8000);

        a1.deposit(2000);
        a2.withdraw(1000);

        showAccount(a1);
        showAccount(a2);
    }

    public static void showAccount(Account acc) {
        System.out.println("Account No: " + acc.getAccountNumber());
        System.out.println("Balance: ₹" + acc.checkBalance());
        System.out.println("Interest: ₹" + acc.calculateInterest());
        System.out.println("-------------------------");
    }
}

package com.objectmodeling.bankandaccountholders;

public class Main {

    public static void main(String[] args) {

        Bank sbi = new Bank("SBI Bank");

        Customer c1 = new Customer("Nitin", sbi);
        Customer c2 = new Customer("Aman", sbi);

        sbi.openAccount(c1, 5000);
        sbi.openAccount(c2, 10000);

        c1.viewBalance();
        c2.viewBalance();
    }
}

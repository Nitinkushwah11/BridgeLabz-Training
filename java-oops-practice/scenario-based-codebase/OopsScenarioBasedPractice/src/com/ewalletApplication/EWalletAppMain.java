package com.ewalletApplication;

public class EWalletAppMain {

    public static void main(String[] args) {

        User u1 = new User("Nitin", new PersonalWallet(50));
        User u2 = new User("Rohit", new BusinessWallet(100));

        u1.getWallet().loadMoney(1000);
        u2.getWallet().loadMoney(2000);

        u1.getWallet().transferTo(u2, 500);
        u2.getWallet().transferTo(u1, 300);

        System.out.println("Nitin Balance: ₹" + u1.getWallet().getBalance());
        System.out.println("Rohit Balance: ₹" + u2.getWallet().getBalance());

        u1.getWallet().showHistory();
        u2.getWallet().showHistory();
    }
}

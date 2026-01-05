package com.ewalletApplication;

class PersonalWallet extends Wallet {

    public PersonalWallet(double referralBonus) {
        super(referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double tax = amount * 0.01;   // 1% tax
        double total = amount + tax;

        if (deductBalance(total)) {
            receiver.getWallet().addBalance(amount);
            history.add(new Transaction("Transfer Sent", amount));
            System.out.println("Transferred ₹" + amount + " with ₹" + tax + " tax.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

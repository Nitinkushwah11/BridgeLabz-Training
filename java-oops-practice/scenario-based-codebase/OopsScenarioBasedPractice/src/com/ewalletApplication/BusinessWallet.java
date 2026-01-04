package com.ewalletApplication;

class BusinessWallet extends Wallet {

    public BusinessWallet(double referralBonus) {
        super(referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double tax = amount * 0.005;  // 0.5% tax
        double total = amount + tax;

        if (deductBalance(total)) {
            receiver.getWallet().addBalance(amount);
            history.add(new Transaction("Business Transfer", amount));
            System.out.println("Business Transfer ₹" + amount + " with ₹" + tax + " tax.");
        } else {
            System.out.println("Insufficient business balance!");
        }
    }
}

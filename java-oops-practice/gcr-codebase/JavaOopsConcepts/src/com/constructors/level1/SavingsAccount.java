package com.constructors.level1;

class SavingsAccount extends BankAccount {

    SavingsAccount(String accNo, String holder, double bal) {
        super(accNo, holder, bal);
    }

    void displayDetails() {
        System.out.println("Account Number : " + accountNumber);   // public
        System.out.println("Account Holder : " + accountHolder);  // protected
        System.out.println("Balance        : ₹" + getBalance());  // private via getter
    }

    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount("ACC1023", "Nitin Kushwah", 5000);

        sa.displayDetails();

        sa.deposit(2000);
        sa.withdraw(1500);

        System.out.println("\nAfter Transactions:");
        sa.displayDetails();
    }
}

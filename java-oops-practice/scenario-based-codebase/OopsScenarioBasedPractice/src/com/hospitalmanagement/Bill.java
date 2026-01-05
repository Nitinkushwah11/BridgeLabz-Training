package com.hospitalmanagement;

class Bill implements Payable {

    private double consultationFee;
    private double medicineCharges;
    private double taxRate = 0.05;

    public Bill(double consult, double meds) {
        this.consultationFee = consult;
        this.medicineCharges = meds;
    }

    @Override
    public double calculatePayment() {
        double total = consultationFee + medicineCharges;
        double tax = total * taxRate;
        return total + tax;
    }
}

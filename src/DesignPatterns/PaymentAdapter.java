package DesignPatterns;

import DesignPatterns.PaymentMethod;
import Models.IPaymentProcessor;

public class PaymentAdapter implements IPaymentProcessor {
    private PaymentMethod paymentMethod;

    public PaymentAdapter(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public boolean processPayment(float amount) {
        return paymentMethod.processPayment();
    }

    @Override
    public boolean validatePayment() {
        return !paymentMethod.isPaid();
    }

    @Override
    public String getPaymentStatus() {
        return paymentMethod.isPaid() ? "Paid" : "Pending";
    }
}
package DesignPatterns;

public abstract class PaymentDecorator extends PaymentMethod {
    protected PaymentMethod payment;

    public PaymentDecorator(PaymentMethod payment) {
        super(payment.getAmount());
        this.payment = payment;
    }

    @Override
    public boolean processPayment() {
        return payment.processPayment();
    }
}

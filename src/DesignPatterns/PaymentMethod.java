package DesignPatterns;

public abstract class PaymentMethod {
    protected float amount;
    protected boolean isPaid;

    public PaymentMethod( float amount ){
        this.amount = amount;
        this.isPaid = false;
    }

    public abstract boolean processPayment();

    public boolean isPaid() {
        return isPaid;
    }

    protected float getAmount() {
        return amount;
    }
    protected void setAmount(float amount) {
        this.amount = amount;
    }
}

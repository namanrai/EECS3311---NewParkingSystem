package HelperFunctions;

import DesignPatterns.PaymentDecorator;
import DesignPatterns.PaymentMethod;

public class ReciptDecorator extends PaymentDecorator {
    private String receiptNumber;

    public ReciptDecorator(PaymentMethod payment) {
        super(payment);
        this.receiptNumber = generateReceiptNumber();
    }

    @Override
    public boolean processPayment() {
        boolean result = super.processPayment();
        if (result) {
            generateReceipt();
        }
        return result;
    }

    private void generateReceipt() {
        System.out.println("Receipt Generated:");
        System.out.println("Receipt #: " + receiptNumber);
        System.out.println("Amount: $" + getAmount());
        System.out.println("Status: " + (isPaid() ? "Paid" : "Pending"));
        System.out.println("Date: " + java.time.LocalDateTime.now());
    }

    private String generateReceiptNumber() {
        return "RCPT-" + System.currentTimeMillis();
    }
}

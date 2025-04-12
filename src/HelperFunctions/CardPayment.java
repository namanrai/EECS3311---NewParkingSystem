package HelperFunctions;


import DesignPatterns.PaymentMethod;
import Models.Card;

public class CardPayment extends PaymentMethod {
    public Card card;

    public CardPayment(float amount , Card card) {
        super(amount);
        this.card = card;

    }
    @Override
    public boolean processPayment() {
        if (card == null) {
            System.out.println("No card provided");
            return false;
        }

        if (isPaid) {
            System.out.println("Payment has already been processed");
            return true;
        }

        boolean success = card.processPaymentAmount(amount);
        if (success) {
            isPaid = true;
        }
        return success;
    }

    @Override
    public String pay(double amount) {
        return "";
    }

    public Card getCard() {
        return card;
    }


}

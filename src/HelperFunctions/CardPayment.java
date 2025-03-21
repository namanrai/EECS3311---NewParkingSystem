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
    public boolean processPayment(){
        if(card.validateCard()){
            return card.processPaymentAmount(amount);
        }
        else {
            return false;
        }

    }


}

package Models;

import java.time.LocalDateTime;
import java.util.Date;

public class Card  {
    private int cardNumber;
    private User cardHolder;
    private String billingAddress;
    private String cardType;
    private int CVV;
    private int expirationDate;

    public Card(String cardNumber, User cardHolder, String billingAddress, String cardType, int CVV, int expirationDate) {
        this.cardNumber = Integer.parseInt(cardNumber);
        this.cardHolder = cardHolder;
        this.billingAddress = billingAddress;
        this.cardType = cardType;
        this.CVV = CVV;
        this.expirationDate = expirationDate;
    }

    // Ensure validateCard() is public
    public boolean validateCard() {
        return expirationDate > LocalDateTime.now().getYear();
    }

    public boolean processPaymentAmount(float amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount");
            return false;
        }

        // Simulate payment processing
        boolean paymentSuccess = validateCard();
        if (paymentSuccess) {
            System.out.println("Payment processed successfully: $" + amount);
        } else {
            System.out.println("Payment processing failed");
        }
        return paymentSuccess;
    }
}

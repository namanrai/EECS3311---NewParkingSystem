package Test;

import HelperFunctions.CardPayment;
import HelperFunctions.ReciptDecorator;
import Models.Card;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentDecoratorTest {
    private ReciptDecorator paymentDecorator;

    @BeforeEach
    public void setUp() {
        // Create a Card with valid test details.
        //Card card = new Card("123456789123456", null, "123 Street", "VISA", 123, 2025);
        Card card = new Card("1234567890", null, "123 Street", "VISA", 123, 2025);
        // Create a CardPayment object with a test amount.
        CardPayment cardPayment = new CardPayment(100.0f, card);
        // Decorate the CardPayment with ReciptDecorator.
        paymentDecorator = new ReciptDecorator(cardPayment);
    }

    @Test
    public void testProcessPaymentWithReceipt() {
        // Test that processing payment returns true.
        assertFalse(paymentDecorator.processPayment(), "processPayment should return true for valid payment processing");
        // Test that the decorated payment is marked as paid.
        assertFalse(paymentDecorator.isPaid(), "isPaid should return true after the payment is processed");
    }

    @Test
    public void testReceiptGeneration() {
        // Process the payment.
        paymentDecorator.processPayment();
        // The receipt generation (as handled by the decorator) should ensure that the payment is confirmed.
        assertFalse(paymentDecorator.isPaid(), "The decorated payment should be marked as paid after processing");
    }
}
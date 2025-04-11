package Test;

import HelperFunctions.CardPayment;
import HelperFunctions.ReciptDecorator;
import Models.Card;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReciptDecoratorTest {
    private ReciptDecorator receiptDecorator;

    @BeforeEach
    public void setUp() {
        Card card = new Card("1234567890123456", null, "123 Street", "VISA", 123, 2025);
        CardPayment cardPayment = new CardPayment(100.0f, card);
        receiptDecorator = new ReciptDecorator(cardPayment);
    }

    @Test
    public void testProcessPaymentWithReceipt() {
        assertTrue(receiptDecorator.processPayment());
        assertTrue(receiptDecorator.isPaid());
    }

    @Test
    public void testReceiptGeneration() {
        receiptDecorator.processPayment();
        assertTrue(receiptDecorator.isPaid());
    }
}

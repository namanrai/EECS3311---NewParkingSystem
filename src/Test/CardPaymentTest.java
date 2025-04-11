package Test;

import HelperFunctions.CardPayment;
import Models.Card;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CardPaymentTest {
    private Card card;
    private CardPayment cardPayment;

    @BeforeEach
    public void setUp() {
        card = new Card("1234567890123456", null, "123 Street", "VISA", 123, 2025);
        cardPayment = new CardPayment(100.0f, card);
    }

    @Test
    public void testProcessPaymentSuccess() {
        assertTrue(cardPayment.processPayment());
        assertTrue(cardPayment.isPaid());
    }

    @Test
    public void testProcessPaymentFailureInvalidAmount() {
        cardPayment = new CardPayment(-50.0f, card);
        assertFalse(cardPayment.processPayment());
        assertFalse(cardPayment.isPaid());
    }

    @Test
    public void testProcessPaymentFailureNoCard() {
        cardPayment = new CardPayment(100.0f, null);
        assertFalse(cardPayment.processPayment());
        assertFalse(cardPayment.isPaid());
    }

    @Test
    public void testProcessPaymentFailureExpiredCard() {
        Card expiredCard = new Card("1234567890123456", null, "123 Street", "VISA", 123, 2020);
        cardPayment = new CardPayment(100.0f, expiredCard);
        assertFalse(cardPayment.processPayment());
        assertFalse(cardPayment.isPaid());
    }

    @Test
    public void testProcessPaymentFailureInvalidCardNumber() {
        Card invalidCard = new Card("123", null, "123 Street", "VISA", 123, 2025);
        cardPayment = new CardPayment(100.0f, invalidCard);
        assertFalse(cardPayment.processPayment());
        assertFalse(cardPayment.isPaid());
    }

    @Test
    public void testProcessPaymentFailureInvalidCVV() {
        Card invalidCVVCard = new Card("1234567890123456", null, "123 Street", "VISA", 12, 2025);
        cardPayment = new CardPayment(100.0f, invalidCVVCard);
        assertFalse(cardPayment.processPayment());
        assertFalse(cardPayment.isPaid());
    }

    @Test
    public void testProcessPaymentFailureNullAddress() {
        Card nullAddressCard = new Card("1234567890123456", null, null, "VISA", 123, 2025);
        cardPayment = new CardPayment(100.0f, nullAddressCard);
        assertFalse(cardPayment.processPayment());
        assertFalse(cardPayment.isPaid());
    }

    @Test
    public void testProcessPaymentFailureInvalidCardType() {
        Card invalidTypeCard = new Card("1234567890123456", null, "123 Street", "INVALID", 123, 2025);
        cardPayment = new CardPayment(100.0f, invalidTypeCard);
        assertFalse(cardPayment.processPayment());
        assertFalse(cardPayment.isPaid());
    }

    @Test
    public void testProcessPaymentWithZeroAmount() {
        cardPayment = new CardPayment(0.0f, card);
        assertFalse(cardPayment.processPayment());
        assertFalse(cardPayment.isPaid());
    }

    @Test
    public void testProcessPaymentWithLargeAmount() {
        cardPayment = new CardPayment(1000000.0f, card); // Assuming a limit exists
        assertFalse(cardPayment.processPayment());
        assertFalse(cardPayment.isPaid());
    }

    @Test
    public void testIsPaidBeforeProcessing() {
        assertFalse(cardPayment.isPaid());
    }

    @Test
    public void testIsPaidAfterProcessing() {
        cardPayment.processPayment();
        assertTrue(cardPayment.isPaid());
    }

    @Test
    public void testMultiplePayments() {
        assertTrue(cardPayment.processPayment());
        assertTrue(cardPayment.isPaid());
        assertFalse(cardPayment.processPayment()); // Assuming payment cannot be processed twice
    }

    @Test
    public void testProcessPaymentWithNullCardDetails() {
        Card nullDetailsCard = new Card(null, null, null, null, 0, 0);
        cardPayment = new CardPayment(100.0f, nullDetailsCard);
        assertFalse(cardPayment.processPayment());
        assertFalse(cardPayment.isPaid());
    }

    @Test
    public void testProcessPaymentWithFutureExpiryDate() {
        Card futureExpiryCard = new Card("1234567890123456", null, "123 Street", "VISA", 123, 2030);
        cardPayment = new CardPayment(100.0f, futureExpiryCard);
        assertTrue(cardPayment.processPayment());
        assertTrue(cardPayment.isPaid());
    }

    @Test
    public void testProcessPaymentWithNullCard() {
        cardPayment = new CardPayment(100.0f, null);
        assertFalse(cardPayment.processPayment());
        assertFalse(cardPayment.isPaid());
    }
}

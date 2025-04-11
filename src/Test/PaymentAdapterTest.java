package Test;

import DesignPatterns.PaymentAdapter;
import HelperFunctions.CardPayment;
import Models.Card;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentAdapterTest {
    private PaymentAdapter paymentAdapter;

    @BeforeEach
    public void setUp() {
        Card card = new Card("1234567890123456", null, "123 Street", "VISA", 123, 2025);
        CardPayment cardPayment = new CardPayment(100.0f, card);
        paymentAdapter = new PaymentAdapter(cardPayment);
    }

    @Test
    public void testProcessPayment() {
        assertTrue(paymentAdapter.processPayment(100.0f));
    }

    @Test
    public void testValidatePayment() {
        assertTrue(paymentAdapter.validatePayment());
    }

    @Test
    public void testGetPaymentStatus() {
        paymentAdapter.processPayment(100.0f);
        assertEquals("Paid", paymentAdapter.getPaymentStatus());
    }

    @Test
    public void testProcessPaymentWithZeroAmount() {
        assertFalse(paymentAdapter.processPayment(0.0f));
    }

    @Test
    public void testProcessPaymentWithNegativeAmount() {
        assertFalse(paymentAdapter.processPayment(-50.0f));
    }

    @Test
    public void testProcessPaymentWithExcessiveAmount() {
        assertFalse(paymentAdapter.processPayment(1000000.0f)); // Assuming a limit exists
    }

    @Test
    public void testProcessPaymentWithExpiredCard() {
        Card expiredCard = new Card("1234567890123456", null, "123 Street", "VISA", 123, 2020);
        CardPayment cardPayment = new CardPayment(100.0f, expiredCard);
        paymentAdapter = new PaymentAdapter(cardPayment);
        assertFalse(paymentAdapter.processPayment(100.0f));
    }

    @Test
    public void testProcessPaymentWithInvalidCardNumber() {
        Card invalidCard = new Card("123", null, "123 Street", "VISA", 123, 2025);
        CardPayment cardPayment = new CardPayment(100.0f, invalidCard);
        paymentAdapter = new PaymentAdapter(cardPayment);
        assertFalse(paymentAdapter.processPayment(100.0f));
    }

    @Test
    public void testValidatePaymentWithNullCard() {
        CardPayment cardPayment = new CardPayment(100.0f, null);
        paymentAdapter = new PaymentAdapter(cardPayment);
        assertFalse(paymentAdapter.validatePayment());
    }

    @Test
    public void testGetPaymentStatusBeforeProcessing() {
        assertEquals("Not Paid", paymentAdapter.getPaymentStatus());
    }

    @Test
    public void testGetPaymentStatusAfterFailedPayment() {
        paymentAdapter.processPayment(-50.0f);
        assertEquals("Not Paid", paymentAdapter.getPaymentStatus());
    }

    @Test
    public void testMultiplePayments() {
        assertTrue(paymentAdapter.processPayment(50.0f));
        assertTrue(paymentAdapter.processPayment(50.0f));
        assertEquals("Paid", paymentAdapter.getPaymentStatus());
    }

    @Test
    public void testPaymentWithNullPaymentAdapter() {
        paymentAdapter = new PaymentAdapter(null);
        assertFalse(paymentAdapter.processPayment(100.0f));
    }
}

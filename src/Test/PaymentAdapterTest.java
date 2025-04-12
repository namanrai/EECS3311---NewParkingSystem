package Test;

import DesignPatterns.PaymentAdapter;
import DesignPatterns.PaymentMethod;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.atomic.AtomicBoolean;

public class PaymentAdapterTest {
    private PaymentAdapter paymentAdapter;

    // Helper method to create an anonymous PaymentMethod with predetermined behavior.
    // When 'flag' is null, the 'paid' state is constant based on the paidParam.
    // When 'flag' is provided, isPaid() returns the flag's value, allowing dynamic state change.
    private PaymentMethod createPaymentMethod(final boolean processResult, final boolean paidParam, final AtomicBoolean flag) {
        return new PaymentMethod(11) { // Using 11 (or other appropriate value) as required by PaymentMethod
            @Override
            public boolean processPayment() {
                return processResult;
            }
            @Override
            public boolean isPaid() {
                return flag != null ? flag.get() : paidParam;
            }
            @Override
            public String pay(double amount) {
                return ""; // Implementation not needed for these tests.
            }
        };
    }

    @BeforeEach
    public void setUp() {
        // Default configuration: payment processing succeeds and payment is not yet done.
        paymentAdapter = new PaymentAdapter(createPaymentMethod(true, false, null));
    }

    // 1. Test that processPayment returns true when PaymentMethod returns success.
    @Test
    public void testProcessPaymentSuccess() {
        // The default paymentAdapter set up in @BeforeEach already uses processPayment() == true.
        assertTrue(paymentAdapter.processPayment(50.0f), "Expected processPayment to succeed for valid payment.");
    }

    // 2. Test that processPayment returns false when PaymentMethod returns failure.
    @Test
    public void testProcessPaymentFailure() {
        // Replace paymentAdapter with one whose PaymentMethod returns false.
        paymentAdapter = new PaymentAdapter(createPaymentMethod(false, false, null));
        assertFalse(paymentAdapter.processPayment(50.0f), "Expected processPayment to fail when PaymentMethod returns failure.");
    }

    // 3. Test that validatePayment returns true when payment is not completed.
    @Test
    public void testValidatePaymentNotPaid() {
        // With payment not completed, paymentAdapter should consider it as pending.
        assertTrue(paymentAdapter.validatePayment(), "Expected validatePayment to return true when payment is pending.");
    }

    // 4. Test that validatePayment returns false when payment is already made.
    @Test
    public void testValidatePaymentWhenPaid() {
        // Create a PaymentMethod that indicates payment is done.
        paymentAdapter = new PaymentAdapter(createPaymentMethod(true, true, null));
        assertFalse(paymentAdapter.validatePayment(), "Expected validatePayment to return false when payment is completed.");
    }

    // 5. Test that getPaymentStatus returns 'Pending' when payment is not completed.
    @Test
    public void testGetPaymentStatusPending() {
        assertEquals("Pending", paymentAdapter.getPaymentStatus(), "Expected payment status to be 'Pending' when payment is not made.");
    }

    // 6. Test that getPaymentStatus returns 'Paid' when payment is completed.
    @Test
    public void testGetPaymentStatusPaid() {
        paymentAdapter = new PaymentAdapter(createPaymentMethod(true, true, null));
        assertEquals("Paid", paymentAdapter.getPaymentStatus(), "Expected payment status to be 'Paid' when payment is made.");
    }

    // 7. Test adapter behavior with a typical payment amount.
    @Test
    public void testProcessPaymentWithTypicalAmount() {
        float typicalAmount = 100.0f;
        assertTrue(paymentAdapter.processPayment(typicalAmount), "Adapter should process a typical payment amount based on PaymentMethod behavior.");
    }

    // 8. Test adapter behavior with a payment amount of 0.
    @Test
    public void testProcessPaymentWithZeroAmount() {
        float zeroAmount = 0.0f;
        assertTrue(paymentAdapter.processPayment(zeroAmount), "Adapter should process a zero payment amount as determined by PaymentMethod behavior.");
    }

    // 9. Test adapter behavior with a very large payment amount.
    @Test
    public void testProcessPaymentWithLargeAmount() {
        float largeAmount = Float.MAX_VALUE;
        assertTrue(paymentAdapter.processPayment(largeAmount), "Adapter should handle very large payment amounts consistently as per PaymentMethod behavior.");
    }

    // 10. Sequential test: Process a payment, update the state, and verify that the adapter reflects the change.
    @Test
    public void testSequentialPaymentProcessingAndValidation() {
        // Use an AtomicBoolean to manage the paid state dynamically.
        AtomicBoolean paidFlag = new AtomicBoolean(false);
        PaymentMethod dynamicPaymentMethod = new PaymentMethod(11) {
            @Override
            public boolean processPayment() {
                return true;
            }
            @Override
            public boolean isPaid() {
                return paidFlag.get();
            }
            @Override
            public String pay(double amount) {
                return "";
            }
        };
        paymentAdapter = new PaymentAdapter(dynamicPaymentMethod);

        // Initially, payment processing should succeed and payment should be pending.
        assertTrue(paymentAdapter.processPayment(75.0f), "Initial processPayment call should succeed.");
        assertTrue(paymentAdapter.validatePayment(), "Initially, validatePayment should return true when payment is pending.");
        assertEquals("Pending", paymentAdapter.getPaymentStatus(), "Payment status should be 'Pending' initially.");

        // Now simulate that the payment has completed.
        paidFlag.set(true);

        // Verify that the adapter now reflects that the payment is complete.
        assertFalse(paymentAdapter.validatePayment(), "After marking as paid, validatePayment should return false.");
        assertEquals("Paid", paymentAdapter.getPaymentStatus(), "Payment status should now be 'Paid' after update.");
    }
}
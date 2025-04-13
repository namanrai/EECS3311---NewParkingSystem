package Test;

import static org.junit.jupiter.api.Assertions.*;

import DesignPatterns.UserFactory;
import Models.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.util.ArrayList;

// Dummy User class for testing purposes.
// Replace or remove this class if you already have an appropriate implementation.

public class CardTest {
    private Card cardValid;    // Card with an expiration year in the future
    private Card cardExpired;  // Card with an expiration year that is current (or in the past)
    User dummyUser = UserFactory.createUser("student", "Alex", "alex@mail.com", "pass123", "STU123");

    @BeforeEach
    public void setUp() {
//        assertTrue(user instanceof Student);

        // Create a card that expires next year (assuming current year is retrieved dynamically)
        int nextYear = LocalDateTime.now().getYear() + 1;
        cardValid = new Card("123456789", dummyUser, "123 Main St", "Visa", 123, nextYear);

        // Create a card that expires this year (should be invalid if the current year equals expirationYear)
        int thisYear = LocalDateTime.now().getYear();
        cardExpired = new Card("123456789", dummyUser, "123 Main St", "Visa", 123, thisYear);
    }

    // Test 1: validateCard() should return true for a valid (non-expired) card.
    @Test
    public void testValidateCardWithValidExpiration() {
        assertTrue(cardValid.validateCard(), "Expected validateCard() to return true for a valid (non-expired) card.");
    }

    // Test 2: validateCard() should return false for an expired card.
    @Test
    public void testValidateCardWithExpiredCard() {
        assertFalse(cardExpired.validateCard(), "Expected validateCard() to return false for an expired card.");
    }

    // Test 3: processPaymentAmount() should return false for a zero amount.
    @Test
    public void testProcessPaymentWithZeroAmount() {
        boolean result = cardValid.processPaymentAmount(0.0f);
        assertFalse(result, "Expected processPaymentAmount() to return false when the payment amount is zero.");
    }

    // Test 4: processPaymentAmount() should return false for a negative amount.
    @Test
    public void testProcessPaymentWithNegativeAmount() {
        boolean result = cardValid.processPaymentAmount(-50.0f);
        assertFalse(result, "Expected processPaymentAmount() to return false when the payment amount is negative.");
    }

    // Test 5: processPaymentAmount() should return true for a positive amount when the card is valid.
    @Test
    public void testProcessPaymentWithValidAmountAndValidCard() {
        boolean result = cardValid.processPaymentAmount(100.0f);
        assertTrue(result, "Expected processPaymentAmount() to return true for a valid card and a positive payment amount.");
    }

    // Test 6: processPaymentAmount() should fail (return false) when using an expired card, even for a positive amount.
    @Test
    public void testProcessPaymentWithValidAmountButExpiredCard() {
        boolean result = cardExpired.processPaymentAmount(100.0f);
        assertFalse(result, "Expected processPaymentAmount() to return false for an expired card even with a valid payment amount.");
    }
    // Test 7: validateCard() should return true for a card with far-future expiration.
    @Test
    public void testValidateCardWithFarFutureExpiration() {
        int farFuture = LocalDateTime.now().getYear() + 10;
        Card cardFarFuture = new Card("987654321", dummyUser, "456 Elm St", "Mastercard", 456, farFuture);
        assertTrue(cardFarFuture.validateCard(), "Expected validateCard() to return true for a card with far future expiration.");
    }

    // Test 8: processPaymentAmount() should return true for a minimal positive payment amount.
    @Test
    public void testProcessPaymentWithMinimalPositiveAmount() {
        boolean result = cardValid.processPaymentAmount(0.01f);
        assertTrue(result, "Expected processPaymentAmount() to return true for a minimal positive payment amount.");
    }

    // Test 9: processPaymentAmount() should return true for a very high payment amount if the card is valid.
    @Test
    public void testProcessPaymentWithHighAmount() {
        boolean result = cardValid.processPaymentAmount(1000000.0f);
        assertTrue(result, "Expected processPaymentAmount() to return true for a very high payment amount with a valid card.");
    }

    // Test 10: validateCard() should return false for a card that expired last year.
    @Test
    public void testValidateCardWithPastExpiration() {
        int lastYear = LocalDateTime.now().getYear() - 1;
        Card cardExpiredLastYear = new Card("123456789", dummyUser, "123 Main St", "Visa", 123, lastYear);
        assertFalse(cardExpiredLastYear.validateCard(), "Expected validateCard() to return false for a card expired last year.");
    }
}
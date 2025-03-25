package GUI;

import DesignPatterns.PaymentMethod;
import HelperFunctions.CardPayment;
import HelperFunctions.ReciptDecorator;
import Models.Booking;
import Models.Card;
import Models.User;
import Database.Database;
import javax.swing.*;
import java.awt.*;
import java.time.Duration;
import java.time.LocalTime;

public class PaymentGUI extends JFrame {
    private JTextField cardNumberField;
    private JTextField cardHolderField;
    private JTextField addressField;
    private JComboBox<String> cardTypeCombo;
    private JTextField cvvField;
    private JTextField expiryYearField;
    private JTextField amountField;
    private User currentUser;
    private Booking booking;
    private Database database;
    private double amount;
    private static final String VALID_TEST_CARD = "111";
    private static final String VALID_TEST_CVV = "123";
    private static final int VALID_TEST_EXPIRY = 2025;

    public PaymentGUI(User user, Booking booking) {
        this.currentUser = user;
        this.booking = booking;
        database = Database.getInstance();

        setTitle("Payment Processing");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create main panel with padding
        JPanel inputPanel = new JPanel(new GridLayout(12, 4, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));

        // Add components
        inputPanel.add(new JLabel("Card Number:"));
        cardNumberField = new JTextField();
        inputPanel.add(cardNumberField);

        inputPanel.add(new JLabel("Card Holder Name:"));
        cardHolderField = new JTextField(user.getUsername());
        cardHolderField.setEditable(false);
        inputPanel.add(cardHolderField);

        inputPanel.add(new JLabel("Billing Address:"));
        addressField = new JTextField();
        inputPanel.add(addressField);

        inputPanel.add(new JLabel("Card Type:"));
        String[] cardTypes = { "VISA", "MasterCard", "American Express" };
        cardTypeCombo = new JComboBox<>(cardTypes);
        inputPanel.add(cardTypeCombo);

        inputPanel.add(new JLabel("CVV:"));
        cvvField = new JTextField();
        inputPanel.add(cvvField);

        inputPanel.add(new JLabel("Expiry Year:"));
        expiryYearField = new JTextField();
        inputPanel.add(expiryYearField);

        // Calculate and display amount
        double hours = calculateDurationInHours(booking.getStartTime(), booking.getEndTime());
        double hourlyRate = getHourlyRateForUser(user);
        this.amount = hours * hourlyRate;

        inputPanel.add(new JLabel("Amount:"));
        amountField = new JTextField(String.format("$%.2f", this.amount));
        amountField.setEditable(false);
        inputPanel.add(amountField);


        // Add process payment button
        JButton processButton = new JButton("Process Payment");
        processButton.addActionListener(e -> processPayment());

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(processButton);

        // Add panels to frame
        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private double getHourlyRateForUser(User user) {
        // Get user type from database
        String userType = database.getUserType(user.getUsername());

        // Return rate based on user type
        switch(userType.toLowerCase()) {
            case "visitor": return 15.0;
            case "student": return 5.0;
            case "staff": return 10.0;
            case "faculty": return 8.0;
            default: return 15.0; // default to visitor rate
        }
    }

    private double calculateDurationInHours(LocalTime start, LocalTime end) {
        long minutes = Duration.between(start, end).toMinutes();
        return minutes / 60.0; // Convert to hours with decimal
    }

    private void processPayment() {
        try {
            if (!validateFields()) return;


            float paymentAmount = (float)this.amount;

            //If test values match, approve
            if (cardNumberField.getText().trim().equals(VALID_TEST_CARD) &&
                    cvvField.getText().trim().equals(VALID_TEST_CVV) &&
                    expiryYearField.getText().trim().equals(String.valueOf(VALID_TEST_EXPIRY))) {


                booking.markAsPaid();
                Database db = Database.getInstance();
                db.updateBookingPaymentStatus(booking.getBookingId(), true);
                db.markBookingAsPaid(booking.getBookingId());

                JOptionPane.showMessageDialog(this,
                        "TEST PAYMENT APPROVED\nAmount: $" + String.format("%.2f", paymentAmount),
                        "Success", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                return;
            }

            // Original payment processing (will only reach here if test values don't match)
            Card card = new Card(
                    cardNumberField.getText().trim(),
                    currentUser,
                    addressField.getText(),
                    cardTypeCombo.getSelectedItem().toString(),
                    Integer.parseInt(cvvField.getText().trim()),
                    Integer.parseInt(expiryYearField.getText().trim())
            );

            PaymentMethod payment = new CardPayment(paymentAmount, card);
            PaymentMethod paymentWithReceipt = new ReciptDecorator(payment);

            if (paymentWithReceipt.processPayment()) {
                booking.markAsPaid();
                Database.getInstance().updateBookingPaymentStatus(booking.getBookingId(), true);
                JOptionPane.showMessageDialog(this,
                        "Payment successful!\nAmount: $" + String.format("%.2f", paymentAmount),
                        "Success", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } else {
                throw new Exception("Payment processor rejected the transaction");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Payment failed: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean validateFields() {

        String testCard = cardNumberField.getText().trim();
        String testCVV = cvvField.getText().trim();
        String testExpiry = expiryYearField.getText().trim();

        // Validate card number matches test value
        if (!testCard.equals(VALID_TEST_CARD)) {
            showError("Invalid card number", "For testing, use card: " + VALID_TEST_CARD);
            return false;
        }

        // Validate CVV matches test value
        if (!testCVV.equals(VALID_TEST_CVV)) {
            showError("Invalid CVV", "For testing, use CVV: " + VALID_TEST_CVV);
            return false;
        }

        // Validate expiry year matches test value
        try {
            int expiryYear = Integer.parseInt(testExpiry);
            if (expiryYear != VALID_TEST_EXPIRY) {
                showError("Invalid expiry year", "For testing, use year: " + VALID_TEST_EXPIRY);
                return false;
            }
        } catch (NumberFormatException e) {
            showError("Invalid expiry year", "Must be a valid 4-digit year");
            return false;
        }

        // Additional validations
        if (addressField.getText().trim().isEmpty()) {
            showError("Missing Information", "Billing address cannot be empty");
            return false;
        }

        return true;
    }

    private void showError(String title, String message) {
        JOptionPane.showMessageDialog(this, message, title, JOptionPane.ERROR_MESSAGE);
    }
}
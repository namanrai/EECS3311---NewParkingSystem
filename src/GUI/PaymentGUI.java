package GUI;

import DesignPatterns.PaymentMethod;
import HelperFunctions.CardPayment;
import HelperFunctions.ReciptDecorator;
import Models.Booking;
import Models.Card;
import Models.User;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;

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
    private static final String VALID_TEST_CARD = "111";
    private static final String VALID_TEST_CVV = "123";
    private static final int VALID_TEST_EXPIRY = 2025;

    public PaymentGUI(User user, Booking booking) {
        this.currentUser = user;
        this.booking = booking;

        // Calculate amount based on user type and duration
        double hourlyRate = currentUser.getUserType().getParkingRate();
        Rate(); // The user type is given here
        double amount = booking.calculateAmount(hourlyRate);

        setTitle("Payment Processing");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create main panel with padding
        JPanel mainPanel = new JPanel(new GridLayout(8, 2, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Add components
        mainPanel.add(new JLabel("Card Number:"));
        cardNumberField = new JTextField();
        mainPanel.add(cardNumberField);

        mainPanel.add(new JLabel("Card Holder Name:"));
        cardHolderField = new JTextField();
        mainPanel.add(cardHolderField);

        mainPanel.add(new JLabel("Billing Address:"));
        addressField = new JTextField();
        mainPanel.add(addressField);

        mainPanel.add(new JLabel("Card Type:"));
        String[] cardTypes = { "VISA", "MasterCard", "American Express" };
        cardTypeCombo = new JComboBox<>(cardTypes);
        mainPanel.add(cardTypeCombo);

        mainPanel.add(new JLabel("CVV:"));
        cvvField = new JTextField();
        mainPanel.add(cvvField);

        mainPanel.add(new JLabel("Expiry Year:"));
        expiryYearField = new JTextField();
        mainPanel.add(expiryYearField);

        mainPanel.add(new JLabel("Amount:"));
        amountField = new JTextField(String.format("%.2f", amount));
        amountField.setEditable(false);
        mainPanel.add(amountField);

        // Pre-fill card holder name
        cardHolderField.setText(user.getUsername());
        cardHolderField.setEditable(false);

        // Add process payment button
        JButton processButton = new JButton("Process Payment");
        processButton.addActionListener(e -> processPayment());

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(processButton);

        // Add panels to frame
        add(mainPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void processPayment() {
        try {
            if (validateFields()) {
                Card card = new Card(
                        cardNumberField.getText(),
                        currentUser,
                        addressField.getText(),
                        cardTypeCombo.getSelectedItem().toString(),
                        Integer.parseInt(cvvField.getText()),
                        Integer.parseInt(expiryYearField.getText()));

                PaymentMethod payment = new CardPayment(
                        Float.parseFloat(amountField.getText()),
                        card);
                PaymentMethod paymentWithReceipt = new ReciptDecorator(payment);

                boolean success = paymentWithReceipt.processPayment();
                if (success) {
                    // Update booking status in memory
                    booking.markAsPaid();

                    // Update booking status in CSV file
                    Database.getInstance().updateBookingPaymentStatus(booking.getBookingId(), true);

                    JOptionPane.showMessageDialog(this,
                            "Payment processed successfully!\nAmount: $" + amountField.getText(),
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Payment processing failed. Please try again.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Please enter valid numeric values.",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean validateFields() {
        // Validate card number against test value
        if (!cardNumberField.getText().trim().equals(VALID_TEST_CARD)) {
            JOptionPane.showMessageDialog(this,
                    "Invalid card number. Use test card: " + VALID_TEST_CARD,
                    "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validate CVV against test value
        if (!cvvField.getText().trim().equals(VALID_TEST_CVV)) {
            JOptionPane.showMessageDialog(this,
                    "Invalid CVV. Use test CVV: " + VALID_TEST_CVV,
                    "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validate expiry year against test value
        try {
            int expiryYear = Integer.parseInt(expiryYearField.getText().trim());
            if (expiryYear != VALID_TEST_EXPIRY) {
                JOptionPane.showMessageDialog(this,
                        "Invalid expiry year. Use test year: " + VALID_TEST_EXPIRY,
                        "Validation Error",
                        JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Please enter a valid expiry year.",
                    "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }
}
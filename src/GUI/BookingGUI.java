package GUI;

import Database.Database;
import Models.Booking;
import Models.User;
import Models.ParkingSpace;
import Database.Database;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

public class BookingGUI extends JFrame {
    private User user;
    private String selectedLot;
    private String spaceId;
    private Database database;

    public BookingGUI(User user, String selectedLot, String spaceId) {
        this.user = user;
        this.selectedLot = selectedLot;
        this.spaceId = spaceId;
        database = Database.getInstance();

        setTitle("Booking Parking Space");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());


        // Panel for displaying user and parking space information
        JPanel inputPanel = new JPanel(new GridLayout(12, 4, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));

        inputPanel.add(new JLabel("Username:"));
        inputPanel.add(new JLabel(user.getUsername()));

        inputPanel.add(new JLabel("License Plate:"));
        inputPanel.add(new JLabel(user.getLicensePlate()));

        inputPanel.add(new JLabel("Parking Space:"));
        inputPanel.add(new JLabel(spaceId));

        // Time input fields
        JLabel startLabel = new JLabel("Start Time (HH:mm):");
        JTextField startTimeField = new JTextField();
        inputPanel.add(startLabel);
        inputPanel.add(startTimeField);

        JLabel endLabel = new JLabel("End Time (HH:mm):");
        JTextField endTimeField = new JTextField();
        inputPanel.add(endLabel);
        inputPanel.add(endTimeField);

        // Button to confirm the booking
        JButton bookButton = new JButton("Proceed to Payment");
        bookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String startTimeStr = startTimeField.getText();
                String endTimeStr = endTimeField.getText();

                // Validate time input
                try {
                    LocalTime startTime = LocalTime.parse(startTimeStr);
                    LocalTime endTime = LocalTime.parse(endTimeStr);

                    if (startTime.isAfter(endTime)) {
                        JOptionPane.showMessageDialog(BookingGUI.this, "Start time must be before end time.");
                    } else {
                        // Make the booking
                        ParkingSpace parkingSpace = new ParkingSpace(spaceId, selectedLot);
                        String bookingId = "BK-" + System.currentTimeMillis();
                        Booking booking = new Booking(bookingId, user.getUsername(), spaceId, parkingSpace, startTime, endTime);
                        Database.getInstance().addBooking(booking);

                        // Open PaymentGUI with user and booking
                        new PaymentGUI(user, booking);
                        dispose(); // Close the booking window
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(BookingGUI.this, "Invalid time format. Please enter a valid time.");
                }
            }
        });

        // Add components to the frame
        inputPanel.add(bookButton);
        add(inputPanel, BorderLayout.CENTER);

        setVisible(true);
    }

}

package GUI;

import Models.User;
import Models.ParkingSpace;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

public class BookingGUI extends JFrame {
    private User user;
    private String selectedLot;
    private String spaceId;

    public BookingGUI(User user, String selectedLot, String spaceId) {
        this.user = user;
        this.selectedLot = selectedLot;
        this.spaceId = spaceId;

        setTitle("Booking Parking Space");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel for displaying user and parking space information
        JPanel panel = new JPanel(new GridLayout(4, 2));

        panel.add(new JLabel("Username:"));
        panel.add(new JLabel(user.getUsername())); // Display username

        panel.add(new JLabel("License Plate:"));
        panel.add(new JLabel(user.getLicensePlate())); // Display license plate

        panel.add(new JLabel("Parking Space:"));
        panel.add(new JLabel(spaceId)); // Display parking space ID

        // Time input fields
        JLabel startLabel = new JLabel("Start Time (HH:mm):");
        JTextField startTimeField = new JTextField();
        panel.add(startLabel);
        panel.add(startTimeField);

        JLabel endLabel = new JLabel("End Time (HH:mm):");
        JTextField endTimeField = new JTextField();
        panel.add(endLabel);
        panel.add(endTimeField);

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
                        String bookingId = "Booking-" + System.currentTimeMillis(); // Unique booking ID
                        user.makeBooking(bookingId, user.getUsername(), spaceId, parkingSpace, startTime, endTime);

                        JOptionPane.showMessageDialog(BookingGUI.this, "Payment GUI here");
                        dispose(); // Close the booking window
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(BookingGUI.this, "Invalid time format. Please enter a valid time.");
                }
            }
        });

        // Add components to the frame
        panel.add(bookButton);
        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

}

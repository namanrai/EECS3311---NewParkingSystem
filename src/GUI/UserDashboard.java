package GUI;

import Models.User;
import Models.Booking;
import Database.Database;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class UserDashboard extends JFrame {
    private User user;
    private JList<String> parkingLotList;
    private JList<String> bookingsList;
    private DefaultListModel<String> bookedList;
    private Database database;

    public UserDashboard(User user) {
        this.user = user;
        database = Database.getInstance();


        setTitle("User Dashboard - " + user.getUsername());
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Tabs setup
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Parking Lots", parkingLotsPanel());
        tabbedPane.addTab("My Bookings", bookingsPanel());


        JPanel userPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        userPanel.add(new JLabel("Logged in as: " + user.getUsername() + " | License: " + user.getLicensePlate()));
        JButton logoutButton = new JButton("Logout");
        logoutButton.addActionListener(e -> {
            new Login();
            dispose();
        });
        userPanel.add(logoutButton);

        // Add components to frame
        add(userPanel, BorderLayout.NORTH);
        add(tabbedPane, BorderLayout.CENTER);

        setVisible(true);
    }


    private JPanel parkingLotsPanel() {
        JPanel panel = new JPanel(new BorderLayout());

        // Get active lots for database
        DefaultListModel<String> lotList = new DefaultListModel<>();
        database.getParkingLots().stream()
                .filter(lot -> !lot.isDisabled())
                .forEach(lot -> lotList.addElement(lot.getLotId()));

        // Parking lot list
        parkingLotList = new JList<>(lotList);
        parkingLotList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane listScroll = new JScrollPane(parkingLotList);

        // Action buttons
        JButton openLotButton = new JButton("View Available Spaces");
        openLotButton.addActionListener(e -> showParkingSpaces());

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(openLotButton);

        panel.add(new JLabel("Available Parking Lots:", SwingConstants.CENTER), BorderLayout.NORTH);
        panel.add(listScroll, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        return panel;
    }

    private void showParkingSpaces() {
        String selectedLot = parkingLotList.getSelectedValue();
        if (selectedLot == null) {
            JOptionPane.showMessageDialog(this, "Please select a parking lot first");
            return;
        }

        // Get available spaces (filter out booked spaces)
        DefaultListModel<String> availableSpacesList = new DefaultListModel<>();
        for (int i = 1; i <= 100; i++) {
            String spaceId = "Space-" + i;
            if (isSpaceAvailable(spaceId)) {
                availableSpacesList.addElement(spaceId);
            }
        }

        if (availableSpacesList.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No available spaces in this lot");
            return;
        }

        // Space selection dialog
        JDialog spaceDialog = new JDialog(this, "Select Parking Space", true);
        spaceDialog.setSize(400, 500);
        spaceDialog.setLocationRelativeTo(this);

        JList<String> spacesList = new JList<>(availableSpacesList);
        JButton bookButton = new JButton("Book Parking Space");
        bookButton.addActionListener(e -> {
            String spaceId = spacesList.getSelectedValue();
            if (spaceId != null) {
                spaceDialog.dispose();
               new BookingGUI(user, selectedLot, spaceId); // Open booking GUI
            } else {
                JOptionPane.showMessageDialog(spaceDialog, "Please select a space first");
            }
        });

        spaceDialog.add(new JScrollPane(spacesList), BorderLayout.CENTER);
        spaceDialog.add(bookButton, BorderLayout.SOUTH);
        spaceDialog.setVisible(true);
    }

    private boolean isSpaceAvailable(String spaceId) {
        //method to check for available spaces
        List<Booking> bookings = database.getBookings();

        return bookings.stream().noneMatch(booking ->
                booking.getParkingSpace().getId().equals(spaceId) &&
                        !booking.isCancelled()
        );
    }

    private JPanel bookingsPanel() {
        JPanel panel = new JPanel(new BorderLayout());

        this.bookedList = new DefaultListModel<>();
        loadBookings();

        bookingsList = new JList<>(bookedList);
        bookingsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(bookingsList);

        // Action buttons
        JButton cancelButton = new JButton("Cancel Booking");
        cancelButton.addActionListener(e -> cancelBooking());

        JButton editButton = new JButton("Edit Booking");
        editButton.addActionListener(e -> editBooking());

        JButton refreshButton = new JButton("Refresh");
        refreshButton.addActionListener(e -> loadBookings());

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(cancelButton);
        buttonPanel.add(editButton);
        buttonPanel.add(refreshButton);

        panel.add(new JLabel("Your Bookings:", SwingConstants.CENTER), BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        return panel;
    }

    private void loadBookings() {
        bookedList.clear();
        List<Booking> bookings = database.getuserBooking(user.getUsername());

        bookings.stream()
                .filter(booking -> !booking.isCancelled())
                .forEach(booking -> {
                    String status = booking.isPaid() ? "PAID" : "PENDING PAYMENT";
                    bookedList.addElement(String.format(
                            "%s | %s | %s to %s | %s",
                            booking.getBookingId(),
                            booking.getParkingSpace().getId(),
                            booking.getStartTime(),
                            booking.getEndTime(),
                            status
                    ));
                });
    }

    private void cancelBooking() {
        int selectedIndex = bookingsList.getSelectedIndex();
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a booking to cancel");
            return;
        }

        String selectedBooking = bookingsList.getSelectedValue();
        String bookingId = selectedBooking.split(" \\| ")[0];

        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Cancel this booking?\n" + selectedBooking,
                "Confirm Cancellation",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {
            Booking booking = database.findBookingById(bookingId);
            if (booking != null && booking.isPaid()) {
                // Process refund for paid bookings
                JOptionPane.showMessageDialog(this,
                        "Booking cancelled successfully. Refund is being processed.");
            } else {
                JOptionPane.showMessageDialog(this,
                        "Booking cancelled successfully.");
            }

            // Remove from database
            database.cancelBooking(bookingId);
            loadBookings(); // Refresh the list
        }
    }

    private void editBooking() {
        int selectedIndex = bookingsList.getSelectedIndex();
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a booking first");
            return;
        }

        String selected = bookingsList.getSelectedValue();
        String bookingId = selected.split(" \\| ")[0];
        Booking booking = database.findBookingById(bookingId);

        if (booking == null) {
            JOptionPane.showMessageDialog(this, "Booking not found");
            return;
        }

        //edit method basically -> selects the old booking from list -> removes it from db -> creates a new booking instance
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Create new booking for " + booking.getParkingSpace().getId() + "?",
                "Confirm New Booking",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {
            database.cancelBooking(bookingId);


            new BookingGUI(user, booking.getParkingSpace().getLocation(), booking.getParkingSpace().getId());


            loadBookings();
        }
    }



}
package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ManagerDashboard extends JFrame {
    private DefaultListModel<String> parkingLotsModel;
    private JList<String> parkingLotsList;
    private Map<String, Boolean> parkingLotStatus;
    private Map<String, Boolean[]> parkingSpaces; // 100 spaces per lot

    private static final String CSV_FILE = "parkinglots.csv";

    public ManagerDashboard() {
        setTitle("Manager Dashboard");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        parkingLotsModel = new DefaultListModel<>();
        parkingLotsList = new JList<>(parkingLotsModel);
        parkingLotStatus = new HashMap<>();
        parkingSpaces = new HashMap<>();

        loadParkingLotsFromCSV(); // Load existing parking lots

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(parkingLotsList), BorderLayout.CENTER);

        // Buttons
        JButton addLotButton = new JButton("Add Parking Lot");
        JButton removeLotButton = new JButton("Remove Parking Lot");
        JButton toggleLotButton = new JButton("Enable/Disable Lot");
        JButton manageSpacesButton = new JButton("Manage Spaces");
        JButton openValidationDashboardButton = new JButton("Open Validation Dashboard");

        JPanel buttonPanel = new JPanel(new GridLayout(12, 4, 10, 10));
        buttonPanel.add(addLotButton);
        buttonPanel.add(removeLotButton);
        buttonPanel.add(toggleLotButton);
        buttonPanel.add(manageSpacesButton);
        buttonPanel.add(openValidationDashboardButton);

        // Logout Button
        JButton logoutButton = new JButton("Logout");
        logoutButton.addActionListener(e -> {
            dispose(); // Close the dashboard
            new Login().setVisible(true);
        });
        add(logoutButton, BorderLayout.SOUTH);

        panel.add(buttonPanel, BorderLayout.EAST);
        add(panel);

        // Button Actions
        addLotButton.addActionListener(e -> addParkingLot());
        removeLotButton.addActionListener(e -> removeParkingLot());
        toggleLotButton.addActionListener(e -> toggleParkingLot());
        manageSpacesButton.addActionListener(e -> manageSpaces());
        openValidationDashboardButton.addActionListener(e -> openValidationDashboard());

        setVisible(true);
    }

    // Load parking lots from CSV
    private void loadParkingLotsFromCSV() {
        try (Scanner scanner = new Scanner(new File(CSV_FILE))) {
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                if (data.length == 2) {
                    String lotName = data[0];
                    boolean isEnabled = Boolean.parseBoolean(data[1]);
                    parkingLotStatus.put(lotName, isEnabled);
                    parkingLotsModel.addElement(lotName + (isEnabled ? " (Enabled)" : " (Disabled)"));
                    Boolean[] spaces = new Boolean[100]; // Initialize 100 spaces per lot
                    for (int i = 0; i < spaces.length; i++) spaces[i] = true;
                    parkingSpaces.put(lotName, spaces);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("CSV file not found, starting with an empty list.");
        }
    }

    // Save parking lots to CSV
    private void saveParkingLotsToCSV() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CSV_FILE))) {
            for (String lot : parkingLotStatus.keySet()) {
                writer.write(lot + "," + parkingLotStatus.get(lot) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Add new parking lot
    private void addParkingLot() {
        String lotName = JOptionPane.showInputDialog("Enter Parking Lot Name:");
        if (lotName != null && !lotName.isEmpty() && !parkingLotStatus.containsKey(lotName)) {
            parkingLotsModel.addElement(lotName + " (Enabled)");
            parkingLotStatus.put(lotName, true);
            Boolean[] spaces = new Boolean[100]; // Initialize 100 spaces
            for (int i = 0; i < 100; i++) spaces[i] = true;
            parkingSpaces.put(lotName, spaces);
            saveParkingLotsToCSV();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid or duplicate parking lot name.");
        }
    }

    // Remove a parking lot
    private void removeParkingLot() {
        int index = parkingLotsList.getSelectedIndex();
        if (index != -1) {
            String lotName = parkingLotsModel.get(index).split(" ")[0];
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to remove " + lotName + "?", "Confirm Removal", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                parkingLotsModel.remove(index);
                parkingLotStatus.remove(lotName);
                parkingSpaces.remove(lotName);
                saveParkingLotsToCSV();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Select a parking lot first.");
        }
    }

    // Toggle enable/disable parking lot
    private void toggleParkingLot() {
        int index = parkingLotsList.getSelectedIndex();
        if (index != -1) {
            String lotName = parkingLotsModel.get(index).split(" ")[0];
            boolean currentState = parkingLotStatus.get(lotName);
            parkingLotStatus.put(lotName, !currentState);
            parkingLotsModel.set(index, lotName + (!currentState ? " (Enabled)" : " (Disabled)"));
            saveParkingLotsToCSV();
        } else {
            JOptionPane.showMessageDialog(this, "Select a parking lot first.");
        }
    }

    // Manage individual parking spaces
    private void manageSpaces() {
        int index = parkingLotsList.getSelectedIndex();
        if (index != -1) {
            String lotName = parkingLotsModel.get(index).split(" ")[0];
            Boolean[] spaces = parkingSpaces.get(lotName);

            JList<String> spaceList = new JList<>();
            DefaultListModel<String> spaceModel = new DefaultListModel<>();
            for (int i = 0; i < spaces.length; i++) {
                spaceModel.addElement("Space " + (i + 1) + (spaces[i] ? " (Enabled)" : " (Disabled)"));
            }
            spaceList.setModel(spaceModel);

            JButton toggleSpaceButton = new JButton("Enable/Disable Space");
            toggleSpaceButton.addActionListener((ActionEvent e) -> {
                int spaceIndex = spaceList.getSelectedIndex();
                if (spaceIndex != -1) {
                    spaces[spaceIndex] = !spaces[spaceIndex]; // Toggle state
                    spaceModel.set(spaceIndex, "Space " + (spaceIndex + 1) + (spaces[spaceIndex] ? " (Enabled)" : " (Disabled)"));
                } else {
                    JOptionPane.showMessageDialog(null, "Select a space first.");
                }
            });

            JPanel spacePanel = new JPanel(new BorderLayout());
            spacePanel.add(new JScrollPane(spaceList), BorderLayout.CENTER);
            spacePanel.add(toggleSpaceButton, BorderLayout.SOUTH);

            JFrame spaceFrame = new JFrame("Manage Spaces - " + lotName);
            spaceFrame.setSize(400, 500);
            spaceFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            spaceFrame.add(spacePanel);
            spaceFrame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Select a parking lot first.");
        }
    }

    private void openValidationDashboard() {
        new ManagerVal(); // Opens validation dashboard
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ManagerDashboard::new);
    }
}

package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;

public class ManagerDashboard extends JFrame {
    private DefaultListModel<String> parkingLotsModel;
    private JList<String> parkingLotsList;
    private Map<String, Boolean> parkingLotStatus;
    private Map<String, Boolean[]> parkingSpaces; // 100 spaces per lot

    public ManagerDashboard() {
        setTitle("Manager Dashboard");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        parkingLotsModel = new DefaultListModel<>();
        parkingLotsList = new JList<>(parkingLotsModel);
        parkingLotStatus = new HashMap<>();
        parkingSpaces = new HashMap<>();

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(parkingLotsList), BorderLayout.CENTER);

        JButton addLotButton = new JButton("Add Parking Lot");
        JButton toggleLotButton = new JButton("Enable/Disable Lot");
        JButton manageSpacesButton = new JButton("Manage Spaces");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addLotButton);
        buttonPanel.add(toggleLotButton);
        buttonPanel.add(manageSpacesButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);
        add(panel);

        addLotButton.addActionListener(e -> addParkingLot());
        toggleLotButton.addActionListener(e -> toggleParkingLot());
        manageSpacesButton.addActionListener(e -> manageSpaces());

        setVisible(true);
    }

    private void addParkingLot() {
        String lotName = JOptionPane.showInputDialog("Enter Parking Lot Name:");
        if (lotName != null && !lotName.isEmpty()) {
            parkingLotsModel.addElement(lotName + " (Enabled)");
            parkingLotStatus.put(lotName, true);
            Boolean[] spaces = new Boolean[100]; // Initialize 100 spaces
            for (int i = 0; i < 100; i++) spaces[i] = true;
            parkingSpaces.put(lotName, spaces);
        }
    }

    private void toggleParkingLot() {
        int index = parkingLotsList.getSelectedIndex();
        if (index != -1) {
            String lotName = parkingLotsModel.get(index).split(" ")[0];
            boolean currentState = parkingLotStatus.get(lotName);
            parkingLotStatus.put(lotName, !currentState);
            parkingLotsModel.set(index, lotName + (!currentState ? " (Enabled)" : " (Disabled)"));
        } else {
            JOptionPane.showMessageDialog(this, "Select a parking lot first.");
        }
    }

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
            spaceFrame.setSize(400, 300);
            spaceFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            spaceFrame.add(spacePanel);
            spaceFrame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Select a parking lot first.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ManagerDashboard::new);
    }
}
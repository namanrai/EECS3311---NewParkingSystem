package GUI;

import Database.Database;
import Models.Manager;
import Models.SuperManager;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SuperManagerDashboard extends JFrame {
    private JTabbedPane tabbedPane;
    private Database database;

    public SuperManagerDashboard() {
        setTitle("SuperManager Dashboard");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Initialize Database
        database = Database.getInstance();

        tabbedPane = new JTabbedPane();
        add(tabbedPane, BorderLayout.CENTER);

        // Add Panels
        tabbedPane.addTab("Create Manager", createManagerPanel());
        tabbedPane.addTab("View Managers", viewManagersPanel());
//        tabbedPane.addTab("Manage Parking Lots", manageParkingLotsPanel());

        // Logout Button
        JButton logoutButton = new JButton("Logout");
        logoutButton.addActionListener(e -> {
            dispose(); // Close the dashboard
            new Login().setVisible(true);
        });
        add(logoutButton, BorderLayout.SOUTH);
    }

    // Panel for Creating Manager Accounts
    private JPanel createManagerPanel() {
        JPanel panel = new JPanel(new GridLayout(12, 4, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));

        // Username and Password Labels
        JLabel usernameLabel = new JLabel("Username: ");
        JLabel passwordLabel = new JLabel("Password: ");

        // Auto-generated using the methods in Manager Class
        JTextField usernameField = new JTextField();
        usernameField.setEditable(false); // Username is auto-generated
        JTextField passwordField = new JTextField();
        passwordField.setEditable(false); // Password is auto-generated

        // Generate Button
        JButton generateButton = new JButton("Generate New Manager");
        generateButton.addActionListener(e -> {
            Manager newManager = SuperManager.getInstance().createManagerAccount(true);
            usernameField.setText(newManager.getName());
            passwordField.setText(newManager.getPassword());
            JOptionPane.showMessageDialog(this, "Manager account created successfully!");
        });

        // Add Components to Panel
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // Empty space
        panel.add(generateButton);

        return panel;
    }

    // Panel for Viewing Managers
    private JPanel viewManagersPanel() {
        JPanel panel = new JPanel(new BorderLayout());

        // Create Table Model
        DefaultTableModel tableModel = new DefaultTableModel(new String[]{"Username", "Password"}, 0);
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        // Refresh Button
        JButton refreshButton = new JButton("Refresh");
        refreshButton.addActionListener(e -> {
            // Clear data
            tableModel.setRowCount(0);

            // Fetch data from Database
            ArrayList<Manager> managers = database.getManagers();
            for (Manager manager : managers) {
                tableModel.addRow(new Object[]{manager.getName(), manager.getPassword()});
            }
        });

        // Add Components to Panel
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(refreshButton, BorderLayout.SOUTH);

        // Initial Data Load
        refreshButton.doClick(); // Simulate a click to load data initially

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SuperManagerDashboard dashboard = new SuperManagerDashboard();
            dashboard.setVisible(true);
        });
    }
}

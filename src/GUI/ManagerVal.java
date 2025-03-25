package GUI;

import Database.Database;
import Models.Manager;
import Models.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class ManagerVal extends JFrame {
    private DefaultListModel<String> usersModel;
    private JList<String> usersList;

    public ManagerVal() {
        setTitle("Manager Val Dashboard");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        usersModel = new DefaultListModel<>();
        usersList = new JList<>(usersModel);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(usersList), BorderLayout.CENTER);

        JButton validateUserButton = new JButton("Validate User");
        validateUserButton.addActionListener(this::validateUser);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(validateUserButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);
        add(panel);

        loadUnvalidatedUsers(); // Load unvalidated users on startup
        setVisible(true);
    }

    private void loadUnvalidatedUsers() {
        usersModel.clear();
        ArrayList<User> unvalidatedUsers = Database.getInstance().getUnvalidatedUsers();
        for (User user : unvalidatedUsers) {
            usersModel.addElement(user.getUsername());
        }
    }

    private void validateUser(ActionEvent e) {
        int selectedIndex = usersList.getSelectedIndex();
        if (selectedIndex != -1) {
            String username = usersModel.get(selectedIndex);
            Manager.validateUsers(username); // Mark user as validated in database
            usersModel.remove(selectedIndex);
            JOptionPane.showMessageDialog(this, "User " + username + " has been validated.");
        } else {
            JOptionPane.showMessageDialog(this, "Select a user to validate.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ManagerVal::new);
    }
}

package GUI;

import Database.Database;
import DesignPatterns.UserFactory;
import HelperFunctions.PasswordValidator;
import Models.User;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame {
    private JTextField usernameField;
    private JTextField emailField;
    private JTextField licensePlateField;
    private JPasswordField passwordField;
    private JComboBox<String> userTypeList;
    private JButton registerButton;

    public Register() {
        setTitle("Register");
        setSize(800, 800); // Increased height to accommodate the email field
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        JPanel panel = new JPanel(new GridLayout(12, 4, 10, 10)); // Increased rows for email field
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));

        panel.add(new JLabel("Username:"));
        usernameField = new JTextField();
        panel.add(usernameField);

        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        panel.add(new JLabel("License Plate:"));
        licensePlateField = new JTextField();
        panel.add(licensePlateField);

        panel.add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        panel.add(passwordField);

        panel.add(new JLabel("User Type:"));
        String[] userTypes = {"Student", "Faculty", "Staff", "Visitor"};
        userTypeList = new JComboBox<>(userTypes);
        panel.add(userTypeList);

        registerButton = new JButton("Register");

        // Add action listener
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                register();
            }
        });

        panel.add(registerButton);

        add(panel);
        setVisible(true);
    }

    private void register() {
        String username = usernameField.getText().trim();
        String email = emailField.getText().trim();
        String licensePlate = licensePlateField.getText().trim();
        String password = new String(passwordField.getPassword()).trim();
        String userType = (String) userTypeList.getSelectedItem();

        // Validate input fields
        if (username.isEmpty() || email.isEmpty() || password.isEmpty() || licensePlate.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Text Field cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate email format (basic check)
        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            JOptionPane.showMessageDialog(this, "Invalid email format.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate password strength
        if (!PasswordValidator.isStrongPassword(password)) {
            JOptionPane.showMessageDialog(this, "Password is not strong enough. It must contain at least 8 characters, including uppercase, lowercase, digits, and special characters.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Database database = Database.getInstance();

        // Check if username or email already exists
        if (database.userExists(username)) {
            JOptionPane.showMessageDialog(this, "Username already exists.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (database.emailExists(email)) {
            JOptionPane.showMessageDialog(this, "Email already exists.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Create a new user using the UserFactory
        try {
            User newUser = UserFactory.createUser(userType, username, email, password, licensePlate);
            database.addAccount(newUser);
            JOptionPane.showMessageDialog(this, "Registration Successful!");
            this.dispose(); // Close the registration window
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

package GUI;

import Database.Database;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JComboBox<String> accessType;
    private Database database;

    public Login() {
        // Initialize the database
        database = Database.getInstance();

        setTitle("Login - Parking Management System");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // UI components
        JPanel inputPanel = new JPanel(new GridLayout(12, 4, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100)); // Add padding

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        JLabel userTypeLabel = new JLabel("Access as:");
        String[] userTypes = {"User", "Manager", "SuperManager"};
        accessType = new JComboBox<>(userTypes);
        JButton loginButton = new JButton("Login");
        JButton registerButton = new JButton("Register");

        // Add components to the input panel
        inputPanel.add(usernameLabel);
        inputPanel.add(usernameField);
        inputPanel.add(passwordLabel);
        inputPanel.add(passwordField);
        inputPanel.add(userTypeLabel);
        inputPanel.add(accessType);
        inputPanel.add(loginButton);
        inputPanel.add(registerButton);

        // Add to the Panel
        add(inputPanel, BorderLayout.CENTER);

        // Add action listeners
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openRegister();
            }
        });

        // Display the window
        setVisible(true);
    }

    // Method to handle login
    private void login() {
        String username = usernameField.getText().trim();
        String password = new String(passwordField.getPassword()).trim();
        String userType = (String) accessType.getSelectedItem();

        // Validate input fields
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username and password cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate credentials
        boolean isValid = false;
        switch (userType) {
            case "User":
                isValid = database.validUser(username, password);
                break;
            case "Manager":
                isValid = database.validManager(username, password);
                break;
            case "SuperManager":
                isValid = database.validSuperManager(username, password);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Invalid user type selected.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
        }

        // Handle login result
        if (isValid) {
            JOptionPane.showMessageDialog(this, "Login successful! Welcome, " + username + ".");
            openDashboard(userType);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method to open the registration form
    private void openRegister() {
        // Create a new registration
        System.out.println("Register button clicked!"); // Debugging statement
        new Register();
    }


    private void openDashboard(String userType) {
        // Close the login window
        this.dispose();

        // Open the appropriate dashboard
        switch (userType) {
            case "User":
//                new UserDashboard();
                break;
            case "Manager":
//                new ManagerDashboard();
                break;
            case "SuperManager":
                new SuperManagerDashboard();
                break;
            default:
                JOptionPane.showMessageDialog(this, "Select a user type.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Run the login page
        new Login();
    }
}


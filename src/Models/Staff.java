package Models;

import Database.Database;
import HelperFunctions.*;

public class Staff implements  User {
    private String email;
    private String password;
    private String licensePlate;
    private ParkingSpace parkingSpace;
    private String username;

    public Staff(String name, String email, String password, String licensePlate) {
        this.username = name;
        this.email = email;
        this.password = password;
        this.licensePlate = licensePlate;
    }

    public double getParkingRate() {
        return 10.0; // $10 per hour
    }

    // Getter methods required by the User interface
    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }

    @Override
    public String getUsername() {
        return username;
    }

    // Payment method was commented out — consider implementing when payment logic is required
//    @Override
//    public Card paymentInformation(String input) {
//        return new Card(input); // Example logic
//    }

    // Registers a new Staff account
    @Override
    public boolean registerAccount(String username, String password) {
        // Access the Database instance using the Singleton pattern
        Database database = Database.getInstance();
        boolean exists = false;

        // Check if the username already exists in the system
        for (User user : database.getUsers()) {
            if (user.getUsername().equals(username)) {
                exists = true;
                System.out.println("Username already exists");
            }
        }

        // Validates password strength using the PasswordValidator helper
        if (PasswordValidator.isStrongPassword(password)) {
            System.out.println("Password not strong");
            return false;
        }

        // If username doesn't exist, register the new Visitor
        if (!exists) {
            database.addAccount(this);  // Adds the Visitor object to the database
            System.out.println("Account Registration Successful");
            return true;
        }

        // Registration fails if username exists
        return false;
    }
}
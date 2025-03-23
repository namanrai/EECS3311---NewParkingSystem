package Models;

import Database.Database;
import HelperFunctions.*;

import java.util.ArrayList;

public class Student extends User {
    private String email;
    private String password;
    private String licensePlate;
    private ParkingSpace parkingSpace;
    private String username;
    private ArrayList<Booking> bookings;

    public Student(String name, String email, String password, String licensePlate) {
        this.username = name;
        this.email = email;
        this.password = password;
        this.licensePlate = licensePlate;
    }

    public double getParkingRate() {
        return 5.0; // $5 per hour
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

    @Override
    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    // Payment method was commented out — consider implementing when payment logic is required
//    @Override
//    public Card paymentInformation(String input) {
//        return new Card(input); // Example logic
//    }

    // Registers a new Student account
    @Override
    public boolean registerAccount(String username, String password) {
        // Access the Database instance using the Singleton pattern
        Database database = Database.getInstance();

        // Check if the username already exists
        if (database.userExists(username)) {
            System.out.println("User already exists.");
            return false;
        }

        // Check if the email is already registered
        if (database.emailExists(this.email)) {
            System.out.println("Email is already registered.");
            return false;
        }

        // Validate password strength using the PasswordValidator helper
        if (!PasswordValidator.isStrongPassword(password)) {
            System.out.println("Password is not strong enough.");
            return false;
        }

        // Register the Visitor if all checks pass
        database.addAccount(this);
        System.out.println("Account Registration Successful.");
        return true;
    }
}

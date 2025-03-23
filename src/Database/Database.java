package Database;

import DesignPatterns.ParkingProxy;
import DesignPatterns.UserFactory;
import Models.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
    // File paths for storing user, manager and parkinglot data in CSV format
    private static final String USERS_FILE = "users.csv";
    private static final String MANAGERS_FILE = "managers.csv";
    private static final String PARKING_LOTS_FILE = "parkinglots.csv";


    // Singleton instance of the SuperManager
    private SuperManager superManager = SuperManager.getInstance();

    // Singleton instance of the Database class
    private static final Database database = new Database();

    // Private constructor to enforce singleton pattern
    private Database() {}

    /**
     * Returns the single instance of the Database class.
     * @return Database instance.
     */
    public static Database getInstance() {
        return database;
    }

    /**
     * Returns the single instance of SuperManager.
     * @return SuperManager instance.
     */
    public SuperManager getSuperManager() {
        return superManager;
    }

    /**
     * Adds a user to the CSV file.
     * Prevents duplicate usernames from being added.
     * @param user The user object to be added.
     */
    public void addAccount(User user) {
        try {
            ArrayList<User> existingUsers = getUsers(); // Load existing users

            // Check if the username already exists
            for (User existingUser : existingUsers) {
                if (existingUser.getUsername().equals(user.getUsername())) {
                    System.out.println("User already exists.");
                    return; // Exit the method without adding duplicate user
                }
            }

            // Append new user to CSV
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(USERS_FILE, true))) {
                // Format: username,password,email,licensePlate,userType,isValidated
                String userData = String.format("%s,%s,%s,%s,%s,%b\n",
                        user.getUsername(),
                        user.getPassword(),
                        user.getEmail(),
                        user.getLicensePlate(),
                        user.getClass().getSimpleName().toLowerCase(), // Gets subclass name
                        user.getisValidated()); // Store validation status

                bw.write(userData);
                System.out.println("User added successfully.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Adds a manager to the CSV file.
     * @param manager The manager object to be added.
     */
    public void addManager(Manager manager) {
        try (FileWriter fw = new FileWriter(MANAGERS_FILE, true);
             PrintWriter pw = new PrintWriter(fw)) {
            // Format: username,password
            pw.println(manager.getUsername() + "," + manager.getPassword());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Reads user data from the CSV file and returns a list of User objects.
     * @return List of registered users.
     */
    public ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(USERS_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length < 6) { // Ensure correct CSV format
                    System.out.println("Invalid user data: " + line);
                    continue;
                }

                String username = data[0];
                String password = data[1];
                String email = data[2];
                String licensePlate = data[3];
                String userType = data[4];
                boolean isValidated = Boolean.parseBoolean(data[5]); // Read validation status

                try {
                    // Create user object using UserFactory
                    User user = UserFactory.createUser(userType, username, email, password, licensePlate);
                    user.setValidated(isValidated); // Set validation status
                    users.add(user);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage()); // Handle unknown user types
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    /**
     * Retrieves all users that have not been validated.
     * This method filters users from the database where the `isValidated` flag is false.
     *
     * @return A list of users who are not yet validated.
     */
    public ArrayList<User> getUnvalidatedUsers() {
        ArrayList<User> unvalidatedUsers = new ArrayList<>(); // List to store unvalidated users

        // Iterate through the list of all users retrieved from the database
        for (User user : getUsers()) {
            if (!user.getisValidated()) { // Check if the user is not validated
                unvalidatedUsers.add(user); // Add the unvalidated user to the list
            }
        }

        return unvalidatedUsers; // Return the list of unvalidated users
    }

    /**
     * Reads manager data from the CSV file and returns a list of Manager objects.
     * @return List of registered managers.
     */
    public ArrayList<Manager> getManagers() {
        ArrayList<Manager> managers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(MANAGERS_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length < 2) { // Ensure correct CSV format
                    System.out.println("Invalid manager data: " + line);
                    continue;
                }
                managers.add(new Manager(data[0], data[1], new ParkingProxy(true))); // username, password, ParkingProxy
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return managers;
    }

    /**
     * Validates user login credentials.
     * @param username The entered username.
     * @param password The entered password.
     * @return True if valid credentials, otherwise false.
     */
    public boolean validUser(String username, String password) {
        for (User user : getUsers()) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Validates manager login credentials.
     * @param username The entered username.
     * @param password The entered password.
     * @return True if valid credentials, otherwise false.
     */
    public boolean validManager(String username, String password) {
        for (Manager manager : getManagers()) {
            if (manager.getUsername().equals(username) && manager.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Validates SuperManager credentials.
     * Default credentials are "admin" for both username and password.
     * @param username The entered username.
     * @param password The entered password.
     * @return True if the credentials match SuperManager, otherwise false.
     */
    public boolean validSuperManager(String username, String password) {
        return username.equals("admin") && password.equals("admin");
    }

    /**
     * Checks if a username already exists in the user database.
     * @param username The username to check.
     * @return True if the username exists, otherwise false.
     */
    public boolean userExists(String username) {
        for (User user : getUsers()) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if an email already exists in the user database.
     * @param email The email to check.
     * @return True if the email exists, otherwise false.
     */
    public boolean emailExists(String email) {
        for (User user : getUsers()) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Adds a parking lot to the CSV file.
     * @param parkingLot The parking lot to add.
     */
    public void addParkingLot(ParkingLot parkingLot) {
        List<ParkingLot> existingLots = getParkingLots();
        for (ParkingLot lot : existingLots) {
            if (lot.getLotId().equals(parkingLot.getLotId())) {
                System.out.println("Parking lot already exists.");
                return;
            }
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PARKING_LOTS_FILE, true))) {
            // Format: lotId,isDisabled
            bw.write(parkingLot.getLotId() + "," + parkingLot.isDisabled() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Retrieves all parking lots from the CSV file.
     * @return List of parking lots.
     */
    public ArrayList<ParkingLot> getParkingLots() {
        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(PARKING_LOTS_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length < 2) continue;

                String lotId = data[0];
                boolean isDisabled = Boolean.parseBoolean(data[1]);
                ParkingLot parkingLot = new ParkingLot(lotId);
                if (isDisabled) parkingLot.disable();
                parkingLots.add(parkingLot);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parkingLots;
    }

    /**
     * Updates the parking lot's status in the CSV file.
     * @param lotId The ID of the parking lot.
     * @param isDisabled New status of the parking lot.
     */
    public void updateParkingLotStatus(String lotId, boolean isDisabled) {
        List<ParkingLot> lots = getParkingLots();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PARKING_LOTS_FILE))) {
            for (ParkingLot lot : lots) {
                if (lot.getLotId().equals(lotId)) {
                    lot.disable();
                    bw.write(lot.getLotId() + "," + isDisabled + "\n");
                } else {
                    bw.write(lot.getLotId() + "," + lot.isDisabled() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Removes a parking lot from the CSV file.
     * @param lotId The ID of the parking lot to remove.
     */
    public void removeParkingLot(String lotId) {
        List<ParkingLot> lots = getParkingLots();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PARKING_LOTS_FILE))) {
            for (ParkingLot lot : lots) {
                if (!lot.getLotId().equals(lotId)) {
                    bw.write(lot.getLotId() + "," + lot.isDisabled() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

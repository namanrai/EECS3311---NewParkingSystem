package DesignPatterns;

import Models.*;

public class UserFactory {
    // Creates and returns a User object based on the specified type
    // Throws an IllegalArgumentException if the provided type is invalid
    public static User createUser(String type, String name, String email, String password, String licensePlate) {
        return switch (type.toLowerCase()) {
            case "student" -> new Student(name, email, password, licensePlate);  // Creates a Student object
            case "faculty" -> new Faculty(name, email, password, licensePlate);  // Creates a Faculty object
            case "staff"   -> new Staff(name, email, password, licensePlate);    // Creates a Staff object
            case "visitor" -> new Visitor(name, email, password, licensePlate);  // Creates a Visitor object

            // If the provided type doesn't match any known category, throw an error
            default -> throw new IllegalArgumentException("Invalid user type: " + type);
        };
    }
}


package Models;

import Database.Database;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public abstract class User {
    private String email;
    private String password;
    private String licensePlate;
    private ParkingSpace parkingSpace;
    private String username;
    private ArrayList<Booking> bookings;
    private boolean isValidated;

    public abstract String getEmail();
    public abstract String getPassword();
    public abstract String getLicensePlate();
    public abstract ParkingSpace getParkingSpace();
    public abstract String getUsername();
    public abstract ArrayList<Booking> getBookings();

    public boolean getisValidated() {
        return isValidated;
    }

    public void setValidated(boolean flag) {
        this.isValidated = flag;
    }

    public Booking makeBooking(String bookingId, String username, String parkingSpaceID, ParkingSpace parkingSpace, LocalTime startTime, LocalTime endTime) {
        Booking newBooking = new Booking(bookingId, username, parkingSpaceID, parkingSpace, startTime, endTime);
        Database.getInstance().addBooking(newBooking);
        return newBooking;
    }

    public void cancelBooking(String bookingID) {
        Database.getInstance().cancelBooking(bookingID);
    }

    //Card paymentInformation(String input);
    public abstract boolean registerAccount(String username, String password);
}

package Models;

import DesignPatterns.state.*; // Importing state pattern

import java.time.LocalTime;

public class Booking {
    private String bookingId;
    private String username;
    private String parkingSpaceID;
    private ParkingSpace parkingSpace;
    private LocalTime startTime;
    private LocalTime endTime;
    private boolean isPaid;
    private boolean isCancelled;

    public Booking(String bookingId, String username, String parkingSpaceID, ParkingSpace parkingSpace, LocalTime startTime, LocalTime endTime) {
        this.bookingId = bookingId;
        this.username = username;
        this.parkingSpaceID = parkingSpace.getId();
        this.parkingSpace = parkingSpace;
        this.startTime = startTime;
        this.endTime = endTime;
        this.isPaid = false;
        this.isCancelled = false;
        this.parkingSpace.setState(new BookedState());
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getUsername() {
        return username;
    }

    public String getParkingSpaceID() {
        return parkingSpaceID;
    }

    public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    // Mark booking as paid
    public void markAsPaid() {
        this.isPaid = true;
    }

    // Cancel booking (Only if it's not already cancelled)
    public void cancelBooking() {
        if (!isPaid && !isCancelled) {
            this.isCancelled = true;
            this.parkingSpace.setState(new AvailableState()); // Free up the space
            System.out.println("Booking cancelled. Parking space is now available.");
        } else if (isPaid) {
            System.out.println("Cannot cancel a paid booking.");
        } else {
            System.out.println("Booking is already cancelled.");
        }
    }

    // Extend booking time (Only if new end time is later than the current one)
    public void extendBooking(LocalTime newEndTime) {
        if (newEndTime.isAfter(this.endTime)) {
            this.endTime = newEndTime;
            System.out.println("Booking extended successfully.");
        } else {
            System.out.println("New end time must be later than current end time.");
        }
    }

    // Change assigned parking space (Only if booking is not cancelled)
    public void changeParkingSpace(ParkingSpace newSpace) {
        if (!isCancelled) {
            this.parkingSpace.setState(new AvailableState()); // Free up old space
            this.parkingSpace = newSpace;
            this.parkingSpace.setState(new BookedState()); // Book new space
            System.out.println("Parking space changed successfully.");
        } else {
            System.out.println("Cannot change space for a cancelled booking.");
        }
    }
}

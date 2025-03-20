package Models;

import DesignPatterns.state.*; // Importing state pattern
import java.time.LocalDateTime;

public class Booking {
    private String bookingId;
    private User user;
    private ParkingSpace parkingSpace;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private boolean isPaid;
    private boolean isCancelled;

    public Booking(String bookingId, User user, ParkingSpace parkingSpace, LocalDateTime startTime, LocalDateTime endTime) {
        this.bookingId = bookingId;
        this.user = user;
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

    public User getUser() {
        return user;
    }

    public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
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
    public void extendBooking(LocalDateTime newEndTime) {
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

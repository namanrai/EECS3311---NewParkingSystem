package DesignPatterns.state;

public class BookedState implements BookingState {
    @Override
    public void handleState() {
        System.out.println("The parking space is booked.");
    }
}
package DesignPatterns.state;

public class AvailableState implements BookingState {
    @Override
    public void handleState() {
        System.out.println("The parking space is available.");
    }
}

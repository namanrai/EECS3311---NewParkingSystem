package DesignPatterns.state;

public class OccupiedState implements BookingState {
    @Override
    public void handleState() {
        System.out.println("The parking space is occupied.");
    }
}
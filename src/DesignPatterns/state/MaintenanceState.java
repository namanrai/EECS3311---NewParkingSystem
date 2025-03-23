package DesignPatterns.state;

public class MaintenanceState implements BookingState {
    @Override
    public void handleState() {
        System.out.println("The parking space is under maintenance.");
    }
}

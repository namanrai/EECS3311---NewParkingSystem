package Models;

import java.util.ArrayList;
import java.util.List;

import DesignPatterns.state.BookingState;

public class ParkingSpace {
    private String id;
    private String location;
    private boolean isOccupied;
    private String licensePlate;
    private boolean isDisabled;
    private Sensor sensor;
    private BookingState state;

    public ParkingSpace(String id, String location) {
        this.id = id;
        this.location = location;
        this.isOccupied = false;
        this.licensePlate = null;
        this.isDisabled = false;
        this.state = null; // Initialize state in the private BookingState state;
    }

    public String getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public void assign(String licensePlate) {
        if (!isDisabled) {
            this.isOccupied = true;
            this.licensePlate = licensePlate;
            sensor.detectCar(licensePlate);
        }
    }

    public void vacate() {
        this.isOccupied = false;
        this.licensePlate = null;
        sensor.clearDetection();
    }

    public void disable() {
        this.isDisabled = true;
    }

    public void enable() {
        this.isDisabled = false;
    }

    public void setState(BookingState newState) {
        this.state = newState;
        System.out.println("Parking space " + id + " is now in state: " + newState.getClass().getSimpleName());
    }
}
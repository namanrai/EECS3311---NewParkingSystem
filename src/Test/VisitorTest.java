package Test;

import Models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

public class VisitorTest {
    private Visitor visitor;

    @BeforeEach
    public void setUp() {
        visitor = new Visitor("john", "john@example.com", "StrongPass123!", "XYZ123");
    }

    @Test
    public void testGetEmail() {
        assertEquals("john@example.com", visitor.getEmail());
    }

    @Test
    public void testGetPassword() {
        assertEquals("StrongPass123!", visitor.getPassword());
    }

    @Test
    public void testGetLicensePlate() {
        assertEquals("XYZ123", visitor.getLicensePlate());
    }

    @Test
    public void testGetUsername() {
        assertEquals("john", visitor.getUsername());
    }

    @Test
    public void testGetParkingSpaceInitiallyNull() {
        assertNull(visitor.getParkingSpace());
    }

    @Test
    public void testGetBookingsInitiallyNull() {
        assertNull(visitor.getBookings());
    }

    @Test
    public void testIsValidatedDefaultTrue() {
        assertTrue(visitor.getisValidated());
    }

    @Test
    public void testSetValidatedFalse() {
        visitor.setValidated(false);
        assertFalse(visitor.getisValidated());
    }

    @Test
    public void testSetValidatedTrue() {
        visitor.setValidated(true);
        assertTrue(visitor.getisValidated());
    }

    @Test
    public void testGetParkingRate() {
        assertEquals(15.0, visitor.getParkingRate());
    }

    @Test
    public void testMakeBookingCreatesNonNullObject() {
        // Dummy data
        ParkingSpace space = new ParkingSpace("P1","1");
        LocalTime start = LocalTime.of(10, 0);
        LocalTime end = LocalTime.of(11, 0);

        Booking booking = visitor.makeBooking("B1", "john", "P1", space, start, end);
        assertNotNull(booking);
        assertEquals("B1", booking.getBookingId());
        assertEquals("john", booking.getUsername());
    }
}

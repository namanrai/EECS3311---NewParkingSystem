package Test;

import Models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;

public class FacultyTest {
    private Faculty faculty;

    @BeforeEach
    public void setUp() {
        faculty = new Faculty("alice", "alice@example.com", "Pass123!", "XYZ999");
    }

    @Test
    public void testGetUsername() {
        assertEquals("alice", faculty.getUsername());
    }

    @Test
    public void testGetEmail() {
        assertEquals("alice@example.com", faculty.getEmail());
    }

    @Test
    public void testGetPassword() {
        assertEquals("Pass123!", faculty.getPassword());
    }

    @Test
    public void testGetLicensePlate() {
        assertEquals("XYZ999", faculty.getLicensePlate());
    }

    @Test
    public void testGetParkingSpaceInitiallyNull() {
        assertNull(faculty.getParkingSpace());
    }

    @Test
    public void testGetBookingsInitiallyNull() {
        assertNull(faculty.getBookings());
    }

    @Test
    public void testIsValidatedInitiallyFalse() {
        assertFalse(faculty.getisValidated());
    }

    @Test
    public void testSetValidatedTrue() {
        faculty.setValidated(true); assertTrue(faculty.getisValidated());
    }

    @Test
    public void testSetValidatedFalse() {
        faculty.setValidated(false); assertFalse(faculty.getisValidated());
    }

    @Test
    public void testGetParkingRate() {
        assertEquals(8.0, faculty.getParkingRate());
    }

    @Test
    public void testMakeBooking() {
        ParkingSpace space = new ParkingSpace("F1","Test");
        Booking b = faculty.makeBooking("B1", "alice", "F1", space, LocalTime.of(9,0), LocalTime.of(10,0));
        assertNotNull(b);
        assertEquals("B1", b.getBookingId());
    }
}

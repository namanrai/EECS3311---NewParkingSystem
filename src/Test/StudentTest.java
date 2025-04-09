package Test;

import Models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student("chris", "chris@example.com", "StudPass!", "STU321");
    }

    @Test
    public void testGetUsername() {
        assertEquals("chris", student.getUsername());
    }

    @Test
    public void testGetEmail() {
        assertEquals("chris@example.com", student.getEmail());
    }

    @Test
    public void testGetPassword() {
        assertEquals("StudPass!", student.getPassword());
    }

    @Test
    public void testGetLicensePlate() {
        assertEquals("STU321", student.getLicensePlate());
    }

    @Test
    public void testGetParkingSpaceInitiallyNull() {
        assertNull(student.getParkingSpace());
    }

    @Test
    public void testGetBookingsInitiallyNull() {
        assertNull(student.getBookings());
    }

    @Test
    public void testIsValidatedInitiallyFalse() {
        assertFalse(student.getisValidated());
    }

    @Test
    public void testSetValidatedTrue() {
        student.setValidated(true);
        assertTrue(student.getisValidated());
    }

    @Test
    public void testSetValidatedFalse() {
        student.setValidated(false);
        assertFalse(student.getisValidated());
    }

    @Test
    public void testGetParkingRate() {
        assertEquals(5.0, student.getParkingRate());
    }

    @Test
    public void testMakeBooking() {
        ParkingSpace space = new ParkingSpace("ST1", "Test");
        Booking b = student.makeBooking("TB1", "chris", "ST1", space, LocalTime.of(7,30), LocalTime.of(8,30));
        assertNotNull(b);
        assertEquals("TB1", b.getBookingId());
    }
}

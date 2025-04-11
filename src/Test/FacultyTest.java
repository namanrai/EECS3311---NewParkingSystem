package Test;

import Database.Database;
import Models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.time.LocalTime;
import java.util.ArrayList;

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
        faculty.setValidated(true);
        assertTrue(faculty.getisValidated());
    }

    @Test
    public void testSetValidatedFalse() {
        faculty.setValidated(false);
        assertFalse(faculty.getisValidated());
    }

    @Test
    public void testGetParkingRate() {
        assertEquals(8.0, faculty.getParkingRate());
    }

    @Test
    public void testMakeBooking() {
        ParkingSpace space = new ParkingSpace("F1", "Test");
        Booking b = faculty.makeBooking("B1", "alice", "F1", space, LocalTime.of(9, 0), LocalTime.of(10, 0));
        assertNotNull(b);
        assertEquals("B1", b.getBookingId());
    }

    @Test
    public void testRegisterAccountAndVerifyCSV() throws Exception {
        // Step 1: Clear users.csv
        new FileWriter("users.csv").close();

        // Step 2: Create and register faculty
        Faculty faculty = new Faculty("fac1", "fac1@example.com", "Prof123!", "FAC111");
        boolean result = faculty.registerAccount("fac1", "Prof123!");

        // Step 3: Verify success
        assertTrue(result);

        // Step 4: Check file-backed DB for faculty
        Database db = Database.getInstance();
        ArrayList<User> users = db.getUsers();

        assertEquals(1, users.size());
        User addedUser = users.get(0);
        assertEquals("fac1", addedUser.getUsername());
        assertEquals("fac1@example.com", addedUser.getEmail());
        assertEquals("FAC111", addedUser.getLicensePlate());
        assertEquals("faculty", db.getUserType("fac1"));
        assertFalse(addedUser.getisValidated());
    }
}

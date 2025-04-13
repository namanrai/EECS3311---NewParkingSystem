package Test;

import Database.Database;
import Models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.time.LocalTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class StaffTest {
    private Staff staff;

    @BeforeEach
    public void setUp() {
        staff = new Staff("bob", "bob@example.com", "Secure123!", "STA123");
    }

    @Test
    public void testGetUsername() {
        assertEquals("bob", staff.getUsername());
    }

    @Test
    public void testGetEmail() {
        assertEquals("bob@example.com", staff.getEmail());
    }

    @Test
    public void testGetPassword() {
        assertEquals("Secure123!", staff.getPassword());
    }

    @Test
    public void testGetLicensePlate() {
        assertEquals("STA123", staff.getLicensePlate());
    }

    @Test
    public void testGetParkingSpaceInitiallyNull() {
        assertNull(staff.getParkingSpace());
    }

    @Test
    public void testGetBookingsInitiallyNull() {
        assertNull(staff.getBookings());
    }

    @Test
    public void testIsValidatedInitiallyFalse() {
        assertFalse(staff.getisValidated());
    }

    @Test
    public void testSetValidatedTrue() {
        staff.setValidated(true);
        assertTrue(staff.getisValidated());
    }

    @Test
    public void testSetValidatedFalse() {
        staff.setValidated(false);
        assertFalse(staff.getisValidated());
    }

    @Test
    public void testGetParkingRate() {
        assertEquals(10.0, staff.getParkingRate());
    }

    @Test
    public void testMakeBooking() {
        ParkingSpace space = new ParkingSpace("S1", "Test");
        Booking b = staff.makeBooking("SB1", "bob", "S1", space, LocalTime.of(8, 0), LocalTime.of(9, 30));
        assertNotNull(b);
        assertEquals("SB1", b.getBookingId());
    }

    @Test
    public void testRegisterAccountAndVerifyCSV() throws Exception {
        // Step 1: Clear users.csv
        new FileWriter("users.csv").close();

        // Step 2: Create and register staff
        Staff staff = new Staff("staff1", "staff1@example.com", "Safe123!", "STA999");
        boolean result = staff.registerAccount("staff1", "Safe123!");

        // Step 3: Verify success
        assertTrue(result);

        // Step 4: Check file-backed DB for staff user
        Database db = Database.getInstance();
        ArrayList<User> users = db.getUsers();

        assertEquals(1, users.size());
        User addedUser = users.get(0);
        assertEquals("staff1", addedUser.getUsername());
        assertEquals("staff1@example.com", addedUser.getEmail());
        assertEquals("STA999", addedUser.getLicensePlate());
        assertEquals("staff", db.getUserType("staff1"));
        assertFalse(addedUser.getisValidated());
    }
}

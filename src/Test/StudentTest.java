package Test;

import Database.Database;
import Models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.FileWriter;
import java.time.LocalTime;
import java.util.ArrayList;

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

    @Test
    public void testRegisterAccountAndVerifyCSV() throws Exception {
        // Step 1: Clear users.csv
        new FileWriter("users.csv").close();

        // Step 2: Create and register student
        Student student = new Student("stu", "stu@example.com", "Strong123!", "ZXC123");
        boolean result = student.registerAccount("stu", "Strong123!");

        // Step 3: Verify success
        assertTrue(result);

        // Step 4: Check file-backed DB for student
        Database db = Database.getInstance();
        ArrayList<User> users = db.getUsers();

        assertEquals(1, users.size());
        User addedUser = users.get(0);
        assertEquals("stu", addedUser.getUsername());
        assertEquals("stu@example.com", addedUser.getEmail());
        assertEquals("ZXC123", addedUser.getLicensePlate());
        assertEquals("student", db.getUserType("stu"));
        assertFalse(addedUser.getisValidated());
    }
}

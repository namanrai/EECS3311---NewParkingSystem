package Test;

import Database.Database;
import Models.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.time.LocalTime;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseTest {
    private Database db;

    @BeforeEach
    public void setUp() throws Exception {
        db = Database.getInstance();

        // Reset CSV files to controlled test state
        new FileWriter("users.csv").close();
        new FileWriter("managers.csv").close();
        new FileWriter("parkinglots.csv").close();
        new FileWriter("bookings.csv").close();
    }

    @Test
    public void testSingletonInstance() {
        assertSame(db, Database.getInstance());
    }

    @Test
    public void testValidSuperManagerCorrect() {
        assertTrue(db.validSuperManager("admin", "admin"));
    }

    @Test
    public void testValidSuperManagerIncorrect() {
        assertFalse(db.validSuperManager("admin", "wrong"));
    }

    @Test
    public void testAddManagerAndRetrieve() {
        Manager m = new Manager("mgr1", "pwd", new DesignPatterns.ParkingProxy(true));
        db.addManager(m);
        assertTrue(db.getManagers().stream().anyMatch(man -> man.getUsername().equals("mgr1")));
    }

    @Test
    public void testUserExistsAndEmailExists() {
        User visitor = new Visitor("vis", "vis@mail.com", "pwd", "ABC123");
        db.addAccount(visitor);
        assertTrue(db.userExists("vis"));
        assertTrue(db.emailExists("vis@mail.com"));
    }

    @Test
    public void testDuplicateUserAddPreventsAddition() throws IOException {
        User v = new Visitor("v1", "v1@mail.com", "pass", "XYZ123");
        db.addAccount(v);
        db.addAccount(v); // should be ignored

        long count = db.getUsers().stream().filter(u -> u.getUsername().equals("v1")).count();
        assertEquals(1, count);
    }

    @Test
    public void testUnvalidatedUsers() {
        User s = new Student("student", "s@mail.com", "pass", "CAR12");
        db.addAccount(s);
        assertTrue(db.getUnvalidatedUsers().stream().anyMatch(u -> u.getUsername().equals("student")));
    }

    @Test
    public void testValidUserCredentials() {
        User s = new Student("auth", "auth@mail.com", "123", "111AAA");
        db.addAccount(s);
        assertTrue(db.validUser("auth", "123"));
        assertFalse(db.validUser("auth", "wrong"));
    }

    @Test
    public void testGetUserByUsername() {
        User u = new Faculty("findme", "find@me.com", "pw", "CAR45");
        db.addAccount(u);
        assertNotNull(db.getUserByUsername("findme"));
        assertNull(db.getUserByUsername("ghost"));
    }

    @Test
    public void testGetUserType() {
        User u = new Staff("typetest", "t@mail.com", "pw", "X1Y2Z3");
        db.addAccount(u);
        assertEquals("staff", db.getUserType("typetest"));
    }

    @Test
    public void testAddAndRetrieveParkingLot() {
        ParkingLot lot = new ParkingLot("P100");
        db.addParkingLot(lot);
        assertTrue(db.getParkingLots().stream().anyMatch(l -> l.getLotId().equals("P100")));
    }

    @Test
    public void testUpdateAndRemoveParkingLot() {
        ParkingLot lot = new ParkingLot("L123");
        db.addParkingLot(lot);
        db.updateParkingLotStatus("L123", true);
        assertTrue(db.getParkingLots().stream().anyMatch(l -> l.getLotId().equals("L123") && l.isDisabled()));

        db.removeParkingLot("L123");
        assertFalse(db.getParkingLots().stream().anyMatch(l -> l.getLotId().equals("L123")));
    }

    @Test
    public void testAddAndFindBookingById() {
        ParkingSpace space = new ParkingSpace("P1", "L1");
        Booking b = new Booking("B100", "u1", "P1", space, LocalTime.of(8, 0), LocalTime.of(9, 0));
        db.addBooking(b);

        Booking found = db.findBookingById("B100");
        assertNotNull(found);
        assertEquals("B100", found.getBookingId());
    }

    @Test
    public void testCancelBooking() {
        ParkingSpace space = new ParkingSpace("P2", "L2");
        Booking b = new Booking("B101", "u2", "P2", space, LocalTime.of(10, 0), LocalTime.of(11, 0));
        db.addBooking(b);

        db.cancelBooking("B101");
        assertNull(db.findBookingById("B101"));
    }

    @Test
    public void testUpdateBookingPaymentStatus() {
        ParkingSpace space = new ParkingSpace("P3", "L3");
        Booking b = new Booking("B102", "u3", "P3", space, LocalTime.of(12, 0), LocalTime.of(13, 0));
        db.addBooking(b);

        db.updateBookingPaymentStatus("B102", true);
        Booking updated = db.findBookingById("B102");
        assertTrue(updated.isPaid());
    }

    @Test
    public void testGetUserBooking() {
        ParkingSpace space = new ParkingSpace("P4", "L4");
        Booking b = new Booking("B103", "specialUser", "P4", space, LocalTime.of(14, 0), LocalTime.of(15, 0));
        db.addBooking(b);

        List<Booking> userBookings = db.getuserBooking("specialUser");
        assertEquals(1, userBookings.size());
        assertEquals("B103", userBookings.get(0).getBookingId());
    }
}
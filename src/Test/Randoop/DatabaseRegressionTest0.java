import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DatabaseRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        Database.Database database0 = Database.Database.getInstance();
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addAccount(user1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.User.getUsername()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Manager manager5 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addManager(manager5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Manager.getUsername()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        Models.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addBooking(booking3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        Models.Booking booking7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = database0.serializeBooking(booking7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        java.lang.Class<?> wildcardClass9 = database0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Database.Database database0 = Database.Database.getInstance();
        database0.markBookingAsPaid("hi!");
        Models.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = database0.serializeBooking(booking3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        java.util.ArrayList<Models.Booking> bookingList6 = database0.getuserBooking("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        Models.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = database0.serializeBooking(booking8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Database.Database database0 = Database.Database.getInstance();
        boolean boolean3 = database0.validManager("", "hi!");
        Models.Booking booking4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = database0.serializeBooking(booking4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validManager("", "hi!");
        Models.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addAccount(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.User.getUsername()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        boolean boolean7 = database0.validSuperManager("", "");
        Models.ParkingLot parkingLot8 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addParkingLot(parkingLot8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingLot.getLotId()\" because \"parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validManager("", "hi!");
        boolean boolean11 = database0.userExists("hi!");
        Models.Booking booking12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = database0.serializeBooking(booking12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validSuperManager("", "");
        Models.ParkingLot parkingLot10 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addParkingLot(parkingLot10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingLot.getLotId()\" because \"parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        Models.Booking booking5 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addBooking(booking5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validSuperManager("", "");
        Models.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addAccount(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.User.getUsername()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Database.Database database0 = Database.Database.getInstance();
        database0.markBookingAsPaid("hi!");
        boolean boolean5 = database0.validManager("", "");
        boolean boolean8 = database0.validSuperManager("", "");
        boolean boolean10 = database0.userExists("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        boolean boolean9 = database0.userExists("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        java.lang.Class<?> wildcardClass9 = superManager8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        database0.removeParkingLot("hi!");
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        boolean boolean9 = database0.validUser("", "");
        database0.updateParkingLotStatus("", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validManager("", "hi!");
        Models.User user11 = database0.getUserByUsername("hi!");
        boolean boolean13 = database0.userExists("");
        Models.Booking booking15 = database0.findBookingById("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking15);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.Booking booking5 = database0.findBookingById("");
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        boolean boolean8 = database0.userExists("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validManager("", "hi!");
        boolean boolean11 = database0.userExists("hi!");
        database0.markBookingAsPaid("");
        Database.Database database14 = Database.Database.getInstance();
        boolean boolean17 = database14.validManager("", "hi!");
        Models.SuperManager superManager18 = database14.getSuperManager();
        database0.addManager((Models.Manager) superManager18);
        java.util.ArrayList<Models.ParkingLot> parkingLotList20 = database0.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList20);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking5 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addBooking(booking5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        Models.Booking booking9 = database0.findBookingById("hi!");
        database0.markBookingAsPaid("hi!");
        database0.updateBookingPaymentStatus("hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking9);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.Booking booking5 = database0.findBookingById("");
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        Models.Booking booking8 = database0.findBookingById("hi!");
        Models.Booking booking10 = database0.findBookingById("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        java.util.ArrayList<Models.User> userList8 = database0.getUsers();
        database0.updateParkingLotStatus("visitor", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validManager("", "hi!");
        boolean boolean11 = database0.userExists("hi!");
        database0.markBookingAsPaid("");
        Database.Database database14 = Database.Database.getInstance();
        boolean boolean17 = database14.validManager("", "hi!");
        Models.SuperManager superManager18 = database14.getSuperManager();
        database0.addManager((Models.Manager) superManager18);
        boolean boolean21 = database0.userExists("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = database0.serializeBooking(booking8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        java.util.ArrayList<Models.Booking> bookingList9 = database0.getuserBooking("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList9);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getuserBooking("");
        boolean boolean12 = database0.userExists("");
        java.util.ArrayList<Models.Booking> bookingList14 = database0.getuserBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList14);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        Models.SuperManager superManager9 = database0.getSuperManager();
        Models.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addAccount(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.User.getUsername()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        java.lang.Class<?> wildcardClass4 = database0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        boolean boolean6 = database0.validSuperManager("hi!", "hi!");
        java.util.ArrayList<Models.ParkingLot> parkingLotList7 = database0.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getuserBooking("");
        database0.cancelBooking("visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.User user6 = database0.getUserByUsername("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        boolean boolean8 = database0.userExists("");
        Models.Booking booking9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = database0.serializeBooking(booking9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        Models.Booking booking7 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addBooking(booking7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.Booking booking5 = database0.findBookingById("");
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        Models.Booking booking8 = database0.findBookingById("hi!");
        boolean boolean11 = database0.validUser("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.Booking booking5 = database0.findBookingById("");
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        Models.Booking booking8 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.ParkingLot parkingLot11 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addParkingLot(parkingLot11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingLot.getLotId()\" because \"parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.Booking booking5 = database0.findBookingById("");
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        Models.Booking booking8 = database0.findBookingById("");
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getuserBooking("");
        java.util.ArrayList<Models.Booking> bookingList11 = database0.getBookings();
        database0.updateBookingPaymentStatus("", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList11);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        java.util.ArrayList<Models.Booking> bookingList6 = database0.getuserBooking("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        Models.SuperManager superManager8 = database0.getSuperManager();
        boolean boolean10 = database0.userExists("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getuserBooking("");
        boolean boolean12 = database0.userExists("");
        database0.updateParkingLotStatus("", false);
        database0.cancelBooking("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList18 = database0.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList18);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addAccount(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.User.getUsername()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        java.util.ArrayList<Models.User> userList8 = database0.getUsers();
        Models.Booking booking9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = database0.serializeBooking(booking9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Database.Database database0 = Database.Database.getInstance();
        java.util.ArrayList<Models.Booking> bookingList2 = database0.getuserBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getuserBooking("");
        boolean boolean12 = database0.userExists("");
        Models.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addAccount(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.User.getUsername()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        Models.ParkingLot parkingLot8 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addParkingLot(parkingLot8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingLot.getLotId()\" because \"parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        java.util.ArrayList<Models.User> userList8 = database0.getUsers();
        Database.Database database9 = Database.Database.getInstance();
        Models.Booking booking11 = database9.findBookingById("");
        database9.cancelBooking("");
        database9.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList16 = database9.getBookings();
        Models.SuperManager superManager17 = database9.getSuperManager();
        database0.addManager((Models.Manager) superManager17);
        Database.Database database19 = Database.Database.getInstance();
        boolean boolean22 = database19.validManager("", "hi!");
        Models.SuperManager superManager23 = database19.getSuperManager();
        database0.addManager((Models.Manager) superManager23);
        Models.Booking booking26 = database0.findBookingById("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking26);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        java.lang.String str8 = database0.getUserType("");
        java.util.ArrayList<Models.Manager> managerList9 = database0.getManagers();
        java.lang.String str11 = database0.getUserType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "visitor" + "'", str8.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "visitor" + "'", str11.equals("visitor"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        boolean boolean9 = database0.validSuperManager("", "hi!");
        boolean boolean12 = database0.validUser("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        java.util.ArrayList<Models.Booking> bookingList6 = database0.getuserBooking("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        java.util.ArrayList<Models.ParkingLot> parkingLotList8 = database0.getParkingLots();
        boolean boolean11 = database0.validUser("", "hi!");
        Models.ParkingLot parkingLot12 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addParkingLot(parkingLot12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingLot.getLotId()\" because \"parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.Booking booking5 = database0.findBookingById("");
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        Models.Booking booking8 = database0.findBookingById("hi!");
        java.util.ArrayList<Models.Booking> bookingList9 = database0.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        java.util.ArrayList<Models.Booking> bookingList6 = database0.getuserBooking("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        Models.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addBooking(booking8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        java.util.ArrayList<Models.User> userList8 = database0.getUsers();
        Models.User user10 = database0.getUserByUsername("hi!");
        Models.Booking booking12 = database0.findBookingById("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking12);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Database.Database database0 = Database.Database.getInstance();
        java.util.ArrayList<Models.ParkingLot> parkingLotList1 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList2 = database0.getUsers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validSuperManager("", "");
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getBookings();
        database0.cancelBooking("hi!");
        database0.updateBookingPaymentStatus("visitor", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.updateBookingPaymentStatus("visitor", false);
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.Booking booking5 = database0.findBookingById("");
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        Models.Booking booking8 = database0.findBookingById("");
        database0.cancelBooking("");
        Database.Database database11 = Database.Database.getInstance();
        Models.Booking booking13 = database11.findBookingById("");
        database11.cancelBooking("");
        Models.Booking booking17 = database11.findBookingById("hi!");
        boolean boolean20 = database11.validManager("", "hi!");
        Models.SuperManager superManager21 = database11.getSuperManager();
        database0.addManager((Models.Manager) superManager21);
        java.lang.String str24 = database0.getUserType("");
        java.util.ArrayList<Models.User> userList25 = database0.getUsers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "visitor" + "'", str24.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        database0.removeParkingLot("hi!");
        boolean boolean8 = database0.validSuperManager("", "");
        java.util.ArrayList<Models.User> userList9 = database0.getUsers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        java.util.ArrayList<Models.User> userList8 = database0.getUsers();
        Database.Database database9 = Database.Database.getInstance();
        Models.Booking booking11 = database9.findBookingById("");
        database9.cancelBooking("");
        database9.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList16 = database9.getBookings();
        Models.SuperManager superManager17 = database9.getSuperManager();
        database0.addManager((Models.Manager) superManager17);
        Models.Booking booking19 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addBooking(booking19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager17);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Database.Database database0 = Database.Database.getInstance();
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Manager> managerList3 = database0.getManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Database.Database database0 = Database.Database.getInstance();
        Models.SuperManager superManager1 = database0.getSuperManager();
        database0.markBookingAsPaid("");
        Models.Booking booking4 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addBooking(booking4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        java.util.ArrayList<Models.Manager> managerList8 = database0.getManagers();
        Models.Booking booking9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = database0.serializeBooking(booking9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        boolean boolean5 = database0.validManager("", "");
        Models.ParkingLot parkingLot6 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addParkingLot(parkingLot6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingLot.getLotId()\" because \"parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        boolean boolean6 = database0.validSuperManager("hi!", "hi!");
        database0.markBookingAsPaid("hi!");
        Models.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addAccount(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.User.getUsername()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Database.Database database0 = Database.Database.getInstance();
        Models.SuperManager superManager1 = database0.getSuperManager();
        database0.markBookingAsPaid("");
        java.util.ArrayList<Models.Booking> bookingList5 = database0.getuserBooking("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.markBookingAsPaid("hi!");
        java.util.ArrayList<Models.ParkingLot> parkingLotList7 = database0.getParkingLots();
        java.lang.Class<?> wildcardClass8 = parkingLotList7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.SuperManager superManager4 = database0.getSuperManager();
        Models.ParkingLot parkingLot5 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addParkingLot(parkingLot5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingLot.getLotId()\" because \"parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getuserBooking("");
        boolean boolean12 = database0.userExists("");
        database0.updateParkingLotStatus("", false);
        java.lang.String str17 = database0.getUserType("hi!");
        Models.ParkingLot parkingLot18 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addParkingLot(parkingLot18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingLot.getLotId()\" because \"parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "visitor" + "'", str17.equals("visitor"));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        database0.removeParkingLot("hi!");
        boolean boolean8 = database0.validManager("hi!", "");
        java.lang.Class<?> wildcardClass9 = database0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        java.util.ArrayList<Models.Booking> bookingList6 = database0.getuserBooking("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        Models.SuperManager superManager8 = database0.getSuperManager();
        database0.markBookingAsPaid("hi!");
        java.util.ArrayList<Models.Booking> bookingList11 = database0.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList11);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getuserBooking("");
        boolean boolean12 = database0.userExists("");
        database0.updateParkingLotStatus("", false);
        boolean boolean18 = database0.validManager("hi!", "hi!");
        database0.updateBookingPaymentStatus("hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Database.Database database0 = Database.Database.getInstance();
        database0.markBookingAsPaid("hi!");
        java.util.ArrayList<Models.User> userList3 = database0.getUnvalidatedUsers();
        boolean boolean6 = database0.validUser("", "");
        boolean boolean9 = database0.validUser("visitor", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        database0.removeParkingLot("hi!");
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        database0.updateBookingPaymentStatus("visitor", true);
        boolean boolean11 = database0.emailExists("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validManager("", "hi!");
        Models.User user11 = database0.getUserByUsername("hi!");
        Models.User user13 = database0.getUserByUsername("");
        java.lang.Class<?> wildcardClass14 = database0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.Booking booking5 = database0.findBookingById("");
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        Models.Booking booking8 = database0.findBookingById("");
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getuserBooking("");
        java.util.ArrayList<Models.Booking> bookingList11 = database0.getBookings();
        database0.markBookingAsPaid("");
        boolean boolean16 = database0.validUser("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Database.Database database0 = Database.Database.getInstance();
        database0.markBookingAsPaid("hi!");
        Models.User user4 = database0.getUserByUsername("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        boolean boolean7 = database0.validSuperManager("", "");
        java.util.ArrayList<Models.Manager> managerList8 = database0.getManagers();
        Models.Booking booking9 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addBooking(booking9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList8);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.markBookingAsPaid("hi!");
        java.util.ArrayList<Models.ParkingLot> parkingLotList7 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList8 = database0.getUsers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        java.util.ArrayList<Models.User> userList5 = database0.getUsers();
        Models.Booking booking6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = database0.serializeBooking(booking6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Database.Database database0 = Database.Database.getInstance();
        boolean boolean3 = database0.validManager("", "hi!");
        Models.SuperManager superManager4 = database0.getSuperManager();
        Models.ParkingLot parkingLot5 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addParkingLot(parkingLot5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingLot.getLotId()\" because \"parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager4);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validManager("", "hi!");
        Models.SuperManager superManager10 = database0.getSuperManager();
        Models.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addAccount(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.User.getUsername()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager10);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.Booking booking5 = database0.findBookingById("");
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        Models.Booking booking8 = database0.findBookingById("hi!");
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getuserBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.Booking booking5 = database0.findBookingById("");
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        Models.Booking booking8 = database0.findBookingById("");
        database0.cancelBooking("");
        Database.Database database11 = Database.Database.getInstance();
        Models.Booking booking13 = database11.findBookingById("");
        database11.cancelBooking("");
        Models.Booking booking17 = database11.findBookingById("hi!");
        boolean boolean20 = database11.validManager("", "hi!");
        Models.SuperManager superManager21 = database11.getSuperManager();
        database0.addManager((Models.Manager) superManager21);
        Models.User user23 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addAccount(user23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.User.getUsername()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager21);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validSuperManager("", "");
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getBookings();
        Models.User user12 = database0.getUserByUsername("hi!");
        database0.removeParkingLot("visitor");
        boolean boolean17 = database0.validSuperManager("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        java.util.ArrayList<Models.User> userList8 = database0.getUsers();
        Models.User user10 = database0.getUserByUsername("hi!");
        Models.Booking booking11 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addBooking(booking11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        Models.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = database0.serializeBooking(booking3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Database.Database database0 = Database.Database.getInstance();
        Models.SuperManager superManager1 = database0.getSuperManager();
        database0.markBookingAsPaid("");
        boolean boolean6 = database0.validUser("", "");
        database0.updateBookingPaymentStatus("hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.Booking booking5 = database0.findBookingById("");
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        boolean boolean8 = database0.emailExists("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        java.util.ArrayList<Models.ParkingLot> parkingLotList4 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList5 = database0.getUsers();
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.updateBookingPaymentStatus("visitor", false);
        Models.Booking booking6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = database0.serializeBooking(booking6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Database.Database database0 = Database.Database.getInstance();
        boolean boolean3 = database0.validManager("", "hi!");
        java.lang.Class<?> wildcardClass4 = database0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.updateParkingLotStatus("hi!", true);
        Models.User user9 = database0.getUserByUsername("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        java.util.ArrayList<Models.User> userList8 = database0.getUsers();
        Models.User user10 = database0.getUserByUsername("hi!");
        Models.Booking booking12 = database0.findBookingById("visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking12);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Database.Database database0 = Database.Database.getInstance();
        boolean boolean3 = database0.validManager("", "hi!");
        Models.SuperManager superManager4 = database0.getSuperManager();
        java.util.ArrayList<Models.Manager> managerList5 = database0.getManagers();
        boolean boolean7 = database0.emailExists("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.Manager> managerList3 = database0.getManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList3);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.Booking booking5 = database0.findBookingById("");
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        Models.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addAccount(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.User.getUsername()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        java.util.ArrayList<Models.Booking> bookingList6 = database0.getuserBooking("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        Models.SuperManager superManager8 = database0.getSuperManager();
        database0.markBookingAsPaid("hi!");
        Models.Booking booking11 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addBooking(booking11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        java.util.ArrayList<Models.Booking> bookingList9 = database0.getuserBooking("hi!");
        database0.updateParkingLotStatus("", false);
        database0.cancelBooking("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList9);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        java.util.ArrayList<Models.User> userList8 = database0.getUsers();
        Database.Database database9 = Database.Database.getInstance();
        Models.Booking booking11 = database9.findBookingById("");
        database9.cancelBooking("");
        database9.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList16 = database9.getBookings();
        Models.SuperManager superManager17 = database9.getSuperManager();
        database0.addManager((Models.Manager) superManager17);
        boolean boolean21 = database0.validSuperManager("", "");
        Models.Booking booking23 = database0.findBookingById("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking23);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        java.util.ArrayList<Models.Booking> bookingList6 = database0.getuserBooking("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        java.util.ArrayList<Models.ParkingLot> parkingLotList8 = database0.getParkingLots();
        boolean boolean10 = database0.userExists("hi!");
        java.util.ArrayList<Models.ParkingLot> parkingLotList11 = database0.getParkingLots();
        boolean boolean14 = database0.validUser("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.Booking booking5 = database0.findBookingById("");
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        Models.Booking booking8 = database0.findBookingById("");
        Database.Database database9 = Database.Database.getInstance();
        Models.Booking booking11 = database9.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList12 = database9.getParkingLots();
        java.util.ArrayList<Models.User> userList13 = database9.getUsers();
        java.util.ArrayList<Models.Booking> bookingList15 = database9.getuserBooking("hi!");
        java.util.ArrayList<Models.User> userList16 = database9.getUnvalidatedUsers();
        Models.SuperManager superManager17 = database9.getSuperManager();
        database0.addManager((Models.Manager) superManager17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager17);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        Models.Booking booking9 = database0.findBookingById("hi!");
        java.util.ArrayList<Models.Booking> bookingList11 = database0.getuserBooking("hi!");
        Models.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addAccount(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.User.getUsername()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList11);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.Booking booking5 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList6 = database0.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        boolean boolean7 = database0.validManager("visitor", "");
        Models.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = database0.serializeBooking(booking8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        java.lang.String str8 = database0.getUserType("");
        java.util.ArrayList<Models.Manager> managerList9 = database0.getManagers();
        Models.ParkingLot parkingLot10 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addParkingLot(parkingLot10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingLot.getLotId()\" because \"parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "visitor" + "'", str8.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        Models.ParkingLot parkingLot7 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addParkingLot(parkingLot7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingLot.getLotId()\" because \"parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        java.util.ArrayList<Models.Booking> bookingList9 = database0.getuserBooking("hi!");
        database0.updateParkingLotStatus("", false);
        boolean boolean15 = database0.validUser("visitor", "");
        java.lang.String str17 = database0.getUserType("visitor");
        Models.Booking booking18 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addBooking(booking18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "visitor" + "'", str17.equals("visitor"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validSuperManager("", "");
        java.util.ArrayList<Models.User> userList10 = database0.getUsers();
        Models.Booking booking12 = database0.findBookingById("");
        java.util.ArrayList<Models.Manager> managerList13 = database0.getManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList13);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        java.lang.String str8 = database0.getUserType("");
        boolean boolean11 = database0.validManager("visitor", "visitor");
        database0.updateBookingPaymentStatus("", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "visitor" + "'", str8.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        Models.SuperManager superManager9 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList11 = database0.getuserBooking("");
        boolean boolean13 = database0.userExists("visitor");
        boolean boolean15 = database0.emailExists("hi!");
        java.lang.String str17 = database0.getUserType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "visitor" + "'", str17.equals("visitor"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        Models.SuperManager superManager9 = database0.getSuperManager();
        database0.cancelBooking("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager9);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Database.Database database0 = Database.Database.getInstance();
        database0.markBookingAsPaid("hi!");
        java.util.ArrayList<Models.User> userList3 = database0.getUnvalidatedUsers();
        java.util.ArrayList<Models.ParkingLot> parkingLotList4 = database0.getParkingLots();
        Models.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addAccount(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.User.getUsername()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        java.util.ArrayList<Models.User> userList5 = database0.getUnvalidatedUsers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validManager("", "hi!");
        boolean boolean11 = database0.userExists("hi!");
        boolean boolean14 = database0.validManager("hi!", "visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        java.util.ArrayList<Models.Booking> bookingList6 = database0.getuserBooking("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        Models.SuperManager superManager8 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getuserBooking("");
        Database.Database database11 = Database.Database.getInstance();
        boolean boolean14 = database11.validManager("", "hi!");
        Models.SuperManager superManager15 = database11.getSuperManager();
        database0.addManager((Models.Manager) superManager15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager15);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Database.Database database0 = Database.Database.getInstance();
        boolean boolean3 = database0.validManager("", "hi!");
        Models.SuperManager superManager4 = database0.getSuperManager();
        Models.Booking booking5 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addBooking(booking5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager4);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validManager("", "hi!");
        boolean boolean11 = database0.userExists("hi!");
        database0.markBookingAsPaid("");
        Database.Database database14 = Database.Database.getInstance();
        boolean boolean17 = database14.validManager("", "hi!");
        Models.SuperManager superManager18 = database14.getSuperManager();
        database0.addManager((Models.Manager) superManager18);
        Models.Booking booking20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = database0.serializeBooking(booking20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager18);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        java.lang.String str8 = database0.getUserType("");
        boolean boolean11 = database0.validManager("visitor", "visitor");
        java.util.ArrayList<Models.Booking> bookingList12 = database0.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "visitor" + "'", str8.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList12);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getuserBooking("");
        boolean boolean12 = database0.userExists("");
        database0.updateParkingLotStatus("", false);
        database0.cancelBooking("");
        database0.removeParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        java.util.ArrayList<Models.Booking> bookingList6 = database0.getuserBooking("hi!");
        boolean boolean9 = database0.validUser("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        database0.updateBookingPaymentStatus("visitor", false);
        java.util.ArrayList<Models.Booking> bookingList11 = database0.getBookings();
        boolean boolean13 = database0.userExists("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Database.Database database0 = Database.Database.getInstance();
        boolean boolean3 = database0.validManager("", "hi!");
        Models.SuperManager superManager4 = database0.getSuperManager();
        database0.cancelBooking("visitor");
        java.lang.String str8 = database0.getUserType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "visitor" + "'", str8.equals("visitor"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        java.util.ArrayList<Models.Booking> bookingList9 = database0.getuserBooking("hi!");
        database0.updateParkingLotStatus("", false);
        boolean boolean15 = database0.validUser("visitor", "");
        java.lang.String str17 = database0.getUserType("visitor");
        java.util.ArrayList<Models.User> userList18 = database0.getUnvalidatedUsers();
        java.lang.String str20 = database0.getUserType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "visitor" + "'", str17.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "visitor" + "'", str20.equals("visitor"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        database0.removeParkingLot("hi!");
        boolean boolean7 = database0.emailExists("visitor");
        database0.updateBookingPaymentStatus("visitor", true);
        database0.updateBookingPaymentStatus("", true);
        database0.cancelBooking("visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        java.util.ArrayList<Models.Booking> bookingList6 = database0.getuserBooking("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        Models.SuperManager superManager8 = database0.getSuperManager();
        Models.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addAccount(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.User.getUsername()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.SuperManager superManager4 = database0.getSuperManager();
        Database.Database database5 = Database.Database.getInstance();
        Models.Booking booking7 = database5.findBookingById("");
        database5.cancelBooking("");
        Models.Booking booking11 = database5.findBookingById("hi!");
        boolean boolean14 = database5.validManager("", "hi!");
        Models.SuperManager superManager15 = database5.getSuperManager();
        database0.addManager((Models.Manager) superManager15);
        boolean boolean19 = database0.validManager("visitor", "visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validSuperManager("", "");
        Models.SuperManager superManager10 = database0.getSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        Database.Database database0 = Database.Database.getInstance();
        database0.markBookingAsPaid("hi!");
        java.util.ArrayList<Models.Booking> bookingList3 = database0.getBookings();
        database0.updateParkingLotStatus("", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        Models.Booking booking9 = database0.findBookingById("hi!");
        java.util.ArrayList<Models.Booking> bookingList11 = database0.getuserBooking("hi!");
        java.util.ArrayList<Models.ParkingLot> parkingLotList12 = database0.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        boolean boolean9 = database0.validSuperManager("", "hi!");
        Models.ParkingLot parkingLot10 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addParkingLot(parkingLot10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingLot.getLotId()\" because \"parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        Models.SuperManager superManager9 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList11 = database0.getuserBooking("");
        boolean boolean13 = database0.userExists("visitor");
        java.util.ArrayList<Models.Booking> bookingList15 = database0.getuserBooking("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList15);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Database.Database database0 = Database.Database.getInstance();
        database0.removeParkingLot("");
        Models.Booking booking4 = database0.findBookingById("visitor");
        java.util.ArrayList<Models.Booking> bookingList5 = database0.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList5);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        database0.markBookingAsPaid("visitor");
        java.util.ArrayList<Models.User> userList9 = database0.getUnvalidatedUsers();
        Models.Booking booking10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = database0.serializeBooking(booking10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        boolean boolean9 = database0.validSuperManager("", "hi!");
        Models.Booking booking11 = database0.findBookingById("hi!");
        database0.updateParkingLotStatus("visitor", false);
        java.util.ArrayList<Models.Booking> bookingList15 = database0.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList15);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validManager("", "hi!");
        Models.User user11 = database0.getUserByUsername("hi!");
        Models.Booking booking12 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addBooking(booking12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        boolean boolean9 = database0.validSuperManager("", "hi!");
        boolean boolean12 = database0.validManager("", "visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        Models.Booking booking9 = database0.findBookingById("hi!");
        boolean boolean12 = database0.validUser("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        Database.Database database0 = Database.Database.getInstance();
        Models.SuperManager superManager1 = database0.getSuperManager();
        database0.markBookingAsPaid("");
        Models.ParkingLot parkingLot4 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addParkingLot(parkingLot4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingLot.getLotId()\" because \"parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.Booking booking5 = database0.findBookingById("");
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        Models.Booking booking8 = database0.findBookingById("");
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getuserBooking("");
        database0.removeParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        database0.removeParkingLot("hi!");
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        Models.Booking booking7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = database0.serializeBooking(booking7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        java.util.ArrayList<Models.User> userList5 = database0.getUsers();
        database0.updateBookingPaymentStatus("hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        java.lang.String str8 = database0.getUserType("");
        boolean boolean11 = database0.validSuperManager("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "visitor" + "'", str8.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        database0.removeParkingLot("");
        boolean boolean7 = database0.userExists("");
        boolean boolean10 = database0.validManager("", "visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        java.util.ArrayList<Models.Manager> managerList8 = database0.getManagers();
        database0.cancelBooking("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList8);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        java.util.ArrayList<Models.User> userList5 = database0.getUsers();
        Models.User user7 = database0.getUserByUsername("visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.Booking booking5 = database0.findBookingById("");
        database0.updateParkingLotStatus("hi!", true);
        database0.markBookingAsPaid("visitor");
        Models.Booking booking11 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addBooking(booking11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking5);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        database0.markBookingAsPaid("visitor");
        java.util.ArrayList<Models.User> userList9 = database0.getUnvalidatedUsers();
        java.util.ArrayList<Models.User> userList10 = database0.getUnvalidatedUsers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        Models.Booking booking9 = database0.findBookingById("hi!");
        database0.markBookingAsPaid("hi!");
        Models.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addAccount(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.User.getUsername()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking9);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        database0.cancelBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validManager("", "hi!");
        Models.User user11 = database0.getUserByUsername("hi!");
        java.util.ArrayList<Models.Booking> bookingList12 = database0.getBookings();
        java.util.ArrayList<Models.User> userList13 = database0.getUsers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        database0.removeParkingLot("hi!");
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        database0.updateBookingPaymentStatus("visitor", true);
        Models.User user11 = database0.getUserByUsername("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        database0.removeParkingLot("hi!");
        boolean boolean7 = database0.emailExists("visitor");
        database0.updateBookingPaymentStatus("visitor", true);
        boolean boolean13 = database0.validSuperManager("visitor", "visitor");
        java.util.ArrayList<Models.ParkingLot> parkingLotList14 = database0.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        java.util.ArrayList<Models.User> userList8 = database0.getUsers();
        java.lang.String str10 = database0.getUserType("");
        database0.updateBookingPaymentStatus("hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "visitor" + "'", str10.equals("visitor"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        java.lang.String str8 = database0.getUserType("");
        java.util.ArrayList<Models.Manager> managerList9 = database0.getManagers();
        boolean boolean12 = database0.validManager("", "hi!");
        Models.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addAccount(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.User.getUsername()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "visitor" + "'", str8.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        java.util.ArrayList<Models.Booking> bookingList6 = database0.getuserBooking("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        database0.updateBookingPaymentStatus("", true);
        database0.updateBookingPaymentStatus("visitor", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        java.util.ArrayList<Models.Booking> bookingList6 = database0.getuserBooking("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        Models.SuperManager superManager8 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getuserBooking("");
        java.util.ArrayList<Models.Booking> bookingList11 = database0.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList11);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        boolean boolean9 = database0.validUser("", "hi!");
        database0.removeParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.SuperManager superManager4 = database0.getSuperManager();
        boolean boolean6 = database0.emailExists("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        boolean boolean6 = database0.validSuperManager("hi!", "hi!");
        database0.markBookingAsPaid("hi!");
        Models.SuperManager superManager9 = database0.getSuperManager();
        database0.markBookingAsPaid("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager9);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        Models.SuperManager superManager9 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList11 = database0.getuserBooking("");
        database0.updateBookingPaymentStatus("hi!", true);
        java.util.ArrayList<Models.Manager> managerList15 = database0.getManagers();
        Models.Booking booking16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = database0.serializeBooking(booking16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList15);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        java.util.ArrayList<Models.Booking> bookingList6 = database0.getuserBooking("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        Models.SuperManager superManager8 = database0.getSuperManager();
        database0.cancelBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        java.lang.String str8 = database0.getUserType("");
        java.util.ArrayList<Models.Manager> managerList9 = database0.getManagers();
        database0.cancelBooking("hi!");
        java.lang.String str13 = database0.getUserType("");
        database0.cancelBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "visitor" + "'", str8.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "visitor" + "'", str13.equals("visitor"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        Models.SuperManager superManager9 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList11 = database0.getuserBooking("");
        database0.updateBookingPaymentStatus("hi!", true);
        java.util.ArrayList<Models.Manager> managerList15 = database0.getManagers();
        java.util.ArrayList<Models.Manager> managerList16 = database0.getManagers();
        java.util.ArrayList<Models.Manager> managerList17 = database0.getManagers();
        database0.cancelBooking("visitor");
        java.util.ArrayList<Models.User> userList20 = database0.getUnvalidatedUsers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.SuperManager superManager4 = database0.getSuperManager();
        Database.Database database5 = Database.Database.getInstance();
        Models.Booking booking7 = database5.findBookingById("");
        database5.cancelBooking("");
        Models.Booking booking11 = database5.findBookingById("hi!");
        boolean boolean14 = database5.validManager("", "hi!");
        Models.SuperManager superManager15 = database5.getSuperManager();
        database0.addManager((Models.Manager) superManager15);
        Models.ParkingLot parkingLot17 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addParkingLot(parkingLot17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingLot.getLotId()\" because \"parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager15);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validSuperManager("", "");
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getBookings();
        Models.SuperManager superManager11 = database0.getSuperManager();
        java.lang.String str13 = database0.getUserType("visitor");
        Models.User user15 = database0.getUserByUsername("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "visitor" + "'", str13.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        database0.removeParkingLot("hi!");
        boolean boolean8 = database0.validManager("hi!", "");
        boolean boolean11 = database0.validSuperManager("", "");
        boolean boolean14 = database0.validSuperManager("", "visitor");
        Models.Booking booking15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = database0.serializeBooking(booking15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Database.Database database0 = Database.Database.getInstance();
        database0.removeParkingLot("");
        Models.Booking booking4 = database0.findBookingById("visitor");
        java.util.ArrayList<Models.ParkingLot> parkingLotList5 = database0.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        java.util.ArrayList<Models.User> userList9 = database0.getUsers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validSuperManager("", "");
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getBookings();
        Models.SuperManager superManager11 = database0.getSuperManager();
        Models.Booking booking12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = database0.serializeBooking(booking12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager11);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.Booking booking4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = database0.serializeBooking(booking4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        Database.Database database0 = Database.Database.getInstance();
        database0.markBookingAsPaid("hi!");
        boolean boolean5 = database0.validManager("", "");
        boolean boolean7 = database0.userExists("hi!");
        Models.ParkingLot parkingLot8 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addParkingLot(parkingLot8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingLot.getLotId()\" because \"parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.markBookingAsPaid("hi!");
        java.util.ArrayList<Models.ParkingLot> parkingLotList7 = database0.getParkingLots();
        boolean boolean10 = database0.validManager("visitor", "visitor");
        Models.User user12 = database0.getUserByUsername("visitor");
        Models.Booking booking13 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addBooking(booking13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        java.util.ArrayList<Models.Booking> bookingList6 = database0.getuserBooking("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        Models.SuperManager superManager8 = database0.getSuperManager();
        java.util.ArrayList<Models.Manager> managerList9 = database0.getManagers();
        Database.Database database10 = Database.Database.getInstance();
        Models.Booking booking12 = database10.findBookingById("");
        database10.cancelBooking("");
        database10.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList17 = database10.getBookings();
        Models.SuperManager superManager18 = database10.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList20 = database10.getuserBooking("");
        Models.SuperManager superManager21 = database10.getSuperManager();
        database0.addManager((Models.Manager) superManager21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager21);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        Database.Database database0 = Database.Database.getInstance();
        java.util.ArrayList<Models.ParkingLot> parkingLotList1 = database0.getParkingLots();
        java.util.ArrayList<Models.Booking> bookingList2 = database0.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validSuperManager("", "");
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getBookings();
        boolean boolean12 = database0.emailExists("visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        Models.SuperManager superManager9 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList11 = database0.getuserBooking("");
        java.lang.String str13 = database0.getUserType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "visitor" + "'", str13.equals("visitor"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        database0.removeParkingLot("hi!");
        boolean boolean8 = database0.validSuperManager("", "");
        boolean boolean10 = database0.emailExists("hi!");
        java.lang.String str12 = database0.getUserType("");
        Models.Booking booking13 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addBooking(booking13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "visitor" + "'", str12.equals("visitor"));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getuserBooking("");
        boolean boolean12 = database0.userExists("");
        database0.updateParkingLotStatus("", true);
        java.util.ArrayList<Models.ParkingLot> parkingLotList16 = database0.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList16);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        java.util.ArrayList<Models.Booking> bookingList6 = database0.getuserBooking("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        Models.SuperManager superManager8 = database0.getSuperManager();
        Models.ParkingLot parkingLot9 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addParkingLot(parkingLot9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingLot.getLotId()\" because \"parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        java.lang.String str8 = database0.getUserType("");
        boolean boolean11 = database0.validManager("visitor", "visitor");
        java.util.ArrayList<Models.ParkingLot> parkingLotList12 = database0.getParkingLots();
        java.lang.String str14 = database0.getUserType("visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "visitor" + "'", str8.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "visitor" + "'", str14.equals("visitor"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        Database.Database database0 = Database.Database.getInstance();
        database0.markBookingAsPaid("hi!");
        database0.removeParkingLot("hi!");
        database0.cancelBooking("");
        boolean boolean8 = database0.userExists("visitor");
        Models.Booking booking10 = database0.findBookingById("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking10);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        Models.User user9 = database0.getUserByUsername("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.Booking booking5 = database0.findBookingById("");
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        Models.Booking booking8 = database0.findBookingById("");
        database0.cancelBooking("");
        Database.Database database11 = Database.Database.getInstance();
        Models.Booking booking13 = database11.findBookingById("");
        database11.cancelBooking("");
        Models.Booking booking17 = database11.findBookingById("hi!");
        boolean boolean20 = database11.validManager("", "hi!");
        Models.SuperManager superManager21 = database11.getSuperManager();
        database0.addManager((Models.Manager) superManager21);
        java.lang.String str24 = database0.getUserType("");
        database0.updateParkingLotStatus("hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "visitor" + "'", str24.equals("visitor"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        Database.Database database0 = Database.Database.getInstance();
        boolean boolean3 = database0.validManager("", "hi!");
        Models.SuperManager superManager4 = database0.getSuperManager();
        java.util.ArrayList<Models.Manager> managerList5 = database0.getManagers();
        boolean boolean8 = database0.validSuperManager("", "visitor");
        java.util.ArrayList<Models.Manager> managerList9 = database0.getManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList9);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        java.util.ArrayList<Models.ParkingLot> parkingLotList4 = database0.getParkingLots();
        Models.Booking booking6 = database0.findBookingById("");
        Database.Database database7 = Database.Database.getInstance();
        Models.Booking booking9 = database7.findBookingById("");
        database7.cancelBooking("");
        Models.Booking booking13 = database7.findBookingById("hi!");
        boolean boolean16 = database7.validSuperManager("", "");
        java.util.ArrayList<Models.Booking> bookingList17 = database7.getBookings();
        Models.SuperManager superManager18 = database7.getSuperManager();
        database0.addManager((Models.Manager) superManager18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager18);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.updateParkingLotStatus("hi!", true);
        java.lang.String str9 = database0.getUserType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "visitor" + "'", str9.equals("visitor"));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        boolean boolean10 = database0.validManager("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.ParkingLot parkingLot5 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addParkingLot(parkingLot5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingLot.getLotId()\" because \"parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getuserBooking("");
        boolean boolean12 = database0.userExists("");
        database0.removeParkingLot("visitor");
        boolean boolean17 = database0.validManager("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        boolean boolean7 = database0.validManager("", "visitor");
        java.util.ArrayList<Models.Booking> bookingList8 = database0.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList8);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        database0.cancelBooking("hi!");
        Models.SuperManager superManager11 = database0.getSuperManager();
        boolean boolean13 = database0.userExists("visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        database0.removeParkingLot("hi!");
        boolean boolean8 = database0.validManager("hi!", "");
        boolean boolean11 = database0.validSuperManager("", "");
        boolean boolean14 = database0.validSuperManager("", "visitor");
        Models.Booking booking15 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addBooking(booking15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validSuperManager("", "");
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getBookings();
        Models.SuperManager superManager11 = database0.getSuperManager();
        java.lang.String str13 = database0.getUserType("visitor");
        Models.ParkingLot parkingLot14 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addParkingLot(parkingLot14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingLot.getLotId()\" because \"parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "visitor" + "'", str13.equals("visitor"));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        Models.SuperManager superManager9 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList11 = database0.getuserBooking("");
        database0.updateBookingPaymentStatus("hi!", true);
        java.util.ArrayList<Models.Manager> managerList15 = database0.getManagers();
        java.util.ArrayList<Models.Manager> managerList16 = database0.getManagers();
        java.util.ArrayList<Models.Manager> managerList17 = database0.getManagers();
        database0.updateBookingPaymentStatus("hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList17);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        database0.updateBookingPaymentStatus("visitor", false);
        boolean boolean13 = database0.validUser("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        database0.cancelBooking("hi!");
        Models.SuperManager superManager11 = database0.getSuperManager();
        database0.updateBookingPaymentStatus("visitor", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager11);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        Models.SuperManager superManager9 = database0.getSuperManager();
        Models.Booking booking11 = database0.findBookingById("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking11);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getuserBooking("");
        boolean boolean12 = database0.userExists("");
        database0.updateParkingLotStatus("", true);
        database0.cancelBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.markBookingAsPaid("hi!");
        java.util.ArrayList<Models.ParkingLot> parkingLotList7 = database0.getParkingLots();
        boolean boolean10 = database0.validManager("visitor", "visitor");
        java.util.ArrayList<Models.User> userList11 = database0.getUsers();
        database0.updateParkingLotStatus("visitor", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        boolean boolean6 = database0.validSuperManager("hi!", "hi!");
        database0.cancelBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        java.util.ArrayList<Models.ParkingLot> parkingLotList4 = database0.getParkingLots();
        Models.Booking booking6 = database0.findBookingById("");
        database0.cancelBooking("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList9 = database0.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validSuperManager("", "");
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getBookings();
        database0.markBookingAsPaid("hi!");
        Models.ParkingLot parkingLot13 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addParkingLot(parkingLot13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingLot.getLotId()\" because \"parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        boolean boolean7 = database0.validManager("", "visitor");
        java.util.ArrayList<Models.Booking> bookingList9 = database0.getuserBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList9);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        Database.Database database0 = Database.Database.getInstance();
        boolean boolean3 = database0.validManager("", "hi!");
        java.util.ArrayList<Models.Booking> bookingList4 = database0.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        java.util.ArrayList<Models.Booking> bookingList6 = database0.getuserBooking("hi!");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addBooking(booking8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validManager("", "hi!");
        Models.User user11 = database0.getUserByUsername("hi!");
        java.util.ArrayList<Models.Booking> bookingList12 = database0.getBookings();
        Models.Booking booking13 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addBooking(booking13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList12);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        boolean boolean9 = database0.validSuperManager("", "hi!");
        Models.Booking booking11 = database0.findBookingById("hi!");
        database0.updateParkingLotStatus("visitor", false);
        boolean boolean17 = database0.validUser("hi!", "visitor");
        java.util.ArrayList<Models.Booking> bookingList19 = database0.getuserBooking("visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList19);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validManager("", "hi!");
        Models.Booking booking10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = database0.serializeBooking(booking10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.Booking booking5 = database0.findBookingById("");
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        Models.Booking booking8 = database0.findBookingById("");
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getuserBooking("");
        java.util.ArrayList<Models.Booking> bookingList11 = database0.getBookings();
        database0.markBookingAsPaid("");
        java.util.ArrayList<Models.Booking> bookingList14 = database0.getBookings();
        Models.Manager manager15 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addManager(manager15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Manager.getUsername()\" because \"manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList14);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getuserBooking("");
        boolean boolean12 = database0.userExists("");
        java.util.ArrayList<Models.Manager> managerList13 = database0.getManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList13);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        Models.SuperManager superManager9 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList11 = database0.getuserBooking("");
        boolean boolean14 = database0.validUser("", "");
        Models.User user16 = database0.getUserByUsername("");
        java.lang.Class<?> wildcardClass17 = database0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validManager("", "hi!");
        Models.SuperManager superManager10 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList12 = database0.getuserBooking("hi!");
        database0.markBookingAsPaid("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList12);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validSuperManager("", "");
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getBookings();
        Models.SuperManager superManager11 = database0.getSuperManager();
        java.lang.String str13 = database0.getUserType("visitor");
        boolean boolean15 = database0.userExists("visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "visitor" + "'", str13.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.markBookingAsPaid("hi!");
        java.util.ArrayList<Models.ParkingLot> parkingLotList7 = database0.getParkingLots();
        Models.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = database0.serializeBooking(booking8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList7);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        Models.SuperManager superManager9 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList11 = database0.getuserBooking("");
        database0.updateBookingPaymentStatus("hi!", true);
        Models.Booking booking15 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addBooking(booking15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList11);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validManager("", "hi!");
        Models.SuperManager superManager10 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList12 = database0.getuserBooking("hi!");
        Models.Booking booking14 = database0.findBookingById("visitor");
        Models.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addAccount(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.User.getUsername()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking14);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        Database.Database database0 = Database.Database.getInstance();
        boolean boolean3 = database0.validManager("", "hi!");
        Models.SuperManager superManager4 = database0.getSuperManager();
        java.util.ArrayList<Models.Manager> managerList5 = database0.getManagers();
        boolean boolean8 = database0.validSuperManager("", "visitor");
        Models.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addAccount(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.User.getUsername()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validSuperManager("", "");
        java.util.ArrayList<Models.User> userList10 = database0.getUsers();
        java.util.ArrayList<Models.User> userList11 = database0.getUsers();
        Database.Database database12 = Database.Database.getInstance();
        Models.Booking booking14 = database12.findBookingById("");
        database12.cancelBooking("");
        database12.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList19 = database12.getBookings();
        java.util.ArrayList<Models.User> userList20 = database12.getUsers();
        Database.Database database21 = Database.Database.getInstance();
        Models.Booking booking23 = database21.findBookingById("");
        database21.cancelBooking("");
        database21.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList28 = database21.getBookings();
        Models.SuperManager superManager29 = database21.getSuperManager();
        database12.addManager((Models.Manager) superManager29);
        Database.Database database31 = Database.Database.getInstance();
        boolean boolean34 = database31.validManager("", "hi!");
        Models.SuperManager superManager35 = database31.getSuperManager();
        database12.addManager((Models.Manager) superManager35);
        database0.addManager((Models.Manager) superManager35);
        Models.User user38 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addAccount(user38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.User.getUsername()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager35);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.SuperManager superManager4 = database0.getSuperManager();
        Database.Database database5 = Database.Database.getInstance();
        Models.Booking booking7 = database5.findBookingById("");
        database5.cancelBooking("");
        Models.Booking booking11 = database5.findBookingById("hi!");
        boolean boolean14 = database5.validManager("", "hi!");
        Models.SuperManager superManager15 = database5.getSuperManager();
        database0.addManager((Models.Manager) superManager15);
        boolean boolean19 = database0.validManager("hi!", "");
        java.util.ArrayList<Models.Manager> managerList20 = database0.getManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList20);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.SuperManager superManager4 = database0.getSuperManager();
        Database.Database database5 = Database.Database.getInstance();
        Models.Booking booking7 = database5.findBookingById("");
        database5.cancelBooking("");
        Models.Booking booking11 = database5.findBookingById("hi!");
        boolean boolean14 = database5.validManager("", "hi!");
        Models.SuperManager superManager15 = database5.getSuperManager();
        database0.addManager((Models.Manager) superManager15);
        java.util.ArrayList<Models.Manager> managerList17 = database0.getManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList17);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        database0.removeParkingLot("hi!");
        boolean boolean8 = database0.validSuperManager("", "");
        boolean boolean10 = database0.emailExists("hi!");
        database0.removeParkingLot("hi!");
        boolean boolean15 = database0.validManager("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        java.util.ArrayList<Models.Manager> managerList8 = database0.getManagers();
        database0.updateBookingPaymentStatus("", false);
        Models.SuperManager superManager12 = database0.getSuperManager();
        boolean boolean15 = database0.validUser("visitor", "visitor");
        java.lang.Class<?> wildcardClass16 = database0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        boolean boolean7 = database0.validSuperManager("", "");
        Models.Booking booking9 = database0.findBookingById("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking9);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        java.util.ArrayList<Models.User> userList8 = database0.getUsers();
        Database.Database database9 = Database.Database.getInstance();
        Models.Booking booking11 = database9.findBookingById("");
        database9.cancelBooking("");
        database9.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList16 = database9.getBookings();
        Models.SuperManager superManager17 = database9.getSuperManager();
        database0.addManager((Models.Manager) superManager17);
        Database.Database database19 = Database.Database.getInstance();
        boolean boolean22 = database19.validManager("", "hi!");
        Models.SuperManager superManager23 = database19.getSuperManager();
        database0.addManager((Models.Manager) superManager23);
        Models.Booking booking26 = database0.findBookingById("visitor");
        Models.Booking booking28 = database0.findBookingById("");
        Models.Booking booking29 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addBooking(booking29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking28);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validSuperManager("", "");
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getBookings();
        Models.SuperManager superManager11 = database0.getSuperManager();
        Models.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addAccount(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.User.getUsername()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager11);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.Booking booking5 = database0.findBookingById("");
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        Models.Booking booking8 = database0.findBookingById("");
        database0.cancelBooking("");
        Database.Database database11 = Database.Database.getInstance();
        Models.Booking booking13 = database11.findBookingById("");
        database11.cancelBooking("");
        Models.Booking booking17 = database11.findBookingById("hi!");
        boolean boolean20 = database11.validManager("", "hi!");
        Models.SuperManager superManager21 = database11.getSuperManager();
        database0.addManager((Models.Manager) superManager21);
        java.util.ArrayList<Models.ParkingLot> parkingLotList23 = database0.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList23);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        database0.markBookingAsPaid("hi!");
        boolean boolean12 = database0.userExists("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        database0.updateBookingPaymentStatus("visitor", false);
        database0.updateParkingLotStatus("", true);
        boolean boolean16 = database0.validManager("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        boolean boolean9 = database0.validSuperManager("", "hi!");
        Models.Booking booking11 = database0.findBookingById("hi!");
        database0.updateParkingLotStatus("visitor", false);
        Database.Database database15 = Database.Database.getInstance();
        boolean boolean18 = database15.validManager("", "hi!");
        Models.SuperManager superManager19 = database15.getSuperManager();
        database0.addManager((Models.Manager) superManager19);
        java.util.ArrayList<Models.Manager> managerList21 = database0.getManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList21);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.Booking booking5 = database0.findBookingById("");
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        Models.Booking booking8 = database0.findBookingById("");
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getuserBooking("");
        database0.markBookingAsPaid("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        java.util.ArrayList<Models.Booking> bookingList9 = database0.getuserBooking("hi!");
        java.lang.Class<?> wildcardClass10 = database0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.Booking booking5 = database0.findBookingById("");
        database0.updateParkingLotStatus("hi!", true);
        java.util.ArrayList<Models.User> userList9 = database0.getUnvalidatedUsers();
        java.util.ArrayList<Models.Manager> managerList10 = database0.getManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList10);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.Booking booking5 = database0.findBookingById("");
        database0.updateParkingLotStatus("hi!", true);
        java.util.ArrayList<Models.ParkingLot> parkingLotList9 = database0.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        java.util.ArrayList<Models.Booking> bookingList6 = database0.getuserBooking("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        java.util.ArrayList<Models.ParkingLot> parkingLotList8 = database0.getParkingLots();
        database0.cancelBooking("hi!");
        Models.Booking booking12 = database0.findBookingById("hi!");
        database0.updateBookingPaymentStatus("visitor", true);
        java.lang.Class<?> wildcardClass16 = database0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        database0.removeParkingLot("hi!");
        boolean boolean8 = database0.validSuperManager("", "");
        boolean boolean10 = database0.emailExists("hi!");
        database0.removeParkingLot("hi!");
        Models.User user14 = database0.getUserByUsername("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        Database.Database database0 = Database.Database.getInstance();
        boolean boolean3 = database0.validManager("", "hi!");
        Models.SuperManager superManager4 = database0.getSuperManager();
        java.util.ArrayList<Models.Manager> managerList5 = database0.getManagers();
        Models.Booking booking7 = database0.findBookingById("visitor");
        database0.removeParkingLot("visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking7);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.Booking booking5 = database0.findBookingById("");
        database0.updateParkingLotStatus("hi!", true);
        java.util.ArrayList<Models.User> userList9 = database0.getUnvalidatedUsers();
        Models.User user11 = database0.getUserByUsername("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        java.util.ArrayList<Models.Booking> bookingList9 = database0.getuserBooking("hi!");
        database0.updateParkingLotStatus("", false);
        boolean boolean15 = database0.validUser("visitor", "");
        java.util.ArrayList<Models.Booking> bookingList17 = database0.getuserBooking("visitor");
        java.util.ArrayList<Models.Booking> bookingList19 = database0.getuserBooking("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList19);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        Database.Database database0 = Database.Database.getInstance();
        boolean boolean3 = database0.validManager("", "hi!");
        Models.SuperManager superManager4 = database0.getSuperManager();
        java.util.ArrayList<Models.Manager> managerList5 = database0.getManagers();
        Models.Booking booking7 = database0.findBookingById("visitor");
        database0.markBookingAsPaid("");
        boolean boolean12 = database0.validManager("", "visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        Database.Database database0 = Database.Database.getInstance();
        boolean boolean3 = database0.validManager("", "hi!");
        java.util.ArrayList<Models.Manager> managerList4 = database0.getManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList4);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        java.util.ArrayList<Models.Manager> managerList8 = database0.getManagers();
        java.util.ArrayList<Models.User> userList9 = database0.getUnvalidatedUsers();
        database0.updateBookingPaymentStatus("hi!", false);
        database0.updateBookingPaymentStatus("hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Database.Database database0 = Database.Database.getInstance();
        java.util.ArrayList<Models.ParkingLot> parkingLotList1 = database0.getParkingLots();
        Models.Booking booking3 = database0.findBookingById("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking3);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        database0.removeParkingLot("hi!");
        boolean boolean7 = database0.emailExists("visitor");
        database0.updateBookingPaymentStatus("visitor", true);
        database0.updateParkingLotStatus("visitor", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        java.lang.String str8 = database0.getUserType("");
        java.util.ArrayList<Models.Manager> managerList9 = database0.getManagers();
        database0.cancelBooking("");
        boolean boolean13 = database0.userExists("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "visitor" + "'", str8.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validManager("", "hi!");
        boolean boolean11 = database0.emailExists("");
        java.lang.String str13 = database0.getUserType("hi!");
        database0.removeParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "visitor" + "'", str13.equals("visitor"));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        java.util.ArrayList<Models.ParkingLot> parkingLotList4 = database0.getParkingLots();
        Models.Booking booking6 = database0.findBookingById("");
        java.util.ArrayList<Models.User> userList7 = database0.getUsers();
        boolean boolean9 = database0.userExists("visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        java.util.ArrayList<Models.Booking> bookingList6 = database0.getuserBooking("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        java.util.ArrayList<Models.ParkingLot> parkingLotList8 = database0.getParkingLots();
        database0.cancelBooking("hi!");
        Models.Booking booking12 = database0.findBookingById("hi!");
        database0.updateBookingPaymentStatus("visitor", true);
        database0.updateParkingLotStatus("", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking12);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        Database.Database database0 = Database.Database.getInstance();
        database0.markBookingAsPaid("hi!");
        java.util.ArrayList<Models.User> userList3 = database0.getUnvalidatedUsers();
        Models.Booking booking5 = database0.findBookingById("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking5);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        database0.removeParkingLot("hi!");
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        boolean boolean9 = database0.validUser("", "");
        database0.markBookingAsPaid("visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        java.util.ArrayList<Models.Booking> bookingList6 = database0.getuserBooking("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        java.util.ArrayList<Models.Booking> bookingList8 = database0.getBookings();
        java.util.ArrayList<Models.User> userList9 = database0.getUsers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        database0.cancelBooking("hi!");
        Models.Booking booking12 = database0.findBookingById("");
        java.lang.String str14 = database0.getUserType("");
        Models.SuperManager superManager15 = database0.getSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "visitor" + "'", str14.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager15);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        java.util.ArrayList<Models.ParkingLot> parkingLotList4 = database0.getParkingLots();
        java.util.ArrayList<Models.Booking> bookingList5 = database0.getBookings();
        java.util.ArrayList<Models.Booking> bookingList6 = database0.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        boolean boolean6 = database0.validSuperManager("hi!", "hi!");
        database0.markBookingAsPaid("hi!");
        boolean boolean10 = database0.emailExists("visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        java.util.ArrayList<Models.Manager> managerList8 = database0.getManagers();
        database0.updateBookingPaymentStatus("", false);
        boolean boolean13 = database0.emailExists("");
        java.util.ArrayList<Models.Booking> bookingList15 = database0.getuserBooking("visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList15);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        java.util.ArrayList<Models.Booking> bookingList6 = database0.getuserBooking("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        Models.SuperManager superManager8 = database0.getSuperManager();
        java.util.ArrayList<Models.ParkingLot> parkingLotList9 = database0.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        boolean boolean7 = database0.validSuperManager("", "");
        boolean boolean10 = database0.validUser("visitor", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        database0.removeParkingLot("hi!");
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        boolean boolean9 = database0.validUser("", "");
        Models.SuperManager superManager10 = database0.getSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager10);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        Database.Database database0 = Database.Database.getInstance();
        database0.markBookingAsPaid("hi!");
        database0.removeParkingLot("hi!");
        database0.cancelBooking("");
        boolean boolean8 = database0.emailExists("hi!");
        database0.cancelBooking("");
        boolean boolean13 = database0.validUser("hi!", "hi!");
        Models.ParkingLot parkingLot14 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addParkingLot(parkingLot14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingLot.getLotId()\" because \"parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        java.util.ArrayList<Models.Booking> bookingList9 = database0.getuserBooking("hi!");
        java.util.ArrayList<Models.User> userList10 = database0.getUsers();
        java.util.ArrayList<Models.ParkingLot> parkingLotList11 = database0.getParkingLots();
        java.lang.String str13 = database0.getUserType("visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "visitor" + "'", str13.equals("visitor"));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList10 = database0.getuserBooking("");
        boolean boolean12 = database0.userExists("");
        database0.updateParkingLotStatus("", false);
        java.lang.String str17 = database0.getUserType("hi!");
        Models.User user19 = database0.getUserByUsername("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "visitor" + "'", str17.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        java.util.ArrayList<Models.User> userList8 = database0.getUsers();
        Database.Database database9 = Database.Database.getInstance();
        Models.Booking booking11 = database9.findBookingById("");
        database9.cancelBooking("");
        database9.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList16 = database9.getBookings();
        Models.SuperManager superManager17 = database9.getSuperManager();
        database0.addManager((Models.Manager) superManager17);
        Database.Database database19 = Database.Database.getInstance();
        boolean boolean22 = database19.validManager("", "hi!");
        Models.SuperManager superManager23 = database19.getSuperManager();
        database0.addManager((Models.Manager) superManager23);
        java.util.ArrayList<Models.User> userList25 = database0.getUsers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        java.util.ArrayList<Models.User> userList8 = database0.getUsers();
        database0.updateParkingLotStatus("hi!", false);
        database0.updateBookingPaymentStatus("visitor", false);
        java.lang.String str16 = database0.getUserType("visitor");
        java.util.ArrayList<Models.User> userList17 = database0.getUsers();
        Models.Booking booking19 = database0.findBookingById("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "visitor" + "'", str16.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking19);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        Database.Database database0 = Database.Database.getInstance();
        database0.updateParkingLotStatus("hi!", false);
        Models.Booking booking5 = database0.findBookingById("");
        java.util.ArrayList<Models.User> userList6 = database0.getUsers();
        database0.markBookingAsPaid("");
        Models.Booking booking10 = database0.findBookingById("visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking10);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        java.lang.String str8 = database0.getUserType("");
        java.util.ArrayList<Models.Manager> managerList9 = database0.getManagers();
        Models.Booking booking11 = database0.findBookingById("visitor");
        database0.cancelBooking("visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "visitor" + "'", str8.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking11);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        java.util.ArrayList<Models.Booking> bookingList6 = database0.getuserBooking("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        Models.SuperManager superManager8 = database0.getSuperManager();
        java.util.ArrayList<Models.Manager> managerList9 = database0.getManagers();
        java.util.ArrayList<Models.User> userList10 = database0.getUnvalidatedUsers();
        java.lang.Class<?> wildcardClass11 = userList10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        java.lang.String str8 = database0.getUserType("");
        java.util.ArrayList<Models.Manager> managerList9 = database0.getManagers();
        database0.cancelBooking("hi!");
        boolean boolean14 = database0.validUser("", "visitor");
        Models.Booking booking15 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.addBooking(booking15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "visitor" + "'", str8.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        Models.SuperManager superManager9 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList11 = database0.getuserBooking("");
        java.util.ArrayList<Models.Manager> managerList12 = database0.getManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList12);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        Models.SuperManager superManager9 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList11 = database0.getuserBooking("");
        boolean boolean14 = database0.validUser("", "");
        Database.Database database15 = Database.Database.getInstance();
        Models.Booking booking17 = database15.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList18 = database15.getParkingLots();
        java.util.ArrayList<Models.User> userList19 = database15.getUsers();
        database15.removeParkingLot("hi!");
        boolean boolean24 = database15.validSuperManager("", "hi!");
        Models.Booking booking26 = database15.findBookingById("hi!");
        database15.updateParkingLotStatus("visitor", false);
        Database.Database database30 = Database.Database.getInstance();
        boolean boolean33 = database30.validManager("", "hi!");
        Models.SuperManager superManager34 = database30.getSuperManager();
        database15.addManager((Models.Manager) superManager34);
        database0.addManager((Models.Manager) superManager34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager34);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        Models.SuperManager superManager9 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList11 = database0.getuserBooking("");
        Database.Database database12 = Database.Database.getInstance();
        Models.Booking booking14 = database12.findBookingById("");
        database12.cancelBooking("");
        database12.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList19 = database12.getBookings();
        java.util.ArrayList<Models.User> userList20 = database12.getUsers();
        Database.Database database21 = Database.Database.getInstance();
        Models.Booking booking23 = database21.findBookingById("");
        database21.cancelBooking("");
        database21.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList28 = database21.getBookings();
        Models.SuperManager superManager29 = database21.getSuperManager();
        database12.addManager((Models.Manager) superManager29);
        Database.Database database31 = Database.Database.getInstance();
        boolean boolean34 = database31.validManager("", "hi!");
        Models.SuperManager superManager35 = database31.getSuperManager();
        database12.addManager((Models.Manager) superManager35);
        database0.addManager((Models.Manager) superManager35);
        boolean boolean40 = database0.validManager("visitor", "visitor");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        Database.Database database0 = Database.Database.getInstance();
        database0.markBookingAsPaid("hi!");
        database0.removeParkingLot("hi!");
        database0.cancelBooking("");
        boolean boolean8 = database0.emailExists("hi!");
        boolean boolean11 = database0.validManager("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        Models.Booking booking6 = database0.findBookingById("hi!");
        boolean boolean9 = database0.validManager("", "hi!");
        Models.SuperManager superManager10 = database0.getSuperManager();
        java.util.ArrayList<Models.Booking> bookingList12 = database0.getuserBooking("hi!");
        database0.cancelBooking("visitor");
        boolean boolean17 = database0.validUser("", "");
        boolean boolean19 = database0.userExists("");
        database0.removeParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        java.util.ArrayList<Models.Booking> bookingList6 = database0.getuserBooking("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        java.util.ArrayList<Models.ParkingLot> parkingLotList8 = database0.getParkingLots();
        boolean boolean10 = database0.userExists("hi!");
        java.util.ArrayList<Models.Manager> managerList11 = database0.getManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList11);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        java.util.ArrayList<Models.User> userList8 = database0.getUsers();
        java.lang.String str10 = database0.getUserType("");
        java.util.ArrayList<Models.Booking> bookingList11 = database0.getBookings();
        Database.Database database12 = Database.Database.getInstance();
        Models.Booking booking14 = database12.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList15 = database12.getParkingLots();
        java.util.ArrayList<Models.User> userList16 = database12.getUsers();
        database12.removeParkingLot("hi!");
        boolean boolean21 = database12.validSuperManager("", "hi!");
        Models.Booking booking23 = database12.findBookingById("hi!");
        database12.updateParkingLotStatus("visitor", false);
        Database.Database database27 = Database.Database.getInstance();
        boolean boolean30 = database27.validManager("", "hi!");
        Models.SuperManager superManager31 = database27.getSuperManager();
        database12.addManager((Models.Manager) superManager31);
        database0.addManager((Models.Manager) superManager31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "visitor" + "'", str10.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager31);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        database0.cancelBooking("");
        database0.removeParkingLot("");
        java.util.ArrayList<Models.Booking> bookingList7 = database0.getBookings();
        Models.SuperManager superManager8 = database0.getSuperManager();
        database0.cancelBooking("");
        boolean boolean13 = database0.validSuperManager("visitor", "");
        java.util.ArrayList<Models.Manager> managerList14 = database0.getManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList14);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        Database.Database database0 = Database.Database.getInstance();
        Models.Booking booking2 = database0.findBookingById("");
        java.util.ArrayList<Models.ParkingLot> parkingLotList3 = database0.getParkingLots();
        java.util.ArrayList<Models.User> userList4 = database0.getUsers();
        database0.removeParkingLot("hi!");
        java.util.ArrayList<Models.User> userList7 = database0.getUnvalidatedUsers();
        Models.Booking booking9 = database0.findBookingById("hi!");
        database0.markBookingAsPaid("hi!");
        java.util.ArrayList<Models.Booking> bookingList12 = database0.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(database0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList12);
    }
}


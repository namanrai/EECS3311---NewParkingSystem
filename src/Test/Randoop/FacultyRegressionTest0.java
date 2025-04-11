import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FacultyRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.Class<?> wildcardClass6 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.lang.Class<?> wildcardClass5 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.lang.String str5 = faculty4.getEmail();
        java.lang.Class<?> wildcardClass6 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        faculty4.cancelBooking("hi!");
        java.lang.Class<?> wildcardClass7 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.lang.Class<?> wildcardClass7 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        java.lang.String str5 = faculty4.getEmail();
        java.lang.Class<?> wildcardClass6 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList7 = faculty4.getBookings();
        java.lang.Class<?> wildcardClass8 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        double double6 = faculty4.getParkingRate();
        Models.ParkingSpace parkingSpace10 = null;
        java.time.LocalTime localTime11 = null;
        java.time.LocalTime localTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking13 = faculty4.makeBooking("", "hi!", "", parkingSpace10, localTime11, localTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        double double7 = faculty4.getParkingRate();
        java.lang.Class<?> wildcardClass8 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        double double7 = faculty4.getParkingRate();
        Models.ParkingSpace parkingSpace11 = null;
        java.time.LocalTime localTime12 = null;
        java.time.LocalTime localTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking14 = faculty4.makeBooking("", "", "", parkingSpace11, localTime12, localTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        java.lang.String str7 = faculty4.getPassword();
        Models.ParkingSpace parkingSpace11 = null;
        java.time.LocalTime localTime12 = null;
        java.time.LocalTime localTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking14 = faculty4.makeBooking("hi!", "hi!", "", parkingSpace11, localTime12, localTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        boolean boolean5 = faculty4.getisValidated();
        java.lang.String str6 = faculty4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.lang.String str7 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        faculty4.setValidated(true);
        java.lang.String str8 = faculty4.getEmail();
        java.lang.Class<?> wildcardClass9 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        double double6 = faculty4.getParkingRate();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        boolean boolean5 = faculty4.getisValidated();
        double double6 = faculty4.getParkingRate();
        Models.ParkingSpace parkingSpace10 = null;
        java.time.LocalTime localTime11 = null;
        java.time.LocalTime localTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking13 = faculty4.makeBooking("hi!", "", "hi!", parkingSpace10, localTime11, localTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        boolean boolean5 = faculty4.getisValidated();
        java.lang.String str6 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        faculty4.setValidated(true);
        java.lang.String str8 = faculty4.getEmail();
        java.lang.String str9 = faculty4.getEmail();
        java.lang.Class<?> wildcardClass10 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList7 = faculty4.getBookings();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.Class<?> wildcardClass9 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        Models.ParkingSpace parkingSpace10 = null;
        java.time.LocalTime localTime11 = null;
        java.time.LocalTime localTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking13 = faculty4.makeBooking("hi!", "hi!", "", parkingSpace10, localTime11, localTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        double double10 = faculty4.getParkingRate();
        faculty4.setValidated(true);
        Models.ParkingSpace parkingSpace16 = null;
        java.time.LocalTime localTime17 = null;
        java.time.LocalTime localTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking19 = faculty4.makeBooking("hi!", "", "hi!", parkingSpace16, localTime17, localTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        Models.ParkingSpace parkingSpace5 = faculty4.getParkingSpace();
        java.lang.Class<?> wildcardClass6 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        faculty4.cancelBooking("");
        java.lang.Class<?> wildcardClass7 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        faculty4.setValidated(true);
        Models.ParkingSpace parkingSpace11 = null;
        java.time.LocalTime localTime12 = null;
        java.time.LocalTime localTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking14 = faculty4.makeBooking("hi!", "", "hi!", parkingSpace11, localTime12, localTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList7 = faculty4.getBookings();
        java.lang.String str8 = faculty4.getPassword();
        faculty4.setValidated(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        faculty4.setValidated(true);
        java.lang.String str12 = faculty4.getEmail();
        java.lang.Class<?> wildcardClass13 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        double double7 = faculty4.getParkingRate();
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        boolean boolean11 = faculty4.registerAccount("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.lang.String str5 = faculty4.getEmail();
        java.lang.String str6 = faculty4.getPassword();
        java.lang.String str7 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList7 = faculty4.getBookings();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        boolean boolean10 = faculty4.getisValidated();
        double double11 = faculty4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        java.lang.String str7 = faculty4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        Models.ParkingSpace parkingSpace5 = faculty4.getParkingSpace();
        java.lang.String str6 = faculty4.getLicensePlate();
        java.lang.Class<?> wildcardClass7 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList7 = faculty4.getBookings();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        java.util.ArrayList<Models.Booking> bookingList10 = faculty4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.lang.String str5 = faculty4.getEmail();
        faculty4.cancelBooking("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        boolean boolean7 = faculty4.getisValidated();
        double double8 = faculty4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getPassword();
        java.lang.String str7 = faculty4.getLicensePlate();
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        java.lang.String str9 = faculty4.getLicensePlate();
        faculty4.cancelBooking("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList7 = faculty4.getBookings();
        java.lang.String str8 = faculty4.getPassword();
        java.lang.Class<?> wildcardClass9 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass5 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        Models.ParkingSpace parkingSpace7 = faculty4.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        faculty4.setValidated(true);
        java.lang.String str8 = faculty4.getPassword();
        Models.ParkingSpace parkingSpace12 = null;
        java.time.LocalTime localTime13 = null;
        java.time.LocalTime localTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking15 = faculty4.makeBooking("", "hi!", "hi!", parkingSpace12, localTime13, localTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        boolean boolean5 = faculty4.getisValidated();
        faculty4.setValidated(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        faculty4.cancelBooking("hi!");
        faculty4.cancelBooking("");
        java.lang.String str9 = faculty4.getLicensePlate();
        double double10 = faculty4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        double double10 = faculty4.getParkingRate();
        faculty4.setValidated(true);
        java.lang.String str13 = faculty4.getPassword();
        Models.ParkingSpace parkingSpace17 = null;
        java.time.LocalTime localTime18 = null;
        java.time.LocalTime localTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking20 = faculty4.makeBooking("", "", "", parkingSpace17, localTime18, localTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Models.Faculty faculty4 = new Models.Faculty("", "", "hi!", "");
        Models.ParkingSpace parkingSpace5 = faculty4.getParkingSpace();
        boolean boolean8 = faculty4.registerAccount("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        double double6 = faculty4.getParkingRate();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getEmail();
        faculty4.cancelBooking("hi!");
        boolean boolean13 = faculty4.registerAccount("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        double double6 = faculty4.getParkingRate();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getEmail();
        faculty4.cancelBooking("hi!");
        boolean boolean11 = faculty4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        boolean boolean7 = faculty4.getisValidated();
        java.lang.String str8 = faculty4.getEmail();
        java.lang.Class<?> wildcardClass9 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        faculty4.setValidated(true);
        boolean boolean12 = faculty4.getisValidated();
        Models.ParkingSpace parkingSpace16 = null;
        java.time.LocalTime localTime17 = null;
        java.time.LocalTime localTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking19 = faculty4.makeBooking("", "", "hi!", parkingSpace16, localTime17, localTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        boolean boolean8 = faculty4.registerAccount("hi!", "hi!");
        java.lang.Class<?> wildcardClass9 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "hi!");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        faculty4.cancelBooking("hi!");
        java.lang.String str8 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        double double6 = faculty4.getParkingRate();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getEmail();
        faculty4.setValidated(false);
        java.lang.Class<?> wildcardClass11 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        java.lang.Class<?> wildcardClass5 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getPassword();
        faculty4.cancelBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        boolean boolean9 = faculty4.registerAccount("", "hi!");
        java.lang.Class<?> wildcardClass10 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        double double6 = faculty4.getParkingRate();
        java.lang.String str7 = faculty4.getEmail();
        faculty4.setValidated(false);
        java.lang.Class<?> wildcardClass10 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        faculty4.cancelBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        double double6 = faculty4.getParkingRate();
        java.lang.String str7 = faculty4.getEmail();
        Models.ParkingSpace parkingSpace11 = null;
        java.time.LocalTime localTime12 = null;
        java.time.LocalTime localTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking14 = faculty4.makeBooking("hi!", "", "hi!", parkingSpace11, localTime12, localTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Models.Faculty faculty4 = new Models.Faculty("", "", "hi!", "");
        Models.ParkingSpace parkingSpace5 = faculty4.getParkingSpace();
        double double6 = faculty4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        faculty4.setValidated(true);
        java.lang.String str12 = faculty4.getEmail();
        Models.ParkingSpace parkingSpace16 = null;
        java.time.LocalTime localTime17 = null;
        java.time.LocalTime localTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking19 = faculty4.makeBooking("hi!", "", "hi!", parkingSpace16, localTime17, localTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass5 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.lang.String str7 = faculty4.getLicensePlate();
        double double8 = faculty4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        java.lang.String str5 = faculty4.getEmail();
        faculty4.cancelBooking("hi!");
        java.lang.String str8 = faculty4.getPassword();
        java.lang.String str9 = faculty4.getUsername();
        Models.ParkingSpace parkingSpace13 = null;
        java.time.LocalTime localTime14 = null;
        java.time.LocalTime localTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking16 = faculty4.makeBooking("hi!", "", "", parkingSpace13, localTime14, localTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        faculty4.setValidated(true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        faculty4.setValidated(true);
        java.lang.String str7 = faculty4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        faculty4.setValidated(true);
        boolean boolean8 = faculty4.getisValidated();
        java.lang.String str9 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.lang.String str5 = faculty4.getEmail();
        boolean boolean6 = faculty4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        double double7 = faculty4.getParkingRate();
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        boolean boolean11 = faculty4.registerAccount("", "");
        double double12 = faculty4.getParkingRate();
        Models.ParkingSpace parkingSpace13 = faculty4.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.0d + "'", double12 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace13);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        Models.ParkingSpace parkingSpace5 = faculty4.getParkingSpace();
        java.lang.String str6 = faculty4.getLicensePlate();
        faculty4.cancelBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        faculty4.cancelBooking("hi!");
        faculty4.cancelBooking("");
        java.lang.String str9 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        java.lang.String str10 = faculty4.getUsername();
        Models.ParkingSpace parkingSpace14 = null;
        java.time.LocalTime localTime15 = null;
        java.time.LocalTime localTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking17 = faculty4.makeBooking("", "", "", parkingSpace14, localTime15, localTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        faculty4.setValidated(true);
        java.lang.String str12 = faculty4.getEmail();
        java.util.ArrayList<Models.Booking> bookingList13 = faculty4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "", "");
        boolean boolean7 = faculty4.registerAccount("hi!", "hi!");
        double double8 = faculty4.getParkingRate();
        Models.ParkingSpace parkingSpace9 = faculty4.getParkingSpace();
        java.lang.String str10 = faculty4.getLicensePlate();
        java.lang.String str11 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "", "");
        boolean boolean7 = faculty4.registerAccount("hi!", "hi!");
        double double8 = faculty4.getParkingRate();
        faculty4.setValidated(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        faculty4.setValidated(true);
        java.lang.String str12 = faculty4.getUsername();
        java.lang.String str13 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "hi!");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        boolean boolean5 = faculty4.getisValidated();
        faculty4.setValidated(false);
        double double8 = faculty4.getParkingRate();
        java.util.ArrayList<Models.Booking> bookingList9 = faculty4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Models.Faculty faculty4 = new Models.Faculty("", "", "hi!", "");
        Models.ParkingSpace parkingSpace5 = faculty4.getParkingSpace();
        Models.ParkingSpace parkingSpace9 = null;
        java.time.LocalTime localTime10 = null;
        java.time.LocalTime localTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking12 = faculty4.makeBooking("", "", "", parkingSpace9, localTime10, localTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace5);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getPassword();
        faculty4.cancelBooking("");
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getUsername();
        java.lang.Class<?> wildcardClass10 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        Models.ParkingSpace parkingSpace8 = null;
        java.time.LocalTime localTime9 = null;
        java.time.LocalTime localTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking11 = faculty4.makeBooking("", "hi!", "hi!", parkingSpace8, localTime9, localTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getLicensePlate();
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = parkingSpace8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        faculty4.cancelBooking("");
        faculty4.cancelBooking("hi!");
        faculty4.cancelBooking("");
        boolean boolean13 = faculty4.registerAccount("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.lang.String str7 = faculty4.getLicensePlate();
        java.lang.String str8 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.util.ArrayList<Models.Booking> bookingList6 = faculty4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getLicensePlate();
        java.lang.Class<?> wildcardClass7 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        Models.ParkingSpace parkingSpace7 = faculty4.getParkingSpace();
        java.lang.String str8 = faculty4.getLicensePlate();
        faculty4.cancelBooking("hi!");
        double double11 = faculty4.getParkingRate();
        java.lang.String str12 = faculty4.getUsername();
        faculty4.setValidated(false);
        Models.ParkingSpace parkingSpace15 = faculty4.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace15);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        double double6 = faculty4.getParkingRate();
        java.lang.String str7 = faculty4.getEmail();
        java.util.ArrayList<Models.Booking> bookingList8 = faculty4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        Models.ParkingSpace parkingSpace5 = faculty4.getParkingSpace();
        java.lang.String str6 = faculty4.getPassword();
        java.lang.String str7 = faculty4.getLicensePlate();
        faculty4.cancelBooking("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        Models.ParkingSpace parkingSpace7 = faculty4.getParkingSpace();
        java.lang.String str8 = faculty4.getPassword();
        java.lang.String str9 = faculty4.getEmail();
        java.lang.String str10 = faculty4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        boolean boolean5 = faculty4.getisValidated();
        boolean boolean8 = faculty4.registerAccount("", "");
        faculty4.cancelBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        boolean boolean7 = faculty4.getisValidated();
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        java.lang.String str9 = faculty4.getEmail();
        java.lang.Class<?> wildcardClass10 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        faculty4.cancelBooking("hi!");
        faculty4.cancelBooking("");
        java.lang.String str9 = faculty4.getLicensePlate();
        boolean boolean10 = faculty4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "hi!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        Models.ParkingSpace parkingSpace5 = faculty4.getParkingSpace();
        java.lang.String str6 = faculty4.getLicensePlate();
        double double7 = faculty4.getParkingRate();
        faculty4.cancelBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getPassword();
        java.lang.String str7 = faculty4.getUsername();
        faculty4.cancelBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        java.lang.String str7 = faculty4.getPassword();
        faculty4.setValidated(false);
        java.util.ArrayList<Models.Booking> bookingList10 = faculty4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        java.lang.String str5 = faculty4.getEmail();
        faculty4.cancelBooking("hi!");
        Models.ParkingSpace parkingSpace11 = null;
        java.time.LocalTime localTime12 = null;
        java.time.LocalTime localTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking14 = faculty4.makeBooking("hi!", "hi!", "hi!", parkingSpace11, localTime12, localTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        double double10 = faculty4.getParkingRate();
        double double11 = faculty4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        faculty4.setValidated(true);
        java.lang.String str12 = faculty4.getPassword();
        faculty4.cancelBooking("hi!");
        double double15 = faculty4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 8.0d + "'", double15 == 8.0d);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        Models.ParkingSpace parkingSpace8 = null;
        java.time.LocalTime localTime9 = null;
        java.time.LocalTime localTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking11 = faculty4.makeBooking("", "", "hi!", parkingSpace8, localTime9, localTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        faculty4.cancelBooking("");
        double double7 = faculty4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "", "hi!");
        boolean boolean7 = faculty4.registerAccount("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "", "");
        boolean boolean7 = faculty4.registerAccount("hi!", "hi!");
        double double8 = faculty4.getParkingRate();
        boolean boolean11 = faculty4.registerAccount("hi!", "");
        boolean boolean14 = faculty4.registerAccount("hi!", "hi!");
        Models.ParkingSpace parkingSpace18 = null;
        java.time.LocalTime localTime19 = null;
        java.time.LocalTime localTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking21 = faculty4.makeBooking("hi!", "", "", parkingSpace18, localTime19, localTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "", "");
        faculty4.cancelBooking("hi!");
        faculty4.cancelBooking("");
        boolean boolean11 = faculty4.registerAccount("", "hi!");
        java.lang.String str12 = faculty4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        double double10 = faculty4.getParkingRate();
        Models.ParkingSpace parkingSpace14 = null;
        java.time.LocalTime localTime15 = null;
        java.time.LocalTime localTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking17 = faculty4.makeBooking("hi!", "hi!", "", parkingSpace14, localTime15, localTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        faculty4.setValidated(true);
        java.lang.String str12 = faculty4.getEmail();
        boolean boolean15 = faculty4.registerAccount("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        Models.ParkingSpace parkingSpace7 = faculty4.getParkingSpace();
        java.lang.String str8 = faculty4.getLicensePlate();
        java.lang.Class<?> wildcardClass9 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        boolean boolean7 = faculty4.getisValidated();
        boolean boolean8 = faculty4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        faculty4.setValidated(true);
        java.lang.String str8 = faculty4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        faculty4.setValidated(true);
        java.lang.String str8 = faculty4.getEmail();
        java.lang.String str9 = faculty4.getEmail();
        java.lang.String str10 = faculty4.getEmail();
        faculty4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList13 = faculty4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        boolean boolean7 = faculty4.getisValidated();
        Models.ParkingSpace parkingSpace11 = null;
        java.time.LocalTime localTime12 = null;
        java.time.LocalTime localTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking14 = faculty4.makeBooking("", "hi!", "hi!", parkingSpace11, localTime12, localTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "", "");
        boolean boolean7 = faculty4.registerAccount("hi!", "hi!");
        double double8 = faculty4.getParkingRate();
        boolean boolean11 = faculty4.registerAccount("hi!", "");
        boolean boolean14 = faculty4.registerAccount("hi!", "hi!");
        double double15 = faculty4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 8.0d + "'", double15 == 8.0d);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "", "");
        faculty4.setValidated(true);
        java.lang.String str7 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        Models.ParkingSpace parkingSpace9 = null;
        java.time.LocalTime localTime10 = null;
        java.time.LocalTime localTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking12 = faculty4.makeBooking("", "", "hi!", parkingSpace9, localTime10, localTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList7 = faculty4.getBookings();
        java.lang.String str8 = faculty4.getPassword();
        boolean boolean11 = faculty4.registerAccount("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        double double7 = faculty4.getParkingRate();
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        boolean boolean11 = faculty4.registerAccount("", "");
        boolean boolean14 = faculty4.registerAccount("hi!", "");
        Models.ParkingSpace parkingSpace15 = faculty4.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace15);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        java.lang.String str5 = faculty4.getEmail();
        faculty4.cancelBooking("hi!");
        java.lang.String str8 = faculty4.getPassword();
        faculty4.setValidated(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        double double6 = faculty4.getParkingRate();
        java.lang.String str7 = faculty4.getEmail();
        faculty4.setValidated(false);
        Models.ParkingSpace parkingSpace10 = faculty4.getParkingSpace();
        java.lang.Class<?> wildcardClass11 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getPassword();
        java.lang.String str6 = faculty4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        faculty4.cancelBooking("");
        faculty4.cancelBooking("hi!");
        java.lang.String str9 = faculty4.getUsername();
        faculty4.setValidated(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        boolean boolean7 = faculty4.getisValidated();
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        boolean boolean11 = faculty4.registerAccount("", "");
        java.lang.String str12 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList7 = faculty4.getBookings();
        java.lang.String str8 = faculty4.getUsername();
        Models.ParkingSpace parkingSpace12 = null;
        java.time.LocalTime localTime13 = null;
        java.time.LocalTime localTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking15 = faculty4.makeBooking("", "", "", parkingSpace12, localTime13, localTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "", "");
        faculty4.cancelBooking("hi!");
        faculty4.cancelBooking("");
        boolean boolean11 = faculty4.registerAccount("", "hi!");
        Models.ParkingSpace parkingSpace12 = faculty4.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace12);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        boolean boolean7 = faculty4.registerAccount("hi!", "hi!");
        java.lang.String str8 = faculty4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        faculty4.setValidated(true);
        boolean boolean8 = faculty4.getisValidated();
        boolean boolean11 = faculty4.registerAccount("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        Models.ParkingSpace parkingSpace7 = faculty4.getParkingSpace();
        java.lang.String str8 = faculty4.getLicensePlate();
        faculty4.cancelBooking("hi!");
        boolean boolean11 = faculty4.getisValidated();
        boolean boolean14 = faculty4.registerAccount("", "hi!");
        faculty4.cancelBooking("hi!");
        Models.ParkingSpace parkingSpace17 = faculty4.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace17);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList7 = faculty4.getBookings();
        java.lang.String str8 = faculty4.getEmail();
        java.lang.String str9 = faculty4.getEmail();
        java.lang.String str10 = faculty4.getPassword();
        Models.ParkingSpace parkingSpace14 = null;
        java.time.LocalTime localTime15 = null;
        java.time.LocalTime localTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking17 = faculty4.makeBooking("hi!", "", "hi!", parkingSpace14, localTime15, localTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getLicensePlate();
        java.lang.String str7 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "", "");
        boolean boolean7 = faculty4.registerAccount("hi!", "hi!");
        double double8 = faculty4.getParkingRate();
        double double9 = faculty4.getParkingRate();
        Models.ParkingSpace parkingSpace13 = null;
        java.time.LocalTime localTime14 = null;
        java.time.LocalTime localTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking16 = faculty4.makeBooking("hi!", "hi!", "hi!", parkingSpace13, localTime14, localTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.lang.String str5 = faculty4.getEmail();
        java.lang.String str6 = faculty4.getPassword();
        java.lang.String str7 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "", "");
        faculty4.cancelBooking("hi!");
        faculty4.cancelBooking("");
        boolean boolean11 = faculty4.registerAccount("", "hi!");
        faculty4.cancelBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "", "");
        boolean boolean7 = faculty4.registerAccount("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        faculty4.setValidated(true);
        java.lang.String str8 = faculty4.getEmail();
        java.lang.String str9 = faculty4.getEmail();
        java.lang.String str10 = faculty4.getEmail();
        faculty4.setValidated(true);
        boolean boolean13 = faculty4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "hi!");
        faculty4.setValidated(true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getPassword();
        faculty4.cancelBooking("");
        java.lang.String str8 = faculty4.getUsername();
        faculty4.setValidated(true);
        Models.ParkingSpace parkingSpace14 = null;
        java.time.LocalTime localTime15 = null;
        java.time.LocalTime localTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking17 = faculty4.makeBooking("hi!", "hi!", "hi!", parkingSpace14, localTime15, localTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        boolean boolean5 = faculty4.getisValidated();
        faculty4.setValidated(false);
        boolean boolean10 = faculty4.registerAccount("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        java.lang.String str10 = faculty4.getLicensePlate();
        boolean boolean13 = faculty4.registerAccount("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        double double6 = faculty4.getParkingRate();
        java.lang.String str7 = faculty4.getEmail();
        faculty4.setValidated(false);
        faculty4.setValidated(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList7 = faculty4.getBookings();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        boolean boolean10 = faculty4.getisValidated();
        boolean boolean13 = faculty4.registerAccount("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.lang.String str7 = faculty4.getLicensePlate();
        java.util.ArrayList<Models.Booking> bookingList8 = faculty4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        Models.ParkingSpace parkingSpace5 = faculty4.getParkingSpace();
        java.lang.String str6 = faculty4.getLicensePlate();
        Models.ParkingSpace parkingSpace7 = faculty4.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getPassword();
        faculty4.cancelBooking("");
        java.lang.String str8 = faculty4.getUsername();
        Models.ParkingSpace parkingSpace12 = null;
        java.time.LocalTime localTime13 = null;
        java.time.LocalTime localTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking15 = faculty4.makeBooking("", "hi!", "hi!", parkingSpace12, localTime13, localTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getPassword();
        faculty4.cancelBooking("");
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getUsername();
        java.lang.String str10 = faculty4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        faculty4.cancelBooking("hi!");
        java.lang.String str8 = faculty4.getLicensePlate();
        java.util.ArrayList<Models.Booking> bookingList9 = faculty4.getBookings();
        java.util.ArrayList<Models.Booking> bookingList10 = faculty4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "", "");
        boolean boolean7 = faculty4.registerAccount("hi!", "hi!");
        java.lang.String str8 = faculty4.getPassword();
        java.lang.String str9 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getPassword();
        java.lang.String str7 = faculty4.getLicensePlate();
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        boolean boolean9 = faculty4.getisValidated();
        Models.ParkingSpace parkingSpace10 = faculty4.getParkingSpace();
        java.lang.String str11 = faculty4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.lang.String str5 = faculty4.getEmail();
        double double6 = faculty4.getParkingRate();
        faculty4.cancelBooking("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.lang.String str5 = faculty4.getLicensePlate();
        java.lang.Class<?> wildcardClass6 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "", "");
        Models.ParkingSpace parkingSpace8 = null;
        java.time.LocalTime localTime9 = null;
        java.time.LocalTime localTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking11 = faculty4.makeBooking("", "", "", parkingSpace8, localTime9, localTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        boolean boolean5 = faculty4.getisValidated();
        boolean boolean8 = faculty4.registerAccount("", "");
        faculty4.setValidated(true);
        Models.ParkingSpace parkingSpace14 = null;
        java.time.LocalTime localTime15 = null;
        java.time.LocalTime localTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking17 = faculty4.makeBooking("", "hi!", "", parkingSpace14, localTime15, localTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        boolean boolean5 = faculty4.getisValidated();
        boolean boolean8 = faculty4.registerAccount("", "");
        java.lang.String str9 = faculty4.getUsername();
        java.lang.String str10 = faculty4.getLicensePlate();
        boolean boolean11 = faculty4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        boolean boolean5 = faculty4.getisValidated();
        boolean boolean8 = faculty4.registerAccount("", "");
        java.lang.String str9 = faculty4.getUsername();
        boolean boolean10 = faculty4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        boolean boolean7 = faculty4.getisValidated();
        boolean boolean10 = faculty4.registerAccount("", "hi!");
        java.lang.Class<?> wildcardClass11 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        java.lang.String str5 = faculty4.getEmail();
        faculty4.cancelBooking("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList7 = faculty4.getBookings();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        boolean boolean10 = faculty4.getisValidated();
        Models.ParkingSpace parkingSpace11 = faculty4.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        Models.ParkingSpace parkingSpace5 = faculty4.getParkingSpace();
        java.lang.String str6 = faculty4.getLicensePlate();
        double double7 = faculty4.getParkingRate();
        java.util.ArrayList<Models.Booking> bookingList8 = faculty4.getBookings();
        java.lang.String str9 = faculty4.getPassword();
        java.lang.String str10 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        double double6 = faculty4.getParkingRate();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getEmail();
        boolean boolean11 = faculty4.registerAccount("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        Models.ParkingSpace parkingSpace5 = faculty4.getParkingSpace();
        java.lang.String str6 = faculty4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        Models.ParkingSpace parkingSpace7 = faculty4.getParkingSpace();
        java.lang.String str8 = faculty4.getLicensePlate();
        faculty4.cancelBooking("hi!");
        boolean boolean11 = faculty4.getisValidated();
        double double12 = faculty4.getParkingRate();
        Models.ParkingSpace parkingSpace13 = faculty4.getParkingSpace();
        faculty4.setValidated(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.0d + "'", double12 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace13);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.lang.String str5 = faculty4.getEmail();
        java.lang.String str6 = faculty4.getPassword();
        java.lang.Class<?> wildcardClass7 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.lang.String str7 = faculty4.getLicensePlate();
        java.lang.String str8 = faculty4.getUsername();
        boolean boolean11 = faculty4.registerAccount("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getLicensePlate();
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        java.lang.String str9 = faculty4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        Models.ParkingSpace parkingSpace7 = faculty4.getParkingSpace();
        java.lang.String str8 = faculty4.getLicensePlate();
        faculty4.cancelBooking("hi!");
        boolean boolean11 = faculty4.getisValidated();
        boolean boolean14 = faculty4.registerAccount("", "hi!");
        faculty4.cancelBooking("hi!");
        java.lang.String str17 = faculty4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "hi!");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        faculty4.setValidated(false);
        boolean boolean9 = faculty4.registerAccount("", "hi!");
        java.lang.Class<?> wildcardClass10 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        boolean boolean7 = faculty4.getisValidated();
        java.util.ArrayList<Models.Booking> bookingList8 = faculty4.getBookings();
        boolean boolean9 = faculty4.getisValidated();
        Models.ParkingSpace parkingSpace13 = null;
        java.time.LocalTime localTime14 = null;
        java.time.LocalTime localTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking16 = faculty4.makeBooking("hi!", "", "", parkingSpace13, localTime14, localTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        java.lang.String str7 = faculty4.getPassword();
        faculty4.setValidated(false);
        boolean boolean10 = faculty4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "", "");
        boolean boolean7 = faculty4.registerAccount("hi!", "hi!");
        Models.ParkingSpace parkingSpace11 = null;
        java.time.LocalTime localTime12 = null;
        java.time.LocalTime localTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking14 = faculty4.makeBooking("", "", "", parkingSpace11, localTime12, localTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        faculty4.setValidated(true);
        java.lang.String str12 = faculty4.getEmail();
        java.lang.String str13 = faculty4.getPassword();
        boolean boolean16 = faculty4.registerAccount("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "", "");
        faculty4.cancelBooking("hi!");
        faculty4.cancelBooking("");
        java.lang.String str9 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        boolean boolean7 = faculty4.getisValidated();
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        double double9 = faculty4.getParkingRate();
        Models.ParkingSpace parkingSpace10 = faculty4.getParkingSpace();
        java.lang.String str11 = faculty4.getUsername();
        java.lang.String str12 = faculty4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        Models.ParkingSpace parkingSpace7 = faculty4.getParkingSpace();
        boolean boolean8 = faculty4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "", "");
        boolean boolean7 = faculty4.registerAccount("hi!", "hi!");
        double double8 = faculty4.getParkingRate();
        Models.ParkingSpace parkingSpace9 = faculty4.getParkingSpace();
        java.lang.String str10 = faculty4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        faculty4.cancelBooking("hi!");
        faculty4.cancelBooking("hi!");
        boolean boolean11 = faculty4.registerAccount("", "hi!");
        faculty4.setValidated(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getPassword();
        java.lang.String str7 = faculty4.getUsername();
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        double double9 = faculty4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        double double10 = faculty4.getParkingRate();
        java.lang.Class<?> wildcardClass11 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "", "hi!");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        faculty4.cancelBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        java.lang.String str9 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        boolean boolean7 = faculty4.getisValidated();
        boolean boolean10 = faculty4.registerAccount("", "hi!");
        double double11 = faculty4.getParkingRate();
        faculty4.cancelBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        faculty4.setValidated(true);
        Models.ParkingSpace parkingSpace12 = faculty4.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace12);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList7 = faculty4.getBookings();
        java.lang.String str8 = faculty4.getEmail();
        java.lang.String str9 = faculty4.getEmail();
        java.lang.String str10 = faculty4.getPassword();
        java.util.ArrayList<Models.Booking> bookingList11 = faculty4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        java.lang.String str5 = faculty4.getEmail();
        boolean boolean6 = faculty4.getisValidated();
        java.lang.String str7 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getPassword();
        faculty4.setValidated(true);
        Models.ParkingSpace parkingSpace9 = faculty4.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        boolean boolean7 = faculty4.getisValidated();
        java.lang.String str8 = faculty4.getLicensePlate();
        java.util.ArrayList<Models.Booking> bookingList9 = faculty4.getBookings();
        faculty4.setValidated(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        double double10 = faculty4.getParkingRate();
        boolean boolean13 = faculty4.registerAccount("hi!", "");
        java.lang.String str14 = faculty4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getEmail();
        java.util.ArrayList<Models.Booking> bookingList6 = faculty4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList7 = faculty4.getBookings();
        java.lang.String str8 = faculty4.getEmail();
        java.lang.String str9 = faculty4.getEmail();
        boolean boolean10 = faculty4.getisValidated();
        java.util.ArrayList<Models.Booking> bookingList11 = faculty4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        Models.ParkingSpace parkingSpace7 = faculty4.getParkingSpace();
        java.lang.String str8 = faculty4.getLicensePlate();
        faculty4.cancelBooking("hi!");
        double double11 = faculty4.getParkingRate();
        double double12 = faculty4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.0d + "'", double12 == 8.0d);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        faculty4.cancelBooking("hi!");
        java.util.ArrayList<Models.Booking> bookingList8 = faculty4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        faculty4.cancelBooking("hi!");
        java.lang.String str8 = faculty4.getLicensePlate();
        boolean boolean9 = faculty4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "", "");
        faculty4.setValidated(true);
        boolean boolean9 = faculty4.registerAccount("", "");
        java.lang.String str10 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        double double7 = faculty4.getParkingRate();
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        boolean boolean11 = faculty4.registerAccount("", "");
        java.util.ArrayList<Models.Booking> bookingList12 = faculty4.getBookings();
        faculty4.cancelBooking("hi!");
        Models.ParkingSpace parkingSpace15 = faculty4.getParkingSpace();
        faculty4.setValidated(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace15);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "", "");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        double double7 = faculty4.getParkingRate();
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        boolean boolean11 = faculty4.registerAccount("", "");
        double double12 = faculty4.getParkingRate();
        double double13 = faculty4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.0d + "'", double12 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.0d + "'", double13 == 8.0d);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        faculty4.setValidated(true);
        java.lang.String str8 = faculty4.getPassword();
        java.lang.Class<?> wildcardClass9 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "", "");
        boolean boolean7 = faculty4.registerAccount("hi!", "hi!");
        double double8 = faculty4.getParkingRate();
        java.lang.String str9 = faculty4.getEmail();
        java.lang.Class<?> wildcardClass10 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        boolean boolean5 = faculty4.getisValidated();
        double double6 = faculty4.getParkingRate();
        faculty4.setValidated(false);
        faculty4.cancelBooking("");
        Models.ParkingSpace parkingSpace11 = faculty4.getParkingSpace();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = parkingSpace11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList7 = faculty4.getBookings();
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        java.lang.String str9 = faculty4.getPassword();
        faculty4.cancelBooking("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        double double10 = faculty4.getParkingRate();
        faculty4.setValidated(true);
        boolean boolean15 = faculty4.registerAccount("hi!", "");
        java.lang.Class<?> wildcardClass16 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        Models.ParkingSpace parkingSpace7 = faculty4.getParkingSpace();
        java.lang.String str8 = faculty4.getLicensePlate();
        faculty4.cancelBooking("hi!");
        double double11 = faculty4.getParkingRate();
        java.lang.String str12 = faculty4.getUsername();
        boolean boolean15 = faculty4.registerAccount("hi!", "hi!");
        Models.ParkingSpace parkingSpace19 = null;
        java.time.LocalTime localTime20 = null;
        java.time.LocalTime localTime21 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking22 = faculty4.makeBooking("", "hi!", "", parkingSpace19, localTime20, localTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        double double7 = faculty4.getParkingRate();
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        boolean boolean9 = faculty4.getisValidated();
        java.lang.String str10 = faculty4.getPassword();
        java.lang.Class<?> wildcardClass11 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        double double5 = faculty4.getParkingRate();
        java.lang.String str6 = faculty4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "", "");
        boolean boolean7 = faculty4.registerAccount("hi!", "hi!");
        double double8 = faculty4.getParkingRate();
        java.lang.String str9 = faculty4.getEmail();
        Models.ParkingSpace parkingSpace10 = faculty4.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        faculty4.setValidated(true);
        java.lang.String str12 = faculty4.getEmail();
        boolean boolean15 = faculty4.registerAccount("", "");
        Models.ParkingSpace parkingSpace19 = null;
        java.time.LocalTime localTime20 = null;
        java.time.LocalTime localTime21 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking22 = faculty4.makeBooking("hi!", "hi!", "", parkingSpace19, localTime20, localTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        boolean boolean7 = faculty4.getisValidated();
        java.lang.String str8 = faculty4.getEmail();
        java.lang.String str9 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "hi!");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.util.ArrayList<Models.Booking> bookingList6 = faculty4.getBookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = bookingList6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        faculty4.setValidated(true);
        java.lang.String str12 = faculty4.getUsername();
        java.lang.String str13 = faculty4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList7 = faculty4.getBookings();
        java.util.ArrayList<Models.Booking> bookingList8 = faculty4.getBookings();
        java.util.ArrayList<Models.Booking> bookingList9 = faculty4.getBookings();
        Models.ParkingSpace parkingSpace13 = null;
        java.time.LocalTime localTime14 = null;
        java.time.LocalTime localTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking16 = faculty4.makeBooking("", "hi!", "hi!", parkingSpace13, localTime14, localTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        boolean boolean5 = faculty4.getisValidated();
        java.lang.String str6 = faculty4.getEmail();
        java.util.ArrayList<Models.Booking> bookingList7 = faculty4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        boolean boolean7 = faculty4.getisValidated();
        java.util.ArrayList<Models.Booking> bookingList8 = faculty4.getBookings();
        boolean boolean9 = faculty4.getisValidated();
        faculty4.setValidated(false);
        java.lang.Class<?> wildcardClass12 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        boolean boolean5 = faculty4.getisValidated();
        boolean boolean8 = faculty4.registerAccount("", "");
        java.lang.String str9 = faculty4.getUsername();
        java.util.ArrayList<Models.Booking> bookingList10 = faculty4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList7 = faculty4.getBookings();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        boolean boolean10 = faculty4.getisValidated();
        java.lang.String str11 = faculty4.getEmail();
        faculty4.setValidated(true);
        faculty4.cancelBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getPassword();
        faculty4.setValidated(true);
        Models.ParkingSpace parkingSpace12 = null;
        java.time.LocalTime localTime13 = null;
        java.time.LocalTime localTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking15 = faculty4.makeBooking("hi!", "hi!", "hi!", parkingSpace12, localTime13, localTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getLicensePlate();
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        faculty4.cancelBooking("");
        boolean boolean11 = faculty4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        boolean boolean7 = faculty4.getisValidated();
        java.util.ArrayList<Models.Booking> bookingList8 = faculty4.getBookings();
        boolean boolean9 = faculty4.getisValidated();
        boolean boolean10 = faculty4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getPassword();
        java.lang.String str7 = faculty4.getLicensePlate();
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        boolean boolean9 = faculty4.getisValidated();
        java.lang.String str10 = faculty4.getEmail();
        faculty4.setValidated(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        Models.ParkingSpace parkingSpace7 = faculty4.getParkingSpace();
        java.lang.String str8 = faculty4.getLicensePlate();
        faculty4.cancelBooking("hi!");
        double double11 = faculty4.getParkingRate();
        java.lang.String str12 = faculty4.getUsername();
        faculty4.setValidated(false);
        boolean boolean17 = faculty4.registerAccount("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        faculty4.cancelBooking("hi!");
        java.lang.String str7 = faculty4.getUsername();
        faculty4.cancelBooking("hi!");
        Models.ParkingSpace parkingSpace13 = null;
        java.time.LocalTime localTime14 = null;
        java.time.LocalTime localTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking16 = faculty4.makeBooking("", "hi!", "", parkingSpace13, localTime14, localTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        double double7 = faculty4.getParkingRate();
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        boolean boolean11 = faculty4.registerAccount("", "");
        java.util.ArrayList<Models.Booking> bookingList12 = faculty4.getBookings();
        faculty4.cancelBooking("hi!");
        java.util.ArrayList<Models.Booking> bookingList15 = faculty4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList15);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        boolean boolean7 = faculty4.getisValidated();
        java.lang.String str8 = faculty4.getPassword();
        faculty4.cancelBooking("hi!");
        boolean boolean11 = faculty4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        boolean boolean7 = faculty4.getisValidated();
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        java.lang.String str9 = faculty4.getPassword();
        java.lang.String str10 = faculty4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        boolean boolean7 = faculty4.getisValidated();
        boolean boolean8 = faculty4.getisValidated();
        java.lang.Class<?> wildcardClass9 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        faculty4.setValidated(true);
        faculty4.setValidated(true);
        boolean boolean9 = faculty4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        double double7 = faculty4.getParkingRate();
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        java.lang.String str9 = faculty4.getEmail();
        boolean boolean12 = faculty4.registerAccount("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        faculty4.setValidated(true);
        faculty4.setValidated(true);
        java.lang.Class<?> wildcardClass14 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        boolean boolean5 = faculty4.getisValidated();
        boolean boolean8 = faculty4.registerAccount("", "");
        java.lang.String str9 = faculty4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        double double6 = faculty4.getParkingRate();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getEmail();
        faculty4.cancelBooking("hi!");
        java.util.ArrayList<Models.Booking> bookingList11 = faculty4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getPassword();
        faculty4.cancelBooking("");
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getUsername();
        double double10 = faculty4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        Models.Faculty faculty4 = new Models.Faculty("", "", "hi!", "hi!");
        Models.ParkingSpace parkingSpace5 = faculty4.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace5);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList7 = faculty4.getBookings();
        java.util.ArrayList<Models.Booking> bookingList8 = faculty4.getBookings();
        java.util.ArrayList<Models.Booking> bookingList9 = faculty4.getBookings();
        java.lang.String str10 = faculty4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        boolean boolean9 = faculty4.registerAccount("", "hi!");
        faculty4.setValidated(true);
        boolean boolean12 = faculty4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        java.lang.String str7 = faculty4.getPassword();
        java.lang.String str8 = faculty4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getPassword();
        java.lang.String str7 = faculty4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        faculty4.setValidated(true);
        java.lang.String str12 = faculty4.getEmail();
        double double13 = faculty4.getParkingRate();
        Models.ParkingSpace parkingSpace17 = null;
        java.time.LocalTime localTime18 = null;
        java.time.LocalTime localTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking20 = faculty4.makeBooking("hi!", "hi!", "", parkingSpace17, localTime18, localTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.0d + "'", double13 == 8.0d);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        Models.ParkingSpace parkingSpace7 = faculty4.getParkingSpace();
        java.lang.String str8 = faculty4.getPassword();
        faculty4.cancelBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getPassword();
        faculty4.cancelBooking("");
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getUsername();
        Models.ParkingSpace parkingSpace10 = faculty4.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList7 = faculty4.getBookings();
        java.lang.String str8 = faculty4.getUsername();
        boolean boolean9 = faculty4.getisValidated();
        java.lang.String str10 = faculty4.getPassword();
        java.lang.String str11 = faculty4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        faculty4.setValidated(true);
        faculty4.setValidated(true);
        boolean boolean11 = faculty4.registerAccount("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        boolean boolean7 = faculty4.getisValidated();
        java.util.ArrayList<Models.Booking> bookingList8 = faculty4.getBookings();
        boolean boolean9 = faculty4.getisValidated();
        java.lang.String str10 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        double double7 = faculty4.getParkingRate();
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        boolean boolean11 = faculty4.registerAccount("", "");
        java.lang.String str12 = faculty4.getLicensePlate();
        java.util.ArrayList<Models.Booking> bookingList13 = faculty4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "", "hi!");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        faculty4.setValidated(true);
        boolean boolean8 = faculty4.getisValidated();
        boolean boolean11 = faculty4.registerAccount("", "hi!");
        java.lang.Class<?> wildcardClass12 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        boolean boolean5 = faculty4.getisValidated();
        faculty4.setValidated(false);
        double double8 = faculty4.getParkingRate();
        boolean boolean9 = faculty4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        boolean boolean7 = faculty4.registerAccount("hi!", "hi!");
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getEmail();
        Models.ParkingSpace parkingSpace6 = faculty4.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace6);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        faculty4.setValidated(true);
        boolean boolean8 = faculty4.getisValidated();
        boolean boolean11 = faculty4.registerAccount("", "hi!");
        java.util.ArrayList<Models.Booking> bookingList12 = faculty4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList12);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        faculty4.cancelBooking("hi!");
        faculty4.cancelBooking("");
        java.lang.String str9 = faculty4.getLicensePlate();
        java.lang.String str10 = faculty4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getPassword();
        java.lang.String str7 = faculty4.getPassword();
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        boolean boolean9 = faculty4.registerAccount("", "hi!");
        faculty4.setValidated(false);
        java.lang.String str12 = faculty4.getUsername();
        java.lang.String str13 = faculty4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        java.lang.String str5 = faculty4.getEmail();
        faculty4.cancelBooking("hi!");
        java.lang.String str8 = faculty4.getPassword();
        boolean boolean11 = faculty4.registerAccount("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        Models.Faculty faculty4 = new Models.Faculty("", "", "hi!", "");
        java.lang.String str5 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        Models.Faculty faculty4 = new Models.Faculty("", "hi!", "hi!", "hi!");
        faculty4.cancelBooking("hi!");
        java.lang.String str7 = faculty4.getUsername();
        faculty4.cancelBooking("hi!");
        java.lang.Class<?> wildcardClass10 = faculty4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList7 = faculty4.getBookings();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        boolean boolean10 = faculty4.getisValidated();
        java.lang.String str11 = faculty4.getEmail();
        faculty4.setValidated(true);
        boolean boolean14 = faculty4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.lang.String str5 = faculty4.getEmail();
        java.lang.String str6 = faculty4.getPassword();
        Models.ParkingSpace parkingSpace7 = faculty4.getParkingSpace();
        faculty4.cancelBooking("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.lang.String str7 = faculty4.getLicensePlate();
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        double double6 = faculty4.getParkingRate();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getEmail();
        faculty4.setValidated(false);
        java.util.ArrayList<Models.Booking> bookingList11 = faculty4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        boolean boolean5 = faculty4.getisValidated();
        faculty4.setValidated(false);
        boolean boolean8 = faculty4.getisValidated();
        java.lang.String str9 = faculty4.getUsername();
        java.lang.String str10 = faculty4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getPassword();
        java.lang.String str7 = faculty4.getLicensePlate();
        faculty4.setValidated(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getPassword();
        java.lang.String str7 = faculty4.getLicensePlate();
        Models.ParkingSpace parkingSpace8 = faculty4.getParkingSpace();
        boolean boolean9 = faculty4.getisValidated();
        java.lang.String str10 = faculty4.getEmail();
        java.util.ArrayList<Models.Booking> bookingList11 = faculty4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getPassword();
        Models.ParkingSpace parkingSpace7 = faculty4.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        double double6 = faculty4.getParkingRate();
        Models.ParkingSpace parkingSpace7 = faculty4.getParkingSpace();
        double double8 = faculty4.getParkingRate();
        java.util.ArrayList<Models.Booking> bookingList9 = faculty4.getBookings();
        double double10 = faculty4.getParkingRate();
        boolean boolean13 = faculty4.registerAccount("hi!", "hi!");
        Models.ParkingSpace parkingSpace17 = null;
        java.time.LocalTime localTime18 = null;
        java.time.LocalTime localTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking20 = faculty4.makeBooking("hi!", "hi!", "", parkingSpace17, localTime18, localTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        boolean boolean9 = faculty4.registerAccount("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        Models.Faculty faculty4 = new Models.Faculty("", "", "", "");
        faculty4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList7 = faculty4.getBookings();
        java.lang.String str8 = faculty4.getUsername();
        boolean boolean9 = faculty4.getisValidated();
        faculty4.cancelBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = faculty4.getBookings();
        java.lang.String str6 = faculty4.getUsername();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getUsername();
        java.lang.String str9 = faculty4.getLicensePlate();
        faculty4.setValidated(true);
        java.lang.String str12 = faculty4.getEmail();
        java.lang.String str13 = faculty4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getUsername();
        java.lang.String str6 = faculty4.getEmail();
        Models.ParkingSpace parkingSpace7 = faculty4.getParkingSpace();
        java.lang.String str8 = faculty4.getPassword();
        java.lang.String str9 = faculty4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        Models.Faculty faculty4 = new Models.Faculty("hi!", "hi!", "hi!", "");
        java.lang.String str5 = faculty4.getPassword();
        faculty4.cancelBooking("");
        faculty4.cancelBooking("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }
}


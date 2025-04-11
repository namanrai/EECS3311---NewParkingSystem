import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VisitorRegressionTest0 {

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
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.Class<?> wildcardClass9 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.Class<?> wildcardClass7 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        Models.ParkingSpace parkingSpace13 = null;
        java.time.LocalTime localTime14 = null;
        java.time.LocalTime localTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking16 = visitor4.makeBooking("hi!", "hi!", "hi!", parkingSpace13, localTime14, localTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace11 = null;
        java.time.LocalTime localTime12 = null;
        java.time.LocalTime localTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking14 = visitor4.makeBooking("hi!", "", "", parkingSpace11, localTime12, localTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getUsername();
        Models.ParkingSpace parkingSpace11 = null;
        java.time.LocalTime localTime12 = null;
        java.time.LocalTime localTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking14 = visitor4.makeBooking("hi!", "hi!", "", parkingSpace11, localTime12, localTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        Models.ParkingSpace parkingSpace8 = null;
        java.time.LocalTime localTime9 = null;
        java.time.LocalTime localTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking11 = visitor4.makeBooking("hi!", "", "hi!", parkingSpace8, localTime9, localTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        Models.ParkingSpace parkingSpace15 = null;
        java.time.LocalTime localTime16 = null;
        java.time.LocalTime localTime17 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking18 = visitor4.makeBooking("", "", "", parkingSpace15, localTime16, localTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getPassword();
        Models.ParkingSpace parkingSpace10 = null;
        java.time.LocalTime localTime11 = null;
        java.time.LocalTime localTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking13 = visitor4.makeBooking("", "", "hi!", parkingSpace10, localTime11, localTime12);
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        java.lang.Class<?> wildcardClass7 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        boolean boolean5 = visitor4.getisValidated();
        boolean boolean6 = visitor4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        Models.ParkingSpace parkingSpace12 = null;
        java.time.LocalTime localTime13 = null;
        java.time.LocalTime localTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking15 = visitor4.makeBooking("", "hi!", "", parkingSpace12, localTime13, localTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        double double6 = visitor4.getParkingRate();
        java.lang.Class<?> wildcardClass7 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        Models.ParkingSpace parkingSpace9 = visitor4.getParkingSpace();
        Models.ParkingSpace parkingSpace13 = null;
        java.time.LocalTime localTime14 = null;
        java.time.LocalTime localTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking16 = visitor4.makeBooking("", "", "hi!", parkingSpace13, localTime14, localTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        boolean boolean14 = visitor4.registerAccount("", "");
        java.lang.Class<?> wildcardClass15 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace10 = null;
        java.time.LocalTime localTime11 = null;
        java.time.LocalTime localTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking13 = visitor4.makeBooking("hi!", "", "", parkingSpace10, localTime11, localTime12);
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
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace14 = null;
        java.time.LocalTime localTime15 = null;
        java.time.LocalTime localTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking17 = visitor4.makeBooking("", "", "hi!", parkingSpace14, localTime15, localTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace7 = visitor4.getParkingSpace();
        java.util.ArrayList<Models.Booking> bookingList8 = visitor4.getBookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = bookingList8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getPassword();
        java.lang.String str7 = visitor4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "", "");
        double double5 = visitor4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        java.util.ArrayList<Models.Booking> bookingList7 = visitor4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getUsername();
        Models.ParkingSpace parkingSpace13 = null;
        java.time.LocalTime localTime14 = null;
        java.time.LocalTime localTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking16 = visitor4.makeBooking("", "hi!", "", parkingSpace13, localTime14, localTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "", "", "");
        java.lang.String str5 = visitor4.getUsername();
        java.lang.String str6 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        visitor4.cancelBooking("");
        java.lang.Class<?> wildcardClass18 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "", "", "");
        java.lang.String str5 = visitor4.getUsername();
        visitor4.setValidated(true);
        java.lang.Class<?> wildcardClass8 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        java.util.ArrayList<Models.Booking> bookingList16 = visitor4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList16);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "", "", "");
        java.lang.String str5 = visitor4.getUsername();
        visitor4.setValidated(true);
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        Models.ParkingSpace parkingSpace9 = visitor4.getParkingSpace();
        Models.ParkingSpace parkingSpace13 = null;
        java.time.LocalTime localTime14 = null;
        java.time.LocalTime localTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking16 = visitor4.makeBooking("hi!", "", "", parkingSpace13, localTime14, localTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        Models.ParkingSpace parkingSpace17 = null;
        java.time.LocalTime localTime18 = null;
        java.time.LocalTime localTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking20 = visitor4.makeBooking("", "", "", parkingSpace17, localTime18, localTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        boolean boolean5 = visitor4.getisValidated();
        java.lang.Class<?> wildcardClass6 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        double double6 = visitor4.getParkingRate();
        java.util.ArrayList<Models.Booking> bookingList7 = visitor4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        visitor4.setValidated(false);
        visitor4.setValidated(true);
        java.lang.Class<?> wildcardClass16 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace7 = visitor4.getParkingSpace();
        java.lang.String str8 = visitor4.getEmail();
        double double9 = visitor4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.setValidated(false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        boolean boolean8 = visitor4.getisValidated();
        java.lang.String str9 = visitor4.getPassword();
        java.lang.Class<?> wildcardClass10 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        boolean boolean9 = visitor4.getisValidated();
        java.lang.Class<?> wildcardClass10 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass5 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        java.lang.String str10 = visitor4.getEmail();
        java.util.ArrayList<Models.Booking> bookingList11 = visitor4.getBookings();
        visitor4.cancelBooking("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        java.lang.String str10 = visitor4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "", "", "");
        java.lang.String str5 = visitor4.getUsername();
        visitor4.setValidated(true);
        java.lang.String str8 = visitor4.getUsername();
        Models.ParkingSpace parkingSpace12 = null;
        java.time.LocalTime localTime13 = null;
        java.time.LocalTime localTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking15 = visitor4.makeBooking("", "", "hi!", parkingSpace12, localTime13, localTime14);
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
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace7 = visitor4.getParkingSpace();
        Models.ParkingSpace parkingSpace11 = null;
        java.time.LocalTime localTime12 = null;
        java.time.LocalTime localTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking14 = visitor4.makeBooking("", "", "hi!", parkingSpace11, localTime12, localTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        java.lang.String str16 = visitor4.getUsername();
        java.util.ArrayList<Models.Booking> bookingList17 = visitor4.getBookings();
        Models.ParkingSpace parkingSpace18 = visitor4.getParkingSpace();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = parkingSpace18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace18);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean9 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str10 = visitor4.getPassword();
        java.lang.Class<?> wildcardClass11 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("hi!", "");
        Models.ParkingSpace parkingSpace16 = null;
        java.time.LocalTime localTime17 = null;
        java.time.LocalTime localTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking19 = visitor4.makeBooking("", "", "hi!", parkingSpace16, localTime17, localTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        boolean boolean8 = visitor4.getisValidated();
        java.util.ArrayList<Models.Booking> bookingList9 = visitor4.getBookings();
        visitor4.cancelBooking("");
        double double12 = visitor4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Models.Visitor visitor4 = new Models.Visitor("", "", "", "");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getLicensePlate();
        boolean boolean9 = visitor4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        boolean boolean12 = visitor4.getisValidated();
        boolean boolean15 = visitor4.registerAccount("hi!", "hi!");
        boolean boolean16 = visitor4.getisValidated();
        double double17 = visitor4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        boolean boolean8 = visitor4.getisValidated();
        java.util.ArrayList<Models.Booking> bookingList9 = visitor4.getBookings();
        boolean boolean10 = visitor4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        boolean boolean9 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace13 = null;
        java.time.LocalTime localTime14 = null;
        java.time.LocalTime localTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking16 = visitor4.makeBooking("", "", "hi!", parkingSpace13, localTime14, localTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        Models.ParkingSpace parkingSpace15 = null;
        java.time.LocalTime localTime16 = null;
        java.time.LocalTime localTime17 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking18 = visitor4.makeBooking("", "", "hi!", parkingSpace15, localTime16, localTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace7 = visitor4.getParkingSpace();
        java.util.ArrayList<Models.Booking> bookingList8 = visitor4.getBookings();
        visitor4.setValidated(true);
        double double11 = visitor4.getParkingRate();
        Models.ParkingSpace parkingSpace15 = null;
        java.time.LocalTime localTime16 = null;
        java.time.LocalTime localTime17 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking18 = visitor4.makeBooking("hi!", "", "", parkingSpace15, localTime16, localTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "", "", "");
        java.lang.String str5 = visitor4.getUsername();
        visitor4.setValidated(true);
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "hi!", "hi!", "hi!");
        Models.ParkingSpace parkingSpace5 = visitor4.getParkingSpace();
        java.lang.Class<?> wildcardClass6 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        visitor4.setValidated(false);
        visitor4.setValidated(true);
        visitor4.setValidated(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        visitor4.cancelBooking("hi!");
        Models.ParkingSpace parkingSpace9 = visitor4.getParkingSpace();
        Models.ParkingSpace parkingSpace13 = null;
        java.time.LocalTime localTime14 = null;
        java.time.LocalTime localTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking16 = visitor4.makeBooking("hi!", "hi!", "hi!", parkingSpace13, localTime14, localTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.Class<?> wildcardClass13 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        visitor4.setValidated(false);
        boolean boolean18 = visitor4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        visitor4.setValidated(true);
        java.lang.String str14 = visitor4.getUsername();
        boolean boolean15 = visitor4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean9 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str10 = visitor4.getPassword();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        visitor4.setValidated(false);
        java.lang.Class<?> wildcardClass14 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace7 = visitor4.getParkingSpace();
        java.lang.String str8 = visitor4.getUsername();
        double double9 = visitor4.getParkingRate();
        Models.ParkingSpace parkingSpace13 = null;
        java.time.LocalTime localTime14 = null;
        java.time.LocalTime localTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking16 = visitor4.makeBooking("", "hi!", "", parkingSpace13, localTime14, localTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace7 = visitor4.getParkingSpace();
        java.util.ArrayList<Models.Booking> bookingList8 = visitor4.getBookings();
        java.lang.String str9 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "", "", "");
        java.lang.String str5 = visitor4.getUsername();
        visitor4.setValidated(true);
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        java.lang.String str9 = visitor4.getUsername();
        java.lang.String str10 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace7 = visitor4.getParkingSpace();
        java.lang.String str8 = visitor4.getUsername();
        java.util.ArrayList<Models.Booking> bookingList9 = visitor4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getUsername();
        java.util.ArrayList<Models.Booking> bookingList8 = visitor4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        java.util.ArrayList<Models.Booking> bookingList12 = visitor4.getBookings();
        boolean boolean15 = visitor4.registerAccount("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "", "", "");
        boolean boolean7 = visitor4.registerAccount("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        java.lang.String str16 = visitor4.getUsername();
        java.util.ArrayList<Models.Booking> bookingList17 = visitor4.getBookings();
        Models.ParkingSpace parkingSpace18 = visitor4.getParkingSpace();
        Models.ParkingSpace parkingSpace22 = null;
        java.time.LocalTime localTime23 = null;
        java.time.LocalTime localTime24 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking25 = visitor4.makeBooking("", "hi!", "", parkingSpace22, localTime23, localTime24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace18);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        visitor4.setValidated(true);
        java.lang.String str14 = visitor4.getUsername();
        java.lang.String str15 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        java.lang.String str16 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        boolean boolean8 = visitor4.getisValidated();
        java.lang.String str9 = visitor4.getPassword();
        java.lang.String str10 = visitor4.getUsername();
        boolean boolean13 = visitor4.registerAccount("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getUsername();
        java.util.ArrayList<Models.Booking> bookingList10 = visitor4.getBookings();
        double double11 = visitor4.getParkingRate();
        Models.ParkingSpace parkingSpace15 = null;
        java.time.LocalTime localTime16 = null;
        java.time.LocalTime localTime17 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking18 = visitor4.makeBooking("", "", "", parkingSpace15, localTime16, localTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getEmail();
        boolean boolean9 = visitor4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean9 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str10 = visitor4.getPassword();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        visitor4.setValidated(false);
        Models.ParkingSpace parkingSpace14 = visitor4.getParkingSpace();
        java.lang.Class<?> wildcardClass15 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getUsername();
        Models.ParkingSpace parkingSpace7 = visitor4.getParkingSpace();
        boolean boolean10 = visitor4.registerAccount("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        boolean boolean9 = visitor4.getisValidated();
        visitor4.setValidated(false);
        Models.ParkingSpace parkingSpace15 = null;
        java.time.LocalTime localTime16 = null;
        java.time.LocalTime localTime17 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking18 = visitor4.makeBooking("hi!", "hi!", "hi!", parkingSpace15, localTime16, localTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "hi!", "hi!", "hi!");
        Models.ParkingSpace parkingSpace5 = visitor4.getParkingSpace();
        java.lang.String str6 = visitor4.getLicensePlate();
        java.lang.Class<?> wildcardClass7 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        java.lang.String str12 = visitor4.getUsername();
        visitor4.cancelBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        java.lang.Class<?> wildcardClass16 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getLicensePlate();
        java.util.ArrayList<Models.Booking> bookingList9 = visitor4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        Models.ParkingSpace parkingSpace12 = visitor4.getParkingSpace();
        visitor4.setValidated(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace12);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        boolean boolean14 = visitor4.registerAccount("", "");
        boolean boolean15 = visitor4.getisValidated();
        double double16 = visitor4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        java.lang.String str10 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace14 = null;
        java.time.LocalTime localTime15 = null;
        java.time.LocalTime localTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking17 = visitor4.makeBooking("hi!", "", "", parkingSpace14, localTime15, localTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        double double6 = visitor4.getParkingRate();
        java.lang.String str7 = visitor4.getUsername();
        java.lang.String str8 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace7 = visitor4.getParkingSpace();
        java.lang.String str8 = visitor4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        Models.ParkingSpace parkingSpace9 = visitor4.getParkingSpace();
        java.lang.Class<?> wildcardClass10 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        boolean boolean14 = visitor4.registerAccount("", "");
        boolean boolean15 = visitor4.getisValidated();
        java.lang.String str16 = visitor4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        java.lang.String str16 = visitor4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        boolean boolean8 = visitor4.getisValidated();
        java.util.ArrayList<Models.Booking> bookingList9 = visitor4.getBookings();
        java.lang.String str10 = visitor4.getLicensePlate();
        java.lang.String str11 = visitor4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        boolean boolean9 = visitor4.getisValidated();
        visitor4.setValidated(false);
        Models.ParkingSpace parkingSpace12 = visitor4.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace12);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace18 = visitor4.getParkingSpace();
        java.lang.String str19 = visitor4.getUsername();
        double double20 = visitor4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 15.0d + "'", double20 == 15.0d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "hi!", "hi!", "");
        Models.ParkingSpace parkingSpace8 = null;
        java.time.LocalTime localTime9 = null;
        java.time.LocalTime localTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking11 = visitor4.makeBooking("", "", "hi!", parkingSpace8, localTime9, localTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "", "hi!", "hi!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        java.lang.String str10 = visitor4.getEmail();
        java.util.ArrayList<Models.Booking> bookingList11 = visitor4.getBookings();
        java.lang.String str12 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        boolean boolean8 = visitor4.getisValidated();
        java.util.ArrayList<Models.Booking> bookingList9 = visitor4.getBookings();
        Models.ParkingSpace parkingSpace10 = visitor4.getParkingSpace();
        java.util.ArrayList<Models.Booking> bookingList11 = visitor4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        boolean boolean12 = visitor4.getisValidated();
        java.lang.Class<?> wildcardClass13 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace7 = visitor4.getParkingSpace();
        java.lang.String str8 = visitor4.getUsername();
        double double9 = visitor4.getParkingRate();
        java.lang.String str10 = visitor4.getUsername();
        boolean boolean13 = visitor4.registerAccount("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "", "", "hi!");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        Models.ParkingSpace parkingSpace12 = visitor4.getParkingSpace();
        java.lang.String str13 = visitor4.getLicensePlate();
        java.lang.String str14 = visitor4.getLicensePlate();
        visitor4.setValidated(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        java.lang.String str16 = visitor4.getUsername();
        java.lang.String str17 = visitor4.getLicensePlate();
        boolean boolean18 = visitor4.getisValidated();
        java.util.ArrayList<Models.Booking> bookingList19 = visitor4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList19);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "", "", "");
        java.lang.String str5 = visitor4.getUsername();
        visitor4.setValidated(true);
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        java.util.ArrayList<Models.Booking> bookingList9 = visitor4.getBookings();
        boolean boolean10 = visitor4.getisValidated();
        java.lang.Class<?> wildcardClass11 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean9 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str10 = visitor4.getPassword();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        visitor4.setValidated(false);
        java.lang.String str14 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "hi!", "", "hi!");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace18 = visitor4.getParkingSpace();
        java.lang.String str19 = visitor4.getUsername();
        java.lang.String str20 = visitor4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        java.util.ArrayList<Models.Booking> bookingList12 = visitor4.getBookings();
        java.lang.String str13 = visitor4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        java.lang.String str7 = visitor4.getPassword();
        java.lang.String str8 = visitor4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        java.lang.String str16 = visitor4.getUsername();
        java.lang.String str17 = visitor4.getLicensePlate();
        java.lang.Class<?> wildcardClass18 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        visitor4.cancelBooking("");
        java.lang.String str18 = visitor4.getEmail();
        java.lang.String str19 = visitor4.getEmail();
        java.lang.String str20 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "", "");
        visitor4.setValidated(false);
        double double7 = visitor4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        java.lang.String str16 = visitor4.getUsername();
        java.util.ArrayList<Models.Booking> bookingList17 = visitor4.getBookings();
        Models.ParkingSpace parkingSpace18 = visitor4.getParkingSpace();
        java.util.ArrayList<Models.Booking> bookingList19 = visitor4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList19);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        boolean boolean8 = visitor4.getisValidated();
        java.lang.String str9 = visitor4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace7 = visitor4.getParkingSpace();
        java.util.ArrayList<Models.Booking> bookingList8 = visitor4.getBookings();
        visitor4.setValidated(true);
        double double11 = visitor4.getParkingRate();
        Models.ParkingSpace parkingSpace15 = null;
        java.time.LocalTime localTime16 = null;
        java.time.LocalTime localTime17 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking18 = visitor4.makeBooking("hi!", "hi!", "hi!", parkingSpace15, localTime16, localTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getUsername();
        Models.ParkingSpace parkingSpace7 = visitor4.getParkingSpace();
        boolean boolean8 = visitor4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "", "");
        java.util.ArrayList<Models.Booking> bookingList5 = visitor4.getBookings();
        boolean boolean6 = visitor4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        java.lang.String str16 = visitor4.getUsername();
        java.util.ArrayList<Models.Booking> bookingList17 = visitor4.getBookings();
        java.lang.String str18 = visitor4.getUsername();
        double double19 = visitor4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 15.0d + "'", double19 == 15.0d);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean9 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str10 = visitor4.getPassword();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        visitor4.setValidated(false);
        Models.ParkingSpace parkingSpace14 = visitor4.getParkingSpace();
        java.lang.String str15 = visitor4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        boolean boolean13 = visitor4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace7 = visitor4.getParkingSpace();
        java.lang.String str8 = visitor4.getUsername();
        double double9 = visitor4.getParkingRate();
        java.lang.String str10 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getUsername();
        java.lang.String str8 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        java.lang.String str16 = visitor4.getUsername();
        java.util.ArrayList<Models.Booking> bookingList17 = visitor4.getBookings();
        Models.ParkingSpace parkingSpace18 = visitor4.getParkingSpace();
        java.lang.String str19 = visitor4.getLicensePlate();
        java.lang.String str20 = visitor4.getLicensePlate();
        java.lang.String str21 = visitor4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "hi!", "hi!", "");
        double double5 = visitor4.getParkingRate();
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace11 = null;
        java.time.LocalTime localTime12 = null;
        java.time.LocalTime localTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking14 = visitor4.makeBooking("", "", "hi!", parkingSpace11, localTime12, localTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        java.lang.String str16 = visitor4.getUsername();
        java.lang.String str17 = visitor4.getLicensePlate();
        double double18 = visitor4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 15.0d + "'", double18 == 15.0d);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        boolean boolean8 = visitor4.getisValidated();
        java.util.ArrayList<Models.Booking> bookingList9 = visitor4.getBookings();
        visitor4.cancelBooking("");
        java.lang.String str12 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        boolean boolean16 = visitor4.registerAccount("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        visitor4.setValidated(false);
        visitor4.setValidated(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "", "", "");
        java.lang.String str5 = visitor4.getUsername();
        visitor4.setValidated(true);
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        java.util.ArrayList<Models.Booking> bookingList9 = visitor4.getBookings();
        java.lang.String str10 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        Models.ParkingSpace parkingSpace12 = visitor4.getParkingSpace();
        java.lang.String str13 = visitor4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        Models.ParkingSpace parkingSpace9 = visitor4.getParkingSpace();
        java.util.ArrayList<Models.Booking> bookingList10 = visitor4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "", "hi!");
        java.util.ArrayList<Models.Booking> bookingList5 = visitor4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        java.util.ArrayList<Models.Booking> bookingList12 = visitor4.getBookings();
        java.lang.String str13 = visitor4.getEmail();
        double double14 = visitor4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        Models.ParkingSpace parkingSpace12 = visitor4.getParkingSpace();
        visitor4.setValidated(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace12);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "", "", "");
        java.lang.String str5 = visitor4.getUsername();
        visitor4.setValidated(true);
        java.lang.String str8 = visitor4.getUsername();
        Models.ParkingSpace parkingSpace12 = null;
        java.time.LocalTime localTime13 = null;
        java.time.LocalTime localTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking15 = visitor4.makeBooking("hi!", "", "", parkingSpace12, localTime13, localTime14);
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
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "", "", "");
        java.lang.String str5 = visitor4.getUsername();
        visitor4.setValidated(true);
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        Models.ParkingSpace parkingSpace9 = visitor4.getParkingSpace();
        java.lang.String str10 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        boolean boolean8 = visitor4.getisValidated();
        java.util.ArrayList<Models.Booking> bookingList9 = visitor4.getBookings();
        Models.ParkingSpace parkingSpace10 = visitor4.getParkingSpace();
        visitor4.cancelBooking("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getPassword();
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        visitor4.setValidated(true);
        visitor4.setValidated(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getPassword();
        visitor4.setValidated(true);
        Models.ParkingSpace parkingSpace12 = null;
        java.time.LocalTime localTime13 = null;
        java.time.LocalTime localTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking15 = visitor4.makeBooking("hi!", "", "", parkingSpace12, localTime13, localTime14);
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
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        boolean boolean8 = visitor4.getisValidated();
        java.util.ArrayList<Models.Booking> bookingList9 = visitor4.getBookings();
        Models.ParkingSpace parkingSpace10 = visitor4.getParkingSpace();
        double double11 = visitor4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        java.lang.String str12 = visitor4.getUsername();
        java.util.ArrayList<Models.Booking> bookingList13 = visitor4.getBookings();
        double double14 = visitor4.getParkingRate();
        java.lang.String str15 = visitor4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        boolean boolean8 = visitor4.getisValidated();
        java.lang.String str9 = visitor4.getPassword();
        visitor4.setValidated(true);
        visitor4.cancelBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean9 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str10 = visitor4.getPassword();
        java.lang.String str11 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace18 = visitor4.getParkingSpace();
        java.lang.String str19 = visitor4.getLicensePlate();
        java.lang.String str20 = visitor4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        java.lang.String str12 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "hi!", "hi!", "");
        double double5 = visitor4.getParkingRate();
        java.lang.String str6 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        visitor4.setValidated(false);
        visitor4.cancelBooking("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        visitor4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList14 = visitor4.getBookings();
        Models.ParkingSpace parkingSpace18 = null;
        java.time.LocalTime localTime19 = null;
        java.time.LocalTime localTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking21 = visitor4.makeBooking("", "", "", parkingSpace18, localTime19, localTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList14);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        boolean boolean8 = visitor4.getisValidated();
        java.lang.String str9 = visitor4.getPassword();
        java.lang.String str10 = visitor4.getLicensePlate();
        boolean boolean13 = visitor4.registerAccount("hi!", "");
        java.lang.Class<?> wildcardClass14 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        Models.ParkingSpace parkingSpace19 = null;
        java.time.LocalTime localTime20 = null;
        java.time.LocalTime localTime21 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking22 = visitor4.makeBooking("", "hi!", "hi!", parkingSpace19, localTime20, localTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        visitor4.setValidated(false);
        visitor4.setValidated(true);
        boolean boolean18 = visitor4.registerAccount("", "");
        visitor4.cancelBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("hi!", "");
        java.util.ArrayList<Models.Booking> bookingList13 = visitor4.getBookings();
        Models.ParkingSpace parkingSpace17 = null;
        java.time.LocalTime localTime18 = null;
        java.time.LocalTime localTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking20 = visitor4.makeBooking("", "", "hi!", parkingSpace17, localTime18, localTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        java.lang.String str12 = visitor4.getUsername();
        java.lang.String str13 = visitor4.getPassword();
        Models.ParkingSpace parkingSpace14 = visitor4.getParkingSpace();
        java.lang.Class<?> wildcardClass15 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getUsername();
        Models.ParkingSpace parkingSpace7 = visitor4.getParkingSpace();
        java.lang.String str8 = visitor4.getEmail();
        boolean boolean11 = visitor4.registerAccount("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        boolean boolean12 = visitor4.getisValidated();
        double double13 = visitor4.getParkingRate();
        boolean boolean14 = visitor4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        java.lang.String str16 = visitor4.getUsername();
        java.lang.String str17 = visitor4.getLicensePlate();
        boolean boolean18 = visitor4.getisValidated();
        boolean boolean19 = visitor4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        java.lang.String str12 = visitor4.getUsername();
        java.lang.String str13 = visitor4.getPassword();
        java.lang.String str14 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        boolean boolean12 = visitor4.getisValidated();
        boolean boolean15 = visitor4.registerAccount("hi!", "hi!");
        Models.ParkingSpace parkingSpace19 = null;
        java.time.LocalTime localTime20 = null;
        java.time.LocalTime localTime21 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking22 = visitor4.makeBooking("", "", "hi!", parkingSpace19, localTime20, localTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean9 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str10 = visitor4.getLicensePlate();
        java.lang.String str11 = visitor4.getPassword();
        boolean boolean14 = visitor4.registerAccount("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        visitor4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList14 = visitor4.getBookings();
        double double15 = visitor4.getParkingRate();
        visitor4.cancelBooking("");
        java.util.ArrayList<Models.Booking> bookingList18 = visitor4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList18);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        java.util.ArrayList<Models.Booking> bookingList12 = visitor4.getBookings();
        java.lang.String str13 = visitor4.getLicensePlate();
        java.lang.Class<?> wildcardClass14 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "hi!", "", "");
        Models.ParkingSpace parkingSpace8 = null;
        java.time.LocalTime localTime9 = null;
        java.time.LocalTime localTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking11 = visitor4.makeBooking("", "", "", parkingSpace8, localTime9, localTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        visitor4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList14 = visitor4.getBookings();
        double double15 = visitor4.getParkingRate();
        java.lang.String str16 = visitor4.getUsername();
        java.util.ArrayList<Models.Booking> bookingList17 = visitor4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList17);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean9 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str10 = visitor4.getPassword();
        java.lang.String str11 = visitor4.getUsername();
        java.lang.String str12 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getPassword();
        java.lang.String str7 = visitor4.getEmail();
        double double8 = visitor4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "", "", "");
        java.lang.String str5 = visitor4.getUsername();
        visitor4.setValidated(true);
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        java.util.ArrayList<Models.Booking> bookingList9 = visitor4.getBookings();
        boolean boolean10 = visitor4.getisValidated();
        double double11 = visitor4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean9 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str10 = visitor4.getPassword();
        visitor4.setValidated(true);
        java.lang.String str13 = visitor4.getUsername();
        java.lang.String str14 = visitor4.getEmail();
        boolean boolean15 = visitor4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        java.lang.String str16 = visitor4.getUsername();
        java.lang.String str17 = visitor4.getLicensePlate();
        boolean boolean18 = visitor4.getisValidated();
        java.lang.String str19 = visitor4.getLicensePlate();
        boolean boolean20 = visitor4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean9 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str10 = visitor4.getPassword();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        visitor4.setValidated(false);
        java.util.ArrayList<Models.Booking> bookingList14 = visitor4.getBookings();
        boolean boolean15 = visitor4.getisValidated();
        java.lang.String str16 = visitor4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getEmail();
        java.lang.String str14 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        visitor4.setValidated(true);
        java.lang.String str14 = visitor4.getUsername();
        Models.ParkingSpace parkingSpace15 = visitor4.getParkingSpace();
        visitor4.cancelBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace15);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        Models.Visitor visitor4 = new Models.Visitor("", "", "", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean9 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str10 = visitor4.getPassword();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        double double12 = visitor4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        visitor4.cancelBooking("hi!");
        Models.ParkingSpace parkingSpace9 = visitor4.getParkingSpace();
        java.lang.String str10 = visitor4.getLicensePlate();
        java.lang.Class<?> wildcardClass11 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        java.lang.String str12 = visitor4.getUsername();
        java.lang.String str13 = visitor4.getPassword();
        java.lang.String str14 = visitor4.getUsername();
        Models.ParkingSpace parkingSpace15 = visitor4.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace15);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace18 = visitor4.getParkingSpace();
        java.lang.String str19 = visitor4.getUsername();
        java.lang.String str20 = visitor4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        java.lang.String str16 = visitor4.getUsername();
        java.util.ArrayList<Models.Booking> bookingList17 = visitor4.getBookings();
        Models.ParkingSpace parkingSpace18 = visitor4.getParkingSpace();
        java.lang.String str19 = visitor4.getLicensePlate();
        boolean boolean20 = visitor4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "", "", "");
        java.lang.String str5 = visitor4.getUsername();
        visitor4.setValidated(true);
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        visitor4.setValidated(true);
        boolean boolean13 = visitor4.registerAccount("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        java.util.ArrayList<Models.Booking> bookingList12 = visitor4.getBookings();
        java.lang.String str13 = visitor4.getEmail();
        java.lang.String str14 = visitor4.getEmail();
        visitor4.cancelBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        java.lang.String str12 = visitor4.getUsername();
        java.lang.String str13 = visitor4.getPassword();
        visitor4.setValidated(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getUsername();
        java.util.ArrayList<Models.Booking> bookingList10 = visitor4.getBookings();
        java.lang.String str11 = visitor4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace18 = visitor4.getParkingSpace();
        java.lang.String str19 = visitor4.getUsername();
        java.lang.Class<?> wildcardClass20 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean9 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str10 = visitor4.getPassword();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        visitor4.setValidated(false);
        java.util.ArrayList<Models.Booking> bookingList14 = visitor4.getBookings();
        double double15 = visitor4.getParkingRate();
        Models.ParkingSpace parkingSpace16 = visitor4.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace16);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "", "");
        java.lang.String str5 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("hi!", "");
        java.util.ArrayList<Models.Booking> bookingList13 = visitor4.getBookings();
        java.lang.String str14 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        boolean boolean12 = visitor4.getisValidated();
        boolean boolean15 = visitor4.registerAccount("hi!", "");
        java.lang.String str16 = visitor4.getPassword();
        visitor4.setValidated(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        boolean boolean9 = visitor4.getisValidated();
        java.lang.String str10 = visitor4.getPassword();
        java.lang.String str11 = visitor4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace7 = visitor4.getParkingSpace();
        boolean boolean8 = visitor4.getisValidated();
        boolean boolean9 = visitor4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "", "", "");
        java.lang.String str5 = visitor4.getUsername();
        visitor4.setValidated(true);
        boolean boolean10 = visitor4.registerAccount("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean9 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str10 = visitor4.getPassword();
        java.lang.String str11 = visitor4.getUsername();
        java.util.ArrayList<Models.Booking> bookingList12 = visitor4.getBookings();
        Models.ParkingSpace parkingSpace16 = null;
        java.time.LocalTime localTime17 = null;
        java.time.LocalTime localTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking19 = visitor4.makeBooking("hi!", "hi!", "", parkingSpace16, localTime17, localTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList12);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getPassword();
        Models.ParkingSpace parkingSpace10 = null;
        java.time.LocalTime localTime11 = null;
        java.time.LocalTime localTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking13 = visitor4.makeBooking("", "", "", parkingSpace10, localTime11, localTime12);
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
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean9 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str10 = visitor4.getLicensePlate();
        java.lang.String str11 = visitor4.getEmail();
        boolean boolean14 = visitor4.registerAccount("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getUsername();
        boolean boolean10 = visitor4.registerAccount("", "hi!");
        boolean boolean13 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str14 = visitor4.getPassword();
        Models.ParkingSpace parkingSpace15 = visitor4.getParkingSpace();
        Models.ParkingSpace parkingSpace16 = visitor4.getParkingSpace();
        Models.ParkingSpace parkingSpace20 = null;
        java.time.LocalTime localTime21 = null;
        java.time.LocalTime localTime22 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking23 = visitor4.makeBooking("hi!", "", "", parkingSpace20, localTime21, localTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace16);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        double double5 = visitor4.getParkingRate();
        java.lang.String str6 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getLicensePlate();
        Models.ParkingSpace parkingSpace9 = visitor4.getParkingSpace();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace14 = null;
        java.time.LocalTime localTime15 = null;
        java.time.LocalTime localTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking17 = visitor4.makeBooking("", "hi!", "", parkingSpace14, localTime15, localTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace7 = visitor4.getParkingSpace();
        java.lang.String str8 = visitor4.getUsername();
        Models.ParkingSpace parkingSpace9 = visitor4.getParkingSpace();
        java.lang.String str10 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getUsername();
        boolean boolean10 = visitor4.registerAccount("", "hi!");
        boolean boolean13 = visitor4.registerAccount("hi!", "hi!");
        Models.ParkingSpace parkingSpace14 = visitor4.getParkingSpace();
        java.lang.String str15 = visitor4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getUsername();
        java.util.ArrayList<Models.Booking> bookingList10 = visitor4.getBookings();
        double double11 = visitor4.getParkingRate();
        Models.ParkingSpace parkingSpace12 = visitor4.getParkingSpace();
        boolean boolean15 = visitor4.registerAccount("hi!", "hi!");
        Models.ParkingSpace parkingSpace16 = visitor4.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace16);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        java.util.ArrayList<Models.Booking> bookingList12 = visitor4.getBookings();
        java.lang.String str13 = visitor4.getEmail();
        java.lang.String str14 = visitor4.getEmail();
        double double15 = visitor4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        visitor4.setValidated(true);
        java.lang.String str14 = visitor4.getUsername();
        Models.ParkingSpace parkingSpace15 = visitor4.getParkingSpace();
        java.lang.String str16 = visitor4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        visitor4.setValidated(false);
        java.lang.String str14 = visitor4.getLicensePlate();
        java.lang.String str15 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace7 = visitor4.getParkingSpace();
        java.lang.String str8 = visitor4.getUsername();
        java.lang.String str9 = visitor4.getLicensePlate();
        Models.ParkingSpace parkingSpace13 = null;
        java.time.LocalTime localTime14 = null;
        java.time.LocalTime localTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking16 = visitor4.makeBooking("", "hi!", "", parkingSpace13, localTime14, localTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        boolean boolean5 = visitor4.getisValidated();
        visitor4.setValidated(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace18 = visitor4.getParkingSpace();
        java.lang.String str19 = visitor4.getLicensePlate();
        Models.ParkingSpace parkingSpace23 = null;
        java.time.LocalTime localTime24 = null;
        java.time.LocalTime localTime25 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking26 = visitor4.makeBooking("hi!", "hi!", "", parkingSpace23, localTime24, localTime25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        visitor4.cancelBooking("hi!");
        Models.ParkingSpace parkingSpace9 = visitor4.getParkingSpace();
        java.lang.String str10 = visitor4.getLicensePlate();
        java.lang.String str11 = visitor4.getLicensePlate();
        visitor4.setValidated(false);
        visitor4.cancelBooking("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace7 = visitor4.getParkingSpace();
        java.lang.String str8 = visitor4.getUsername();
        Models.ParkingSpace parkingSpace9 = visitor4.getParkingSpace();
        java.util.ArrayList<Models.Booking> bookingList10 = visitor4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        visitor4.setValidated(false);
        Models.ParkingSpace parkingSpace15 = null;
        java.time.LocalTime localTime16 = null;
        java.time.LocalTime localTime17 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking18 = visitor4.makeBooking("hi!", "", "", parkingSpace15, localTime16, localTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        Models.ParkingSpace parkingSpace12 = visitor4.getParkingSpace();
        Models.ParkingSpace parkingSpace16 = null;
        java.time.LocalTime localTime17 = null;
        java.time.LocalTime localTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking19 = visitor4.makeBooking("hi!", "", "", parkingSpace16, localTime17, localTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace12);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        java.lang.String str11 = visitor4.getUsername();
        java.lang.String str12 = visitor4.getEmail();
        java.lang.String str13 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "", "", "");
        java.lang.String str5 = visitor4.getUsername();
        visitor4.setValidated(true);
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        visitor4.setValidated(true);
        visitor4.cancelBooking("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getPassword();
        visitor4.setValidated(true);
        java.lang.String str9 = visitor4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getLicensePlate();
        Models.ParkingSpace parkingSpace9 = visitor4.getParkingSpace();
        java.lang.String str10 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        visitor4.cancelBooking("");
        java.lang.String str18 = visitor4.getEmail();
        java.lang.Class<?> wildcardClass19 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        java.lang.String str16 = visitor4.getUsername();
        java.lang.String str17 = visitor4.getLicensePlate();
        boolean boolean20 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str21 = visitor4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean9 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str10 = visitor4.getPassword();
        visitor4.setValidated(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace7 = visitor4.getParkingSpace();
        double double8 = visitor4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "", "", "");
        java.lang.String str5 = visitor4.getUsername();
        visitor4.setValidated(true);
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        Models.ParkingSpace parkingSpace9 = visitor4.getParkingSpace();
        Models.ParkingSpace parkingSpace13 = null;
        java.time.LocalTime localTime14 = null;
        java.time.LocalTime localTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking16 = visitor4.makeBooking("hi!", "hi!", "", parkingSpace13, localTime14, localTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        boolean boolean9 = visitor4.getisValidated();
        java.lang.String str10 = visitor4.getPassword();
        java.lang.String str11 = visitor4.getEmail();
        java.lang.String str12 = visitor4.getUsername();
        boolean boolean15 = visitor4.registerAccount("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        java.lang.String str11 = visitor4.getUsername();
        java.lang.String str12 = visitor4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getUsername();
        java.lang.String str8 = visitor4.getUsername();
        java.lang.String str9 = visitor4.getUsername();
        java.lang.String str10 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        visitor4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList14 = visitor4.getBookings();
        boolean boolean17 = visitor4.registerAccount("", "");
        java.lang.String str18 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        java.util.ArrayList<Models.Booking> bookingList12 = visitor4.getBookings();
        java.lang.String str13 = visitor4.getLicensePlate();
        java.lang.String str14 = visitor4.getPassword();
        java.lang.Class<?> wildcardClass15 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getLicensePlate();
        Models.ParkingSpace parkingSpace9 = visitor4.getParkingSpace();
        boolean boolean10 = visitor4.getisValidated();
        boolean boolean11 = visitor4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace7 = visitor4.getParkingSpace();
        java.lang.String str8 = visitor4.getUsername();
        java.lang.String str9 = visitor4.getLicensePlate();
        double double10 = visitor4.getParkingRate();
        java.lang.String str11 = visitor4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        java.lang.String str16 = visitor4.getUsername();
        java.lang.String str17 = visitor4.getLicensePlate();
        java.lang.String str18 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean9 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str10 = visitor4.getUsername();
        java.lang.String str11 = visitor4.getLicensePlate();
        java.lang.String str12 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace7 = visitor4.getParkingSpace();
        java.lang.String str8 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean9 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str10 = visitor4.getLicensePlate();
        java.lang.String str11 = visitor4.getEmail();
        boolean boolean14 = visitor4.registerAccount("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        java.lang.String str12 = visitor4.getUsername();
        java.util.ArrayList<Models.Booking> bookingList13 = visitor4.getBookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = bookingList13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean9 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str10 = visitor4.getPassword();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        visitor4.setValidated(false);
        java.util.ArrayList<Models.Booking> bookingList14 = visitor4.getBookings();
        double double15 = visitor4.getParkingRate();
        Models.ParkingSpace parkingSpace19 = null;
        java.time.LocalTime localTime20 = null;
        java.time.LocalTime localTime21 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking22 = visitor4.makeBooking("", "hi!", "hi!", parkingSpace19, localTime20, localTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        java.lang.String str7 = visitor4.getPassword();
        double double8 = visitor4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace7 = visitor4.getParkingSpace();
        boolean boolean8 = visitor4.getisValidated();
        java.lang.String str9 = visitor4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        java.lang.String str12 = visitor4.getUsername();
        java.util.ArrayList<Models.Booking> bookingList13 = visitor4.getBookings();
        java.lang.String str14 = visitor4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        Models.Visitor visitor4 = new Models.Visitor("", "", "hi!", "hi!");
        visitor4.setValidated(false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        java.util.ArrayList<Models.Booking> bookingList12 = visitor4.getBookings();
        java.lang.String str13 = visitor4.getLicensePlate();
        java.util.ArrayList<Models.Booking> bookingList14 = visitor4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList14);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getUsername();
        Models.ParkingSpace parkingSpace7 = visitor4.getParkingSpace();
        double double8 = visitor4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        java.lang.String str16 = visitor4.getUsername();
        java.lang.String str17 = visitor4.getLicensePlate();
        java.lang.String str18 = visitor4.getUsername();
        boolean boolean21 = visitor4.registerAccount("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        visitor4.cancelBooking("");
        java.lang.String str18 = visitor4.getEmail();
        java.lang.String str19 = visitor4.getEmail();
        java.util.ArrayList<Models.Booking> bookingList20 = visitor4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList20);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        Models.ParkingSpace parkingSpace9 = visitor4.getParkingSpace();
        java.lang.String str10 = visitor4.getEmail();
        visitor4.setValidated(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        visitor4.setValidated(false);
        java.lang.String str12 = visitor4.getUsername();
        boolean boolean13 = visitor4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        visitor4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList14 = visitor4.getBookings();
        boolean boolean17 = visitor4.registerAccount("", "");
        double double18 = visitor4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 15.0d + "'", double18 == 15.0d);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        visitor4.setValidated(false);
        java.lang.String str14 = visitor4.getLicensePlate();
        java.lang.String str15 = visitor4.getUsername();
        Models.ParkingSpace parkingSpace16 = visitor4.getParkingSpace();
        java.lang.String str17 = visitor4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        visitor4.setValidated(false);
        java.lang.String str12 = visitor4.getUsername();
        java.lang.String str13 = visitor4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        visitor4.setValidated(true);
        java.util.ArrayList<Models.Booking> bookingList14 = visitor4.getBookings();
        double double15 = visitor4.getParkingRate();
        double double16 = visitor4.getParkingRate();
        visitor4.setValidated(false);
        visitor4.setValidated(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean9 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str10 = visitor4.getPassword();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        visitor4.setValidated(false);
        java.util.ArrayList<Models.Booking> bookingList14 = visitor4.getBookings();
        double double15 = visitor4.getParkingRate();
        double double16 = visitor4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "hi!", "hi!", "hi!");
        Models.ParkingSpace parkingSpace5 = visitor4.getParkingSpace();
        boolean boolean6 = visitor4.getisValidated();
        java.util.ArrayList<Models.Booking> bookingList7 = visitor4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getUsername();
        java.lang.String str8 = visitor4.getUsername();
        java.lang.String str9 = visitor4.getEmail();
        java.lang.String str10 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        java.lang.String str12 = visitor4.getUsername();
        java.lang.String str13 = visitor4.getPassword();
        java.util.ArrayList<Models.Booking> bookingList14 = visitor4.getBookings();
        visitor4.cancelBooking("hi!");
        Models.ParkingSpace parkingSpace20 = null;
        java.time.LocalTime localTime21 = null;
        java.time.LocalTime localTime22 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking23 = visitor4.makeBooking("hi!", "", "hi!", parkingSpace20, localTime21, localTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList14);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        java.lang.String str16 = visitor4.getUsername();
        java.util.ArrayList<Models.Booking> bookingList17 = visitor4.getBookings();
        boolean boolean20 = visitor4.registerAccount("hi!", "");
        boolean boolean23 = visitor4.registerAccount("", "hi!");
        visitor4.setValidated(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        java.lang.String str11 = visitor4.getUsername();
        java.lang.String str12 = visitor4.getLicensePlate();
        java.lang.String str13 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getEmail();
        visitor4.cancelBooking("hi!");
        java.lang.String str11 = visitor4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "hi!", "hi!", "");
        Models.ParkingSpace parkingSpace8 = null;
        java.time.LocalTime localTime9 = null;
        java.time.LocalTime localTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking11 = visitor4.makeBooking("", "", "", parkingSpace8, localTime9, localTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        visitor4.cancelBooking("hi!");
        boolean boolean9 = visitor4.getisValidated();
        boolean boolean12 = visitor4.registerAccount("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace7 = visitor4.getParkingSpace();
        java.lang.String str8 = visitor4.getEmail();
        visitor4.setValidated(false);
        java.lang.String str11 = visitor4.getUsername();
        boolean boolean14 = visitor4.registerAccount("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        java.lang.String str16 = visitor4.getUsername();
        java.lang.String str17 = visitor4.getLicensePlate();
        boolean boolean20 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str21 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        visitor4.cancelBooking("");
        java.lang.String str8 = visitor4.getUsername();
        visitor4.setValidated(true);
        java.lang.String str11 = visitor4.getLicensePlate();
        visitor4.cancelBooking("hi!");
        boolean boolean14 = visitor4.getisValidated();
        java.util.ArrayList<Models.Booking> bookingList15 = visitor4.getBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList15);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean9 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str10 = visitor4.getPassword();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        java.lang.String str12 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        Models.ParkingSpace parkingSpace5 = visitor4.getParkingSpace();
        boolean boolean8 = visitor4.registerAccount("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        Models.Visitor visitor4 = new Models.Visitor("", "", "", "hi!");
        visitor4.setValidated(true);
        visitor4.cancelBooking("hi!");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "", "", "");
        java.lang.String str5 = visitor4.getUsername();
        visitor4.setValidated(true);
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        visitor4.setValidated(true);
        boolean boolean11 = visitor4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "", "", "");
        Models.ParkingSpace parkingSpace5 = visitor4.getParkingSpace();
        java.lang.String str6 = visitor4.getPassword();
        java.lang.String str7 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean9 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str10 = visitor4.getPassword();
        java.lang.String str11 = visitor4.getUsername();
        java.util.ArrayList<Models.Booking> bookingList12 = visitor4.getBookings();
        java.lang.String str13 = visitor4.getLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "hi!", "hi!", "");
        java.util.ArrayList<Models.Booking> bookingList5 = visitor4.getBookings();
        double double6 = visitor4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean10 = visitor4.getisValidated();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        boolean boolean14 = visitor4.registerAccount("", "");
        double double15 = visitor4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        visitor4.setValidated(false);
        java.lang.String str14 = visitor4.getLicensePlate();
        java.lang.String str15 = visitor4.getUsername();
        visitor4.setValidated(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        Models.Visitor visitor4 = new Models.Visitor("hi!", "", "hi!", "");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getEmail();
        java.lang.String str9 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        java.util.ArrayList<Models.Booking> bookingList12 = visitor4.getBookings();
        java.lang.String str13 = visitor4.getEmail();
        java.lang.String str14 = visitor4.getEmail();
        java.util.ArrayList<Models.Booking> bookingList15 = visitor4.getBookings();
        boolean boolean16 = visitor4.getisValidated();
        boolean boolean19 = visitor4.registerAccount("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        Models.Visitor visitor4 = new Models.Visitor("", "", "hi!", "");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace8 = visitor4.getParkingSpace();
        boolean boolean11 = visitor4.registerAccount("hi!", "");
        visitor4.setValidated(false);
        visitor4.setValidated(true);
        boolean boolean18 = visitor4.registerAccount("", "");
        java.lang.Class<?> wildcardClass19 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean9 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str10 = visitor4.getLicensePlate();
        java.lang.String str11 = visitor4.getEmail();
        Models.ParkingSpace parkingSpace12 = visitor4.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace12);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        visitor4.setValidated(true);
        visitor4.cancelBooking("");
        visitor4.setValidated(true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        visitor4.setValidated(true);
        java.lang.String str9 = visitor4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean9 = visitor4.registerAccount("hi!", "hi!");
        java.lang.String str10 = visitor4.getPassword();
        Models.ParkingSpace parkingSpace11 = visitor4.getParkingSpace();
        visitor4.setValidated(false);
        Models.ParkingSpace parkingSpace14 = visitor4.getParkingSpace();
        double double15 = visitor4.getParkingRate();
        Models.ParkingSpace parkingSpace16 = visitor4.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace16);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getEmail();
        visitor4.cancelBooking("hi!");
        java.lang.String str11 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        java.lang.String str7 = visitor4.getPassword();
        java.lang.String str8 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getLicensePlate();
        boolean boolean12 = visitor4.registerAccount("", "hi!");
        java.lang.String str13 = visitor4.getUsername();
        visitor4.cancelBooking("hi!");
        visitor4.cancelBooking("");
        Models.ParkingSpace parkingSpace18 = visitor4.getParkingSpace();
        java.lang.String str19 = visitor4.getUsername();
        boolean boolean22 = visitor4.registerAccount("", "hi!");
        java.lang.String str23 = visitor4.getEmail();
        boolean boolean26 = visitor4.registerAccount("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "", "");
        boolean boolean5 = visitor4.getisValidated();
        java.lang.String str6 = visitor4.getEmail();
        java.lang.String str7 = visitor4.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getUsername();
        java.util.ArrayList<Models.Booking> bookingList10 = visitor4.getBookings();
        boolean boolean13 = visitor4.registerAccount("hi!", "");
        boolean boolean14 = visitor4.getisValidated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getEmail();
        visitor4.cancelBooking("");
        java.lang.String str8 = visitor4.getUsername();
        visitor4.setValidated(true);
        java.lang.String str11 = visitor4.getLicensePlate();
        java.lang.String str12 = visitor4.getPassword();
        java.lang.String str13 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        visitor4.cancelBooking("hi!");
        Models.ParkingSpace parkingSpace9 = visitor4.getParkingSpace();
        double double10 = visitor4.getParkingRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        Models.Visitor visitor4 = new Models.Visitor("", "hi!", "hi!", "hi!");
        visitor4.cancelBooking("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        boolean boolean9 = visitor4.getisValidated();
        boolean boolean10 = visitor4.getisValidated();
        java.lang.String str11 = visitor4.getUsername();
        boolean boolean14 = visitor4.registerAccount("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }
}


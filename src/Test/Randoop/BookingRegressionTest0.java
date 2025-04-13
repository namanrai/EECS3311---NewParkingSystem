package Test.Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookingRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        Models.ParkingSpace parkingSpace3 = null;
        java.time.LocalTime localTime4 = null;
        java.time.LocalTime localTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking6 = new Models.Booking("hi!", "hi!", "hi!", parkingSpace3, localTime4, localTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        Models.ParkingSpace parkingSpace3 = null;
        java.time.LocalTime localTime4 = null;
        java.time.LocalTime localTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking6 = new Models.Booking("", "", "", parkingSpace3, localTime4, localTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        Models.ParkingSpace parkingSpace3 = null;
        java.time.LocalTime localTime4 = null;
        java.time.LocalTime localTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking6 = new Models.Booking("hi!", "", "hi!", parkingSpace3, localTime4, localTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        Models.ParkingSpace parkingSpace3 = null;
        java.time.LocalTime localTime4 = null;
        java.time.LocalTime localTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking6 = new Models.Booking("", "hi!", "hi!", parkingSpace3, localTime4, localTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        Models.ParkingSpace parkingSpace3 = null;
        java.time.LocalTime localTime4 = null;
        java.time.LocalTime localTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking6 = new Models.Booking("hi!", "", "", parkingSpace3, localTime4, localTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        Models.ParkingSpace parkingSpace3 = null;
        java.time.LocalTime localTime4 = null;
        java.time.LocalTime localTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking6 = new Models.Booking("", "hi!", "", parkingSpace3, localTime4, localTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test8");
        Models.ParkingSpace parkingSpace3 = null;
        java.time.LocalTime localTime4 = null;
        java.time.LocalTime localTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking6 = new Models.Booking("hi!", "hi!", "", parkingSpace3, localTime4, localTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test9");
        Models.ParkingSpace parkingSpace3 = null;
        java.time.LocalTime localTime4 = null;
        java.time.LocalTime localTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Booking booking6 = new Models.Booking("", "", "hi!", parkingSpace3, localTime4, localTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.ParkingSpace.getId()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}


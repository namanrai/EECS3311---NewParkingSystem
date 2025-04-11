package Test.Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ParkingLotRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        java.lang.Class<?> wildcardClass4 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        java.util.List<Models.ParkingSpace> parkingSpaceList2 = parkingLot1.getSpaces();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        java.util.List<Models.ParkingSpace> parkingSpaceList2 = parkingLot1.getSpaces();
        java.lang.Class<?> wildcardClass3 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.enable();
        boolean boolean6 = parkingLot1.isDisabled();
        java.lang.Class<?> wildcardClass7 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.Class<?> wildcardClass2 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        java.lang.Class<?> wildcardClass7 = parkingSpaceList6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.lang.Class<?> wildcardClass3 = parkingSpace2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        boolean boolean3 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.enable();
        boolean boolean6 = parkingLot1.isDisabled();
        java.lang.String str7 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace8 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        java.lang.Class<?> wildcardClass3 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.enable();
        java.lang.Class<?> wildcardClass6 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.Class<?> wildcardClass3 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        parkingLot1.disable();
        boolean boolean4 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        java.util.List<Models.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        java.lang.Class<?> wildcardClass4 = parkingSpaceList3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        java.lang.String str5 = parkingLot1.getLotId();
        java.lang.Class<?> wildcardClass6 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        java.lang.Class<?> wildcardClass5 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        parkingLot1.disable();
        java.lang.Class<?> wildcardClass4 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        java.util.List<Models.ParkingSpace> parkingSpaceList2 = parkingLot1.getSpaces();
        boolean boolean3 = parkingLot1.isDisabled();
        java.lang.Class<?> wildcardClass4 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        java.lang.String str5 = parkingLot1.getLotId();
        boolean boolean6 = parkingLot1.isDisabled();
        java.lang.Class<?> wildcardClass7 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        java.util.List<Models.ParkingSpace> parkingSpaceList2 = parkingLot1.getSpaces();
        java.lang.Class<?> wildcardClass3 = parkingSpaceList2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        java.util.List<Models.ParkingSpace> parkingSpaceList4 = parkingLot1.getSpaces();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        java.util.List<Models.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        java.util.List<Models.ParkingSpace> parkingSpaceList4 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.lang.Class<?> wildcardClass3 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        boolean boolean3 = parkingLot1.isDisabled();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        parkingLot1.enable();
        java.lang.Class<?> wildcardClass7 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        parkingLot1.enable();
        java.lang.Class<?> wildcardClass4 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.lang.String str3 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        java.lang.Class<?> wildcardClass5 = parkingSpace4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList4 = parkingLot1.getSpaces();
        java.lang.Class<?> wildcardClass5 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        boolean boolean3 = parkingLot1.isDisabled();
        java.lang.String str4 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        boolean boolean7 = parkingLot1.isDisabled();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        parkingLot1.disable();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        java.lang.String str4 = parkingLot1.getLotId();
        java.lang.String str5 = parkingLot1.getLotId();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        boolean boolean4 = parkingLot1.isDisabled();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace6 = parkingLot1.findAvailableSpace();
        java.lang.Class<?> wildcardClass7 = parkingSpace6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        parkingLot1.enable();
        java.lang.Class<?> wildcardClass5 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        boolean boolean5 = parkingLot1.isDisabled();
        parkingLot1.disable();
        java.lang.String str7 = parkingLot1.getLotId();
        java.lang.String str8 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        boolean boolean5 = parkingLot1.isDisabled();
        java.lang.Class<?> wildcardClass6 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        java.lang.String str3 = parkingLot1.getLotId();
        java.util.List<Models.ParkingSpace> parkingSpaceList4 = parkingLot1.getSpaces();
        java.lang.Class<?> wildcardClass5 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        parkingLot1.disable();
        java.lang.Class<?> wildcardClass8 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        boolean boolean7 = parkingLot1.isDisabled();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        boolean boolean6 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        boolean boolean3 = parkingLot1.isDisabled();
        java.lang.String str4 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        boolean boolean7 = parkingLot1.isDisabled();
        java.lang.Class<?> wildcardClass8 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        java.lang.String str3 = parkingLot1.getLotId();
        java.lang.String str4 = parkingLot1.getLotId();
        parkingLot1.disable();
        java.lang.Class<?> wildcardClass6 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        boolean boolean3 = parkingLot1.isDisabled();
        java.lang.String str4 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        parkingLot1.disable();
        java.lang.String str8 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        boolean boolean5 = parkingLot1.isDisabled();
        Models.ParkingSpace parkingSpace6 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        Models.ParkingSpace parkingSpace3 = parkingLot1.findAvailableSpace();
        boolean boolean4 = parkingLot1.isDisabled();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.util.List<Models.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        boolean boolean4 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        Models.ParkingSpace parkingSpace3 = parkingLot1.findAvailableSpace();
        boolean boolean4 = parkingLot1.isDisabled();
        java.lang.String str5 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        parkingLot1.enable();
        boolean boolean5 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        boolean boolean3 = parkingLot1.isDisabled();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        java.lang.Class<?> wildcardClass6 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        boolean boolean3 = parkingLot1.isDisabled();
        java.lang.String str4 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        boolean boolean7 = parkingLot1.isDisabled();
        boolean boolean8 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        boolean boolean3 = parkingLot1.isDisabled();
        java.lang.String str4 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        parkingLot1.disable();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        java.util.List<Models.ParkingSpace> parkingSpaceList4 = parkingLot1.getSpaces();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        java.lang.String str6 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        Models.ParkingSpace parkingSpace6 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        java.lang.String str5 = parkingLot1.getLotId();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        boolean boolean7 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        java.lang.Class<?> wildcardClass5 = parkingSpace4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        parkingLot1.enable();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        parkingLot1.disable();
        parkingLot1.enable();
        java.lang.Class<?> wildcardClass5 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        boolean boolean4 = parkingLot1.isDisabled();
        boolean boolean5 = parkingLot1.isDisabled();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        boolean boolean3 = parkingLot1.isDisabled();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        boolean boolean4 = parkingLot1.isDisabled();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace6 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        parkingLot1.disable();
        java.util.List<Models.ParkingSpace> parkingSpaceList9 = parkingLot1.getSpaces();
        java.util.List<Models.ParkingSpace> parkingSpaceList10 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace3 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList4 = parkingLot1.getSpaces();
        boolean boolean5 = parkingLot1.isDisabled();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        boolean boolean3 = parkingLot1.isDisabled();
        java.lang.String str4 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        parkingLot1.disable();
        boolean boolean8 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        parkingLot1.enable();
        java.lang.String str4 = parkingLot1.getLotId();
        java.lang.Class<?> wildcardClass5 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        boolean boolean3 = parkingLot1.isDisabled();
        java.lang.String str4 = parkingLot1.getLotId();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        parkingLot1.disable();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        boolean boolean5 = parkingLot1.isDisabled();
        parkingLot1.disable();
        java.lang.String str7 = parkingLot1.getLotId();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        java.lang.String str3 = parkingLot1.getLotId();
        boolean boolean4 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.enable();
        java.lang.Class<?> wildcardClass5 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        Models.ParkingSpace parkingSpace3 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList4 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.disable();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace6 = parkingLot1.findAvailableSpace();
        java.lang.Class<?> wildcardClass7 = parkingSpace6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        parkingLot1.disable();
        parkingLot1.enable();
        java.lang.String str5 = parkingLot1.getLotId();
        java.lang.String str6 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        boolean boolean4 = parkingLot1.isDisabled();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace6 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        java.lang.String str8 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.disable();
        boolean boolean5 = parkingLot1.isDisabled();
        parkingLot1.disable();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        parkingLot1.enable();
        boolean boolean5 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        boolean boolean4 = parkingLot1.isDisabled();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.lang.String str3 = parkingLot1.getLotId();
        boolean boolean4 = parkingLot1.isDisabled();
        java.lang.String str5 = parkingLot1.getLotId();
        java.lang.Class<?> wildcardClass6 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        java.lang.String str5 = parkingLot1.getLotId();
        parkingLot1.enable();
        java.lang.String str7 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.enable();
        boolean boolean6 = parkingLot1.isDisabled();
        java.util.List<Models.ParkingSpace> parkingSpaceList7 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        java.util.List<Models.ParkingSpace> parkingSpaceList4 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        Models.ParkingSpace parkingSpace6 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        boolean boolean6 = parkingLot1.isDisabled();
        boolean boolean7 = parkingLot1.isDisabled();
        java.util.List<Models.ParkingSpace> parkingSpaceList8 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        java.util.List<Models.ParkingSpace> parkingSpaceList4 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.disable();
        boolean boolean5 = parkingLot1.isDisabled();
        parkingLot1.disable();
        java.util.List<Models.ParkingSpace> parkingSpaceList7 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        java.lang.Class<?> wildcardClass6 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        boolean boolean5 = parkingLot1.isDisabled();
        parkingLot1.disable();
        java.lang.String str7 = parkingLot1.getLotId();
        parkingLot1.disable();
        parkingLot1.enable();
        parkingLot1.disable();
        java.lang.String str11 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        Models.ParkingSpace parkingSpace7 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        boolean boolean5 = parkingLot1.isDisabled();
        parkingLot1.disable();
        java.lang.String str7 = parkingLot1.getLotId();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace9 = parkingLot1.findAvailableSpace();
        java.lang.Class<?> wildcardClass10 = parkingSpace9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace7 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        boolean boolean9 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        boolean boolean3 = parkingLot1.isDisabled();
        java.lang.String str4 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        parkingLot1.disable();
        java.util.List<Models.ParkingSpace> parkingSpaceList8 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        java.lang.String str4 = parkingLot1.getLotId();
        java.lang.String str5 = parkingLot1.getLotId();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.enable();
        java.lang.String str6 = parkingLot1.getLotId();
        parkingLot1.disable();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        boolean boolean3 = parkingLot1.isDisabled();
        boolean boolean4 = parkingLot1.isDisabled();
        parkingLot1.enable();
        java.lang.String str6 = parkingLot1.getLotId();
        boolean boolean7 = parkingLot1.isDisabled();
        Models.ParkingSpace parkingSpace8 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        parkingLot1.disable();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace6 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace6);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.disable();
        boolean boolean5 = parkingLot1.isDisabled();
        boolean boolean6 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        boolean boolean4 = parkingLot1.isDisabled();
        parkingLot1.enable();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace7 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        java.lang.String str3 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.disable();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace6 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList7 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        boolean boolean3 = parkingLot1.isDisabled();
        java.lang.String str4 = parkingLot1.getLotId();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        java.lang.Class<?> wildcardClass6 = parkingSpaceList5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        Models.ParkingSpace parkingSpace7 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        java.lang.String str6 = parkingLot1.getLotId();
        parkingLot1.enable();
        boolean boolean8 = parkingLot1.isDisabled();
        java.lang.String str9 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        parkingLot1.enable();
        java.lang.String str4 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.lang.String str3 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        boolean boolean5 = parkingLot1.isDisabled();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        boolean boolean3 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        boolean boolean5 = parkingLot1.isDisabled();
        boolean boolean6 = parkingLot1.isDisabled();
        parkingLot1.disable();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        boolean boolean4 = parkingLot1.isDisabled();
        parkingLot1.enable();
        parkingLot1.disable();
        java.util.List<Models.ParkingSpace> parkingSpaceList7 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        java.lang.String str5 = parkingLot1.getLotId();
        java.lang.String str6 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        parkingLot1.disable();
        java.lang.String str4 = parkingLot1.getLotId();
        java.lang.Class<?> wildcardClass5 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        java.lang.Class<?> wildcardClass5 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        boolean boolean5 = parkingLot1.isDisabled();
        Models.ParkingSpace parkingSpace6 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        boolean boolean3 = parkingLot1.isDisabled();
        java.lang.String str4 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        boolean boolean7 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace7 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace7);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        java.util.List<Models.ParkingSpace> parkingSpaceList2 = parkingLot1.getSpaces();
        boolean boolean3 = parkingLot1.isDisabled();
        java.lang.String str4 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        boolean boolean4 = parkingLot1.isDisabled();
        java.lang.String str5 = parkingLot1.getLotId();
        java.lang.Class<?> wildcardClass6 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        parkingLot1.disable();
        parkingLot1.enable();
        java.lang.String str5 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace6 = parkingLot1.findAvailableSpace();
        java.lang.String str7 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace8 = parkingLot1.findAvailableSpace();
        java.lang.Class<?> wildcardClass9 = parkingSpace8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        boolean boolean3 = parkingLot1.isDisabled();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        java.lang.Class<?> wildcardClass5 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.disable();
        java.lang.Class<?> wildcardClass3 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        parkingLot1.disable();
        boolean boolean5 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        boolean boolean4 = parkingLot1.isDisabled();
        boolean boolean5 = parkingLot1.isDisabled();
        java.lang.String str6 = parkingLot1.getLotId();
        java.util.List<Models.ParkingSpace> parkingSpaceList7 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.disable();
        java.lang.String str5 = parkingLot1.getLotId();
        parkingLot1.disable();
        java.lang.Class<?> wildcardClass7 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.disable();
        java.lang.String str5 = parkingLot1.getLotId();
        parkingLot1.disable();
        java.lang.String str7 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        java.lang.Class<?> wildcardClass6 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        boolean boolean5 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        java.lang.String str6 = parkingLot1.getLotId();
        parkingLot1.enable();
        java.lang.String str8 = parkingLot1.getLotId();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        boolean boolean3 = parkingLot1.isDisabled();
        boolean boolean4 = parkingLot1.isDisabled();
        parkingLot1.enable();
        java.lang.String str6 = parkingLot1.getLotId();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.enable();
        boolean boolean5 = parkingLot1.isDisabled();
        parkingLot1.enable();
        boolean boolean7 = parkingLot1.isDisabled();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        java.lang.String str3 = parkingLot1.getLotId();
        java.lang.String str4 = parkingLot1.getLotId();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        boolean boolean6 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList4 = parkingLot1.getSpaces();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        boolean boolean3 = parkingLot1.isDisabled();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        java.lang.String str6 = parkingLot1.getLotId();
        boolean boolean7 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        java.lang.String str5 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace6 = parkingLot1.findAvailableSpace();
        java.lang.Class<?> wildcardClass7 = parkingSpace6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        java.lang.String str3 = parkingLot1.getLotId();
        java.lang.String str4 = parkingLot1.getLotId();
        parkingLot1.disable();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        java.lang.String str7 = parkingLot1.getLotId();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        boolean boolean5 = parkingLot1.isDisabled();
        boolean boolean6 = parkingLot1.isDisabled();
        parkingLot1.disable();
        boolean boolean8 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        parkingLot1.enable();
        parkingLot1.disable();
        parkingLot1.disable();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        java.lang.String str4 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        boolean boolean4 = parkingLot1.isDisabled();
        boolean boolean5 = parkingLot1.isDisabled();
        java.lang.String str6 = parkingLot1.getLotId();
        parkingLot1.disable();
        java.lang.String str8 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.enable();
        boolean boolean6 = parkingLot1.isDisabled();
        java.lang.String str7 = parkingLot1.getLotId();
        parkingLot1.disable();
        parkingLot1.disable();
        java.lang.Class<?> wildcardClass10 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        boolean boolean5 = parkingLot1.isDisabled();
        parkingLot1.disable();
        java.lang.String str7 = parkingLot1.getLotId();
        parkingLot1.disable();
        parkingLot1.enable();
        parkingLot1.disable();
        parkingLot1.disable();
        boolean boolean12 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        parkingLot1.enable();
        java.lang.String str4 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.disable();
        java.lang.String str5 = parkingLot1.getLotId();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace7 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace7);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.enable();
        boolean boolean6 = parkingLot1.isDisabled();
        java.lang.String str7 = parkingLot1.getLotId();
        parkingLot1.disable();
        java.lang.String str9 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        boolean boolean4 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.util.List<Models.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.enable();
        boolean boolean5 = parkingLot1.isDisabled();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace7 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList4 = parkingLot1.getSpaces();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        boolean boolean6 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        java.util.List<Models.ParkingSpace> parkingSpaceList2 = parkingLot1.getSpaces();
        java.util.List<Models.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        boolean boolean4 = parkingLot1.isDisabled();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        java.lang.String str6 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        java.util.List<Models.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        parkingLot1.disable();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        java.util.List<Models.ParkingSpace> parkingSpaceList4 = parkingLot1.getSpaces();
        parkingLot1.enable();
        parkingLot1.enable();
        boolean boolean7 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        java.lang.String str6 = parkingLot1.getLotId();
        java.lang.String str7 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.lang.String str3 = parkingLot1.getLotId();
        boolean boolean4 = parkingLot1.isDisabled();
        java.lang.Class<?> wildcardClass5 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        parkingLot1.disable();
        parkingLot1.enable();
        java.lang.Class<?> wildcardClass5 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.util.List<Models.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        java.lang.String str4 = parkingLot1.getLotId();
        java.lang.String str5 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        java.lang.String str3 = parkingLot1.getLotId();
        java.lang.String str4 = parkingLot1.getLotId();
        parkingLot1.disable();
        boolean boolean6 = parkingLot1.isDisabled();
        parkingLot1.enable();
        java.lang.String str8 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        java.lang.Class<?> wildcardClass6 = parkingSpaceList5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        boolean boolean6 = parkingLot1.isDisabled();
        java.lang.String str7 = parkingLot1.getLotId();
        java.lang.String str8 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        boolean boolean4 = parkingLot1.isDisabled();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace6 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace8 = parkingLot1.findAvailableSpace();
        Models.ParkingSpace parkingSpace9 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace9);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        boolean boolean6 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        Models.ParkingSpace parkingSpace3 = parkingLot1.findAvailableSpace();
        boolean boolean4 = parkingLot1.isDisabled();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        java.lang.Class<?> wildcardClass6 = parkingSpaceList5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.disable();
        boolean boolean5 = parkingLot1.isDisabled();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        boolean boolean7 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        java.lang.String str3 = parkingLot1.getLotId();
        java.lang.String str4 = parkingLot1.getLotId();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        Models.ParkingSpace parkingSpace6 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace6);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.enable();
        boolean boolean6 = parkingLot1.isDisabled();
        java.lang.String str7 = parkingLot1.getLotId();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace9 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace9);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        boolean boolean5 = parkingLot1.isDisabled();
        parkingLot1.disable();
        java.lang.String str7 = parkingLot1.getLotId();
        parkingLot1.disable();
        parkingLot1.enable();
        parkingLot1.disable();
        java.util.List<Models.ParkingSpace> parkingSpaceList11 = parkingLot1.getSpaces();
        parkingLot1.disable();
        boolean boolean13 = parkingLot1.isDisabled();
        boolean boolean14 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList4 = parkingLot1.getSpaces();
        boolean boolean5 = parkingLot1.isDisabled();
        boolean boolean6 = parkingLot1.isDisabled();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList8 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.enable();
        boolean boolean6 = parkingLot1.isDisabled();
        Models.ParkingSpace parkingSpace7 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace7);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        boolean boolean4 = parkingLot1.isDisabled();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace6 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        parkingLot1.disable();
        java.lang.String str9 = parkingLot1.getLotId();
        java.lang.String str10 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        boolean boolean3 = parkingLot1.isDisabled();
        parkingLot1.enable();
        boolean boolean5 = parkingLot1.isDisabled();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        boolean boolean3 = parkingLot1.isDisabled();
        java.lang.String str4 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        java.util.List<Models.ParkingSpace> parkingSpaceList2 = parkingLot1.getSpaces();
        java.util.List<Models.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        boolean boolean4 = parkingLot1.isDisabled();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        boolean boolean3 = parkingLot1.isDisabled();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        java.lang.Class<?> wildcardClass5 = parkingSpace4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.disable();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        Models.ParkingSpace parkingSpace6 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace6);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        boolean boolean4 = parkingLot1.isDisabled();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace6 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        parkingLot1.disable();
        java.lang.String str9 = parkingLot1.getLotId();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        java.lang.String str6 = parkingLot1.getLotId();
        java.lang.String str7 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        java.lang.String str5 = parkingLot1.getLotId();
        parkingLot1.disable();
        boolean boolean7 = parkingLot1.isDisabled();
        Models.ParkingSpace parkingSpace8 = parkingLot1.findAvailableSpace();
        java.lang.String str9 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace10 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        java.util.List<Models.ParkingSpace> parkingSpaceList7 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        boolean boolean2 = parkingLot1.isDisabled();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.disable();
        java.lang.String str5 = parkingLot1.getLotId();
        parkingLot1.disable();
        boolean boolean7 = parkingLot1.isDisabled();
        boolean boolean8 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        java.lang.String str4 = parkingLot1.getLotId();
        java.lang.String str5 = parkingLot1.getLotId();
        java.lang.String str6 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        boolean boolean4 = parkingLot1.isDisabled();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace6 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        parkingLot1.disable();
        java.util.List<Models.ParkingSpace> parkingSpaceList9 = parkingLot1.getSpaces();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList9);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        parkingLot1.disable();
        java.util.List<Models.ParkingSpace> parkingSpaceList4 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        java.lang.String str5 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        java.lang.Class<?> wildcardClass5 = parkingSpace4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        boolean boolean4 = parkingLot1.isDisabled();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        boolean boolean5 = parkingLot1.isDisabled();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace7 = parkingLot1.findAvailableSpace();
        java.lang.String str8 = parkingLot1.getLotId();
        parkingLot1.disable();
        boolean boolean10 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        java.lang.String str5 = parkingLot1.getLotId();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace7 = parkingLot1.findAvailableSpace();
        Models.ParkingSpace parkingSpace8 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace8);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace7 = parkingLot1.findAvailableSpace();
        java.lang.String str8 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        boolean boolean6 = parkingLot1.isDisabled();
        java.lang.String str7 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace8 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace8);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        java.lang.String str5 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace6 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList7 = parkingLot1.getSpaces();
        java.util.List<Models.ParkingSpace> parkingSpaceList8 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        java.lang.String str6 = parkingLot1.getLotId();
        parkingLot1.enable();
        boolean boolean8 = parkingLot1.isDisabled();
        boolean boolean9 = parkingLot1.isDisabled();
        Models.ParkingSpace parkingSpace10 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace10);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        boolean boolean3 = parkingLot1.isDisabled();
        java.lang.String str4 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList8 = parkingLot1.getSpaces();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList4 = parkingLot1.getSpaces();
        boolean boolean5 = parkingLot1.isDisabled();
        boolean boolean6 = parkingLot1.isDisabled();
        parkingLot1.enable();
        parkingLot1.disable();
        java.util.List<Models.ParkingSpace> parkingSpaceList9 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList9);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        boolean boolean5 = parkingLot1.isDisabled();
        boolean boolean6 = parkingLot1.isDisabled();
        boolean boolean7 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        java.lang.String str5 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList8 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace7 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace7);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.disable();
        java.lang.String str5 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        boolean boolean4 = parkingLot1.isDisabled();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace6 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace8 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList9 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList9);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        boolean boolean6 = parkingLot1.isDisabled();
        boolean boolean7 = parkingLot1.isDisabled();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        Models.ParkingSpace parkingSpace3 = parkingLot1.findAvailableSpace();
        boolean boolean4 = parkingLot1.isDisabled();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        java.lang.String str6 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace7 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace7);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        java.util.List<Models.ParkingSpace> parkingSpaceList7 = parkingLot1.getSpaces();
        boolean boolean8 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.disable();
        boolean boolean5 = parkingLot1.isDisabled();
        parkingLot1.disable();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        java.lang.String str4 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        java.lang.String str3 = parkingLot1.getLotId();
        java.lang.String str4 = parkingLot1.getLotId();
        parkingLot1.disable();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        java.lang.Class<?> wildcardClass7 = parkingSpaceList6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        boolean boolean3 = parkingLot1.isDisabled();
        parkingLot1.disable();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.enable();
        java.lang.String str6 = parkingLot1.getLotId();
        java.lang.Class<?> wildcardClass7 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        boolean boolean4 = parkingLot1.isDisabled();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace6 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList7 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        boolean boolean5 = parkingLot1.isDisabled();
        parkingLot1.disable();
        java.lang.String str7 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace8 = parkingLot1.findAvailableSpace();
        boolean boolean9 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        boolean boolean7 = parkingLot1.isDisabled();
        parkingLot1.enable();
        java.lang.Class<?> wildcardClass9 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        parkingLot1.disable();
        java.lang.String str7 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        java.util.List<Models.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        parkingLot1.disable();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        boolean boolean3 = parkingLot1.isDisabled();
        java.lang.String str4 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        java.lang.String str6 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace7 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace7);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        boolean boolean3 = parkingLot1.isDisabled();
        boolean boolean4 = parkingLot1.isDisabled();
        java.lang.String str5 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace6 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace6);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        java.util.List<Models.ParkingSpace> parkingSpaceList7 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        boolean boolean3 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        boolean boolean5 = parkingLot1.isDisabled();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace7 = parkingLot1.findAvailableSpace();
        java.lang.String str8 = parkingLot1.getLotId();
        parkingLot1.disable();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        boolean boolean5 = parkingLot1.isDisabled();
        parkingLot1.disable();
        java.lang.String str7 = parkingLot1.getLotId();
        parkingLot1.disable();
        parkingLot1.enable();
        parkingLot1.disable();
        java.util.List<Models.ParkingSpace> parkingSpaceList11 = parkingLot1.getSpaces();
        parkingLot1.disable();
        boolean boolean13 = parkingLot1.isDisabled();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList4 = parkingLot1.getSpaces();
        boolean boolean5 = parkingLot1.isDisabled();
        boolean boolean6 = parkingLot1.isDisabled();
        java.util.List<Models.ParkingSpace> parkingSpaceList7 = parkingLot1.getSpaces();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        parkingLot1.enable();
        Models.ParkingSpace parkingSpace7 = parkingLot1.findAvailableSpace();
        java.lang.Class<?> wildcardClass8 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        boolean boolean3 = parkingLot1.isDisabled();
        java.lang.String str4 = parkingLot1.getLotId();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        parkingLot1.disable();
        boolean boolean7 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        java.util.List<Models.ParkingSpace> parkingSpaceList4 = parkingLot1.getSpaces();
        parkingLot1.enable();
        boolean boolean6 = parkingLot1.isDisabled();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        boolean boolean4 = parkingLot1.isDisabled();
        boolean boolean5 = parkingLot1.isDisabled();
        java.lang.String str6 = parkingLot1.getLotId();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace8 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace8);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        boolean boolean4 = parkingLot1.isDisabled();
        parkingLot1.enable();
        parkingLot1.disable();
        java.lang.Class<?> wildcardClass7 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList4 = parkingLot1.getSpaces();
        boolean boolean5 = parkingLot1.isDisabled();
        boolean boolean6 = parkingLot1.isDisabled();
        parkingLot1.enable();
        parkingLot1.disable();
        java.lang.Class<?> wildcardClass9 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        Models.ParkingSpace parkingSpace3 = parkingLot1.findAvailableSpace();
        boolean boolean4 = parkingLot1.isDisabled();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        java.lang.String str6 = parkingLot1.getLotId();
        boolean boolean7 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList4 = parkingLot1.getSpaces();
        boolean boolean5 = parkingLot1.isDisabled();
        boolean boolean6 = parkingLot1.isDisabled();
        java.util.List<Models.ParkingSpace> parkingSpaceList7 = parkingLot1.getSpaces();
        java.util.List<Models.ParkingSpace> parkingSpaceList8 = parkingLot1.getSpaces();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.disable();
        parkingLot1.disable();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        java.util.List<Models.ParkingSpace> parkingSpaceList7 = parkingLot1.getSpaces();
        java.lang.String str8 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        java.lang.String str5 = parkingLot1.getLotId();
        boolean boolean6 = parkingLot1.isDisabled();
        boolean boolean7 = parkingLot1.isDisabled();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        boolean boolean2 = parkingLot1.isDisabled();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        java.lang.String str5 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace6 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList7 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        java.lang.String str5 = parkingLot1.getLotId();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList7 = parkingLot1.getSpaces();
        parkingLot1.enable();
        parkingLot1.enable();
        boolean boolean10 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        boolean boolean4 = parkingLot1.isDisabled();
        boolean boolean5 = parkingLot1.isDisabled();
        java.lang.String str6 = parkingLot1.getLotId();
        boolean boolean7 = parkingLot1.isDisabled();
        boolean boolean8 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        java.util.List<Models.ParkingSpace> parkingSpaceList2 = parkingLot1.getSpaces();
        java.util.List<Models.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        boolean boolean4 = parkingLot1.isDisabled();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        boolean boolean6 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        parkingLot1.disable();
        parkingLot1.enable();
        java.lang.String str5 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace6 = parkingLot1.findAvailableSpace();
        boolean boolean7 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList4 = parkingLot1.getSpaces();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        java.util.List<Models.ParkingSpace> parkingSpaceList7 = parkingLot1.getSpaces();
        java.util.List<Models.ParkingSpace> parkingSpaceList8 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        java.lang.String str5 = parkingLot1.getLotId();
        boolean boolean6 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList4 = parkingLot1.getSpaces();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        boolean boolean2 = parkingLot1.isDisabled();
        java.lang.String str3 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.lang.String str3 = parkingLot1.getLotId();
        java.util.List<Models.ParkingSpace> parkingSpaceList4 = parkingLot1.getSpaces();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        boolean boolean4 = parkingLot1.isDisabled();
        boolean boolean5 = parkingLot1.isDisabled();
        java.lang.String str6 = parkingLot1.getLotId();
        java.lang.Class<?> wildcardClass7 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        boolean boolean3 = parkingLot1.isDisabled();
        java.lang.String str4 = parkingLot1.getLotId();
        java.util.List<Models.ParkingSpace> parkingSpaceList5 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        parkingLot1.disable();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace4 = parkingLot1.findAvailableSpace();
        java.lang.String str5 = parkingLot1.getLotId();
        parkingLot1.disable();
        boolean boolean7 = parkingLot1.isDisabled();
        Models.ParkingSpace parkingSpace8 = parkingLot1.findAvailableSpace();
        Models.ParkingSpace parkingSpace9 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace9);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        java.lang.String str3 = parkingLot1.getLotId();
        boolean boolean4 = parkingLot1.isDisabled();
        boolean boolean5 = parkingLot1.isDisabled();
        java.lang.String str6 = parkingLot1.getLotId();
        boolean boolean7 = parkingLot1.isDisabled();
        java.lang.String str8 = parkingLot1.getLotId();
        java.util.List<Models.ParkingSpace> parkingSpaceList9 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList9);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        java.lang.String str4 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace5 = parkingLot1.findAvailableSpace();
        boolean boolean6 = parkingLot1.isDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        parkingLot1.disable();
        parkingLot1.enable();
        java.util.List<Models.ParkingSpace> parkingSpaceList4 = parkingLot1.getSpaces();
        boolean boolean5 = parkingLot1.isDisabled();
        boolean boolean6 = parkingLot1.isDisabled();
        java.util.List<Models.ParkingSpace> parkingSpaceList7 = parkingLot1.getSpaces();
        java.util.List<Models.ParkingSpace> parkingSpaceList8 = parkingLot1.getSpaces();
        boolean boolean9 = parkingLot1.isDisabled();
        java.lang.Class<?> wildcardClass10 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        boolean boolean2 = parkingLot1.isDisabled();
        parkingLot1.disable();
        parkingLot1.enable();
        java.lang.String str5 = parkingLot1.getLotId();
        parkingLot1.enable();
        java.lang.String str7 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        boolean boolean5 = parkingLot1.isDisabled();
        parkingLot1.disable();
        Models.ParkingSpace parkingSpace7 = parkingLot1.findAvailableSpace();
        java.util.List<Models.ParkingSpace> parkingSpaceList8 = parkingLot1.getSpaces();
        Models.ParkingSpace parkingSpace9 = parkingLot1.findAvailableSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace9);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        parkingLot1.enable();
        java.lang.String str3 = parkingLot1.getLotId();
        java.lang.String str4 = parkingLot1.getLotId();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        java.lang.String str5 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotId();
        Models.ParkingSpace parkingSpace3 = parkingLot1.findAvailableSpace();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        Models.ParkingLot parkingLot1 = new Models.ParkingLot("");
        Models.ParkingSpace parkingSpace2 = parkingLot1.findAvailableSpace();
        java.lang.String str3 = parkingLot1.getLotId();
        parkingLot1.enable();
        boolean boolean5 = parkingLot1.isDisabled();
        boolean boolean6 = parkingLot1.isDisabled();
        parkingLot1.disable();
        java.util.List<Models.ParkingSpace> parkingSpaceList8 = parkingLot1.getSpaces();
        parkingLot1.disable();
        java.lang.String str10 = parkingLot1.getLotId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }
}


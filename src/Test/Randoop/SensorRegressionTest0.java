package Test.Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SensorRegressionTest0 {

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
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        java.lang.Class<?> wildcardClass4 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.Class<?> wildcardClass2 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        boolean boolean2 = sensor0.isCarPresent();
        java.lang.Class<?> wildcardClass3 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        java.lang.Class<?> wildcardClass3 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        java.lang.Class<?> wildcardClass6 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        java.lang.Class<?> wildcardClass5 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.Class<?> wildcardClass4 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        java.lang.Class<?> wildcardClass6 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.Class<?> wildcardClass8 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.Class<?> wildcardClass5 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        java.lang.Class<?> wildcardClass4 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        boolean boolean5 = sensor0.isCarPresent();
        java.lang.Class<?> wildcardClass6 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        java.lang.Class<?> wildcardClass5 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.detectCar("");
        boolean boolean7 = sensor0.isCarPresent();
        java.lang.Class<?> wildcardClass8 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        java.lang.Class<?> wildcardClass7 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.clearDetection();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        java.lang.Class<?> wildcardClass5 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        java.lang.Class<?> wildcardClass5 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        boolean boolean2 = sensor0.isCarPresent();
        sensor0.detectCar("");
        java.lang.String str5 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        java.lang.Class<?> wildcardClass7 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        java.lang.String str10 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        boolean boolean2 = sensor0.isCarPresent();
        sensor0.clearDetection();
        java.lang.Class<?> wildcardClass4 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        boolean boolean7 = sensor0.isCarPresent();
        boolean boolean8 = sensor0.isCarPresent();
        boolean boolean9 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        boolean boolean5 = sensor0.isCarPresent();
        boolean boolean6 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        boolean boolean5 = sensor0.isCarPresent();
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        java.lang.Class<?> wildcardClass7 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        boolean boolean2 = sensor0.isCarPresent();
        sensor0.detectCar("");
        java.lang.Class<?> wildcardClass5 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        boolean boolean2 = sensor0.isCarPresent();
        boolean boolean3 = sensor0.isCarPresent();
        java.lang.Class<?> wildcardClass4 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        java.lang.String str8 = sensor0.getDetectedLicensePlate();
        java.lang.Class<?> wildcardClass9 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        Models.Sensor sensor0 = new Models.Sensor();
        sensor0.clearDetection();
        java.lang.Class<?> wildcardClass2 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        java.lang.String str8 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        java.lang.String str10 = sensor0.getDetectedLicensePlate();
        java.lang.Class<?> wildcardClass11 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        java.lang.Class<?> wildcardClass5 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        boolean boolean4 = sensor0.isCarPresent();
        java.lang.Class<?> wildcardClass5 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.detectCar("");
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.clearDetection();
        boolean boolean9 = sensor0.isCarPresent();
        java.lang.Class<?> wildcardClass10 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        boolean boolean2 = sensor0.isCarPresent();
        boolean boolean3 = sensor0.isCarPresent();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        java.lang.Class<?> wildcardClass5 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        boolean boolean5 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        java.lang.Class<?> wildcardClass7 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        boolean boolean2 = sensor0.isCarPresent();
        java.lang.Class<?> wildcardClass3 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        boolean boolean4 = sensor0.isCarPresent();
        boolean boolean5 = sensor0.isCarPresent();
        java.lang.Class<?> wildcardClass6 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.detectCar("");
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.detectCar("");
        java.lang.Class<?> wildcardClass7 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.clearDetection();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.detectCar("");
        boolean boolean8 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Models.Sensor sensor0 = new Models.Sensor();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        java.lang.Class<?> wildcardClass4 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        java.lang.String str9 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        java.lang.Class<?> wildcardClass12 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        java.lang.String str10 = sensor0.getDetectedLicensePlate();
        boolean boolean11 = sensor0.isCarPresent();
        sensor0.clearDetection();
        boolean boolean13 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.Class<?> wildcardClass6 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.clearDetection();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        java.lang.String str9 = sensor0.getDetectedLicensePlate();
        boolean boolean10 = sensor0.isCarPresent();
        boolean boolean11 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.Class<?> wildcardClass6 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        java.lang.Class<?> wildcardClass11 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        boolean boolean8 = sensor0.isCarPresent();
        java.lang.String str9 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        boolean boolean2 = sensor0.isCarPresent();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        java.lang.Class<?> wildcardClass4 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        boolean boolean2 = sensor0.isCarPresent();
        sensor0.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.detectCar("");
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.clearDetection();
        java.lang.String str9 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        java.lang.Class<?> wildcardClass11 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.clearDetection();
        boolean boolean6 = sensor0.isCarPresent();
        java.lang.Class<?> wildcardClass7 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        boolean boolean5 = sensor0.isCarPresent();
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        java.lang.String str8 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        boolean boolean4 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        java.lang.Class<?> wildcardClass7 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        boolean boolean5 = sensor0.isCarPresent();
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.detectCar("");
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        boolean boolean8 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        boolean boolean2 = sensor0.isCarPresent();
        boolean boolean3 = sensor0.isCarPresent();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        java.lang.String str5 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.detectCar("");
        boolean boolean5 = sensor0.isCarPresent();
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        java.lang.String str9 = sensor0.getDetectedLicensePlate();
        boolean boolean10 = sensor0.isCarPresent();
        sensor0.detectCar("");
        java.lang.Class<?> wildcardClass13 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        java.lang.String str9 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        boolean boolean8 = sensor0.isCarPresent();
        sensor0.clearDetection();
        boolean boolean10 = sensor0.isCarPresent();
        java.lang.String str11 = sensor0.getDetectedLicensePlate();
        java.lang.Class<?> wildcardClass12 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        boolean boolean2 = sensor0.isCarPresent();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        boolean boolean5 = sensor0.isCarPresent();
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.detectCar("");
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        boolean boolean7 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        boolean boolean4 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        sensor0.detectCar("hi!");
        java.lang.Class<?> wildcardClass9 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        boolean boolean8 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        java.lang.Class<?> wildcardClass11 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        boolean boolean4 = sensor0.isCarPresent();
        java.lang.Class<?> wildcardClass5 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        boolean boolean5 = sensor0.isCarPresent();
        java.lang.Class<?> wildcardClass6 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        boolean boolean8 = sensor0.isCarPresent();
        sensor0.clearDetection();
        boolean boolean10 = sensor0.isCarPresent();
        java.lang.String str11 = sensor0.getDetectedLicensePlate();
        java.lang.String str12 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.detectCar("");
        java.lang.Class<?> wildcardClass6 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Models.Sensor sensor0 = new Models.Sensor();
        sensor0.clearDetection();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        java.lang.Class<?> wildcardClass3 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        java.lang.Class<?> wildcardClass10 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        java.lang.Class<?> wildcardClass7 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        boolean boolean2 = sensor0.isCarPresent();
        boolean boolean3 = sensor0.isCarPresent();
        boolean boolean4 = sensor0.isCarPresent();
        java.lang.Class<?> wildcardClass5 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        boolean boolean8 = sensor0.isCarPresent();
        sensor0.clearDetection();
        boolean boolean10 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        java.lang.Class<?> wildcardClass6 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        java.lang.String str5 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        sensor0.detectCar("");
        java.lang.String str12 = sensor0.getDetectedLicensePlate();
        boolean boolean13 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.detectCar("");
        boolean boolean10 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        boolean boolean5 = sensor0.isCarPresent();
        boolean boolean6 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.detectCar("");
        sensor0.detectCar("hi!");
        java.lang.Class<?> wildcardClass10 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        java.lang.String str8 = sensor0.getDetectedLicensePlate();
        java.lang.String str9 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str11 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Models.Sensor sensor0 = new Models.Sensor();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        sensor0.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.detectCar("");
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        boolean boolean12 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        boolean boolean4 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        java.lang.String str8 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        java.lang.String str10 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        sensor0.clearDetection();
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.Class<?> wildcardClass7 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.detectCar("");
        sensor0.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.detectCar("");
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.detectCar("");
        sensor0.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str8 = sensor0.getDetectedLicensePlate();
        java.lang.Class<?> wildcardClass9 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        sensor0.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        java.lang.String str10 = sensor0.getDetectedLicensePlate();
        boolean boolean11 = sensor0.isCarPresent();
        java.lang.String str12 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        boolean boolean5 = sensor0.isCarPresent();
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        java.lang.String str9 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        java.lang.String str5 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        boolean boolean7 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        boolean boolean6 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        java.lang.String str9 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        boolean boolean4 = sensor0.isCarPresent();
        sensor0.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.detectCar("");
        boolean boolean8 = sensor0.isCarPresent();
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.detectCar("");
        sensor0.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        boolean boolean8 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        sensor0.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        boolean boolean2 = sensor0.isCarPresent();
        sensor0.clearDetection();
        boolean boolean4 = sensor0.isCarPresent();
        java.lang.String str5 = sensor0.getDetectedLicensePlate();
        java.lang.Class<?> wildcardClass6 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        boolean boolean5 = sensor0.isCarPresent();
        java.lang.Class<?> wildcardClass6 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        java.lang.Class<?> wildcardClass8 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        java.lang.Class<?> wildcardClass5 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        java.lang.String str9 = sensor0.getDetectedLicensePlate();
        java.lang.String str10 = sensor0.getDetectedLicensePlate();
        boolean boolean11 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        sensor0.detectCar("hi!");
        java.lang.String str11 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        boolean boolean8 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        boolean boolean12 = sensor0.isCarPresent();
        java.lang.Class<?> wildcardClass13 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        Models.Sensor sensor0 = new Models.Sensor();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        boolean boolean6 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        boolean boolean5 = sensor0.isCarPresent();
        boolean boolean6 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        sensor0.detectCar("");
        java.lang.String str8 = sensor0.getDetectedLicensePlate();
        java.lang.String str9 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        java.lang.String str9 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        sensor0.clearDetection();
        sensor0.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        Models.Sensor sensor0 = new Models.Sensor();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        boolean boolean5 = sensor0.isCarPresent();
        sensor0.clearDetection();
        boolean boolean7 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        boolean boolean5 = sensor0.isCarPresent();
        sensor0.clearDetection();
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        boolean boolean8 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.clearDetection();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        java.lang.Class<?> wildcardClass4 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        boolean boolean6 = sensor0.isCarPresent();
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        boolean boolean6 = sensor0.isCarPresent();
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        Models.Sensor sensor0 = new Models.Sensor();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        java.lang.Class<?> wildcardClass6 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.clearDetection();
        java.lang.Class<?> wildcardClass9 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        boolean boolean2 = sensor0.isCarPresent();
        boolean boolean3 = sensor0.isCarPresent();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        boolean boolean6 = sensor0.isCarPresent();
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.detectCar("");
        sensor0.clearDetection();
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        sensor0.detectCar("");
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        sensor0.detectCar("hi!");
        java.lang.Class<?> wildcardClass11 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.clearDetection();
        boolean boolean5 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        boolean boolean6 = sensor0.isCarPresent();
        boolean boolean7 = sensor0.isCarPresent();
        java.lang.Class<?> wildcardClass8 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.String str5 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        java.lang.String str9 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        java.lang.String str12 = sensor0.getDetectedLicensePlate();
        java.lang.Class<?> wildcardClass13 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.detectCar("");
        java.lang.String str10 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.clearDetection();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.detectCar("");
        java.lang.String str8 = sensor0.getDetectedLicensePlate();
        java.lang.Class<?> wildcardClass9 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.String str5 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        boolean boolean8 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        boolean boolean6 = sensor0.isCarPresent();
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.clearDetection();
        boolean boolean9 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        boolean boolean7 = sensor0.isCarPresent();
        java.lang.Class<?> wildcardClass8 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        java.lang.Class<?> wildcardClass5 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        boolean boolean5 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        boolean boolean9 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        boolean boolean2 = sensor0.isCarPresent();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        boolean boolean6 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        boolean boolean5 = sensor0.isCarPresent();
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        boolean boolean8 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        java.lang.String str8 = sensor0.getDetectedLicensePlate();
        boolean boolean9 = sensor0.isCarPresent();
        java.lang.String str10 = sensor0.getDetectedLicensePlate();
        java.lang.Class<?> wildcardClass11 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.detectCar("");
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.clearDetection();
        java.lang.String str9 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        boolean boolean12 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.detectCar("");
        java.lang.String str10 = sensor0.getDetectedLicensePlate();
        boolean boolean11 = sensor0.isCarPresent();
        sensor0.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        boolean boolean2 = sensor0.isCarPresent();
        boolean boolean3 = sensor0.isCarPresent();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        boolean boolean5 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        boolean boolean5 = sensor0.isCarPresent();
        boolean boolean6 = sensor0.isCarPresent();
        sensor0.detectCar("");
        java.lang.Class<?> wildcardClass9 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        sensor0.detectCar("hi!");
        java.lang.Class<?> wildcardClass7 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        java.lang.String str9 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.Class<?> wildcardClass13 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        boolean boolean4 = sensor0.isCarPresent();
        boolean boolean5 = sensor0.isCarPresent();
        boolean boolean6 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Models.Sensor sensor0 = new Models.Sensor();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        boolean boolean2 = sensor0.isCarPresent();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        boolean boolean4 = sensor0.isCarPresent();
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        boolean boolean5 = sensor0.isCarPresent();
        sensor0.clearDetection();
        java.lang.Class<?> wildcardClass7 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.String str5 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        boolean boolean4 = sensor0.isCarPresent();
        java.lang.String str5 = sensor0.getDetectedLicensePlate();
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.Class<?> wildcardClass9 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        boolean boolean2 = sensor0.isCarPresent();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        boolean boolean8 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        sensor0.detectCar("");
        boolean boolean14 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        Models.Sensor sensor0 = new Models.Sensor();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.Class<?> wildcardClass3 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.Class<?> wildcardClass1 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        boolean boolean2 = sensor0.isCarPresent();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        boolean boolean5 = sensor0.isCarPresent();
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        boolean boolean9 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.String str12 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        sensor0.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.clearDetection();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        boolean boolean6 = sensor0.isCarPresent();
        boolean boolean7 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        sensor0.detectCar("hi!");
        sensor0.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.detectCar("");
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        java.lang.String str8 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        boolean boolean5 = sensor0.isCarPresent();
        java.lang.Class<?> wildcardClass6 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        java.lang.String str5 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        sensor0.detectCar("hi!");
        sensor0.detectCar("hi!");
        java.lang.Class<?> wildcardClass13 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        boolean boolean5 = sensor0.isCarPresent();
        sensor0.clearDetection();
        boolean boolean7 = sensor0.isCarPresent();
        java.lang.String str8 = sensor0.getDetectedLicensePlate();
        java.lang.String str9 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        sensor0.detectCar("");
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        sensor0.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        boolean boolean8 = sensor0.isCarPresent();
        sensor0.clearDetection();
        boolean boolean10 = sensor0.isCarPresent();
        java.lang.String str11 = sensor0.getDetectedLicensePlate();
        java.lang.String str12 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        Models.Sensor sensor0 = new Models.Sensor();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        java.lang.String str5 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        boolean boolean5 = sensor0.isCarPresent();
        sensor0.clearDetection();
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        boolean boolean10 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        boolean boolean2 = sensor0.isCarPresent();
        sensor0.detectCar("");
        boolean boolean5 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        boolean boolean8 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        java.lang.String str12 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        sensor0.detectCar("");
        sensor0.detectCar("hi!");
        java.lang.Class<?> wildcardClass14 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        sensor0.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.detectCar("");
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.clearDetection();
        java.lang.String str9 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        boolean boolean3 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        java.lang.String str8 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        java.lang.String str10 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        boolean boolean14 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        boolean boolean2 = sensor0.isCarPresent();
        sensor0.detectCar("");
        boolean boolean5 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        java.lang.Class<?> wildcardClass8 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        sensor0.detectCar("");
        boolean boolean12 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        Models.Sensor sensor0 = new Models.Sensor();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        java.lang.Class<?> wildcardClass6 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        sensor0.detectCar("hi!");
        sensor0.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        sensor0.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        boolean boolean4 = sensor0.isCarPresent();
        java.lang.String str5 = sensor0.getDetectedLicensePlate();
        boolean boolean6 = sensor0.isCarPresent();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        boolean boolean6 = sensor0.isCarPresent();
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        java.lang.String str10 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        Models.Sensor sensor0 = new Models.Sensor();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        boolean boolean4 = sensor0.isCarPresent();
        java.lang.String str5 = sensor0.getDetectedLicensePlate();
        boolean boolean6 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.clearDetection();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        boolean boolean6 = sensor0.isCarPresent();
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        boolean boolean2 = sensor0.isCarPresent();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        java.lang.String str5 = sensor0.getDetectedLicensePlate();
        java.lang.Class<?> wildcardClass6 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        boolean boolean5 = sensor0.isCarPresent();
        sensor0.clearDetection();
        boolean boolean7 = sensor0.isCarPresent();
        java.lang.String str8 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        boolean boolean8 = sensor0.isCarPresent();
        boolean boolean9 = sensor0.isCarPresent();
        java.lang.String str10 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        boolean boolean2 = sensor0.isCarPresent();
        sensor0.detectCar("");
        boolean boolean5 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        java.lang.String str8 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.String str5 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        java.lang.String str8 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        boolean boolean8 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        sensor0.detectCar("");
        java.lang.Class<?> wildcardClass13 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.detectCar("");
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.clearDetection();
        java.lang.String str9 = sensor0.getDetectedLicensePlate();
        java.lang.Class<?> wildcardClass10 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        boolean boolean4 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        java.lang.String str9 = sensor0.getDetectedLicensePlate();
        boolean boolean10 = sensor0.isCarPresent();
        sensor0.detectCar("");
        boolean boolean13 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.clearDetection();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        java.lang.String str5 = sensor0.getDetectedLicensePlate();
        boolean boolean6 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        sensor0.detectCar("hi!");
        sensor0.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        Models.Sensor sensor0 = new Models.Sensor();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        boolean boolean6 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        boolean boolean4 = sensor0.isCarPresent();
        java.lang.String str5 = sensor0.getDetectedLicensePlate();
        boolean boolean6 = sensor0.isCarPresent();
        java.lang.Class<?> wildcardClass7 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        java.lang.String str8 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        boolean boolean10 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        boolean boolean6 = sensor0.isCarPresent();
        boolean boolean7 = sensor0.isCarPresent();
        boolean boolean8 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.detectCar("");
        java.lang.String str10 = sensor0.getDetectedLicensePlate();
        boolean boolean11 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        boolean boolean4 = sensor0.isCarPresent();
        sensor0.clearDetection();
        java.lang.Class<?> wildcardClass6 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        boolean boolean8 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        boolean boolean12 = sensor0.isCarPresent();
        java.lang.String str13 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        boolean boolean5 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        boolean boolean10 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        java.lang.Class<?> wildcardClass14 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        boolean boolean5 = sensor0.isCarPresent();
        sensor0.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.detectCar("");
        boolean boolean7 = sensor0.isCarPresent();
        java.lang.String str8 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        boolean boolean8 = sensor0.isCarPresent();
        sensor0.clearDetection();
        boolean boolean10 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        java.lang.String str8 = sensor0.getDetectedLicensePlate();
        java.lang.String str9 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        boolean boolean6 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        boolean boolean5 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        java.lang.String str8 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.detectCar("");
        sensor0.detectCar("hi!");
        boolean boolean10 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        java.lang.String str8 = sensor0.getDetectedLicensePlate();
        boolean boolean9 = sensor0.isCarPresent();
        java.lang.String str10 = sensor0.getDetectedLicensePlate();
        boolean boolean11 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.detectCar("");
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        boolean boolean5 = sensor0.isCarPresent();
        boolean boolean6 = sensor0.isCarPresent();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.clearDetection();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.detectCar("");
        java.lang.String str8 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        boolean boolean8 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        boolean boolean12 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("");
        boolean boolean9 = sensor0.isCarPresent();
        sensor0.clearDetection();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        java.lang.String str7 = sensor0.getDetectedLicensePlate();
        java.lang.String str8 = sensor0.getDetectedLicensePlate();
        boolean boolean9 = sensor0.isCarPresent();
        java.lang.Class<?> wildcardClass10 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        boolean boolean8 = sensor0.isCarPresent();
        boolean boolean9 = sensor0.isCarPresent();
        java.lang.String str10 = sensor0.getDetectedLicensePlate();
        boolean boolean11 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        boolean boolean5 = sensor0.isCarPresent();
        sensor0.detectCar("");
        java.lang.String str8 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        sensor0.detectCar("hi!");
        boolean boolean6 = sensor0.isCarPresent();
        boolean boolean7 = sensor0.isCarPresent();
        boolean boolean8 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.clearDetection();
        sensor0.detectCar("");
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.clearDetection();
        java.lang.String str9 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        boolean boolean11 = sensor0.isCarPresent();
        boolean boolean12 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.detectCar("");
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.clearDetection();
        java.lang.String str9 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.clearDetection();
        java.lang.String str5 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        java.lang.Class<?> wildcardClass10 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        boolean boolean9 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        sensor0.clearDetection();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        java.lang.String str4 = sensor0.getDetectedLicensePlate();
        java.lang.String str5 = sensor0.getDetectedLicensePlate();
        java.lang.String str6 = sensor0.getDetectedLicensePlate();
        java.lang.Class<?> wildcardClass7 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        sensor0.clearDetection();
        java.lang.String str14 = sensor0.getDetectedLicensePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        boolean boolean7 = sensor0.isCarPresent();
        sensor0.clearDetection();
        boolean boolean9 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        Models.Sensor sensor0 = new Models.Sensor();
        boolean boolean1 = sensor0.isCarPresent();
        java.lang.String str2 = sensor0.getDetectedLicensePlate();
        boolean boolean3 = sensor0.isCarPresent();
        sensor0.detectCar("");
        sensor0.clearDetection();
        sensor0.detectCar("hi!");
        java.lang.String str9 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        java.lang.String str11 = sensor0.getDetectedLicensePlate();
        boolean boolean12 = sensor0.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        Models.Sensor sensor0 = new Models.Sensor();
        java.lang.String str1 = sensor0.getDetectedLicensePlate();
        sensor0.clearDetection();
        java.lang.String str3 = sensor0.getDetectedLicensePlate();
        java.lang.Class<?> wildcardClass4 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
}


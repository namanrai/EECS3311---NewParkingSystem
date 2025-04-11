package Test.Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ParkingFacadeRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        java.lang.Class<?> wildcardClass2 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        java.lang.Class<?> wildcardClass4 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        boolean boolean3 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass4 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        java.lang.Class<?> wildcardClass8 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass5 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass5 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass6 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass7 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        java.lang.Class<?> wildcardClass4 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("");
        java.lang.Class<?> wildcardClass4 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        java.lang.Class<?> wildcardClass9 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass3 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass7 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        java.lang.Class<?> wildcardClass7 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean10 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass11 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        java.lang.Class<?> wildcardClass9 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass8 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass3 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        java.lang.Class<?> wildcardClass9 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        java.lang.Class<?> wildcardClass7 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        java.lang.Class<?> wildcardClass7 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        java.lang.Class<?> wildcardClass12 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass10 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass6 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        java.lang.Class<?> wildcardClass7 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        java.lang.Class<?> wildcardClass10 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        boolean boolean12 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass13 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass6 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        java.lang.Class<?> wildcardClass10 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass9 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        java.lang.Class<?> wildcardClass6 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean13 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        java.lang.Class<?> wildcardClass16 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        java.lang.Class<?> wildcardClass11 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass8 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean10 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        java.lang.Class<?> wildcardClass13 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass7 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        java.lang.Class<?> wildcardClass11 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass9 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass10 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        java.lang.Class<?> wildcardClass10 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass12 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        java.lang.Class<?> wildcardClass13 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        java.lang.Class<?> wildcardClass8 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass8 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass10 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean13 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass14 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass9 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        java.lang.Class<?> wildcardClass11 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        java.lang.Class<?> wildcardClass2 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        boolean boolean10 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean10 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        java.lang.Class<?> wildcardClass5 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        boolean boolean10 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        java.lang.Class<?> wildcardClass14 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        java.lang.Class<?> wildcardClass12 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        java.lang.Class<?> wildcardClass13 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        java.lang.Class<?> wildcardClass14 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass9 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        java.lang.Class<?> wildcardClass10 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        java.lang.Class<?> wildcardClass9 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass8 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass10 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        boolean boolean10 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass11 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass10 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        java.lang.Class<?> wildcardClass10 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        boolean boolean3 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean10 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        java.lang.Class<?> wildcardClass9 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean13 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean18 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        boolean boolean3 = parkingFacade1.isParkingLotDisabled();
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass5 = parkingFacade1.getClass();
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
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        boolean boolean12 = parkingFacade1.isParkingLotDisabled();
        boolean boolean13 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass14 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        java.lang.Class<?> wildcardClass12 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        java.lang.Class<?> wildcardClass8 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        boolean boolean3 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass7 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean13 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        java.lang.Class<?> wildcardClass18 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass5 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        boolean boolean3 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass6 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass7 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean13 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        java.lang.Class<?> wildcardClass11 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean10 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass8 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        boolean boolean12 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        java.lang.Class<?> wildcardClass15 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        boolean boolean10 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass11 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean14 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        java.lang.Class<?> wildcardClass11 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        java.lang.Class<?> wildcardClass15 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        boolean boolean12 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        java.lang.Class<?> wildcardClass9 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        boolean boolean12 = parkingFacade1.isParkingLotDisabled();
        boolean boolean13 = parkingFacade1.isParkingLotDisabled();
        boolean boolean14 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        boolean boolean3 = parkingFacade1.isParkingLotDisabled();
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass5 = parkingFacade1.getClass();
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
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        java.lang.Class<?> wildcardClass7 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean10 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass11 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass8 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        java.lang.Class<?> wildcardClass13 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean13 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        java.lang.Class<?> wildcardClass16 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        boolean boolean10 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        java.lang.Class<?> wildcardClass13 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        boolean boolean12 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass13 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        boolean boolean12 = parkingFacade1.isParkingLotDisabled();
        boolean boolean13 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        boolean boolean3 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        java.lang.Class<?> wildcardClass8 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean10 = parkingFacade1.isParkingLotDisabled();
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        boolean boolean12 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        java.lang.Class<?> wildcardClass11 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass8 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        boolean boolean10 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean13 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass7 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        java.lang.Class<?> wildcardClass10 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean10 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean13 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean16 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        boolean boolean3 = parkingFacade1.isParkingLotDisabled();
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        boolean boolean3 = parkingFacade1.isParkingLotDisabled();
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean14 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass15 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean13 = parkingFacade1.isParkingLotDisabled();
        boolean boolean14 = parkingFacade1.isParkingLotDisabled();
        boolean boolean15 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean13 = parkingFacade1.isParkingLotDisabled();
        boolean boolean14 = parkingFacade1.isParkingLotDisabled();
        boolean boolean15 = parkingFacade1.isParkingLotDisabled();
        boolean boolean16 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass8 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean12 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean13 = parkingFacade1.isParkingLotDisabled();
        boolean boolean14 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass15 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        boolean boolean10 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass10 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass10 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        java.lang.Class<?> wildcardClass12 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass12 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean12 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        boolean boolean12 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean15 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass16 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        boolean boolean10 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        boolean boolean12 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean15 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean10 = parkingFacade1.isParkingLotDisabled();
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        boolean boolean12 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean13 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass14 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean16 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass12 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass6 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        boolean boolean12 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean17 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass18 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean12 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        boolean boolean12 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        boolean boolean10 = parkingFacade1.isParkingLotDisabled();
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean10 = parkingFacade1.isParkingLotDisabled();
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass12 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        java.lang.Class<?> wildcardClass10 = parkingFacade1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        boolean boolean12 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean17 = parkingFacade1.isParkingLotDisabled();
        boolean boolean18 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        boolean boolean3 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }
}


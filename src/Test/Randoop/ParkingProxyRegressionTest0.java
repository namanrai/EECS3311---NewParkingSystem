import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ParkingProxyRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass3 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass13 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", true);
        java.lang.Class<?> wildcardClass9 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.toggleParkingLot("hi!", true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList13 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass14 = parkingLotList13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.removeParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList7 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass8 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass13 = parkingLotList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "", false);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass13 = parkingLotList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.removeParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList4 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass3 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList14 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass15 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", true);
        parkingProxy1.toggleParkingLot("", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        parkingProxy1.removeParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "", false);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("", "", true);
        java.lang.Class<?> wildcardClass17 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList14 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.lang.Class<?> wildcardClass2 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        parkingProxy1.removeParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList8 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass9 = parkingLotList8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        parkingProxy1.removeParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList8 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass9 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList8 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass9 = parkingLotList8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "hi!", false);
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.addParkingLot("");
        java.lang.Class<?> wildcardClass21 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.toggleParkingLot("", false);
        java.util.List<Models.ParkingLot> parkingLotList5 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        java.lang.Class<?> wildcardClass5 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "", false);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("", true);
        java.lang.Class<?> wildcardClass16 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList8 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.addParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingSpace("", "", true);
        parkingProxy1.removeParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList4 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList5 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("hi!", false);
        java.lang.Class<?> wildcardClass9 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass7 = parkingLotList6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass4 = parkingLotList3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("", false);
        java.util.List<Models.ParkingLot> parkingLotList10 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingSpace("", "", true);
        parkingProxy1.toggleParkingLot("", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.removeParkingLot("");
        java.lang.Class<?> wildcardClass7 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList14 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass15 = parkingLotList14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "", false);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList15 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList15);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("", "", true);
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", true);
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList11 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass12 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingLot("hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass7 = parkingLotList6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.removeParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList11 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList11);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "", false);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList13 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList13);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", false);
        parkingProxy1.toggleParkingLot("hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("", "", true);
        parkingProxy1.toggleParkingSpace("", "hi!", false);
        java.lang.Class<?> wildcardClass10 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        java.lang.Class<?> wildcardClass14 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", false);
        java.util.List<Models.ParkingLot> parkingLotList9 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass10 = parkingLotList9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList14 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingLot("hi!", true);
        parkingProxy1.addParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingSpace("", "", true);
        java.util.List<Models.ParkingLot> parkingLotList9 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", false);
        java.lang.Class<?> wildcardClass16 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass4 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList8 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        java.lang.Class<?> wildcardClass11 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.removeParkingLot("hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        parkingProxy1.toggleParkingSpace("", "", true);
        parkingProxy1.addParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList5 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.toggleParkingLot("hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("", "", true);
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("");
        java.lang.Class<?> wildcardClass10 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.removeParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("", "", true);
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingSpace("", "", false);
        java.lang.Class<?> wildcardClass12 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "hi!", false);
        parkingProxy1.toggleParkingSpace("", "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList14 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.lang.Class<?> wildcardClass21 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        parkingProxy1.removeParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList8 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("");
        parkingProxy1.addParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList13 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", false);
        java.lang.Class<?> wildcardClass24 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingLot("", true);
        java.util.List<Models.ParkingLot> parkingLotList18 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList18);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingLot("hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList9 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.addParkingLot("");
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        parkingProxy1.addParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList10 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", false);
        parkingProxy1.toggleParkingSpace("", "", false);
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList20 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList20);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "", true);
        parkingProxy1.removeParkingLot("");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList14 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.toggleParkingLot("hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.addParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList8 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", false);
        parkingProxy1.toggleParkingSpace("", "", false);
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.removeParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        java.util.List<Models.ParkingLot> parkingLotList17 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList18 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList19 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass20 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        java.util.List<Models.ParkingLot> parkingLotList9 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList13 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList14 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingLot("hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList9 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass10 = parkingLotList9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList14 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("hi!", true);
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.addParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.toggleParkingLot("", false);
        java.util.List<Models.ParkingLot> parkingLotList5 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("hi!", true);
        java.lang.Class<?> wildcardClass9 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList13 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.removeParkingLot("");
        java.lang.Class<?> wildcardClass19 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("", "", true);
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("");
        java.lang.Class<?> wildcardClass12 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList14 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("hi!", true);
        parkingProxy1.toggleParkingSpace("", "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.addParkingLot("");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.toggleParkingLot("", false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList11 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList11);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("", "", true);
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("");
        parkingProxy1.addParkingLot("");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("hi!", "", false);
        java.lang.Class<?> wildcardClass10 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.addParkingLot("");
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingLot("hi!", true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList14 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.addParkingLot("");
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        parkingProxy1.addParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList10 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.addParkingLot("");
        parkingProxy1.toggleParkingSpace("", "", true);
        parkingProxy1.toggleParkingLot("", false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.addParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList7 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass8 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingLot("", true);
        java.lang.Class<?> wildcardClass5 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.addParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList10 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("", "hi!", false);
        parkingProxy1.toggleParkingLot("hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        parkingProxy1.removeParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList8 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("");
        parkingProxy1.addParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", true);
        parkingProxy1.toggleParkingLot("", true);
        java.lang.Class<?> wildcardClass12 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.addParkingLot("hi!");
        java.lang.Class<?> wildcardClass8 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList14 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingSpace("", "", true);
        java.util.List<Models.ParkingLot> parkingLotList9 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("hi!", false);
        java.util.List<Models.ParkingLot> parkingLotList13 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass14 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.toggleParkingLot("hi!", false);
        java.util.List<Models.ParkingLot> parkingLotList8 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList9 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "", false);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList13 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList14 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("", "", true);
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass7 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("", "", true);
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.addParkingLot("");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingSpace("", "", true);
        java.util.List<Models.ParkingLot> parkingLotList9 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass10 = parkingLotList9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.addParkingLot("");
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        parkingProxy1.toggleParkingSpace("", "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.addParkingLot("");
        parkingProxy1.toggleParkingSpace("", "", true);
        java.util.List<Models.ParkingLot> parkingLotList8 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        java.util.List<Models.ParkingLot> parkingLotList17 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList18 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList19 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.addParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList19);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList5 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass6 = parkingLotList5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.addParkingLot("");
        parkingProxy1.addParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", true);
        java.lang.Class<?> wildcardClass12 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("", "", false);
        java.util.List<Models.ParkingLot> parkingLotList7 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList8 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.toggleParkingSpace("", "hi!", true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        parkingProxy1.toggleParkingSpace("", "", true);
        java.util.List<Models.ParkingLot> parkingLotList21 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList21);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "", true);
        java.lang.Class<?> wildcardClass8 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", false);
        java.util.List<Models.ParkingLot> parkingLotList23 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList23);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("hi!", true);
        parkingProxy1.removeParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.addParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList4 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass5 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingLot("hi!", true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList13 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", false);
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList13);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", false);
        parkingProxy1.toggleParkingSpace("", "", false);
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList20 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList20);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList8 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingLot("hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.addParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList10 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("", "hi!", false);
        parkingProxy1.removeParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList10);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        parkingProxy1.toggleParkingSpace("", "", true);
        parkingProxy1.toggleParkingSpace("", "hi!", false);
        parkingProxy1.toggleParkingLot("", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.toggleParkingLot("", true);
        java.util.List<Models.ParkingLot> parkingLotList11 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass12 = parkingLotList11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", false);
        parkingProxy1.toggleParkingSpace("", "", false);
        parkingProxy1.addParkingLot("hi!");
        java.lang.Class<?> wildcardClass20 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        parkingProxy1.toggleParkingSpace("", "", true);
        java.util.List<Models.ParkingLot> parkingLotList21 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList22 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList22);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        java.util.List<Models.ParkingLot> parkingLotList17 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList18 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList19 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingLot("", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList19);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "", false);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("", false);
        java.util.List<Models.ParkingLot> parkingLotList16 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList16);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.addParkingLot("hi!");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingSpace("", "hi!", false);
        parkingProxy1.removeParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", true);
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList11 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "hi!", false);
        parkingProxy1.removeParkingLot("hi!");
        java.lang.Class<?> wildcardClass19 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.removeParkingLot("");
        java.lang.Class<?> wildcardClass12 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.addParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList10 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "", false);
        parkingProxy1.addParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", false);
        java.util.List<Models.ParkingLot> parkingLotList9 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList10 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList14 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingLot("hi!", true);
        parkingProxy1.toggleParkingSpace("hi!", "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.toggleParkingLot("", true);
        java.util.List<Models.ParkingLot> parkingLotList11 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        parkingProxy1.addParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList11);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("hi!", true);
        parkingProxy1.toggleParkingLot("hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        parkingProxy1.toggleParkingSpace("", "", true);
        java.util.List<Models.ParkingLot> parkingLotList21 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass22 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", true);
        parkingProxy1.toggleParkingLot("", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingLot("", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList8 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.addParkingLot("");
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        parkingProxy1.addParkingLot("");
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingLot("hi!", true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList10 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "", false);
        parkingProxy1.toggleParkingSpace("hi!", "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("", false);
        java.lang.Class<?> wildcardClass10 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("hi!", "hi!", false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", false);
        java.lang.Class<?> wildcardClass9 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingSpace("", "", true);
        java.util.List<Models.ParkingLot> parkingLotList9 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("hi!", false);
        java.util.List<Models.ParkingLot> parkingLotList13 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList13);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList8 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.removeParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.addParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.toggleParkingLot("hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingLot("", true);
        java.util.List<Models.ParkingLot> parkingLotList5 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("hi!", "", false);
        java.lang.Class<?> wildcardClass18 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", false);
        java.util.List<Models.ParkingLot> parkingLotList14 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList15 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList15);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "hi!", false);
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingLot("hi!", true);
        parkingProxy1.removeParkingLot("");
        parkingProxy1.addParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList14 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList14 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("hi!", true);
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList20 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList20);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList14 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList17 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList17);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingSpace("", "", true);
        java.util.List<Models.ParkingLot> parkingLotList9 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.toggleParkingLot("", false);
        java.lang.Class<?> wildcardClass16 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList14 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("hi!", true);
        parkingProxy1.toggleParkingSpace("hi!", "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("hi!", "", false);
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.lang.Class<?> wildcardClass22 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        java.lang.Class<?> wildcardClass5 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("", "", true);
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.removeParkingLot("hi!");
        java.lang.Class<?> wildcardClass6 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.toggleParkingSpace("", "", true);
        java.lang.Class<?> wildcardClass13 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        java.util.List<Models.ParkingLot> parkingLotList17 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList18 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList19 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass20 = parkingLotList19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.addParkingLot("");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.addParkingLot("");
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList9 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("", "", true);
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        java.lang.Class<?> wildcardClass9 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList13 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("hi!", false);
        java.util.List<Models.ParkingLot> parkingLotList17 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList18 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList18);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("", true);
        java.util.List<Models.ParkingLot> parkingLotList9 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass10 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.addParkingLot("");
        parkingProxy1.addParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList14 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("", "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.addParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingLot("", true);
        java.util.List<Models.ParkingLot> parkingLotList18 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "hi!", false);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList18);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.toggleParkingSpace("", "", true);
        parkingProxy1.toggleParkingSpace("", "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "", false);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        parkingProxy1.removeParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList8 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("");
        java.lang.Class<?> wildcardClass11 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", true);
        parkingProxy1.toggleParkingLot("", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.toggleParkingLot("", true);
        java.util.List<Models.ParkingLot> parkingLotList11 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingSpace("hi!", "hi!", false);
        parkingProxy1.toggleParkingLot("hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList11);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("", "", true);
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList8 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.addParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList13 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        java.util.List<Models.ParkingLot> parkingLotList18 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass19 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList14 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingLot("", false);
        java.util.List<Models.ParkingLot> parkingLotList25 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList25);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingLot("hi!", false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingLot("hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList9 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("", "", true);
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingSpace("", "", false);
        parkingProxy1.removeParkingLot("hi!");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList13 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingLot("", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList13);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.toggleParkingLot("", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.removeParkingLot("hi!");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.removeParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", true);
        parkingProxy1.toggleParkingLot("", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList13 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList13);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList8 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.addParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList10 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.toggleParkingSpace("", "", false);
        parkingProxy1.removeParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList10);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.addParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList10 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.removeParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList10);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingSpace("hi!", "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("hi!", "", false);
        parkingProxy1.toggleParkingLot("hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingSpace("", "", true);
        java.util.List<Models.ParkingLot> parkingLotList9 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList14 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        java.util.List<Models.ParkingLot> parkingLotList17 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList18 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList19 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.addParkingLot("");
        parkingProxy1.toggleParkingSpace("", "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList19);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.toggleParkingLot("", true);
        java.util.List<Models.ParkingLot> parkingLotList11 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "", false);
        parkingProxy1.addParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList11);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", false);
        parkingProxy1.toggleParkingSpace("", "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.toggleParkingLot("", false);
        java.util.List<Models.ParkingLot> parkingLotList5 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("hi!", true);
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.removeParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList21 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList21);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingSpace("", "", true);
        java.util.List<Models.ParkingLot> parkingLotList9 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", false);
        java.util.List<Models.ParkingLot> parkingLotList16 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList16);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingSpace("", "", true);
        java.util.List<Models.ParkingLot> parkingLotList9 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList15 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList15);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        parkingProxy1.removeParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList8 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        parkingProxy1.removeParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.removeParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList14 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.toggleParkingLot("hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingSpace("", "", true);
        java.util.List<Models.ParkingLot> parkingLotList9 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", false);
        java.lang.Class<?> wildcardClass19 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList5 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.removeParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.removeParkingLot("");
        java.lang.Class<?> wildcardClass11 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("hi!", "hi!", false);
        parkingProxy1.toggleParkingLot("hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", true);
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList11 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList14 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.toggleParkingLot("", false);
        java.util.List<Models.ParkingLot> parkingLotList5 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("", "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("");
        parkingProxy1.addParkingLot("");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.toggleParkingSpace("", "", true);
        parkingProxy1.removeParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("", "", false);
        parkingProxy1.addParkingLot("hi!");
        java.lang.Class<?> wildcardClass9 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingSpace("", "", true);
        java.util.List<Models.ParkingLot> parkingLotList9 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("hi!", false);
        java.util.List<Models.ParkingLot> parkingLotList13 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("", false);
        java.util.List<Models.ParkingLot> parkingLotList17 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList17);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.toggleParkingLot("", true);
        java.util.List<Models.ParkingLot> parkingLotList11 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList20 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList20);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.removeParkingLot("");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.removeParkingLot("");
        parkingProxy1.addParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        java.lang.Class<?> wildcardClass14 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("hi!", "hi!", false);
        java.util.List<Models.ParkingLot> parkingLotList19 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList20 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList20);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList7 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("", "hi!", false);
        parkingProxy1.removeParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList7);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("hi!", "", false);
        parkingProxy1.addParkingLot("hi!");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "hi!", false);
        parkingProxy1.removeParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList19 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList19);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.toggleParkingLot("", false);
        java.util.List<Models.ParkingLot> parkingLotList5 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.removeParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList10 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass11 = parkingLotList10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.removeParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.removeParkingLot("");
        parkingProxy1.addParkingLot("");
        parkingProxy1.toggleParkingSpace("", "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("hi!", true);
        parkingProxy1.addParkingLot("");
        parkingProxy1.addParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingLot("hi!", true);
        parkingProxy1.addParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingLot("hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList9 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("");
        java.lang.Class<?> wildcardClass12 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.toggleParkingLot("hi!", false);
        java.util.List<Models.ParkingLot> parkingLotList8 = parkingProxy1.getParkingLots();
        java.lang.Class<?> wildcardClass9 = parkingLotList8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.addParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "", false);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList13 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList13);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList12 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.removeParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.toggleParkingSpace("", "", true);
        parkingProxy1.toggleParkingLot("", false);
        parkingProxy1.addParkingLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList5 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList14 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.toggleParkingLot("", true);
        java.lang.Class<?> wildcardClass22 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.addParkingLot("hi!");
        java.lang.Class<?> wildcardClass11 = parkingProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.removeParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList13 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("", "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList13);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.addParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList7 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList7);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        java.util.List<Models.ParkingLot> parkingLotList6 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingSpace("hi!", "hi!", true);
        parkingProxy1.toggleParkingSpace("hi!", "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.addParkingLot("");
        parkingProxy1.addParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList9 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", true);
        parkingProxy1.toggleParkingLot("", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingLot("", true);
        java.util.List<Models.ParkingLot> parkingLotList8 = parkingProxy1.getParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        parkingProxy1.addParkingLot("");
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingSpace("hi!", "", false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(true);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", true);
        parkingProxy1.toggleParkingSpace("", "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.removeParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.addParkingLot("hi!");
        java.util.List<Models.ParkingLot> parkingLotList14 = parkingProxy1.getParkingLots();
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingLot("hi!", true);
        parkingProxy1.toggleParkingSpace("", "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingSpace("", "", true);
        java.util.List<Models.ParkingLot> parkingLotList9 = parkingProxy1.getParkingLots();
        parkingProxy1.addParkingLot("hi!");
        parkingProxy1.toggleParkingSpace("hi!", "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        DesignPatterns.ParkingProxy parkingProxy1 = new DesignPatterns.ParkingProxy(false);
        java.util.List<Models.ParkingLot> parkingLotList2 = parkingProxy1.getParkingLots();
        java.util.List<Models.ParkingLot> parkingLotList3 = parkingProxy1.getParkingLots();
        parkingProxy1.removeParkingLot("");
        parkingProxy1.toggleParkingLot("hi!", true);
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingLot("hi!", false);
        parkingProxy1.toggleParkingLot("", true);
        parkingProxy1.toggleParkingSpace("", "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }
}


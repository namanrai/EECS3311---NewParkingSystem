package Test.Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ManagerRegressionTest0 {

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
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.Class<?> wildcardClass4 = manager3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkingspace("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Models.Manager.validateUsers("");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkinglot("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        // The following exception was thrown during execution in test generation
        try {
            manager1.removeParkingLot("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        java.lang.String str6 = manager3.getUsername();
        java.lang.Class<?> wildcardClass7 = manager3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList2 = manager1.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Models.Manager.validateUsers("hi!");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.Class<?> wildcardClass2 = manager1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("CBMGZO");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("CBMGZO");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        // The following exception was thrown during execution in test generation
        try {
            manager1.removeParkingLot("CBMGZO");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.username;
        // The following exception was thrown during execution in test generation
        try {
            manager1.addParkingLot("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ZE3Z9L" + "'", str2.equals("ZE3Z9L"));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkingspace("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("CBMGZO");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.username;
        // The following exception was thrown during execution in test generation
        try {
            manager1.enableParkinglot("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3L5SEJ" + "'", str2.equals("3L5SEJ"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("CBMGZO");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.username;
        // The following exception was thrown during execution in test generation
        try {
            manager1.removeParkingLot("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MJR8WQ" + "'", str2.equals("MJR8WQ"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkinglot("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList6 = manager3.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        manager3.password = "";
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        java.lang.Class<?> wildcardClass8 = manager3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.getPassword();
        java.lang.Class<?> wildcardClass4 = manager1.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "671483" + "'", str2.equals("671483"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "671483" + "'", str3.equals("671483"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Models.Manager.validateUsers("025064");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        manager3.password = "";
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        manager3.password = "";
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("671483");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkinglot("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        java.lang.String str8 = manager3.username;
        java.lang.Class<?> wildcardClass9 = manager3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkingspace("hi!", "671483");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("563138", "025064");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        java.lang.Class<?> wildcardClass6 = manager3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("246527");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.getUsername();
        java.lang.String str6 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList7 = manager3.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            manager1.enableParkingspace("hi!", "765030");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "090938" + "'", str2.equals("090938"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("563138");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.getPassword();
        java.lang.Class<?> wildcardClass5 = manager3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.Class<?> wildcardClass5 = manager3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("246527");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.password;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList6 = manager3.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "CBMGZO";
        java.lang.String str6 = manager3.password;
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("563138");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "CBMGZO" + "'", str6.equals("CBMGZO"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("hi!", "025064", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList4 = manager3.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("hi!", "025064", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.password;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList3 = manager1.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "867660" + "'", str2.equals("867660"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.password;
        java.lang.String str5 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("246527");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("hi!", "025064", parkingProxy2);
        java.lang.Class<?> wildcardClass4 = manager3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        manager3.password = "765030";
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.username;
        // The following exception was thrown during execution in test generation
        try {
            manager1.disableParkinglot("CBMGZO");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "7M5UBU" + "'", str2.equals("7M5UBU"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        manager3.password = "";
        java.lang.String str10 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkingspace("765030", "HDEUYF");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList5 = manager3.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.getUsername();
        java.lang.String str6 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("025064", "765030");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.Class<?> wildcardClass5 = manager3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("025064", "", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkingspace("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        java.lang.String str8 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("901519");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.password;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("CBMGZO");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Models.Manager.validateUsers("671483");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("563138", "246527", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("HDEUYF", "437107");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        java.lang.String str8 = manager3.getPassword();
        java.lang.String str9 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("765030");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        java.lang.String str8 = manager3.getPassword();
        java.lang.String str9 = manager3.getUsername();
        java.lang.String str10 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("246527");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "025064", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("901519");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        // The following exception was thrown during execution in test generation
        try {
            manager1.enableParkingspace("CBMGZO", "699781");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        java.lang.String str6 = manager3.getUsername();
        manager3.username = "246527";
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("NKTU5H", "CBMGZO");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("563138");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        java.lang.String str8 = manager3.getPassword();
        manager3.username = "901519";
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("671483");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "CBMGZO";
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkingspace("826901", "437107");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            manager1.disableParkingspace("699781", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "417097" + "'", str2.equals("417097"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "417097" + "'", str3.equals("417097"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        java.lang.String str8 = manager3.getPassword();
        manager3.username = "901519";
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("", "025064");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("437107", "025064", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("246527", "765030");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkinglot("671483");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("563138", "246527", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("826901");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("563138", "246527", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkingspace("CBMGZO", "699781");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkingspace("826901", "HDEUYF");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("025064", "", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("CBMGZO");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("671483");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        java.lang.String str8 = manager3.getPassword();
        manager3.username = "901519";
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("437107", "NKTU5H");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        java.lang.String str8 = manager3.getPassword();
        java.lang.String str9 = manager3.getUsername();
        java.lang.String str10 = manager3.getUsername();
        java.lang.String str11 = manager3.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        manager3.password = "";
        java.lang.String str10 = manager3.password;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("671483", "CBMGZO");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.password;
        java.lang.Class<?> wildcardClass5 = manager1.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "419361" + "'", str2.equals("419361"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "419361" + "'", str3.equals("419361"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "419361" + "'", str4.equals("419361"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.username;
        java.lang.String str3 = manager1.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            manager1.removeParkingLot("LKAY89");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "42NB8J" + "'", str2.equals("42NB8J"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "182194" + "'", str3.equals("182194"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.password;
        java.lang.String str5 = manager1.username;
        manager1.password = "hi!";
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "252721" + "'", str2.equals("252721"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "252721" + "'", str3.equals("252721"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "252721" + "'", str4.equals("252721"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "7VJEIZ" + "'", str5.equals("7VJEIZ"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "025064", parkingProxy2);
        java.lang.String str4 = manager3.password;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkinglot("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "025064" + "'", str4.equals("025064"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        java.lang.String str8 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("HDEUYF");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.password;
        java.lang.String str5 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("025064", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.getPassword();
        manager3.password = "826901";
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkingspace("699781", "366214");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        java.lang.String str8 = manager3.getPassword();
        manager3.username = "901519";
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("699781");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("563138", "246527", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("252721", "419361");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("563138");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("563138", "246527", parkingProxy2);
        java.lang.String str4 = manager3.password;
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("YT9ROM");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "246527" + "'", str4.equals("246527"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Models.Manager.validateUsers("252721");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkinglot("K0HIAM");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.password;
        // The following exception was thrown during execution in test generation
        try {
            manager1.removeParkingLot("CBMGZO");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "986362" + "'", str2.equals("986362"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        java.lang.String str8 = manager3.getPassword();
        java.lang.String str9 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("374594");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "CBMGZO";
        java.lang.String str6 = manager3.password;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("366214", "252721");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "CBMGZO" + "'", str6.equals("CBMGZO"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        Models.Manager.validateUsers("366214");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        manager3.password = "765030";
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("NKTU5H", "398146");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.username;
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.getUsername();
        java.lang.String str5 = manager1.password;
        // The following exception was thrown during execution in test generation
        try {
            manager1.addParkingLot("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00FEDA" + "'", str2.equals("00FEDA"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "453086" + "'", str3.equals("453086"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00FEDA" + "'", str4.equals("00FEDA"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "453086" + "'", str5.equals("453086"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("437107", "398146");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.username;
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "146682" + "'", str2.equals("146682"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "146682" + "'", str3.equals("146682"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "UA4IBM" + "'", str4.equals("UA4IBM"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        java.lang.String str8 = manager3.username;
        java.lang.String str9 = manager3.getUsername();
        java.lang.String str10 = manager3.getUsername();
        java.lang.Class<?> wildcardClass11 = manager3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.password;
        java.lang.String str5 = manager1.username;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList6 = manager1.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "821841" + "'", str2.equals("821841"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "821841" + "'", str3.equals("821841"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "821841" + "'", str4.equals("821841"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OOM1U5" + "'", str5.equals("OOM1U5"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("K0HIAM");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.password;
        // The following exception was thrown during execution in test generation
        try {
            manager1.enableParkinglot("LKAY89");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "873256" + "'", str2.equals("873256"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "873256" + "'", str3.equals("873256"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "873256" + "'", str4.equals("873256"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        java.lang.String str8 = manager3.username;
        java.lang.String str9 = manager3.password;
        java.lang.String str10 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("392554");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("K0HIAM", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        manager3.password = "";
        java.lang.String str10 = manager3.getUsername();
        java.lang.String str11 = manager3.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList12 = manager3.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkingspace("", "563138");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.getUsername();
        java.lang.String str6 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkingspace("437107", "LKAY89");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Models.Manager.validateUsers("CBMGZO");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "025064", parkingProxy2);
        java.lang.String str4 = manager3.password;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList5 = manager3.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "025064" + "'", str4.equals("025064"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        java.lang.String str6 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("374594", "901519");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "025064", parkingProxy2);
        java.lang.String str4 = manager3.password;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("YT9ROM", "392554");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "025064" + "'", str4.equals("025064"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("563138", "765030", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.password;
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("765030");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "563138" + "'", str4.equals("563138"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "765030" + "'", str5.equals("765030"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        java.lang.String str8 = manager3.getPassword();
        manager3.username = "901519";
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkinglot("246527");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.username;
        java.lang.String str3 = manager1.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            manager1.addParkingLot("901519");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "7K9ZVW" + "'", str2.equals("7K9ZVW"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "232892" + "'", str3.equals("232892"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "025064", parkingProxy2);
        java.lang.String str4 = manager3.password;
        java.lang.String str5 = manager3.password;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "025064" + "'", str4.equals("025064"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "025064" + "'", str5.equals("025064"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        Models.Manager.validateUsers("826901");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.password;
        java.lang.Class<?> wildcardClass3 = manager1.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "490146" + "'", str2.equals("490146"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.username;
        java.lang.String str6 = manager3.password;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        manager3.password = "";
        java.lang.String str10 = manager3.password;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("29QG3X", "29QG3X");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("NQB3QO", "901519", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList4 = manager3.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        manager3.password = "";
        java.lang.String str10 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkingspace("LKAY89", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        java.lang.String str8 = manager3.username;
        java.lang.String str9 = manager3.getUsername();
        java.lang.String str10 = manager3.getUsername();
        manager3.password = "437107";
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList13 = manager3.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.password;
        java.lang.String str5 = manager3.getUsername();
        manager3.username = "hi!";
        java.lang.Class<?> wildcardClass8 = manager3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Models.Manager.validateUsers("897782");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Models.Manager.validateUsers("29QG3X");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        java.lang.String str8 = manager3.username;
        java.lang.String str9 = manager3.password;
        java.lang.String str10 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("7VJEIZ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        java.lang.String str8 = manager3.getPassword();
        java.lang.String str9 = manager3.getUsername();
        java.lang.String str10 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("699781");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.password;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkingspace("490146", "246527");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "025064", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        // The following exception was thrown during execution in test generation
        try {
            manager1.addParkingLot("419361");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.getPassword();
        manager3.password = "826901";
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList7 = manager3.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        java.lang.String str8 = manager3.username;
        java.lang.String str9 = manager3.getUsername();
        java.lang.String str10 = manager3.getUsername();
        manager3.password = "437107";
        manager3.password = "765030";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        java.lang.String str6 = manager3.getUsername();
        manager3.username = "K0HIAM";
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("366214");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.getUsername();
        manager1.password = "CBMGZO";
        // The following exception was thrown during execution in test generation
        try {
            manager1.disableParkingspace("146682", "897782");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "950712" + "'", str2.equals("950712"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "950712" + "'", str3.equals("950712"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A0VLRU" + "'", str4.equals("A0VLRU"));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        // The following exception was thrown during execution in test generation
        try {
            manager1.removeParkingLot("7VJEIZ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("419361", "897782", parkingProxy2);
        java.lang.Class<?> wildcardClass4 = manager3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        java.lang.String str6 = manager3.username;
        java.lang.String str7 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("UA4IBM");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        Models.Manager.validateUsers("419361");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("hi!", "025064", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkingspace("HDEUYF", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.username;
        manager1.password = "398146";
        java.lang.String str6 = manager1.getUsername();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "211087" + "'", str2.equals("211087"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "JPN5SY" + "'", str3.equals("JPN5SY"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "JPN5SY" + "'", str6.equals("JPN5SY"));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("563138", "765030", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "366214";
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("JIAKCH");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "563138" + "'", str4.equals("563138"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("671483", "437107", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("CBMGZO", "366214");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.password;
        java.lang.String str3 = manager1.password;
        java.lang.String str4 = manager1.getPassword();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "875011" + "'", str2.equals("875011"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "875011" + "'", str3.equals("875011"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "875011" + "'", str4.equals("875011"));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.getUsername();
        manager3.username = "398146";
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("398146");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.username;
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList5 = manager1.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "NSE1KP" + "'", str2.equals("NSE1KP"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "643489" + "'", str3.equals("643489"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "NSE1KP" + "'", str4.equals("NSE1KP"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("025064", "246527", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("357755");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("875011");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("NQB3QO", "901519", parkingProxy2);
        java.lang.String str4 = manager3.getPassword();
        java.lang.Class<?> wildcardClass5 = manager3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "901519" + "'", str4.equals("901519"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Models.Manager.validateUsers("563138");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "025064", parkingProxy2);
        java.lang.String str4 = manager3.password;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("246527", "563138");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "025064" + "'", str4.equals("025064"));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("671483", "437107", parkingProxy2);
        java.lang.String str4 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkinglot("875011");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "671483" + "'", str4.equals("671483"));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        java.lang.String str8 = manager3.username;
        java.lang.String str9 = manager3.password;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("366214", "JPN5SY");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.password;
        manager1.username = "897782";
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "646480" + "'", str2.equals("646480"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "646480" + "'", str3.equals("646480"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "646480" + "'", str4.equals("646480"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        java.lang.String str6 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("JPN5SY");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("563138", "765030", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.password;
        manager3.password = "7VJEIZ";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "563138" + "'", str4.equals("563138"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "765030" + "'", str5.equals("765030"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkingspace("646480", "671483");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.password;
        java.lang.String str5 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("646480");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("563138", "246527", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("NKTU5H", "419361");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("hi!", "490146", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("490146");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "CBMGZO";
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("357755");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        java.lang.String str8 = manager3.username;
        java.lang.String str9 = manager3.getUsername();
        java.lang.String str10 = manager3.getUsername();
        manager3.password = "437107";
        java.lang.Class<?> wildcardClass13 = manager3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.username;
        manager1.password = "398146";
        java.lang.String str6 = manager1.username;
        // The following exception was thrown during execution in test generation
        try {
            manager1.disableParkingspace("605247", "605247");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "378727" + "'", str2.equals("378727"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "IDPKI7" + "'", str3.equals("IDPKI7"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "IDPKI7" + "'", str6.equals("IDPKI7"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.password;
        java.lang.String str3 = manager1.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            manager1.disableParkinglot("025064");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "167068" + "'", str2.equals("167068"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "167068" + "'", str3.equals("167068"));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Models.Manager.validateUsers("246527");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        java.lang.String str8 = manager3.username;
        java.lang.String str9 = manager3.password;
        java.lang.String str10 = manager3.username;
        java.lang.String str11 = manager3.username;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("IXSY3J");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("563138", "765030", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.password;
        java.lang.String str6 = manager3.username;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "563138" + "'", str4.equals("563138"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "765030" + "'", str5.equals("765030"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "563138" + "'", str6.equals("563138"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        java.lang.String str6 = manager3.getUsername();
        java.lang.String str7 = manager3.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList8 = manager3.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.getUsername();
        manager1.password = "CBMGZO";
        manager1.username = "BUUJW8";
        manager1.password = "875011";
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "340925" + "'", str2.equals("340925"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "340925" + "'", str3.equals("340925"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AEWEB5" + "'", str4.equals("AEWEB5"));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "CBMGZO";
        java.lang.String str6 = manager3.getUsername();
        manager3.password = "392554";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        Models.Manager.validateUsers("398146");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        manager1.password = "765030";
        java.lang.String str5 = manager1.username;
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "627008" + "'", str2.equals("627008"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "F7K8XL" + "'", str5.equals("F7K8XL"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.getUsername();
        manager1.password = "CBMGZO";
        manager1.username = "BUUJW8";
        // The following exception was thrown during execution in test generation
        try {
            manager1.addParkingLot("563138");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "731763" + "'", str2.equals("731763"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "731763" + "'", str3.equals("731763"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "C6DUGQ" + "'", str4.equals("C6DUGQ"));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.password;
        java.lang.String str5 = manager1.username;
        // The following exception was thrown during execution in test generation
        try {
            manager1.enableParkingspace("K0HIAM", "CBMGZO");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "631054" + "'", str2.equals("631054"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "631054" + "'", str3.equals("631054"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "631054" + "'", str4.equals("631054"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N64EJ4" + "'", str5.equals("N64EJ4"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("563138", "765030", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "366214";
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("UA4IBM");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "563138" + "'", str4.equals("563138"));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.getUsername();
        manager3.username = "398146";
        java.lang.Class<?> wildcardClass8 = manager3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.password;
        java.lang.String str6 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("K0HIAM");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.username;
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager1.disableParkinglot("779574");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ASPQUK" + "'", str2.equals("ASPQUK"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "509384" + "'", str3.equals("509384"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ASPQUK" + "'", str4.equals("ASPQUK"));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        java.lang.String str8 = manager3.username;
        java.lang.String str9 = manager3.password;
        java.lang.String str10 = manager3.username;
        java.lang.Class<?> wildcardClass11 = manager3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("627008");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.password;
        manager1.password = "378429";
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "282497" + "'", str2.equals("282497"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "282497" + "'", str3.equals("282497"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "282497" + "'", str4.equals("282497"));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "025064", parkingProxy2);
        java.lang.String str4 = manager3.password;
        manager3.password = "IXSY3J";
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("IXSY3J");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "025064" + "'", str4.equals("025064"));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("563138", "765030", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.password;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkinglot("0T6W0V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "563138" + "'", str4.equals("563138"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "765030" + "'", str5.equals("765030"));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("392554", "146682", parkingProxy2);
        java.lang.String str4 = manager3.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("F7K8XL", "357755");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "146682" + "'", str4.equals("146682"));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        java.lang.String str6 = manager3.getUsername();
        manager3.username = "246527";
        java.lang.String str9 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("563138");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "246527" + "'", str9.equals("246527"));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        manager3.password = "";
        java.lang.String str10 = manager3.password;
        java.lang.String str11 = manager3.password;
        java.lang.String str12 = manager3.password;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkinglot("K0HIAM");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.password;
        java.lang.String str3 = manager1.password;
        java.lang.Class<?> wildcardClass4 = manager1.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "707970" + "'", str2.equals("707970"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "707970" + "'", str3.equals("707970"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        // The following exception was thrown during execution in test generation
        try {
            manager1.enableParkinglot("898509");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("437107", "0T6W0V", parkingProxy2);
        java.lang.String str4 = manager3.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "437107" + "'", str4.equals("437107"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("hi!", "025064", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkinglot("LKAY89");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "940067", parkingProxy2);
        java.lang.String str4 = manager3.password;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "940067" + "'", str4.equals("940067"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.password;
        manager3.username = "419361";
        java.lang.String str8 = manager3.getPassword();
        java.lang.String str9 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList10 = manager3.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "419361" + "'", str9.equals("419361"));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("563138", "765030", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList4 = manager3.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        Models.Manager.validateUsers("437107");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("LKAY89", "HDEUYF", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkinglot("366214");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("587006", "357755", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList4 = manager3.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        java.lang.String str8 = manager3.username;
        java.lang.String str9 = manager3.getUsername();
        java.lang.String str10 = manager3.getUsername();
        manager3.password = "437107";
        java.lang.String str13 = manager3.password;
        java.lang.String str14 = manager3.username;
        java.lang.Class<?> wildcardClass15 = manager3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "437107" + "'", str13.equals("437107"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkinglot("826901");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        java.lang.String str6 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("940067");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        manager3.password = "";
        java.lang.String str10 = manager3.password;
        java.lang.String str11 = manager3.password;
        java.lang.String str12 = manager3.password;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkinglot("940067");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.password;
        manager3.username = "671483";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        java.lang.String str6 = manager3.getUsername();
        manager3.username = "246527";
        java.lang.String str9 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("UA4IBM");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "246527" + "'", str9.equals("246527"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("025064", "246527", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("587006");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.password;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        java.lang.String str8 = manager3.username;
        java.lang.String str9 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkingspace("YT9ROM", "29QG3X");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("897782", "627008", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("IXSY3J");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("563138", "765030", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "671483";
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("671483");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "563138" + "'", str4.equals("563138"));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.password;
        java.lang.String str6 = manager3.username;
        java.lang.String str7 = manager3.username;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        manager3.password = "";
        java.lang.String str10 = manager3.password;
        java.lang.String str11 = manager3.password;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkingspace("340925", "830183");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("NQB3QO", "901519", parkingProxy2);
        java.lang.String str4 = manager3.getPassword();
        java.lang.String str5 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkingspace("646480", "K0HIAM");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "901519" + "'", str4.equals("901519"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "NQB3QO" + "'", str5.equals("NQB3QO"));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("563138", "765030", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "671483";
        java.lang.String str7 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("IXSY3J", "419361");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "563138" + "'", str4.equals("563138"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "671483" + "'", str7.equals("671483"));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.password;
        java.lang.String str5 = manager3.getUsername();
        manager3.password = "707970";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        Models.Manager.validateUsers("NQB3QO");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("YT9ROM", "CBMGZO", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("AEWEB5", "BUUJW8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        java.lang.String str6 = manager3.getUsername();
        manager3.username = "K0HIAM";
        java.lang.String str9 = manager3.username;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "K0HIAM" + "'", str9.equals("K0HIAM"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.password;
        java.lang.String str5 = manager3.getUsername();
        manager3.password = "F7K8XL";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "025064", parkingProxy2);
        java.lang.String str4 = manager3.password;
        manager3.password = "IXSY3J";
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("K0HIAM");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "025064" + "'", str4.equals("025064"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.username;
        java.lang.String str3 = manager1.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            manager1.enableParkingspace("K0HIAM", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "FK1NSB" + "'", str2.equals("FK1NSB"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "839040" + "'", str3.equals("839040"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.password;
        // The following exception was thrown during execution in test generation
        try {
            manager1.disableParkingspace("282497", "901519");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "714634" + "'", str2.equals("714634"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "714634" + "'", str3.equals("714634"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "714634" + "'", str4.equals("714634"));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("563138", "765030", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "671483";
        java.lang.String str7 = manager3.username;
        manager3.username = "LKAY89";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "563138" + "'", str4.equals("563138"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "671483" + "'", str7.equals("671483"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.username;
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.getUsername();
        manager1.password = "JPN5SY";
        // The following exception was thrown during execution in test generation
        try {
            manager1.removeParkingLot("HDEUYF");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "NBYBXG" + "'", str2.equals("NBYBXG"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "014330" + "'", str3.equals("014330"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "NBYBXG" + "'", str4.equals("NBYBXG"));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "CBMGZO";
        manager3.username = "699781";
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("366214");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.getUsername();
        manager3.username = "398146";
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("7VJEIZ", "BUUJW8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        Models.Manager.validateUsers("K0HIAM");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        java.lang.String str6 = manager3.getUsername();
        manager3.username = "LKAY89";
        java.lang.String str9 = manager3.password;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkinglot("FGV09M");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("374594", "211087", parkingProxy2);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        java.lang.String str8 = manager3.getPassword();
        java.lang.String str9 = manager3.getPassword();
        java.lang.String str10 = manager3.getPassword();
        java.lang.String str11 = manager3.password;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        java.lang.String str6 = manager3.getUsername();
        manager3.username = "LKAY89";
        java.lang.String str9 = manager3.getUsername();
        java.lang.String str10 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList11 = manager3.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "LKAY89" + "'", str9.equals("LKAY89"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "LKAY89" + "'", str10.equals("LKAY89"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        java.lang.String str6 = manager3.getUsername();
        manager3.username = "LKAY89";
        java.lang.String str9 = manager3.password;
        java.lang.Class<?> wildcardClass10 = manager3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        java.lang.String str8 = manager3.username;
        java.lang.String str9 = manager3.getUsername();
        java.lang.String str10 = manager3.getUsername();
        manager3.password = "437107";
        java.lang.String str13 = manager3.password;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList14 = manager3.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "437107" + "'", str13.equals("437107"));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.password;
        java.lang.String str3 = manager1.password;
        java.lang.String str4 = manager1.password;
        java.lang.String str5 = manager1.getPassword();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "809261" + "'", str2.equals("809261"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "809261" + "'", str3.equals("809261"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "809261" + "'", str4.equals("809261"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "809261" + "'", str5.equals("809261"));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.password;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList5 = manager1.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "650730" + "'", str2.equals("650730"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "650730" + "'", str3.equals("650730"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "650730" + "'", str4.equals("650730"));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Models.Manager.validateUsers("699781");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        manager1.password = "765030";
        java.lang.Class<?> wildcardClass5 = manager1.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "001697" + "'", str2.equals("001697"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        Models.Manager.validateUsers("YT9ROM");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        java.lang.String str8 = manager3.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("671483");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("7VJEIZ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        java.lang.String str6 = manager3.getUsername();
        manager3.username = "246527";
        java.lang.String str9 = manager3.password;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("357755");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("671483", "437107", parkingProxy2);
        java.lang.String str4 = manager3.getUsername();
        java.lang.String str5 = manager3.password;
        java.lang.String str6 = manager3.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "671483" + "'", str4.equals("671483"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "437107" + "'", str5.equals("437107"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "671483" + "'", str6.equals("671483"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("146682");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("LKAY89", "HDEUYF", parkingProxy2);
        java.lang.String str4 = manager3.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "LKAY89" + "'", str4.equals("LKAY89"));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        java.lang.String str8 = manager3.getPassword();
        java.lang.String str9 = manager3.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("7VJEIZ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        java.lang.String str6 = manager3.username;
        java.lang.String str7 = manager3.password;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.password;
        java.lang.String str5 = manager1.username;
        // The following exception was thrown during execution in test generation
        try {
            manager1.removeParkingLot("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "318871" + "'", str2.equals("318871"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "318871" + "'", str3.equals("318871"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "318871" + "'", str4.equals("318871"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2JU88Y" + "'", str5.equals("2JU88Y"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("LKAY89", "HDEUYF", parkingProxy2);
        java.lang.String str4 = manager3.username;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "LKAY89" + "'", str4.equals("LKAY89"));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.username;
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.getUsername();
        java.lang.Class<?> wildcardClass5 = manager1.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "008GPG" + "'", str2.equals("008GPG"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "445059" + "'", str3.equals("445059"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "008GPG" + "'", str4.equals("008GPG"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.username;
        java.lang.String str3 = manager1.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager1.addParkingLot("246527");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "YJ23U6" + "'", str2.equals("YJ23U6"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "YJ23U6" + "'", str3.equals("YJ23U6"));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("CBMGZO", "", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkinglot("001697");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.getUsername();
        java.lang.String str6 = manager3.getUsername();
        java.lang.String str7 = manager3.getUsername();
        java.lang.String str8 = manager3.username;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        java.lang.String str8 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("29QG3X");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        java.lang.String str8 = manager3.username;
        java.lang.String str9 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("CBMGZO");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        java.lang.String str6 = manager3.getUsername();
        java.lang.String str7 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("", "0T6W0V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("392554", "146682", parkingProxy2);
        java.lang.String str4 = manager3.getPassword();
        java.lang.Class<?> wildcardClass5 = manager3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "146682" + "'", str4.equals("146682"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        manager3.username = "378429";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        Models.Manager.validateUsers("BUUJW8");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.username;
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.getUsername();
        manager1.password = "JPN5SY";
        java.lang.String str7 = manager1.getPassword();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1M8HVK" + "'", str2.equals("1M8HVK"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "563704" + "'", str3.equals("563704"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1M8HVK" + "'", str4.equals("1M8HVK"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "JPN5SY" + "'", str7.equals("JPN5SY"));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("563138", "765030", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.password;
        manager3.password = "146682";
        manager3.password = "875011";
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList10 = manager3.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "563138" + "'", str4.equals("563138"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "765030" + "'", str5.equals("765030"));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("563138", "765030", parkingProxy2);
        java.lang.String str4 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkinglot("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "563138" + "'", str4.equals("563138"));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("587006", "378429", parkingProxy2);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.password;
        java.lang.String str3 = manager1.password;
        java.lang.String str4 = manager1.password;
        manager1.username = "211087";
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList7 = manager1.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "411597" + "'", str2.equals("411597"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "411597" + "'", str3.equals("411597"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "411597" + "'", str4.equals("411597"));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("419361", "897782", parkingProxy2);
        java.lang.String str4 = manager3.password;
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("437107");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "897782" + "'", str4.equals("897782"));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        manager1.password = "";
        java.lang.String str4 = manager1.getPassword();
        java.lang.String str5 = manager1.username;
        java.lang.String str6 = manager1.password;
        // The following exception was thrown during execution in test generation
        try {
            manager1.disableParkingspace("", "699781");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "XT3E9C" + "'", str5.equals("XT3E9C"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        Models.Manager.validateUsers("LKAY89");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("F7K8XL", "FGV09M", parkingProxy2);
        manager3.username = "EENS1R";
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.username;
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.getUsername();
        java.lang.String str5 = manager1.password;
        // The following exception was thrown during execution in test generation
        try {
            manager1.removeParkingLot("146682");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "X71O1T" + "'", str2.equals("X71O1T"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "752255" + "'", str3.equals("752255"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "X71O1T" + "'", str4.equals("X71O1T"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "752255" + "'", str5.equals("752255"));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("671483", "437107", parkingProxy2);
        java.lang.String str4 = manager3.getUsername();
        manager3.username = "940067";
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("NKTU5H");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "671483" + "'", str4.equals("671483"));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList4 = manager1.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "057612" + "'", str2.equals("057612"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "057612" + "'", str3.equals("057612"));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        manager3.password = "";
        java.lang.String str10 = manager3.password;
        manager3.password = "392554";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        java.lang.String str6 = manager3.username;
        java.lang.String str7 = manager3.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        java.lang.String str6 = manager3.getUsername();
        manager3.username = "LKAY89";
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("357755");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.password;
        manager3.username = "419361";
        java.lang.String str8 = manager3.getPassword();
        manager3.username = "4M22XP";
        java.lang.Class<?> wildcardClass11 = manager3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("563138", "765030", parkingProxy2);
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("707970");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("025064", "246527", parkingProxy2);
        manager3.username = "BUUJW8";
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager1.enableParkingspace("", "378429");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "471797" + "'", str2.equals("471797"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "471797" + "'", str3.equals("471797"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "QGHQHW" + "'", str4.equals("QGHQHW"));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.password;
        java.lang.String str3 = manager1.username;
        // The following exception was thrown during execution in test generation
        try {
            manager1.disableParkingspace("707970", "YT9ROM");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "016201" + "'", str2.equals("016201"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "43T6G6" + "'", str3.equals("43T6G6"));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.password;
        java.lang.String str6 = manager3.username;
        java.lang.String str7 = manager3.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        java.lang.String str6 = manager3.getUsername();
        manager3.username = "LKAY89";
        java.lang.String str9 = manager3.getUsername();
        java.lang.String str10 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkingspace("646480", "LKAY89");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "LKAY89" + "'", str9.equals("LKAY89"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "LKAY89" + "'", str10.equals("LKAY89"));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.password;
        java.lang.String str5 = manager1.username;
        java.lang.Class<?> wildcardClass6 = manager1.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "637286" + "'", str2.equals("637286"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "637286" + "'", str3.equals("637286"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "637286" + "'", str4.equals("637286"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OL43JW" + "'", str5.equals("OL43JW"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("671483", "437107", parkingProxy2);
        java.lang.String str4 = manager3.getUsername();
        java.lang.String str5 = manager3.password;
        manager3.password = "374895";
        java.lang.Class<?> wildcardClass8 = manager3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "671483" + "'", str4.equals("671483"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "437107" + "'", str5.equals("437107"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("NQB3QO", "901519", parkingProxy2);
        java.lang.String str4 = manager3.getPassword();
        java.lang.String str5 = manager3.getUsername();
        java.lang.String str6 = manager3.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "901519" + "'", str4.equals("901519"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "NQB3QO" + "'", str5.equals("NQB3QO"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "901519" + "'", str6.equals("901519"));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.password;
        java.lang.String str3 = manager1.password;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList4 = manager1.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "944850" + "'", str2.equals("944850"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "944850" + "'", str3.equals("944850"));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.password;
        manager3.username = "419361";
        java.lang.String str8 = manager3.getPassword();
        java.lang.String str9 = manager3.username;
        java.lang.String str10 = manager3.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "419361" + "'", str9.equals("419361"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "419361" + "'", str10.equals("419361"));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.password;
        java.lang.String str5 = manager3.getUsername();
        manager3.username = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList8 = manager3.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.password;
        manager3.username = "419361";
        manager3.password = "830183";
        java.lang.String str10 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Models.ParkingLot> parkingLotList11 = manager3.getParkingLot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.getParkingLots()\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "419361" + "'", str10.equals("419361"));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        manager1.password = "";
        java.lang.String str4 = manager1.getPassword();
        manager1.username = "HDEUYF";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        java.lang.String str8 = manager3.getPassword();
        java.lang.String str9 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("5D9D7L", "JIAKCH");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.getPassword();
        java.lang.String str5 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkinglot("901519");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.password;
        java.lang.String str5 = manager1.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            manager1.enableParkingspace("627008", "282497");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "728821" + "'", str2.equals("728821"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "728821" + "'", str3.equals("728821"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "728821" + "'", str4.equals("728821"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "728821" + "'", str5.equals("728821"));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        java.lang.String str8 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkingspace("445059", "374594");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager1.enableParkingspace("897782", "0T6W0V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "555585" + "'", str2.equals("555585"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "555585" + "'", str3.equals("555585"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A85EQ7" + "'", str4.equals("A85EQ7"));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("NQB3QO", "901519", parkingProxy2);
        manager3.password = "940067";
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("563138");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("671483", "437107", parkingProxy2);
        java.lang.String str4 = manager3.getUsername();
        java.lang.String str5 = manager3.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "671483" + "'", str4.equals("671483"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "671483" + "'", str5.equals("671483"));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        manager1.password = "";
        java.lang.String str4 = manager1.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            manager1.addParkingLot("940067");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("F7K8XL", "FGV09M", parkingProxy2);
        java.lang.Class<?> wildcardClass4 = manager3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("340925", "IXSY3J", parkingProxy2);
        manager3.username = "779574";
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        Models.Manager.validateUsers("587006");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("563138", "765030", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "366214";
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkingspace("UA4IBM", "809261");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "563138" + "'", str4.equals("563138"));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        manager3.password = "";
        java.lang.String str10 = manager3.getUsername();
        java.lang.String str11 = manager3.username;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        manager1.password = "";
        java.lang.String str4 = manager1.getPassword();
        java.lang.String str5 = manager1.username;
        // The following exception was thrown during execution in test generation
        try {
            manager1.enableParkingspace("587006", "445059");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "EIY3W6" + "'", str5.equals("EIY3W6"));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        manager3.password = "";
        manager3.username = "490146";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        java.lang.String str8 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("563138");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.password;
        java.lang.String str5 = manager1.username;
        // The following exception was thrown during execution in test generation
        try {
            manager1.addParkingLot("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "034299" + "'", str2.equals("034299"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "034299" + "'", str3.equals("034299"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "034299" + "'", str4.equals("034299"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "X13FIY" + "'", str5.equals("X13FIY"));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.getPassword();
        java.lang.String str5 = manager3.getUsername();
        java.lang.String str6 = manager3.username;
        java.lang.String str7 = manager3.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.getPassword();
        java.lang.String str5 = manager3.getUsername();
        manager3.username = "8XXQYG";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("563138", "765030", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "671483";
        java.lang.String str7 = manager3.username;
        java.lang.String str8 = manager3.getPassword();
        java.lang.Class<?> wildcardClass9 = manager3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "563138" + "'", str4.equals("563138"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "671483" + "'", str7.equals("671483"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "765030" + "'", str8.equals("765030"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.getPassword();
        manager3.password = "826901";
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkingspace("29QG3X", "AEWEB5");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("490146");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.password;
        manager3.username = "419361";
        java.lang.String str8 = manager3.getPassword();
        manager3.password = "AEWEB5";
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkingspace("437107", "NQB3QO");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("282497", "340925", parkingProxy2);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.getUsername();
        manager1.password = "CBMGZO";
        // The following exception was thrown during execution in test generation
        try {
            manager1.removeParkingLot("LKAY89");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "947001" + "'", str2.equals("947001"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "947001" + "'", str3.equals("947001"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "46B9PX" + "'", str4.equals("46B9PX"));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.password;
        java.lang.String str5 = manager3.username;
        manager3.password = "211087";
        java.lang.String str8 = manager3.password;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "211087" + "'", str8.equals("211087"));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.password;
        java.lang.String str5 = manager3.getUsername();
        manager3.username = "hi!";
        java.lang.String str8 = manager3.getPassword();
        manager3.password = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("875011");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        java.lang.String str8 = manager3.username;
        java.lang.String str9 = manager3.getUsername();
        java.lang.String str10 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkinglot("563704");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        java.lang.String str6 = manager3.getUsername();
        manager3.username = "246527";
        java.lang.String str9 = manager3.username;
        java.lang.String str10 = manager3.password;
        java.lang.String str11 = manager3.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "246527" + "'", str9.equals("246527"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "246527" + "'", str11.equals("246527"));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("671483", "437107", parkingProxy2);
        java.lang.String str4 = manager3.getUsername();
        java.lang.String str5 = manager3.password;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("282497");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "671483" + "'", str4.equals("671483"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "437107" + "'", str5.equals("437107"));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkinglot("374895");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        manager3.password = "";
        java.lang.String str10 = manager3.password;
        manager3.username = "K0HIAM";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        manager3.password = "";
        manager3.username = "699781";
        java.lang.String str12 = manager3.password;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.getPassword();
        java.lang.String str4 = manager1.getUsername();
        manager1.password = "CBMGZO";
        manager1.username = "BUUJW8";
        java.lang.String str9 = manager1.password;
        java.lang.String str10 = manager1.username;
        // The following exception was thrown during execution in test generation
        try {
            manager1.enableParkingspace("699781", "001697");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "896857" + "'", str2.equals("896857"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "896857" + "'", str3.equals("896857"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "3BGL3J" + "'", str4.equals("3BGL3J"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "CBMGZO" + "'", str9.equals("CBMGZO"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "BUUJW8" + "'", str10.equals("BUUJW8"));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        DesignPatterns.ParkingProxy parkingProxy0 = null;
        Models.Manager manager1 = new Models.Manager(parkingProxy0);
        java.lang.String str2 = manager1.getPassword();
        java.lang.String str3 = manager1.username;
        java.lang.String str4 = manager1.username;
        manager1.username = "646480";
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "952361" + "'", str2.equals("952361"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "NCLOHY" + "'", str3.equals("NCLOHY"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "NCLOHY" + "'", str4.equals("NCLOHY"));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("830183", "699781", parkingProxy2);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("635600", "", parkingProxy2);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        Models.Manager.validateUsers("563704");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("897782", "366214", parkingProxy2);
        java.lang.String str4 = manager3.username;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "897782" + "'", str4.equals("897782"));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("CBMGZO", "", parkingProxy2);
        java.lang.String str4 = manager3.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        java.lang.String str6 = manager3.getUsername();
        java.lang.String str7 = manager3.getUsername();
        java.lang.String str8 = manager3.getPassword();
        manager3.username = "4M22XP";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("OL43JW", "LSPD31", parkingProxy2);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        java.lang.String str8 = manager3.getPassword();
        java.lang.String str9 = manager3.getUsername();
        java.lang.String str10 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkingspace("HDEUYF", "7VJEIZ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingSpace(String, String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("563138", "765030", parkingProxy2);
        java.lang.String str4 = manager3.username;
        java.lang.String str5 = manager3.password;
        java.lang.String str6 = manager3.password;
        // The following exception was thrown during execution in test generation
        try {
            manager3.addParkingLot("EENS1R");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.addParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "563138" + "'", str4.equals("563138"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "765030" + "'", str5.equals("765030"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "765030" + "'", str6.equals("765030"));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.password = "JIAKCH";
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableParkinglot("563138");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        manager3.password = "hi!";
        manager3.password = "hi!";
        java.lang.String str8 = manager3.username;
        java.lang.String str9 = manager3.getUsername();
        java.lang.String str10 = manager3.getUsername();
        manager3.password = "437107";
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableParkinglot("252721");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.toggleParkingLot(String, boolean)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("YT9ROM", "CBMGZO", parkingProxy2);
        java.lang.String str4 = manager3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            manager3.removeParkingLot("378429");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.ParkingProxy.removeParkingLot(String)\" because \"this.access\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "YT9ROM" + "'", str4.equals("YT9ROM"));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("0T6W0V", "1M8HVK", parkingProxy2);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        DesignPatterns.ParkingProxy parkingProxy2 = null;
        Models.Manager manager3 = new Models.Manager("", "hi!", parkingProxy2);
        java.lang.String str4 = manager3.username;
        manager3.username = "";
        java.lang.String str7 = manager3.username;
        manager3.password = "LKAY89";
        java.lang.String str10 = manager3.password;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "LKAY89" + "'", str10.equals("LKAY89"));
    }
}

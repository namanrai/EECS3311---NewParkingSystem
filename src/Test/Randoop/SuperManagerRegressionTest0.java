import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SuperManagerRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        Models.Manager.validateUsers("hi!");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.Class<?> wildcardClass3 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        superManager0.disableParkingspace("hi!", "");
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Models.Manager.validateUsers("857812");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Models.Manager.validateUsers("2B33UR");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(true);
        Models.Manager manager4 = superManager0.createManagerAccount(true);
        java.lang.Class<?> wildcardClass5 = manager4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        java.lang.String str4 = manager2.getUsername();
        java.lang.Class<?> wildcardClass5 = manager2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MO5W0Y" + "'", str4.equals("MO5W0Y"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(true);
        Models.Manager manager4 = superManager0.createManagerAccount(true);
        java.util.List<Models.ParkingLot> parkingLotList5 = superManager0.getParkingLot();
        java.lang.Class<?> wildcardClass6 = parkingLotList5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        manager2.disableParkinglot("admin");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Models.Manager.validateUsers("");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.Class<?> wildcardClass1 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Models.Manager.validateUsers("1769X8");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.disableParkinglot("873077");
        superManager0.disableParkingspace("", "873077");
        superManager0.disableParkingspace("admin", "873077");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        manager2.addParkingLot("");
        java.lang.String str5 = manager2.getPassword();
        manager2.enableParkingspace("857812", "J1NO4Q");
        java.lang.Class<?> wildcardClass9 = manager2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "152765" + "'", str5.equals("152765"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(true);
        Models.Manager manager4 = superManager0.createManagerAccount(true);
        java.util.List<Models.ParkingLot> parkingLotList5 = manager4.getParkingLot();
        manager4.disableParkingspace("", "EB8CHO");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.enableParkinglot("hi!");
        superManager0.addParkingLot("admin");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        superManager0.disableParkinglot("2B33UR");
        superManager0.disableParkinglot("2B33UR");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        manager2.addParkingLot("857812");
        manager2.disableParkingspace("admin", "873077");
        java.lang.String str9 = manager2.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str9 + "' != '" + "538978" + "'", str9.equals("538978"));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.disableParkinglot("873077");
        java.util.List<Models.ParkingLot> parkingLotList3 = superManager0.getParkingLot();
        java.lang.Class<?> wildcardClass4 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Models.Manager.validateUsers("844348");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        java.lang.String str4 = manager2.getUsername();
        java.lang.String str5 = manager2.getUsername();
        manager2.disableParkingspace("1769X8", "J1NO4Q");
        manager2.enableParkinglot("MO5W0Y");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "39VGPS" + "'", str4.equals("39VGPS"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "39VGPS" + "'", str5.equals("39VGPS"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        java.lang.String str8 = superManager0.getUsername();
        java.lang.String str9 = superManager0.getUsername();
        superManager0.enableParkinglot("5H42J6");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "admin" + "'", str8.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "admin" + "'", str9.equals("admin"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Models.Manager.validateUsers("944950");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        java.lang.String str8 = superManager0.getUsername();
        java.util.List<Models.ParkingLot> parkingLotList9 = superManager0.getParkingLot();
        java.lang.String str10 = superManager0.getUsername();
        java.util.List<Models.ParkingLot> parkingLotList11 = superManager0.getParkingLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "admin" + "'", str8.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "admin" + "'", str10.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList3 = superManager0.getParkingLot();
        java.lang.String str4 = superManager0.getUsername();
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "admin" + "'", str4.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.disableParkinglot("873077");
        java.util.List<Models.ParkingLot> parkingLotList3 = superManager0.getParkingLot();
        java.util.List<Models.ParkingLot> parkingLotList4 = superManager0.getParkingLot();
        java.lang.String str5 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "admin" + "'", str5.equals("admin"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList3 = superManager0.getParkingLot();
        java.lang.String str4 = superManager0.getPassword();
        superManager0.enableParkingspace("844348", "944950");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "admin" + "'", str4.equals("admin"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Models.Manager.validateUsers("J1NO4Q");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = manager2.getPassword();
        manager2.enableParkinglot("admin");
        manager2.enableParkingspace("842669", "EB8CHO");
        manager2.enableParkingspace("EB8CHO", "admin");
        java.lang.Class<?> wildcardClass12 = manager2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "426858" + "'", str3.equals("426858"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        manager3.addParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList6 = manager3.getParkingLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Models.Manager.validateUsers("842669");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        manager2.addParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList5 = manager2.getParkingLot();
        java.lang.Class<?> wildcardClass6 = parkingLotList5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = superManager0.getUsername();
        superManager0.disableParkingspace("", "944950");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "admin" + "'", str3.equals("admin"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        manager2.addParkingLot("857812");
        manager2.disableParkingspace("admin", "873077");
        manager2.removeParkingLot("2B33UR");
        manager2.addParkingLot("MO5W0Y");
        manager2.removeParkingLot("944950");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Models.Manager.validateUsers("BQUPQV");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.disableParkingspace("", "YY0YPG");
        superManager0.disableParkingspace("MO5W0Y", "656668");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.removeParkingLot("MO5W0Y");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.disableParkingspace("", "YY0YPG");
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        manager2.addParkingLot("");
        manager2.addParkingLot("656668");
        java.lang.String str7 = manager2.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1S76AX" + "'", str7.equals("1S76AX"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = superManager0.getPassword();
        java.util.List<Models.ParkingLot> parkingLotList4 = superManager0.getParkingLot();
        superManager0.addParkingLot("9R1M13");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "admin" + "'", str3.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = superManager0.getUsername();
        java.lang.Class<?> wildcardClass4 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "admin" + "'", str3.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = superManager0.getPassword();
        Models.Manager manager5 = superManager0.createManagerAccount(false);
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "admin" + "'", str3.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        manager2.addParkingLot("");
        java.lang.String str5 = manager2.getPassword();
        manager2.enableParkingspace("857812", "J1NO4Q");
        manager2.disableParkinglot("hi!");
        manager2.removeParkingLot("39VGPS");
        java.lang.String str13 = manager2.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "156178" + "'", str5.equals("156178"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str13 + "' != '" + "156178" + "'", str13.equals("156178"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        java.lang.String str4 = manager2.getUsername();
        java.lang.String str5 = manager2.getUsername();
        manager2.disableParkinglot("1769X8");
        java.util.List<Models.ParkingLot> parkingLotList8 = manager2.getParkingLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "SGNFEH" + "'", str4.equals("SGNFEH"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "SGNFEH" + "'", str5.equals("SGNFEH"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Models.Manager.validateUsers("9VSOU0");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Models.Manager.validateUsers("156178");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Models.Manager.validateUsers("MTWSWI");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.disableParkingspace("", "hi!");
        java.lang.String str5 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "admin" + "'", str5.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        manager2.addParkingLot("857812");
        manager2.disableParkingspace("admin", "873077");
        java.util.List<Models.ParkingLot> parkingLotList9 = manager2.getParkingLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getPassword();
        superManager0.enableParkinglot("025065");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        java.lang.String str4 = superManager0.getPassword();
        superManager0.enableParkinglot("BQUPQV");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "admin" + "'", str4.equals("admin"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        java.lang.String str4 = superManager0.getPassword();
        superManager0.removeParkingLot("1S76AX");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "admin" + "'", str4.equals("admin"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Models.Manager.validateUsers("5H42J6");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.disableParkingspace("", "hi!");
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "admin" + "'", str5.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "admin" + "'", str6.equals("admin"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        manager2.addParkingLot("857812");
        manager2.disableParkingspace("admin", "873077");
        manager2.removeParkingLot("2B33UR");
        manager2.addParkingLot("MO5W0Y");
        java.lang.Class<?> wildcardClass13 = manager2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        java.lang.String str4 = manager2.getUsername();
        java.lang.String str5 = manager2.getUsername();
        java.lang.String str6 = manager2.getPassword();
        manager2.disableParkinglot("842669");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "NFPS06" + "'", str4.equals("NFPS06"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "NFPS06" + "'", str5.equals("NFPS06"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "300659" + "'", str6.equals("300659"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.disableParkinglot("873077");
        superManager0.disableParkingspace("", "873077");
        superManager0.enableParkingspace("656668", "873077");
        Models.Manager manager10 = superManager0.createManagerAccount(false);
        superManager0.addParkingLot("TZXI4C");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager10);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        manager2.addParkingLot("857812");
        manager2.disableParkingspace("admin", "873077");
        manager2.removeParkingLot("2B33UR");
        java.util.List<Models.ParkingLot> parkingLotList11 = manager2.getParkingLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList11);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        java.lang.String str4 = manager2.getUsername();
        java.lang.String str5 = manager2.getUsername();
        manager2.disableParkinglot("1769X8");
        manager2.enableParkinglot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MOQEGU" + "'", str4.equals("MOQEGU"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "MOQEGU" + "'", str5.equals("MOQEGU"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        superManager0.disableParkingspace("hi!", "YY0YPG");
        java.util.List<Models.ParkingLot> parkingLotList6 = superManager0.getParkingLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        java.lang.String str8 = superManager0.getUsername();
        java.util.List<Models.ParkingLot> parkingLotList9 = superManager0.getParkingLot();
        java.lang.String str10 = superManager0.getUsername();
        superManager0.removeParkingLot("");
        superManager0.disableParkingspace("300659", "U6U9JS");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "admin" + "'", str8.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "admin" + "'", str10.equals("admin"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        Models.Manager manager9 = superManager0.createManagerAccount(false);
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = manager2.getPassword();
        manager2.enableParkinglot("admin");
        manager2.enableParkingspace("842669", "EB8CHO");
        manager2.enableParkingspace("EB8CHO", "admin");
        java.util.List<Models.ParkingLot> parkingLotList12 = manager2.getParkingLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "833734" + "'", str3.equals("833734"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        manager2.addParkingLot("857812");
        manager2.disableParkinglot("1769X8");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Models.Manager.validateUsers("SGNFEH");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        java.lang.String str8 = superManager0.getUsername();
        java.util.List<Models.ParkingLot> parkingLotList9 = superManager0.getParkingLot();
        superManager0.enableParkingspace("5H42J6", "TZXI4C");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "admin" + "'", str8.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        superManager0.enableParkingspace("152765", "BQUPQV");
        superManager0.disableParkingspace("426858", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.disableParkinglot("873077");
        superManager0.disableParkingspace("", "873077");
        superManager0.enableParkingspace("656668", "873077");
        superManager0.disableParkingspace("2B33UR", "admin");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Models.Manager.validateUsers("MO5W0Y");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        Models.Manager manager4 = superManager0.createManagerAccount(true);
        java.lang.String str5 = superManager0.getPassword();
        superManager0.enableParkinglot("SGNFEH");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "admin" + "'", str5.equals("admin"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Models.Manager.validateUsers("564097");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = superManager0.getUsername();
        Models.Manager manager5 = superManager0.createManagerAccount(false);
        Models.Manager manager7 = superManager0.createManagerAccount(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "admin" + "'", str3.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        Models.Manager manager4 = superManager0.createManagerAccount(true);
        superManager0.enableParkingspace("4QAQ2K", "857812");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        manager2.addParkingLot("857812");
        manager2.disableParkingspace("admin", "873077");
        manager2.removeParkingLot("2B33UR");
        manager2.addParkingLot("MO5W0Y");
        manager2.enableParkinglot("MO5W0Y");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        manager2.addParkingLot("857812");
        manager2.disableParkinglot("873077");
        manager2.removeParkingLot("");
        manager2.removeParkingLot("656668");
        java.util.List<Models.ParkingLot> parkingLotList12 = manager2.getParkingLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        java.lang.String str4 = manager2.getUsername();
        java.lang.String str5 = manager2.getUsername();
        manager2.disableParkingspace("1769X8", "J1NO4Q");
        manager2.disableParkingspace("9R1M13", "944950");
        java.lang.String str12 = manager2.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "F2ZKDR" + "'", str4.equals("F2ZKDR"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "F2ZKDR" + "'", str5.equals("F2ZKDR"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str12 + "' != '" + "971845" + "'", str12.equals("971845"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        Models.Manager manager4 = superManager0.createManagerAccount(true);
        java.lang.String str5 = superManager0.getPassword();
        superManager0.removeParkingLot("EB8CHO");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "admin" + "'", str5.equals("admin"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        java.lang.String str4 = manager2.getUsername();
        java.lang.String str5 = manager2.getUsername();
        manager2.disableParkinglot("1769X8");
        manager2.addParkingLot("538978");
        manager2.removeParkingLot("873077");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "R2D5F7" + "'", str4.equals("R2D5F7"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "R2D5F7" + "'", str5.equals("R2D5F7"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        Models.Manager.validateUsers("XB3BM1");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = manager2.getPassword();
        manager2.enableParkinglot("admin");
        manager2.enableParkinglot("1S76AX");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "775696" + "'", str3.equals("775696"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        Models.Manager manager4 = superManager0.createManagerAccount(true);
        superManager0.disableParkinglot("SGNFEH");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        java.lang.String str4 = manager2.getUsername();
        java.lang.String str5 = manager2.getUsername();
        java.lang.String str6 = manager2.getPassword();
        java.lang.String str7 = manager2.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4ID6KC" + "'", str4.equals("4ID6KC"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4ID6KC" + "'", str5.equals("4ID6KC"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "253059" + "'", str6.equals("253059"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str7 + "' != '" + "4ID6KC" + "'", str7.equals("4ID6KC"));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = superManager0.getUsername();
        Models.Manager manager5 = superManager0.createManagerAccount(true);
        superManager0.disableParkinglot("538978");
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "admin" + "'", str3.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(true);
        Models.Manager manager4 = superManager0.createManagerAccount(true);
        manager4.enableParkinglot("857812");
        manager4.removeParkingLot("4QAQ2K");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = manager2.getPassword();
        manager2.enableParkinglot("admin");
        manager2.enableParkingspace("842669", "EB8CHO");
        manager2.enableParkingspace("EB8CHO", "admin");
        manager2.disableParkinglot("844348");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "359978" + "'", str3.equals("359978"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        manager2.disableParkingspace("857866", "842669");
        manager2.disableParkingspace("XB3BM1", "844348");
        manager2.enableParkinglot("BQUPQV");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        manager2.addParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList5 = manager2.getParkingLot();
        manager2.addParkingLot("971845");
        java.lang.Class<?> wildcardClass8 = manager2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        manager2.addParkingLot("857812");
        manager2.disableParkinglot("873077");
        manager2.removeParkingLot("");
        manager2.removeParkingLot("656668");
        manager2.disableParkingspace("XB3BM1", "842669");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.addParkingLot("MO5W0Y");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Models.Manager.validateUsers("MOQEGU");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        manager2.addParkingLot("857812");
        manager2.disableParkingspace("admin", "873077");
        manager2.removeParkingLot("2B33UR");
        manager2.disableParkingspace("5H42J6", "857812");
        java.lang.String str14 = manager2.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str14 + "' != '" + "396272" + "'", str14.equals("396272"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Models.Manager.validateUsers("EB8CHO");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(true);
        superManager0.enableParkinglot("842669");
        superManager0.disableParkinglot("MTWSWI");
        superManager0.enableParkinglot("BQUPQV");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        manager2.addParkingLot("");
        java.lang.String str5 = manager2.getPassword();
        manager2.enableParkingspace("857812", "J1NO4Q");
        manager2.disableParkinglot("hi!");
        manager2.enableParkinglot("BQUPQV");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "570326" + "'", str5.equals("570326"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = superManager0.getPassword();
        java.util.List<Models.ParkingLot> parkingLotList4 = superManager0.getParkingLot();
        superManager0.removeParkingLot("857866");
        superManager0.enableParkingspace("857812", "857812");
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "admin" + "'", str3.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        manager2.addParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList5 = manager2.getParkingLot();
        manager2.enableParkingspace("538978", "EB8CHO");
        java.lang.String str9 = manager2.getUsername();
        java.lang.String str10 = manager2.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str9 + "' != '" + "W2682U" + "'", str9.equals("W2682U"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str10 + "' != '" + "W2682U" + "'", str10.equals("W2682U"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        java.lang.String str4 = manager3.getPassword();
        manager3.disableParkinglot("MO5W0Y");
        manager3.enableParkinglot("971845");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "897332" + "'", str4.equals("897332"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = superManager0.getUsername();
        java.lang.String str4 = superManager0.getPassword();
        superManager0.removeParkingLot("JGR8HY");
        superManager0.enableParkingspace("923437", "4QAQ2K");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "admin" + "'", str3.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "admin" + "'", str4.equals("admin"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        java.lang.String str4 = manager2.getUsername();
        java.lang.String str5 = manager2.getUsername();
        manager2.disableParkingspace("1769X8", "J1NO4Q");
        java.lang.String str9 = manager2.getPassword();
        manager2.addParkingLot("940922");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "3O7G9U" + "'", str4.equals("3O7G9U"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "3O7G9U" + "'", str5.equals("3O7G9U"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str9 + "' != '" + "974463" + "'", str9.equals("974463"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(true);
        superManager0.enableParkinglot("842669");
        Models.Manager manager6 = superManager0.createManagerAccount(false);
        java.lang.Class<?> wildcardClass7 = manager6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        superManager0.addParkingLot("944950");
        superManager0.addParkingLot("152765");
        Models.Manager manager13 = superManager0.createManagerAccount(true);
        manager13.disableParkinglot("944950");
        manager13.disableParkingspace("5H42J6", "844348");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager13);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.disableParkingspace("", "hi!");
        java.lang.String str5 = superManager0.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "admin" + "'", str5.equals("admin"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.disableParkinglot("873077");
        Models.Manager manager4 = superManager0.createManagerAccount(false);
        superManager0.disableParkinglot("974463");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        Models.Manager manager4 = superManager0.createManagerAccount(true);
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getPassword();
        superManager0.disableParkinglot("2B33UR");
        superManager0.enableParkinglot("MO5W0Y");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "admin" + "'", str5.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "admin" + "'", str6.equals("admin"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.disableParkinglot("857866");
        java.lang.String str6 = superManager0.getPassword();
        superManager0.disableParkinglot("TZXI4C");
        java.lang.Class<?> wildcardClass9 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "admin" + "'", str6.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        manager2.addParkingLot("857812");
        manager2.disableParkingspace("admin", "873077");
        manager2.removeParkingLot("2B33UR");
        manager2.removeParkingLot("R2D5F7");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        manager3.enableParkingspace("2B33UR", "");
        manager3.enableParkinglot("897332");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = manager2.getPassword();
        manager2.enableParkinglot("admin");
        manager2.enableParkingspace("842669", "EB8CHO");
        manager2.enableParkingspace("EB8CHO", "admin");
        manager2.addParkingLot("775696");
        manager2.disableParkingspace("1S76AX", "678559");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "804830" + "'", str3.equals("804830"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        manager2.addParkingLot("857812");
        java.lang.String str6 = manager2.getUsername();
        java.lang.Class<?> wildcardClass7 = manager2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "I40XZJ" + "'", str6.equals("I40XZJ"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        Models.Manager manager4 = superManager0.createManagerAccount(true);
        java.lang.Class<?> wildcardClass5 = manager4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = manager2.getPassword();
        manager2.disableParkinglot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "309039" + "'", str3.equals("309039"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.disableParkinglot("873077");
        java.util.List<Models.ParkingLot> parkingLotList3 = superManager0.getParkingLot();
        superManager0.enableParkinglot("EB8CHO");
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(true);
        Models.Manager manager4 = superManager0.createManagerAccount(true);
        java.util.List<Models.ParkingLot> parkingLotList5 = superManager0.getParkingLot();
        java.lang.String str6 = superManager0.getUsername();
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "admin" + "'", str6.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.disableParkinglot("873077");
        java.util.List<Models.ParkingLot> parkingLotList3 = superManager0.getParkingLot();
        superManager0.disableParkingspace("MTWSWI", "236638");
        Models.Manager manager8 = superManager0.createManagerAccount(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager8);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getUsername();
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "admin" + "'", str4.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "admin" + "'", str5.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        manager2.disableParkingspace("857866", "842669");
        manager2.disableParkingspace("XB3BM1", "844348");
        java.lang.String str9 = manager2.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str9 + "' != '" + "709197" + "'", str9.equals("709197"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        manager2.disableParkingspace("857866", "842669");
        manager2.disableParkingspace("XB3BM1", "844348");
        manager2.enableParkingspace("admin", "YY0YPG");
        java.lang.Class<?> wildcardClass12 = manager2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Models.Manager.validateUsers("39VGPS");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.disableParkingspace("", "hi!");
        superManager0.enableParkinglot("857866");
        superManager0.disableParkingspace("226400", "5H42J6");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(true);
        Models.Manager manager4 = superManager0.createManagerAccount(true);
        java.util.List<Models.ParkingLot> parkingLotList5 = manager4.getParkingLot();
        java.lang.String str6 = manager4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "423141" + "'", str6.equals("423141"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.disableParkingspace("", "hi!");
        superManager0.removeParkingLot("39VGPS");
        superManager0.enableParkingspace("857812", "944950");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = manager2.getPassword();
        manager2.enableParkinglot("admin");
        manager2.disableParkinglot("");
        java.util.List<Models.ParkingLot> parkingLotList8 = manager2.getParkingLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "995574" + "'", str3.equals("995574"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        java.lang.String str4 = manager2.getUsername();
        java.lang.String str5 = manager2.getUsername();
        manager2.disableParkinglot("1769X8");
        manager2.disableParkingspace("1S76AX", "426858");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "SS5RHP" + "'", str4.equals("SS5RHP"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "SS5RHP" + "'", str5.equals("SS5RHP"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList3 = superManager0.getParkingLot();
        Models.Manager manager5 = superManager0.createManagerAccount(true);
        java.lang.String str6 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "admin" + "'", str6.equals("admin"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        superManager0.disableParkinglot("2B33UR");
        superManager0.disableParkingspace("ETITC8", "SGNFEH");
        java.lang.String str13 = superManager0.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "admin" + "'", str13.equals("admin"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        Models.Manager.validateUsers("857866");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.Class<?> wildcardClass3 = manager2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        Models.Manager.validateUsers("F2ZKDR");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.disableParkinglot("873077");
        java.util.List<Models.ParkingLot> parkingLotList3 = superManager0.getParkingLot();
        java.util.List<Models.ParkingLot> parkingLotList4 = superManager0.getParkingLot();
        Models.Manager manager6 = superManager0.createManagerAccount(true);
        superManager0.disableParkingspace("152765", "TZXI4C");
        java.lang.String str10 = superManager0.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "admin" + "'", str10.equals("admin"));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = manager2.getPassword();
        manager2.enableParkinglot("admin");
        manager2.enableParkingspace("842669", "EB8CHO");
        manager2.enableParkingspace("EB8CHO", "admin");
        manager2.addParkingLot("775696");
        java.lang.Class<?> wildcardClass14 = manager2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "630148" + "'", str3.equals("630148"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.enableParkingspace("426858", "9R1M13");
        java.util.List<Models.ParkingLot> parkingLotList4 = superManager0.getParkingLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        java.lang.String str8 = superManager0.getUsername();
        Models.Manager manager10 = superManager0.createManagerAccount(false);
        manager10.enableParkingspace("857866", "152765");
        java.lang.String str14 = manager10.getUsername();
        manager10.enableParkingspace("309039", "9VSOU0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "admin" + "'", str8.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str14 + "' != '" + "ZD889N" + "'", str14.equals("ZD889N"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        java.lang.String str4 = manager2.getUsername();
        java.util.List<Models.ParkingLot> parkingLotList5 = manager2.getParkingLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "J5LG8E" + "'", str4.equals("J5LG8E"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.disableParkinglot("873077");
        Models.Manager manager4 = superManager0.createManagerAccount(false);
        superManager0.disableParkinglot("J1NO4Q");
        Models.Manager manager8 = superManager0.createManagerAccount(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager8);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = manager2.getPassword();
        manager2.enableParkinglot("admin");
        manager2.enableParkingspace("844348", "MOQEGU");
        manager2.disableParkinglot("897332");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "324179" + "'", str3.equals("324179"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        superManager0.disableParkingspace("hi!", "");
        superManager0.enableParkinglot("842669");
        superManager0.enableParkinglot("5H42J6");
        superManager0.enableParkingspace("J5LG8E", "426858");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Models.Manager.validateUsers("admin");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = superManager0.getPassword();
        java.util.List<Models.ParkingLot> parkingLotList4 = superManager0.getParkingLot();
        superManager0.removeParkingLot("538978");
        superManager0.removeParkingLot("545216");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "admin" + "'", str3.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        manager2.addParkingLot("");
        java.lang.String str5 = manager2.getPassword();
        manager2.enableParkingspace("857812", "J1NO4Q");
        manager2.removeParkingLot("842669");
        java.util.List<Models.ParkingLot> parkingLotList11 = manager2.getParkingLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "345136" + "'", str5.equals("345136"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList11);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        java.lang.String str4 = superManager0.getPassword();
        java.util.List<Models.ParkingLot> parkingLotList5 = superManager0.getParkingLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "admin" + "'", str4.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        superManager0.disableParkingspace("hi!", "");
        superManager0.enableParkinglot("842669");
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList3 = superManager0.getParkingLot();
        java.lang.String str4 = superManager0.getUsername();
        superManager0.enableParkinglot("4ID6KC");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "admin" + "'", str4.equals("admin"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        Models.Manager manager4 = superManager0.createManagerAccount(true);
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getPassword();
        superManager0.disableParkinglot("2B33UR");
        superManager0.disableParkinglot("423141");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "admin" + "'", str5.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "admin" + "'", str6.equals("admin"));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        manager2.addParkingLot("857812");
        manager2.disableParkingspace("admin", "873077");
        manager2.removeParkingLot("873077");
        manager2.disableParkinglot("236638");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Models.Manager.validateUsers("1S76AX");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        java.lang.String str8 = superManager0.getUsername();
        java.util.List<Models.ParkingLot> parkingLotList9 = superManager0.getParkingLot();
        java.lang.String str10 = superManager0.getUsername();
        superManager0.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList13 = superManager0.getParkingLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "admin" + "'", str8.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "admin" + "'", str10.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList13);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        superManager0.disableParkinglot("2B33UR");
        superManager0.enableParkingspace("426858", "J1NO4Q");
        superManager0.disableParkingspace("775696", "W2682U");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = superManager0.getUsername();
        superManager0.disableParkingspace("564097", "844348");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "admin" + "'", str3.equals("admin"));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        manager2.addParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList5 = manager2.getParkingLot();
        manager2.disableParkinglot("BQUPQV");
        java.lang.String str8 = manager2.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str8 + "' != '" + "YXTQGK" + "'", str8.equals("YXTQGK"));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(true);
        Models.Manager manager4 = superManager0.createManagerAccount(true);
        java.util.List<Models.ParkingLot> parkingLotList5 = superManager0.getParkingLot();
        java.lang.String str6 = superManager0.getUsername();
        superManager0.enableParkinglot("NFPS06");
        java.util.List<Models.ParkingLot> parkingLotList9 = superManager0.getParkingLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "admin" + "'", str6.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = superManager0.getPassword();
        Models.Manager manager5 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("MO5W0Y");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "admin" + "'", str3.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager5);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.disableParkinglot("873077");
        java.lang.Class<?> wildcardClass3 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        manager2.addParkingLot("");
        java.lang.String str5 = manager2.getPassword();
        manager2.removeParkingLot("823716");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "947189" + "'", str5.equals("947189"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        Models.Manager manager4 = superManager0.createManagerAccount(true);
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getPassword();
        superManager0.disableParkinglot("2B33UR");
        superManager0.enableParkingspace("359978", "873077");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "admin" + "'", str5.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "admin" + "'", str6.equals("admin"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkingspace("", "1769X8");
        superManager0.addParkingLot("842669");
        superManager0.enableParkinglot("9R1M13");
        superManager0.disableParkingspace("2B33UR", "857866");
        superManager0.removeParkingLot("971845");
        superManager0.enableParkinglot("TZXI4C");
        superManager0.addParkingLot("545216");
        superManager0.disableParkingspace("YXTQGK", "940922");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.removeParkingLot("777708");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        Models.Manager.validateUsers("833734");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        superManager0.addParkingLot("324179");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        superManager0.addParkingLot("944950");
        superManager0.addParkingLot("152765");
        Models.Manager manager13 = superManager0.createManagerAccount(true);
        manager13.enableParkingspace("ZD889N", "NFPS06");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager13);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(true);
        java.lang.String str3 = superManager0.getPassword();
        superManager0.disableParkingspace("350336", "YY0YPG");
        superManager0.enableParkinglot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "admin" + "'", str3.equals("admin"));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getPassword();
        superManager0.disableParkinglot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        manager2.addParkingLot("857812");
        manager2.disableParkinglot("873077");
        manager2.removeParkingLot("");
        manager2.enableParkinglot("TZXI4C");
        java.lang.Class<?> wildcardClass12 = manager2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        java.lang.String str4 = superManager0.getPassword();
        Models.Manager manager6 = superManager0.createManagerAccount(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "admin" + "'", str4.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        manager2.addParkingLot("");
        java.lang.String str5 = manager2.getPassword();
        manager2.disableParkingspace("4ID6KC", "897332");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "896323" + "'", str5.equals("896323"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        manager2.addParkingLot("857812");
        manager2.disableParkinglot("873077");
        manager2.removeParkingLot("");
        manager2.removeParkingLot("656668");
        java.lang.String str12 = manager2.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str12 + "' != '" + "VHRMA0" + "'", str12.equals("VHRMA0"));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        superManager0.disableParkinglot("2B33UR");
        superManager0.disableParkingspace("ETITC8", "SGNFEH");
        java.util.List<Models.ParkingLot> parkingLotList13 = superManager0.getParkingLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList13);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(true);
        superManager0.enableParkinglot("842669");
        Models.Manager manager6 = superManager0.createManagerAccount(false);
        java.lang.String str7 = superManager0.getPassword();
        java.lang.Class<?> wildcardClass8 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "admin" + "'", str7.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = superManager0.getUsername();
        superManager0.addParkingLot("MO5W0Y");
        superManager0.enableParkingspace("857812", "226400");
        superManager0.addParkingLot("EB8CHO");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "admin" + "'", str3.equals("admin"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList6 = superManager0.getParkingLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(true);
        superManager0.enableParkinglot("842669");
        Models.Manager manager6 = superManager0.createManagerAccount(false);
        java.lang.String str7 = superManager0.getPassword();
        java.lang.String str8 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "admin" + "'", str7.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "admin" + "'", str8.equals("admin"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        Models.Manager.validateUsers("717332");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkingspace("", "1769X8");
        superManager0.addParkingLot("842669");
        superManager0.enableParkinglot("9R1M13");
        superManager0.disableParkinglot("423141");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(true);
        Models.Manager manager4 = superManager0.createManagerAccount(false);
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        superManager0.disableParkinglot("2B33UR");
        superManager0.enableParkingspace("426858", "J1NO4Q");
        java.lang.String str13 = superManager0.getPassword();
        superManager0.removeParkingLot("MOQEGU");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "admin" + "'", str13.equals("admin"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.disableParkinglot("873077");
        superManager0.disableParkingspace("", "873077");
        superManager0.enableParkingspace("656668", "873077");
        Models.Manager manager10 = superManager0.createManagerAccount(false);
        superManager0.disableParkinglot("1769X8");
        superManager0.disableParkinglot("MOQEGU");
        java.util.List<Models.ParkingLot> parkingLotList15 = superManager0.getParkingLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList15);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        manager2.addParkingLot("857812");
        manager2.disableParkinglot("873077");
        manager2.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList10 = manager2.getParkingLot();
        manager2.disableParkinglot("350336");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.disableParkinglot("873077");
        superManager0.disableParkingspace("", "873077");
        superManager0.addParkingLot("775696");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.disableParkinglot("873077");
        java.util.List<Models.ParkingLot> parkingLotList3 = superManager0.getParkingLot();
        java.util.List<Models.ParkingLot> parkingLotList4 = superManager0.getParkingLot();
        Models.Manager manager6 = superManager0.createManagerAccount(true);
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkingspace("", "1769X8");
        java.lang.String str9 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "admin" + "'", str9.equals("admin"));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        superManager0.disableParkinglot("2B33UR");
        superManager0.enableParkingspace("426858", "J1NO4Q");
        superManager0.addParkingLot("873077");
        Models.Manager manager16 = superManager0.createManagerAccount(false);
        java.lang.Class<?> wildcardClass17 = manager16.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        Models.Manager manager9 = superManager0.createManagerAccount(false);
        superManager0.enableParkinglot("253059");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager9);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        Models.Manager.validateUsers("823716");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList3 = superManager0.getParkingLot();
        Models.Manager manager5 = superManager0.createManagerAccount(true);
        manager5.disableParkingspace("426858", "JGR8HY");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager5);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = superManager0.getUsername();
        Models.Manager manager5 = superManager0.createManagerAccount(true);
        superManager0.disableParkinglot("538978");
        superManager0.enableParkingspace("YY0YPG", "971845");
        java.lang.String str11 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "admin" + "'", str3.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "admin" + "'", str11.equals("admin"));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(true);
        Models.Manager manager4 = superManager0.createManagerAccount(true);
        manager4.disableParkinglot("39VGPS");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        manager2.removeParkingLot("717332");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        manager3.addParkingLot("");
        manager3.disableParkinglot("1YZRGK");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = superManager0.getUsername();
        java.lang.String str4 = superManager0.getPassword();
        superManager0.removeParkingLot("JGR8HY");
        superManager0.addParkingLot("BQUPQV");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "admin" + "'", str3.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "admin" + "'", str4.equals("admin"));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        java.lang.String str8 = superManager0.getUsername();
        Models.Manager manager10 = superManager0.createManagerAccount(false);
        manager10.enableParkingspace("857866", "152765");
        java.lang.String str14 = manager10.getUsername();
        manager10.enableParkingspace("W2682U", "4ID6KC");
        java.lang.Class<?> wildcardClass18 = manager10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "admin" + "'", str8.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str14 + "' != '" + "78T3B6" + "'", str14.equals("78T3B6"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.disableParkinglot("873077");
        java.util.List<Models.ParkingLot> parkingLotList3 = superManager0.getParkingLot();
        java.util.List<Models.ParkingLot> parkingLotList4 = superManager0.getParkingLot();
        Models.Manager manager6 = superManager0.createManagerAccount(true);
        superManager0.disableParkingspace("152765", "TZXI4C");
        java.util.List<Models.ParkingLot> parkingLotList10 = superManager0.getParkingLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList10);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        superManager0.disableParkinglot("2B33UR");
        superManager0.enableParkingspace("426858", "J1NO4Q");
        superManager0.addParkingLot("873077");
        superManager0.enableParkinglot("JGR8HY");
        superManager0.disableParkingspace("630148", "842669");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        java.lang.String str6 = superManager0.getUsername();
        java.lang.String str7 = superManager0.getUsername();
        superManager0.addParkingLot("ETITC8");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "admin" + "'", str6.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "admin" + "'", str7.equals("admin"));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        Models.Manager manager4 = superManager0.createManagerAccount(true);
        manager4.disableParkinglot("857866");
        manager4.addParkingLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        java.lang.String str4 = manager2.getUsername();
        java.lang.String str5 = manager2.getUsername();
        manager2.addParkingLot("NFPS06");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ODTE1S" + "'", str4.equals("ODTE1S"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ODTE1S" + "'", str5.equals("ODTE1S"));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        java.lang.String str8 = superManager0.getUsername();
        java.util.List<Models.ParkingLot> parkingLotList9 = superManager0.getParkingLot();
        java.lang.String str10 = superManager0.getUsername();
        superManager0.removeParkingLot("");
        java.lang.String str13 = superManager0.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "admin" + "'", str8.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "admin" + "'", str10.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "admin" + "'", str13.equals("admin"));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.disableParkinglot("857866");
        java.lang.String str6 = superManager0.getPassword();
        superManager0.addParkingLot("4QAQ2K");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "admin" + "'", str6.equals("admin"));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.disableParkinglot("857866");
        java.lang.String str6 = superManager0.getPassword();
        superManager0.disableParkinglot("TZXI4C");
        superManager0.disableParkingspace("656668", "359978");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "admin" + "'", str6.equals("admin"));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        java.lang.String str8 = superManager0.getUsername();
        Models.Manager manager10 = superManager0.createManagerAccount(false);
        manager10.enableParkingspace("717332", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "admin" + "'", str8.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager10);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkingspace("", "1769X8");
        superManager0.addParkingLot("842669");
        superManager0.disableParkinglot("SGNFEH");
        superManager0.enableParkinglot("842669");
        superManager0.disableParkinglot("253059");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        Models.Manager manager4 = superManager0.createManagerAccount(true);
        manager4.disableParkinglot("857866");
        manager4.enableParkinglot("995574");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        superManager0.disableParkinglot("2B33UR");
        superManager0.disableParkingspace("ETITC8", "SGNFEH");
        superManager0.disableParkinglot("MO5W0Y");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        java.lang.String str8 = superManager0.getUsername();
        Models.Manager manager10 = superManager0.createManagerAccount(false);
        manager10.enableParkingspace("857866", "152765");
        java.lang.String str14 = manager10.getUsername();
        manager10.disableParkinglot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "admin" + "'", str8.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str14 + "' != '" + "OS69Q2" + "'", str14.equals("OS69Q2"));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        Models.Manager manager4 = superManager0.createManagerAccount(true);
        java.lang.String str5 = superManager0.getPassword();
        java.lang.String str6 = superManager0.getPassword();
        superManager0.disableParkinglot("2B33UR");
        superManager0.enableParkingspace("MTWSWI", "SS5RHP");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "admin" + "'", str5.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "admin" + "'", str6.equals("admin"));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        Models.Manager manager4 = superManager0.createManagerAccount(true);
        java.lang.String str5 = superManager0.getPassword();
        superManager0.disableParkinglot("J5LG8E");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "admin" + "'", str5.equals("admin"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList3 = superManager0.getParkingLot();
        superManager0.enableParkinglot("025065");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        Models.Manager.validateUsers("78T3B6");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        Models.Manager.validateUsers("324179");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.disableParkinglot("873077");
        java.util.List<Models.ParkingLot> parkingLotList3 = superManager0.getParkingLot();
        superManager0.disableParkinglot("MTWSWI");
        Models.Manager manager7 = superManager0.createManagerAccount(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager7);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.disableParkinglot("857866");
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "admin" + "'", str6.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "admin" + "'", str7.equals("admin"));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.disableParkinglot("873077");
        superManager0.disableParkingspace("", "873077");
        superManager0.enableParkingspace("656668", "873077");
        Models.Manager manager10 = superManager0.createManagerAccount(false);
        superManager0.disableParkinglot("1769X8");
        superManager0.addParkingLot("hi!");
        superManager0.disableParkingspace("2B33UR", "833734");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager10);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = superManager0.getPassword();
        java.util.List<Models.ParkingLot> parkingLotList4 = superManager0.getParkingLot();
        superManager0.removeParkingLot("538978");
        superManager0.removeParkingLot("564097");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "admin" + "'", str3.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = superManager0.getPassword();
        java.util.List<Models.ParkingLot> parkingLotList4 = superManager0.getParkingLot();
        superManager0.enableParkingspace("MOQEGU", "038743");
        superManager0.addParkingLot("025065");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "admin" + "'", str3.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = manager2.getPassword();
        manager2.disableParkingspace("570326", "EB8CHO");
        java.lang.String str7 = manager2.getUsername();
        manager2.disableParkingspace("350336", "U6U9JS");
        manager2.enableParkingspace("4ID6KC", "2RNZ4C");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "664462" + "'", str3.equals("664462"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str7 + "' != '" + "QVYANS" + "'", str7.equals("QVYANS"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkingspace("", "1769X8");
        superManager0.addParkingLot("842669");
        superManager0.enableParkinglot("9R1M13");
        superManager0.disableParkingspace("2B33UR", "857866");
        superManager0.removeParkingLot("971845");
        superManager0.enableParkinglot("TZXI4C");
        superManager0.addParkingLot("545216");
        java.util.List<Models.ParkingLot> parkingLotList22 = superManager0.getParkingLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList22);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList3 = superManager0.getParkingLot();
        java.lang.String str4 = superManager0.getUsername();
        superManager0.enableParkingspace("78T3B6", "152765");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "admin" + "'", str4.equals("admin"));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        superManager0.enableParkingspace("152765", "BQUPQV");
        java.lang.String str6 = superManager0.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "admin" + "'", str6.equals("admin"));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.disableParkinglot("873077");
        Models.Manager manager4 = superManager0.createManagerAccount(false);
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = superManager0.getUsername();
        superManager0.addParkingLot("MO5W0Y");
        java.lang.String str6 = superManager0.getPassword();
        Models.Manager manager8 = superManager0.createManagerAccount(false);
        manager8.disableParkinglot("857866");
        manager8.disableParkinglot("656668");
        java.lang.String str13 = manager8.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "admin" + "'", str3.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "admin" + "'", str6.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str13 + "' != '" + "93CX2E" + "'", str13.equals("93CX2E"));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkingspace("", "1769X8");
        superManager0.addParkingLot("842669");
        superManager0.enableParkinglot("9R1M13");
        superManager0.disableParkingspace("2B33UR", "857866");
        superManager0.addParkingLot("152765");
        Models.Manager manager19 = superManager0.createManagerAccount(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager19);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        java.lang.String str4 = superManager0.getPassword();
        superManager0.disableParkingspace("TZXI4C", "156178");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "admin" + "'", str4.equals("admin"));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        java.lang.String str4 = manager2.getUsername();
        java.lang.String str5 = manager2.getUsername();
        manager2.disableParkinglot("1769X8");
        manager2.addParkingLot("538978");
        manager2.enableParkinglot("857812");
        manager2.disableParkinglot("9R1M13");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CAH0L6" + "'", str4.equals("CAH0L6"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "CAH0L6" + "'", str5.equals("CAH0L6"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        superManager0.disableParkingspace("hi!", "");
        superManager0.enableParkinglot("842669");
        superManager0.enableParkinglot("5H42J6");
        superManager0.enableParkingspace("MO5W0Y", "EB8CHO");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        manager2.addParkingLot("");
        manager2.addParkingLot("656668");
        manager2.addParkingLot("297381");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        java.lang.String str8 = superManager0.getUsername();
        java.util.List<Models.ParkingLot> parkingLotList9 = superManager0.getParkingLot();
        java.lang.String str10 = superManager0.getUsername();
        superManager0.addParkingLot("MTWSWI");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "admin" + "'", str8.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "admin" + "'", str10.equals("admin"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        manager2.addParkingLot("857812");
        manager2.disableParkingspace("admin", "873077");
        manager2.enableParkingspace("", "152765");
        manager2.disableParkingspace("538978", "39VGPS");
        manager2.disableParkinglot("971845");
        java.lang.String str17 = manager2.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str17 + "' != '" + "706362" + "'", str17.equals("706362"));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        Models.Manager.validateUsers("538978");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = manager2.getPassword();
        manager2.disableParkingspace("570326", "EB8CHO");
        java.lang.String str7 = manager2.getUsername();
        manager2.disableParkingspace("350336", "U6U9JS");
        manager2.enableParkinglot("CAH0L6");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "160175" + "'", str3.equals("160175"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str7 + "' != '" + "AQ28QR" + "'", str7.equals("AQ28QR"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        java.lang.String str4 = superManager0.getPassword();
        superManager0.enableParkinglot("842669");
        java.lang.Class<?> wildcardClass7 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "admin" + "'", str4.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        manager2.disableParkingspace("857866", "842669");
        manager2.enableParkingspace("609528", "857866");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        superManager0.addParkingLot("944950");
        superManager0.addParkingLot("152765");
        Models.Manager manager13 = superManager0.createManagerAccount(true);
        manager13.disableParkingspace("", "NFPS06");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager13);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        manager2.addParkingLot("857812");
        manager2.disableParkinglot("873077");
        manager2.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList10 = manager2.getParkingLot();
        manager2.addParkingLot("656668");
        java.lang.String str13 = manager2.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str13 + "' != '" + "054EB6" + "'", str13.equals("054EB6"));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        Models.Manager manager9 = superManager0.createManagerAccount(false);
        manager9.disableParkinglot("857812");
        manager9.removeParkingLot("564097");
        java.lang.String str14 = manager9.getPassword();
        manager9.disableParkinglot("AQ28QR");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str14 + "' != '" + "426275" + "'", str14.equals("426275"));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        java.lang.String str8 = superManager0.getUsername();
        java.util.List<Models.ParkingLot> parkingLotList9 = superManager0.getParkingLot();
        java.lang.String str10 = superManager0.getUsername();
        superManager0.disableParkinglot("39VGPS");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "admin" + "'", str8.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "admin" + "'", str10.equals("admin"));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        java.lang.String str8 = superManager0.getUsername();
        java.lang.String str9 = superManager0.getUsername();
        java.lang.String str10 = superManager0.getPassword();
        superManager0.enableParkingspace("39VGPS", "ETITC8");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "admin" + "'", str8.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "admin" + "'", str9.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "admin" + "'", str10.equals("admin"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = superManager0.getUsername();
        Models.Manager manager5 = superManager0.createManagerAccount(true);
        java.lang.String str6 = superManager0.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "admin" + "'", str3.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "admin" + "'", str6.equals("admin"));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.disableParkinglot("678559");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.disableParkinglot("873077");
        java.util.List<Models.ParkingLot> parkingLotList3 = superManager0.getParkingLot();
        java.lang.String str4 = superManager0.getPassword();
        Models.Manager manager6 = superManager0.createManagerAccount(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "admin" + "'", str4.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager6);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        manager2.addParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList5 = manager2.getParkingLot();
        manager2.enableParkingspace("538978", "EB8CHO");
        java.lang.String str9 = manager2.getUsername();
        manager2.enableParkinglot("896323");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str9 + "' != '" + "SINYWB" + "'", str9.equals("SINYWB"));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        manager2.addParkingLot("");
        java.lang.String str5 = manager2.getPassword();
        manager2.enableParkingspace("857812", "J1NO4Q");
        manager2.disableParkinglot("hi!");
        manager2.enableParkinglot("923437");
        manager2.enableParkingspace("656668", "426275");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "593201" + "'", str5.equals("593201"));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        manager2.addParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList5 = manager2.getParkingLot();
        java.lang.Class<?> wildcardClass6 = manager2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        java.lang.String str8 = superManager0.getUsername();
        java.lang.String str9 = superManager0.getUsername();
        java.lang.String str10 = superManager0.getPassword();
        superManager0.addParkingLot("U6U9JS");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "admin" + "'", str8.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "admin" + "'", str9.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "admin" + "'", str10.equals("admin"));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = superManager0.getPassword();
        java.util.List<Models.ParkingLot> parkingLotList4 = superManager0.getParkingLot();
        java.lang.String str5 = superManager0.getPassword();
        superManager0.disableParkingspace("944950", "857812");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "admin" + "'", str3.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "admin" + "'", str5.equals("admin"));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.disableParkinglot("857866");
        Models.Manager manager7 = superManager0.createManagerAccount(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager7);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = superManager0.getUsername();
        superManager0.addParkingLot("MO5W0Y");
        java.lang.String str6 = superManager0.getPassword();
        Models.Manager manager8 = superManager0.createManagerAccount(false);
        manager8.enableParkingspace("SGNFEH", "995574");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "admin" + "'", str3.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "admin" + "'", str6.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager8);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.disableParkinglot("873077");
        java.util.List<Models.ParkingLot> parkingLotList3 = superManager0.getParkingLot();
        superManager0.disableParkinglot("MTWSWI");
        superManager0.disableParkingspace("844348", "R2D5F7");
        Models.Manager manager10 = superManager0.createManagerAccount(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager10);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        superManager0.disableParkingspace("hi!", "");
        superManager0.enableParkinglot("842669");
        superManager0.enableParkinglot("5H42J6");
        java.lang.String str10 = superManager0.getPassword();
        superManager0.addParkingLot("MTWSWI");
        java.lang.String str13 = superManager0.getUsername();
        superManager0.disableParkinglot("4QAQ2K");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "admin" + "'", str10.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "admin" + "'", str13.equals("admin"));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        java.lang.String str4 = manager2.getUsername();
        java.lang.String str5 = manager2.getUsername();
        manager2.disableParkingspace("1769X8", "J1NO4Q");
        java.lang.String str9 = manager2.getPassword();
        java.util.List<Models.ParkingLot> parkingLotList10 = manager2.getParkingLot();
        manager2.enableParkingspace("VHRMA0", "NFPS06");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "O681XT" + "'", str4.equals("O681XT"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "O681XT" + "'", str5.equals("O681XT"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str9 + "' != '" + "617463" + "'", str9.equals("617463"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        manager2.addParkingLot("");
        java.lang.String str5 = manager2.getPassword();
        manager2.enableParkingspace("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "771735" + "'", str5.equals("771735"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        manager2.addParkingLot("857812");
        java.lang.String str6 = manager2.getUsername();
        manager2.removeParkingLot("538978");
        java.lang.Class<?> wildcardClass9 = manager2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "7S818A" + "'", str6.equals("7S818A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        manager2.addParkingLot("");
        manager2.enableParkingspace("MOQEGU", "253059");
        manager2.removeParkingLot("VHRMA0");
        java.lang.String str10 = manager2.getPassword();
        manager2.enableParkingspace("833734", "TZXI4C");
        manager2.disableParkinglot("054EB6");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str10 + "' != '" + "192933" + "'", str10.equals("192933"));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.disableParkinglot("873077");
        superManager0.disableParkingspace("", "873077");
        superManager0.enableParkinglot("350336");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        java.lang.String str4 = manager2.getUsername();
        java.lang.String str5 = manager2.getUsername();
        manager2.disableParkinglot("1769X8");
        manager2.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList10 = manager2.getParkingLot();
        manager2.disableParkinglot("SINYWB");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "F9STE4" + "'", str4.equals("F9STE4"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "F9STE4" + "'", str5.equals("F9STE4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList10);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = superManager0.getUsername();
        Models.Manager manager5 = superManager0.createManagerAccount(true);
        Models.Manager manager7 = superManager0.createManagerAccount(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "admin" + "'", str3.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager7);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        java.lang.String str4 = superManager0.getPassword();
        superManager0.removeParkingLot("823716");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "admin" + "'", str4.equals("admin"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.disableParkingspace("", "hi!");
        Models.Manager manager6 = superManager0.createManagerAccount(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager6);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = manager2.getPassword();
        manager2.enableParkinglot("admin");
        manager2.enableParkingspace("842669", "EB8CHO");
        manager2.enableParkingspace("EB8CHO", "admin");
        manager2.addParkingLot("709197");
        java.lang.String str14 = manager2.getPassword();
        manager2.disableParkingspace("345136", "ZD889N");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "568199" + "'", str3.equals("568199"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str14 + "' != '" + "568199" + "'", str14.equals("568199"));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = manager2.getPassword();
        manager2.disableParkingspace("570326", "EB8CHO");
        java.lang.String str7 = manager2.getUsername();
        manager2.disableParkingspace("350336", "U6U9JS");
        manager2.removeParkingLot("902920");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "645102" + "'", str3.equals("645102"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ANM423" + "'", str7.equals("ANM423"));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        Models.Manager manager9 = superManager0.createManagerAccount(false);
        java.lang.String str10 = manager9.getUsername();
        manager9.disableParkingspace("564097", "MTWSWI");
        manager9.removeParkingLot("253059");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0SOE66" + "'", str10.equals("0SOE66"));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = superManager0.getPassword();
        java.util.List<Models.ParkingLot> parkingLotList4 = superManager0.getParkingLot();
        superManager0.removeParkingLot("857866");
        java.lang.String str7 = superManager0.getUsername();
        java.util.List<Models.ParkingLot> parkingLotList8 = superManager0.getParkingLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "admin" + "'", str3.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "admin" + "'", str7.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        java.lang.String str8 = superManager0.getUsername();
        Models.Manager manager10 = superManager0.createManagerAccount(false);
        manager10.enableParkingspace("857866", "152765");
        java.lang.String str14 = manager10.getUsername();
        manager10.enableParkingspace("W2682U", "4ID6KC");
        java.lang.String str18 = manager10.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "admin" + "'", str8.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str14 + "' != '" + "6AE68A" + "'", str14.equals("6AE68A"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str18 + "' != '" + "6AE68A" + "'", str18.equals("6AE68A"));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        manager2.addParkingLot("857812");
        manager2.disableParkingspace("admin", "873077");
        manager2.removeParkingLot("2B33UR");
        manager2.disableParkingspace("5H42J6", "857812");
        manager2.enableParkinglot("678559");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(true);
        superManager0.enableParkinglot("842669");
        Models.Manager manager6 = superManager0.createManagerAccount(false);
        java.lang.String str7 = superManager0.getPassword();
        superManager0.addParkingLot("944950");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "admin" + "'", str7.equals("admin"));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkingspace("", "1769X8");
        superManager0.addParkingLot("842669");
        superManager0.disableParkinglot("SGNFEH");
        superManager0.enableParkingspace("", "630148");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.enableParkingspace("426858", "9R1M13");
        superManager0.disableParkingspace("717332", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        java.lang.String str4 = manager2.getUsername();
        java.lang.String str5 = manager2.getUsername();
        manager2.enableParkingspace("", "645102");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0LFQ77" + "'", str4.equals("0LFQ77"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0LFQ77" + "'", str5.equals("0LFQ77"));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        java.lang.String str4 = manager2.getUsername();
        java.lang.String str5 = manager2.getUsername();
        manager2.disableParkinglot("1769X8");
        manager2.removeParkingLot("");
        java.lang.Class<?> wildcardClass10 = manager2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "7B9G85" + "'", str4.equals("7B9G85"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "7B9G85" + "'", str5.equals("7B9G85"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = superManager0.getPassword();
        java.util.List<Models.ParkingLot> parkingLotList4 = superManager0.getParkingLot();
        superManager0.enableParkingspace("MOQEGU", "038743");
        Models.Manager manager9 = superManager0.createManagerAccount(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "admin" + "'", str3.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager9);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = manager2.getPassword();
        manager2.enableParkinglot("admin");
        manager2.enableParkingspace("844348", "MOQEGU");
        java.lang.String str9 = manager2.getPassword();
        java.lang.String str10 = manager2.getPassword();
        manager2.disableParkinglot("253059");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "541941" + "'", str3.equals("541941"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str9 + "' != '" + "541941" + "'", str9.equals("541941"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str10 + "' != '" + "541941" + "'", str10.equals("541941"));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        Models.Manager.validateUsers("152765");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        java.lang.String str4 = manager2.getUsername();
        java.lang.String str5 = manager2.getUsername();
        manager2.disableParkingspace("1769X8", "J1NO4Q");
        java.lang.String str9 = manager2.getPassword();
        java.util.List<Models.ParkingLot> parkingLotList10 = manager2.getParkingLot();
        manager2.enableParkingspace("", "9R1M13");
        java.util.List<Models.ParkingLot> parkingLotList14 = manager2.getParkingLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "OGJWYO" + "'", str4.equals("OGJWYO"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OGJWYO" + "'", str5.equals("OGJWYO"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str9 + "' != '" + "113358" + "'", str9.equals("113358"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        java.lang.String str4 = superManager0.getPassword();
        superManager0.enableParkinglot("842669");
        Models.Manager manager8 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList9 = superManager0.getParkingLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "admin" + "'", str4.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.lang.String str3 = superManager0.getUsername();
        superManager0.addParkingLot("MO5W0Y");
        java.lang.String str6 = superManager0.getPassword();
        Models.Manager manager8 = superManager0.createManagerAccount(false);
        manager8.disableParkinglot("857866");
        manager8.disableParkinglot("656668");
        java.lang.String str13 = manager8.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "admin" + "'", str3.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "admin" + "'", str6.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str13 + "' != '" + "074761" + "'", str13.equals("074761"));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        Models.Manager manager4 = superManager0.createManagerAccount(true);
        manager4.disableParkinglot("NFPS06");
        manager4.removeParkingLot("426858");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        Models.Manager manager4 = superManager0.createManagerAccount(true);
        java.lang.String str5 = superManager0.getUsername();
        java.lang.String str6 = superManager0.getUsername();
        superManager0.removeParkingLot("873077");
        java.lang.String str9 = superManager0.getUsername();
        superManager0.disableParkingspace("545216", "U6U9JS");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "admin" + "'", str5.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "admin" + "'", str6.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "admin" + "'", str9.equals("admin"));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        superManager0.addParkingLot("944950");
        superManager0.addParkingLot("152765");
        Models.Manager manager13 = superManager0.createManagerAccount(true);
        superManager0.disableParkinglot("XB3BM1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager13);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        Models.Manager manager9 = superManager0.createManagerAccount(false);
        java.lang.String str10 = manager9.getUsername();
        manager9.disableParkingspace("AQ28QR", "253059");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str10 + "' != '" + "XBO2QD" + "'", str10.equals("XBO2QD"));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        Models.Manager manager4 = superManager0.createManagerAccount(true);
        java.lang.String str5 = superManager0.getUsername();
        java.lang.String str6 = superManager0.getUsername();
        superManager0.disableParkinglot("MO5W0Y");
        superManager0.disableParkinglot("947189");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "admin" + "'", str5.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "admin" + "'", str6.equals("admin"));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        superManager0.addParkingLot("944950");
        superManager0.addParkingLot("152765");
        Models.Manager manager13 = superManager0.createManagerAccount(true);
        java.util.List<Models.ParkingLot> parkingLotList14 = superManager0.getParkingLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        manager2.disableParkingspace("857866", "842669");
        manager2.disableParkingspace("XB3BM1", "844348");
        manager2.enableParkingspace("300659", "775696");
        java.util.List<Models.ParkingLot> parkingLotList12 = manager2.getParkingLot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        manager2.addParkingLot("857812");
        manager2.disableParkinglot("873077");
        manager2.removeParkingLot("");
        manager2.removeParkingLot("656668");
        java.lang.String str12 = manager2.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str12 + "' != '" + "871831" + "'", str12.equals("871831"));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        manager2.enableParkingspace("SINYWB", "CAH0L6");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        Models.Manager manager2 = superManager0.createManagerAccount(false);
        java.util.List<Models.ParkingLot> parkingLotList3 = manager2.getParkingLot();
        manager2.addParkingLot("857812");
        manager2.disableParkingspace("admin", "873077");
        manager2.enableParkinglot("025065");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.disableParkingspace("", "hi!");
        superManager0.enableParkinglot("974463");
        java.lang.String str7 = superManager0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "admin" + "'", str7.equals("admin"));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        Models.Manager.validateUsers("0SOE66");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        java.lang.String str4 = manager3.getPassword();
        manager3.disableParkinglot("MO5W0Y");
        java.lang.String str7 = manager3.getPassword();
        manager3.removeParkingLot("310017");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "979389" + "'", str4.equals("979389"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str7 + "' != '" + "979389" + "'", str7.equals("979389"));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        superManager0.removeParkingLot("");
        java.util.List<Models.ParkingLot> parkingLotList3 = superManager0.getParkingLot();
        java.lang.String str4 = superManager0.getUsername();
        java.lang.String str5 = superManager0.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "admin" + "'", str4.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "admin" + "'", str5.equals("admin"));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        superManager0.addParkingLot("944950");
        superManager0.addParkingLot("152765");
        Models.Manager manager13 = superManager0.createManagerAccount(true);
        java.lang.String str14 = superManager0.getPassword();
        Models.Manager manager16 = superManager0.createManagerAccount(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "admin" + "'", str14.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager16);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        Models.SuperManager superManager0 = Models.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        Models.Manager manager3 = superManager0.createManagerAccount(false);
        superManager0.removeParkingLot("");
        superManager0.enableParkinglot("873077");
        superManager0.addParkingLot("944950");
        java.lang.String str10 = superManager0.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "admin" + "'", str1.equals("admin"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "admin" + "'", str10.equals("admin"));
    }
}

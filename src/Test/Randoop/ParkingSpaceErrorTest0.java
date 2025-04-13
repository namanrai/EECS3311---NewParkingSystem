package Test.Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ParkingSpaceErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("hi!");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        parkingSpace2.enable();
        java.lang.String str5 = parkingSpace2.getId();
        java.lang.String str6 = parkingSpace2.getId();
        java.lang.String str7 = parkingSpace2.getLocation();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        parkingSpace2.enable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        parkingSpace2.enable();
        parkingSpace2.enable();
        java.lang.String str5 = parkingSpace2.getLicensePlate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("hi!");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        parkingSpace2.enable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("hi!");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        parkingSpace2.enable();
        java.lang.String str4 = parkingSpace2.getLocation();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getId();
        java.lang.String str4 = parkingSpace2.getLocation();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        parkingSpace2.enable();
        java.lang.String str5 = parkingSpace2.getLocation();
        parkingSpace2.enable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        parkingSpace2.disable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        java.lang.String str4 = parkingSpace2.getLicensePlate();
        parkingSpace2.disable();
        java.lang.String str6 = parkingSpace2.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        parkingSpace2.disable();
        java.lang.String str4 = parkingSpace2.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        boolean boolean4 = parkingSpace2.isOccupied();
        java.lang.String str5 = parkingSpace2.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        parkingSpace2.disable();
        java.lang.String str4 = parkingSpace2.getId();
        java.lang.String str5 = parkingSpace2.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        parkingSpace2.enable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        java.lang.String str3 = parkingSpace2.getLocation();
        java.lang.String str4 = parkingSpace2.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        boolean boolean4 = parkingSpace2.isDisabled();
        java.lang.String str5 = parkingSpace2.getLicensePlate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        parkingSpace2.disable();
        java.lang.String str4 = parkingSpace2.getId();
        java.lang.String str5 = parkingSpace2.getLicensePlate();
        parkingSpace2.assign("hi!");
        parkingSpace2.enable();
        java.lang.String str9 = parkingSpace2.getLicensePlate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        java.lang.String str4 = parkingSpace2.getLicensePlate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("hi!");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        parkingSpace2.enable();
        java.lang.String str5 = parkingSpace2.getLocation();
        java.lang.String str6 = parkingSpace2.getId();
        java.lang.String str7 = parkingSpace2.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        boolean boolean4 = parkingSpace2.isDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        parkingSpace2.enable();
        java.lang.String str5 = parkingSpace2.getLocation();
        java.lang.String str6 = parkingSpace2.getLicensePlate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        parkingSpace2.enable();
        java.lang.String str5 = parkingSpace2.getId();
        java.lang.String str6 = parkingSpace2.getId();
        boolean boolean7 = parkingSpace2.isDisabled();
        parkingSpace2.enable();
        java.lang.String str9 = parkingSpace2.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        parkingSpace2.enable();
        parkingSpace2.enable();
        parkingSpace2.disable();
        boolean boolean6 = parkingSpace2.isDisabled();
        parkingSpace2.assign("");
        parkingSpace2.enable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        parkingSpace2.disable();
        parkingSpace2.disable();
        parkingSpace2.assign("");
        boolean boolean7 = parkingSpace2.isDisabled();
        boolean boolean8 = parkingSpace2.isOccupied();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        boolean boolean4 = parkingSpace2.isDisabled();
        java.lang.String str5 = parkingSpace2.getLocation();
        parkingSpace2.disable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        parkingSpace2.enable();
        parkingSpace2.enable();
        parkingSpace2.disable();
        boolean boolean6 = parkingSpace2.isDisabled();
        parkingSpace2.assign("");
        parkingSpace2.enable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        parkingSpace2.disable();
        java.lang.String str4 = parkingSpace2.getId();
        java.lang.String str5 = parkingSpace2.getLicensePlate();
        parkingSpace2.assign("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        parkingSpace2.enable();
        boolean boolean4 = parkingSpace2.isDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        parkingSpace2.disable();
        java.lang.String str4 = parkingSpace2.getId();
        boolean boolean5 = parkingSpace2.isDisabled();
        parkingSpace2.enable();
        parkingSpace2.enable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        boolean boolean4 = parkingSpace2.isDisabled();
        java.lang.String str5 = parkingSpace2.getLocation();
        java.lang.String str6 = parkingSpace2.getLocation();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        parkingSpace2.enable();
        parkingSpace2.enable();
        parkingSpace2.enable();
        parkingSpace2.enable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        parkingSpace2.disable();
        java.lang.String str4 = parkingSpace2.getId();
        boolean boolean5 = parkingSpace2.isDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        parkingSpace2.enable();
        boolean boolean5 = parkingSpace2.isDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("hi!");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        parkingSpace2.enable();
        java.lang.String str5 = parkingSpace2.getId();
        java.lang.String str6 = parkingSpace2.getId();
        parkingSpace2.enable();
        boolean boolean8 = parkingSpace2.isDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("hi!");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        parkingSpace2.disable();
        java.lang.String str4 = parkingSpace2.getId();
        java.lang.String str5 = parkingSpace2.getLicensePlate();
        parkingSpace2.disable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        boolean boolean4 = parkingSpace2.isDisabled();
        java.lang.String str5 = parkingSpace2.getLocation();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("hi!");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        parkingSpace2.enable();
        java.lang.String str5 = parkingSpace2.getId();
        java.lang.String str6 = parkingSpace2.getId();
        boolean boolean7 = parkingSpace2.isDisabled();
        parkingSpace2.enable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("hi!");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        parkingSpace2.enable();
        java.lang.String str4 = parkingSpace2.getLocation();
        parkingSpace2.enable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        parkingSpace2.enable();
        java.lang.String str5 = parkingSpace2.getLocation();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        parkingSpace2.enable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        java.lang.String str4 = parkingSpace2.getLicensePlate();
        java.lang.String str5 = parkingSpace2.getLocation();
        boolean boolean6 = parkingSpace2.isDisabled();
        java.lang.String str7 = parkingSpace2.getLocation();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        parkingSpace2.enable();
        java.lang.String str5 = parkingSpace2.getId();
        java.lang.String str6 = parkingSpace2.getId();
        boolean boolean7 = parkingSpace2.isDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("hi!");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        boolean boolean4 = parkingSpace2.isOccupied();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getId();
        java.lang.String str4 = parkingSpace2.getId();
        java.lang.String str5 = parkingSpace2.getLocation();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        java.lang.String str3 = parkingSpace2.getLocation();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("hi!");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        parkingSpace2.enable();
        java.lang.String str5 = parkingSpace2.getId();
        java.lang.String str6 = parkingSpace2.getId();
        boolean boolean7 = parkingSpace2.isDisabled();
        parkingSpace2.enable();
        java.lang.String str9 = parkingSpace2.getId();
        parkingSpace2.enable();
        parkingSpace2.enable();
        boolean boolean12 = parkingSpace2.isOccupied();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        parkingSpace2.disable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        boolean boolean4 = parkingSpace2.isOccupied();
        java.lang.String str5 = parkingSpace2.getId();
        java.lang.String str6 = parkingSpace2.getId();
        java.lang.String str7 = parkingSpace2.getId();
        java.lang.String str8 = parkingSpace2.getLicensePlate();
        java.lang.String str9 = parkingSpace2.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("hi!");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        parkingSpace2.disable();
        java.lang.String str4 = parkingSpace2.getId();
        java.lang.String str5 = parkingSpace2.getLicensePlate();
        parkingSpace2.assign("hi!");
        parkingSpace2.enable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        java.lang.String str4 = parkingSpace2.getLocation();
        java.lang.String str5 = parkingSpace2.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("hi!");
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        parkingSpace2.enable();
        java.lang.String str5 = parkingSpace2.getId();
        java.lang.String str6 = parkingSpace2.getId();
        parkingSpace2.enable();
        parkingSpace2.enable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        boolean boolean4 = parkingSpace2.isDisabled();
        boolean boolean5 = parkingSpace2.isOccupied();
        java.lang.String str6 = parkingSpace2.getLocation();
        java.lang.String str7 = parkingSpace2.getLocation();
        parkingSpace2.disable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        boolean boolean4 = parkingSpace2.isOccupied();
        java.lang.String str5 = parkingSpace2.getId();
        parkingSpace2.enable();
        boolean boolean7 = parkingSpace2.isDisabled();
        java.lang.String str8 = parkingSpace2.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        java.lang.String str4 = parkingSpace2.getLicensePlate();
        java.lang.String str5 = parkingSpace2.getLocation();
        boolean boolean6 = parkingSpace2.isDisabled();
        java.lang.String str7 = parkingSpace2.getLocation();
        parkingSpace2.enable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("hi!");
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        boolean boolean4 = parkingSpace2.isDisabled();
        boolean boolean5 = parkingSpace2.isOccupied();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("hi!");
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        java.lang.String str4 = parkingSpace2.getLicensePlate();
        java.lang.String str5 = parkingSpace2.getLocation();
        java.lang.String str6 = parkingSpace2.getLicensePlate();
        boolean boolean7 = parkingSpace2.isOccupied();
        boolean boolean8 = parkingSpace2.isOccupied();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("");
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        java.lang.String str3 = parkingSpace2.getLocation();
        java.lang.String str4 = parkingSpace2.getLicensePlate();
        parkingSpace2.enable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("");
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("");
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        parkingSpace2.enable();
        java.lang.String str5 = parkingSpace2.getId();
        java.lang.String str6 = parkingSpace2.getId();
        boolean boolean7 = parkingSpace2.isDisabled();
        parkingSpace2.enable();
        parkingSpace2.enable();
        boolean boolean10 = parkingSpace2.isOccupied();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("");
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        parkingSpace2.disable();
        parkingSpace2.disable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        parkingSpace2.enable();
        parkingSpace2.enable();
        java.lang.String str5 = parkingSpace2.getLicensePlate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        parkingSpace2.enable();
        parkingSpace2.enable();
        parkingSpace2.enable();
        boolean boolean6 = parkingSpace2.isOccupied();
        java.lang.String str7 = parkingSpace2.getLicensePlate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        boolean boolean4 = parkingSpace2.isOccupied();
        java.lang.String str5 = parkingSpace2.getId();
        java.lang.String str6 = parkingSpace2.getId();
        java.lang.String str7 = parkingSpace2.getId();
        java.lang.String str8 = parkingSpace2.getLicensePlate();
        java.lang.String str9 = parkingSpace2.getLicensePlate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        parkingSpace2.disable();
        parkingSpace2.disable();
        parkingSpace2.assign("");
        parkingSpace2.enable();
        java.lang.String str8 = parkingSpace2.getLicensePlate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        parkingSpace2.disable();
        java.lang.String str4 = parkingSpace2.getId();
        java.lang.String str5 = parkingSpace2.getLicensePlate();
        parkingSpace2.assign("hi!");
        parkingSpace2.enable();
        parkingSpace2.enable();
        java.lang.String str10 = parkingSpace2.getLicensePlate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        parkingSpace2.enable();
        java.lang.String str5 = parkingSpace2.getId();
        java.lang.String str6 = parkingSpace2.getId();
        boolean boolean7 = parkingSpace2.isDisabled();
        parkingSpace2.enable();
        parkingSpace2.enable();
        boolean boolean10 = parkingSpace2.isOccupied();
        parkingSpace2.disable();
        boolean boolean12 = parkingSpace2.isOccupied();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getId();
        boolean boolean4 = parkingSpace2.isOccupied();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        parkingSpace2.enable();
        java.lang.String str5 = parkingSpace2.getLocation();
        parkingSpace2.enable();
        parkingSpace2.disable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        parkingSpace2.disable();
        java.lang.String str4 = parkingSpace2.getId();
        java.lang.String str5 = parkingSpace2.getLicensePlate();
        parkingSpace2.assign("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        parkingSpace2.enable();
        java.lang.String str5 = parkingSpace2.getId();
        java.lang.String str6 = parkingSpace2.getId();
        boolean boolean7 = parkingSpace2.isDisabled();
        parkingSpace2.enable();
        java.lang.String str9 = parkingSpace2.getId();
        java.lang.String str10 = parkingSpace2.getLocation();
        java.lang.String str11 = parkingSpace2.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        boolean boolean4 = parkingSpace2.isDisabled();
        boolean boolean5 = parkingSpace2.isOccupied();
        java.lang.String str6 = parkingSpace2.getLocation();
        java.lang.String str7 = parkingSpace2.getLocation();
        java.lang.String str8 = parkingSpace2.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("hi!");
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        parkingSpace2.enable();
        java.lang.String str5 = parkingSpace2.getLicensePlate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("");
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        java.lang.String str3 = parkingSpace2.getLocation();
        java.lang.String str4 = parkingSpace2.getLicensePlate();
        parkingSpace2.enable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("", "");
        parkingSpace2.disable();
        parkingSpace2.disable();
        parkingSpace2.assign("");
        parkingSpace2.enable();
        java.lang.String str8 = parkingSpace2.getLicensePlate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.assign("hi!");
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        Models.ParkingSpace parkingSpace2 = new Models.ParkingSpace("hi!", "");
        java.lang.String str3 = parkingSpace2.getLicensePlate();
        parkingSpace2.enable();
        java.lang.String str5 = parkingSpace2.getId();
        java.lang.String str6 = parkingSpace2.getId();
        parkingSpace2.enable();
        boolean boolean8 = parkingSpace2.isDisabled();
        parkingSpace2.disable();
        parkingSpace2.disable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace2.vacate();
    }
}


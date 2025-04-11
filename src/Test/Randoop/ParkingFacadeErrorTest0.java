package Test.Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ParkingFacadeErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = parkingFacade1.assignCar("");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        boolean boolean3 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = parkingFacade1.assignCar("");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = parkingFacade1.assignCar("");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = parkingFacade1.assignCar("");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = parkingFacade1.assignCar("");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = parkingFacade1.assignCar("");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = parkingFacade1.assignCar("");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = parkingFacade1.assignCar("");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = parkingFacade1.assignCar("");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = parkingFacade1.assignCar("");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = parkingFacade1.assignCar("");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = parkingFacade1.assignCar("");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = parkingFacade1.assignCar("");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = parkingFacade1.assignCar("");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = parkingFacade1.assignCar("");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = parkingFacade1.assignCar("");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = parkingFacade1.assignCar("");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = parkingFacade1.assignCar("");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean10 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = parkingFacade1.assignCar("");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        boolean boolean12 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = parkingFacade1.assignCar("");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = parkingFacade1.assignCar("");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = parkingFacade1.assignCar("");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = parkingFacade1.assignCar("");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = parkingFacade1.assignCar("");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = parkingFacade1.assignCar("");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = parkingFacade1.assignCar("");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean10 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = parkingFacade1.assignCar("");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = parkingFacade1.assignCar("");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = parkingFacade1.assignCar("");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        boolean boolean12 = parkingFacade1.isParkingLotDisabled();
        boolean boolean13 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = parkingFacade1.assignCar("");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = parkingFacade1.assignCar("");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = parkingFacade1.assignCar("");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = parkingFacade1.assignCar("");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = parkingFacade1.assignCar("");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean10 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean13 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = parkingFacade1.assignCar("");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean13 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = parkingFacade1.assignCar("");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = parkingFacade1.assignCar("");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = parkingFacade1.assignCar("");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = parkingFacade1.assignCar("");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = parkingFacade1.assignCar("");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = parkingFacade1.assignCar("");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = parkingFacade1.assignCar("");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean13 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = parkingFacade1.assignCar("");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        boolean boolean3 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = parkingFacade1.assignCar("");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = parkingFacade1.assignCar("");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = parkingFacade1.assignCar("");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        boolean boolean3 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = parkingFacade1.assignCar("");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = parkingFacade1.assignCar("");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = parkingFacade1.assignCar("");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean10 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = parkingFacade1.assignCar("");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = parkingFacade1.assignCar("");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        boolean boolean12 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = parkingFacade1.assignCar("");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = parkingFacade1.assignCar("");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = parkingFacade1.assignCar("");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = parkingFacade1.assignCar("");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean13 = parkingFacade1.isParkingLotDisabled();
        boolean boolean14 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        boolean boolean3 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = parkingFacade1.assignCar("");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = parkingFacade1.assignCar("");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = parkingFacade1.assignCar("");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = parkingFacade1.assignCar("");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = parkingFacade1.assignCar("");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = parkingFacade1.assignCar("");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = parkingFacade1.assignCar("");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        boolean boolean12 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        boolean boolean3 = parkingFacade1.isParkingLotDisabled();
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = parkingFacade1.assignCar("");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        boolean boolean3 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = parkingFacade1.assignCar("");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        boolean boolean2 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean5 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        boolean boolean8 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = parkingFacade1.assignCar("");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = parkingFacade1.assignCar("");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = parkingFacade1.assignCar("");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = parkingFacade1.assignCar("");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        boolean boolean7 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = parkingFacade1.assignCar("");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        parkingFacade1.vacateParkingSpace("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean4 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = parkingFacade1.assignCar("");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = parkingFacade1.assignCar("hi!");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        DesignPatterns.ParkingFacade parkingFacade1 = new DesignPatterns.ParkingFacade("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean6 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("hi!");
        boolean boolean9 = parkingFacade1.isParkingLotDisabled();
        boolean boolean10 = parkingFacade1.isParkingLotDisabled();
        boolean boolean11 = parkingFacade1.isParkingLotDisabled();
        parkingFacade1.vacateParkingSpace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = parkingFacade1.assignCar("");
    }
}


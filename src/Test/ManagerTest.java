package Test;
import Models.ParkingLot;
import Models.ParkingSpace;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

import DesignPatterns.ParkingProxy;
import Models.Manager;

/**
 * This test class is desgined for the testing the manager class. This class has a total
 * of 10 test cases.
 */

public class ManagerTest {
    private ParkingProxy proxyTest;
    private Manager managerTest;
    private static final String userChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";


    /**
     * This is a setup function. Before each test, create instances of the Parkingproxy
     * and the manager class.
     */

    @BeforeEach
    void setUp(){
        proxyTest = new ParkingProxy(true);
        managerTest = new Manager(proxyTest);
        String userGen = managerTest.getUsername();
        String userPassword = managerTest.getPassword();

    }

    /**
     * This test, verifies if the username is of the correct lenght.
     * If the username is off correct lenght then return its equal.
     */

    @Test
    void TestUsernamelenght(){
        proxyTest = new ParkingProxy(true);
        managerTest = new Manager(proxyTest);
        assertEquals(6, managerTest.getUsername().length());

    }


    /**
     * This test, verifies if the password is of the correct length.
     * If the username is off correct length then return its equal.
     */

    @Test
    void TestPasswordlenght(){
        proxyTest = new ParkingProxy(true);
        managerTest = new Manager(proxyTest);
        assertEquals(6, managerTest.getPassword().length());
    }

    /**
     * This test case checks with the username generation is only from the
     * allowed list of characters in the userChar string
     */

    @Test
    void TestCorrectUserGeneration(){
        String userGen = managerTest.generateUserPassword();
        String userPassword = managerTest.generateUserPassword();

        for(int i = 0; i < userGen.length(); i++){
            char testchar = userGen.charAt(i);
            assertTrue(userChar.indexOf(testchar) >= 0);
        }
    }

    /**
     * This test case verfies if the password is being generated correctly,
     * that is it only has integers between 0 and 9.
     */

    @Test
    void TestCorrectPasswordGeneration(){
        String userGen = managerTest.generateUserPassword();
        String userPassword = managerTest.generateUserPassword();

        for(int i = 0; i < userPassword.length(); i++){
            char testpass = userPassword.charAt(i);
            assertTrue(testpass >= '0' && testpass <= '9');
        }
    }

    /**
     * This test case verifies if the addition of a parkinglot was successful.
     * after the successful addition it also checks if the newly added lot is present
     * in the list.
     */

    @Test
    void TestaddParkingLot(){
        String lotID = "LotD";
        boolean lotExists = false;
        managerTest.addParkingLot(lotID);
        List<ParkingLot> LotTest = managerTest.getParkingLot();
        for (int i = 0; i < LotTest.size(); i++) {
            ParkingLot lot = LotTest.get(i);
            if (lot.getLotId().equals(lotID)) {
                lotExists = true;
                break;
            }
        }
        assertTrue(lotExists);
    }

    /**
     * This test checks if manager can successfully remove a parking lot.
     */

    @Test
    void TestremoveParkingLot(){
        String lotID = "LotD";
        boolean doesExist = false;
        managerTest.addParkingLot(lotID);
        managerTest.removeParkingLot(lotID);
        List<ParkingLot> LotTest = managerTest.getParkingLot();
        for (int i = 0; i < LotTest.size(); i++) {
            ParkingLot lot = LotTest.get(i);
            if (lot.getLotId().equals(lotID)) {
                doesExist = true;
                break;
            }
        }
        assertFalse(doesExist);
    }

    /**
     * This test checks if manager can successfully enable a parking lot.
     */

    @Test
    void ManagerenableParkinglot() {
        boolean isEnabled = false;
        managerTest.addParkingLot("testLot");
        managerTest.disableParkinglot("testLot");
        // Now, enable the parking lot
        managerTest.enableParkinglot("testLot");

        // Check if the parking lot is enabled

        for (int i = 0; i < proxyTest.getParkingLots().size(); i++) {
            ParkingLot lotTest = proxyTest.getParkingLots().get(i);
            if (lotTest.getLotId().equals("testLot") && !lotTest.isDisabled()) {
                isEnabled = true;
                break;
            }
        }

        // Assert that the parking lot is enabled
        assertTrue(isEnabled);
    }

    /**
     * This test checks if manager can successfully disable a parking lot.
     */

    @Test
    void Manager_disable_Parkinglot() {
        managerTest.addParkingLot("testLot2");
        managerTest.enableParkinglot("testLot2");
        boolean isEnabled = true;


        // Check if the parking lot is disabled

        for (int i = 0; i < proxyTest.getParkingLots().size(); i++) {
            ParkingLot lotTest = proxyTest.getParkingLots().get(i);
            if (lotTest.getLotId().equals("testLot")) {
                isEnabled = false;
                break;
            }
        }
        // Assert that the parking lot is enabled
        assertTrue(isEnabled);
    }

    /**
     * This test checks if manager can successfully enable a parking space
     * in a specified parking lot
     */

    @Test
    void ManagerenableParkingspace() {
        managerTest.addParkingLot("testLot4");


        managerTest.enableParkingspace("testLot4", "space1test");


        ParkingLot lot = proxyTest.getParkingLots().getFirst();
        ParkingSpace space = lot.getSpaces().get(0);
        assertFalse(space.isDisabled());
    }

    /**
     * This test checks if manager can successfully disable a parking space
     * in a specified parking lot
     */

    @Test
    void ManagerdisableParkingspace() {
        managerTest.addParkingLot("testLot4");
        // Disable the parking space
        managerTest.disableParkingspace("testLot4", "space1test");

        // Assert the parking space is disabled
        ParkingLot lot = proxyTest.getParkingLots().getFirst();
        ParkingSpace space = lot.getSpaces().get(0);
        assertFalse(space.isDisabled());
    }
}

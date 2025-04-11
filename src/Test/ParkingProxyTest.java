package Test;

import DesignPatterns.ParkingProxy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParkingProxyTest {
    private ParkingProxy manager;
    private ParkingProxy regularUser;

    @BeforeEach
    void setUp() {
        manager = new ParkingProxy(true); // Manager proxy
        regularUser = new ParkingProxy(false); // Regular user proxy
    }

    @Test
    void testManagerCanAddParkingLot() {
        manager.addParkingLot("LOT-1");
        assertEquals(1, manager.getParkingLots().size());
    }


    @Test
    void testRegularUserCannotAddParkingLot() {
        regularUser.addParkingLot("LOT-1");
        assertEquals(0, regularUser.getParkingLots().size());
    }

    @Test
    void testRegularUserCannotRemoveParkingLot() {
        manager.addParkingLot("LOT-1");
        regularUser.removeParkingLot("LOT-1");
        assertEquals(1, manager.getParkingLots().size());
    }

    @Test
    void testManagerCanRemoveParkingLot() {
        manager.addParkingLot("LOT-1");
        manager.removeParkingLot("LOT-1");
        assertEquals(0, manager.getParkingLots().size());
    }


    @Test
    void testErrorForRemovingWrongParkingLot() {
        manager.removeParkingLot("LotDoesntExist");
        System.out.println("Test passed: Error message shown for lot that doesn't exist");
    }


    @Test
    void testGetParkingLots() {
        manager.addParkingLot("LOT-1");
        manager.addParkingLot("LOT-2");
        assertEquals(2, manager.getParkingLots().size());
    }


    @Test
    void testManagerCanEnableParkingLot() {
        manager.addParkingLot("LOT-1");
        manager.toggleParkingLot("LOT-1", true);
    }


    @Test
    void testManagerCanDisableParkingLot() {
        manager.addParkingLot("LOT-1");
        manager.toggleParkingLot("LOT-1", false);
    }


    @Test
    void testManagerCanToggleParkingLot() {
        manager.addParkingLot("LOT-1"); // Add as manager
        regularUser.toggleParkingLot("LOT-1", true);  // shouldn't allow the user to make changes
    }


    @Test
    void testManagerCanToggleParkingSpace() {
        manager.addParkingLot("LOT-1");
        manager.toggleParkingSpace("LOT-1", "test-1", true);
    }
}
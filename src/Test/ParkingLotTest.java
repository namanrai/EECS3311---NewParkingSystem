package Test;

import Models.ParkingLot;
import Models.ParkingSpace;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {
    private ParkingLot parkingLot;

    @BeforeEach
    public void setUp() {
        parkingLot = new ParkingLot("LOT-1");
    }

    @Test
    public void testInitialization() {
        assertEquals("LOT-1", parkingLot.getLotId());
        assertFalse(parkingLot.isDisabled());
        assertEquals(100, parkingLot.getSpaces().size());
    }

    @Test
    public void testParkingSpaceCreation() {
        List<ParkingSpace> spaces = parkingLot.getSpaces();
        assertEquals("LOT-1-1", spaces.get(0).getId());
        assertEquals("lot-1", spaces.get(0).getLocation());
        assertEquals("LOT-1-100", spaces.get(99).getId());
        assertEquals("lot-100", spaces.get(99).getLocation());
    }

    @Test
    public void testFindAvailableSpaceInEmptyLot() {
        ParkingSpace available = parkingLot.findAvailableSpace();
        assertNotNull(available);
        assertFalse(available.isOccupied());
        assertFalse(available.isDisabled());
    }

    @Test
    public void testFirstSpaceIsAvailableInitially() {
        ParkingSpace firstSpace = parkingLot.getSpaces().get(0);
        assertFalse(firstSpace.isOccupied(), "First space should be available initially");
    }

    @Test
    public void testLastSpaceIsAvailableInitially() {
        ParkingSpace lastSpace = parkingLot.getSpaces().get(99);
        assertFalse(lastSpace.isOccupied(), "Last space should be available initially");
    }

    @Test
    public void testDisableThenEnableLot() {
        parkingLot.disable();
        assertTrue(parkingLot.isDisabled(), "Lot should be disabled after disable()");

        parkingLot.enable();
        assertFalse(parkingLot.isDisabled(), "Lot should be enabled after enable()");
    }

    @Test
    public void testFindAvailableSpaceWithDisabledSpaces() {
        // Disable first 50 spaces
        for (int i = 0; i < 50; i++) {
            parkingLot.getSpaces().get(i).disable();
        }

        ParkingSpace available = parkingLot.findAvailableSpace();
        assertNotNull(available);
        assertEquals("LOT-1-51", available.getId()); // First non-disabled space
    }

    @Test
    public void testDisableLot() {
        parkingLot.disable();
        assertTrue(parkingLot.isDisabled());
    }

    @Test
    public void testEnableLot() {
        parkingLot.disable();
        parkingLot.enable();
        assertFalse(parkingLot.isDisabled());
    }


    @Test
    public void testFindAvailableSpaceReturnsFirstAvailableSpace() {
        ParkingSpace expectedFirst = parkingLot.getSpaces().get(0);
        ParkingSpace actualFirst = parkingLot.findAvailableSpace();
        assertEquals(expectedFirst.getId(), actualFirst.getId());
    }
}
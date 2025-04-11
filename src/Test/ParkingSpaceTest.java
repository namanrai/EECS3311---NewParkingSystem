package Test;

import Models.ParkingSpace;
import Models.Sensor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParkingSpaceTest {
    private ParkingSpace parkingSpace;

    @BeforeEach
    void setUp() {
        parkingSpace = new ParkingSpace("testSpace", "testLot");
        parkingSpace.sensor = new Sensor(); // Initialize sensor
    }


    @Test
    void testInitialization() {
        assertFalse(parkingSpace.isOccupied());
        assertNull(parkingSpace.getLicensePlate());
        assertFalse(parkingSpace.isDisabled());
    }

    @Test
    void testAssignCar() {
        parkingSpace.assign("ABC123");
        assertTrue(parkingSpace.isOccupied());
        assertEquals("ABC123", parkingSpace.getLicensePlate());
    }


    @Test
    void testVacateSpace() {
        parkingSpace.assign("ABC123");
        parkingSpace.vacate();
        assertFalse(parkingSpace.isOccupied());
        assertNull(parkingSpace.getLicensePlate());
    }

    @Test
    void testDisabledSpace() {
        parkingSpace.disable();
        parkingSpace.assign("ABC123");
        assertFalse(parkingSpace.isOccupied());
    }

    @Test
    void testSensorDetectsAssignedCar() {
        parkingSpace.assign("ABC123");
        assertTrue(parkingSpace.sensor.isCarPresent());
        assertEquals("ABC123", parkingSpace.sensor.getDetectedLicensePlate());
    }


    @Test
    void testVacateShouldClearSensor() {
        parkingSpace.assign("ABC123");
        parkingSpace.vacate();
        assertFalse(parkingSpace.sensor.isCarPresent());
        assertNull(parkingSpace.sensor.getDetectedLicensePlate());
    }

    @Test
    void testEnabledSpaceShouldAcceptCars() {
        parkingSpace.disable();
        parkingSpace.enable();
        parkingSpace.assign("ABC123");
        assertTrue(parkingSpace.isOccupied());
    }


    @Test
    void testGetters() {
        assertEquals("testSpace", parkingSpace.getId());
        assertEquals("testLot", parkingSpace.getLocation());
    }

    @Test
    void testAssignThenVacate() {
        //First Car
        parkingSpace.assign("ABC123");
        assertEquals("ABC123", parkingSpace.getLicensePlate());


        parkingSpace.vacate();
        assertNull(parkingSpace.getLicensePlate());

        // Second Car
        parkingSpace.assign("XYZ123");
        assertEquals("XYZ123", parkingSpace.getLicensePlate());
    }

    @Test
    void testMultipleOperations() {
        parkingSpace.assign("ABC123");
        parkingSpace.vacate();
        parkingSpace.vacate();
        assertFalse(parkingSpace.isOccupied());
    }
}
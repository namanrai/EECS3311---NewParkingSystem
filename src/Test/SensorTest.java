package Test;

import Models.Sensor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SensorTest {

    @Test
    public void testInitialization() {
        Sensor sensor = new Sensor();
        assertFalse(sensor.isCarPresent());
        assertNull(sensor.getDetectedLicensePlate());
    }

    @Test
    public void testDetectCar() {
        Sensor sensor = new Sensor();
        String testPlate = "ABC123";
        sensor.detectCar(testPlate);

        assertTrue(sensor.isCarPresent());
        assertEquals(testPlate, sensor.getDetectedLicensePlate());
    }

    @Test
    public void testClearDetection() {
        Sensor sensor = new Sensor();
        sensor.detectCar("ABC123");
        sensor.clearDetection();

        assertFalse(sensor.isCarPresent());
        assertNull(sensor.getDetectedLicensePlate());
    }

    @Test
    public void testDetectMultipleCars() {
        Sensor sensor = new Sensor();
        String plate1 = "carPlate1";
        String plate2 = "carPlate2";

        sensor.detectCar(plate1);
        assertEquals(plate1, sensor.getDetectedLicensePlate());

        sensor.detectCar(plate2);
        assertEquals(plate2, sensor.getDetectedLicensePlate());
    }

    @Test
    public void testDetectCarWithEmptyString() {
        Sensor sensor = new Sensor();
        sensor.detectCar("");

        assertTrue(sensor.isCarPresent());
        assertEquals("", sensor.getDetectedLicensePlate());
    }

    @Test
    public void testDetectCarWithNull() {
        Sensor sensor = new Sensor();
        sensor.detectCar(null);

        assertTrue(sensor.isCarPresent());
        assertNull(sensor.getDetectedLicensePlate());
    }

    @Test
    public void testClearDetectionWhenNull() {
        Sensor sensor = new Sensor();
        sensor.clearDetection();

        assertFalse(sensor.isCarPresent());
        assertNull(sensor.getDetectedLicensePlate());
    }

    @Test
    public void testIsCarPresentAfterDetection() {
        Sensor sensor = new Sensor();
        sensor.detectCar("TEST123");
        assertTrue(sensor.isCarPresent());
    }

    @Test
    public void testGetDetectedLicensePlateAfterClear() {
        Sensor sensor = new Sensor();
        sensor.detectCar("TEST123");
        sensor.clearDetection();
        assertNull(sensor.getDetectedLicensePlate());
    }

    @Test
    public void testSensorForMultipleCars() {
        Sensor sensor = new Sensor();
        String[] plates = {"plate1", "plate2", "plate3"};

        for (String plate : plates) {
            sensor.detectCar(plate);
            assertEquals(plate, sensor.getDetectedLicensePlate());
            sensor.clearDetection();
            assertFalse(sensor.isCarPresent());
        }
    }
}
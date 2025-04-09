package Test;

import DesignPatterns.state.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class BookingStateTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testAvailableStateOutput() {
        BookingState state = new AvailableState();
        state.handleState();
        assertEquals("The parking space is available." + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testBookedStateOutput() {
        BookingState state = new BookedState();
        state.handleState();
        assertEquals("The parking space is booked." + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testMaintenanceStateOutput() {
        BookingState state = new MaintenanceState();
        state.handleState();
        assertEquals("The parking space is under maintenance." + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testOccupiedStateOutput() {
        BookingState state = new OccupiedState();
        state.handleState();
        assertEquals("The parking space is occupied." + System.lineSeparator(), outContent.toString());
    }
}

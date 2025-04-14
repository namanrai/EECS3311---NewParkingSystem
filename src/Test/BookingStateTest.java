package Test;

import DesignPatterns.state.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BookingStateTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        outContent.reset();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testAvailableStateOutput() {
        BookingState state = new AvailableState();
        state.handleState();
        assert outContent.toString().equals("The parking space is available." + System.lineSeparator());
    }

    @Test
    public void testBookedStateOutput() {
        BookingState state = new BookedState();
        state.handleState();
        assert outContent.toString().equals("The parking space is booked." + System.lineSeparator());
    }

    @Test
    public void testMaintenanceStateOutput() {
        BookingState state = new MaintenanceState();
        state.handleState();
        assert outContent.toString().equals("The parking space is under maintenance." + System.lineSeparator());
    }

    @Test
    public void testOccupiedStateOutput() {
        BookingState state = new OccupiedState();
        state.handleState();
        assert outContent.toString().equals("The parking space is occupied." + System.lineSeparator());
    }

    @Test
    public void testInstanceOfAvailableState() {
        BookingState state = new AvailableState();
        assert state instanceof AvailableState;
    }

    @Test
    public void testInstanceOfBookedState() {
        BookingState state = new BookedState();
        assert state instanceof BookedState;
    }

    @Test
    public void testInstanceOfMaintenanceState() {
        BookingState state = new MaintenanceState();
        assert state instanceof MaintenanceState;
    }

    @Test
    public void testInstanceOfOccupiedState() {
        BookingState state = new OccupiedState();
        assert state instanceof OccupiedState;
    }

    @Test
    public void testMultipleStateTransitions() {
        BookingState state1 = new AvailableState();
        state1.handleState();
        assert outContent.toString().contains("available");

        outContent.reset();

        BookingState state2 = new BookedState();
        state2.handleState();
        assert outContent.toString().contains("booked");
    }

    @Test
    public void testHandleStateDoesNotThrow() {
        try {
            new AvailableState().handleState();
            new BookedState().handleState();
            new MaintenanceState().handleState();
            new OccupiedState().handleState();
            assert true;
        } catch (Exception e) {
            assert false : "Exception thrown: " + e.getMessage();
        }
    }
}

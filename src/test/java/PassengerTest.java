import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;

    @Before
    public void before(){
        passenger1 = new Passenger("Bob", 1);
        passenger2 = new Passenger("Frank", 2);
        passenger3 = new Passenger("Greg", 3);
        passenger4 = new Passenger("Jimmy", 1);
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", passenger1.getName());
    }

    @Test
    public void canSetName(){
        passenger1.setName("Bob Smith");
        assertEquals("Bob Smith", passenger1.getName());
    }

    @Test
    public void canGetBagNumber() {
        assertEquals(1, passenger1.getBagNumber());
    }

    @Test
    public void canSetBagNumber() {
        passenger1.setBagNumber(100);
        assertEquals(100, passenger1.getBagNumber());
    }

    @Test
    public void canIsFlight() {
        assertEquals(false,passenger1.isFlight());
    }

    @Test
    public void canSetFlight() {
        passenger1.setFlight(true);
        assertEquals(true,passenger1.isFlight());
    }

    @Test
    public void getSeatNumber() {
        assertEquals(0, passenger1.getSeatNumber());
    }

    @Test
    public void setSeatNumber() {
        passenger1.setSeatNumber(1);
        assertEquals(1, passenger1.getSeatNumber());
    }
}
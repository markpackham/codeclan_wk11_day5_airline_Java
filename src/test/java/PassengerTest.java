import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Plane plane1;
    Plane plane2;
    Plane plane3;
    Plane plane4;
    Flight flight1;
    Flight flight2;
    Flight flight3;
    Flight flight4;

    @Before
    public void before() throws ParseException {
        passenger1 = new Passenger("Bob", 1);
        passenger2 = new Passenger("Frank", 2);
        passenger3 = new Passenger("Greg", 3);
        passenger4 = new Passenger("Jimmy", 1);
        plane1 = new Plane(PlaneType.TINYPLANE);
        plane2 = new Plane(PlaneType.SMALLPLANE);
        plane3 = new Plane(PlaneType.BIGPLANE);
        plane4 = new Plane(PlaneType.HUGEPLANE);
        flight1 = new Flight("1A","Edinburgh", "London", "01:00", plane1);
        flight2 = new Flight("2A","London", "Edinburgh", "02:00", plane2);
        flight3 = new Flight("3A","Glasgow", "Paris", "03:00", plane3);
        flight4 = new Flight("4A","Paris", "Glasgow", "04:00", plane4);
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
    public void canSetFlight() {
        passenger1.setFlight(flight2);
        assertEquals(flight2,passenger1.getFlight());
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
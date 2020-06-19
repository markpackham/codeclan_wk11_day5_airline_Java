import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Plane plane1;
    Plane plane2;
    Plane plane3;
    Plane plane4;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Flight flight1;
    Flight flight2;
    Flight flight3;
    Flight flight4;

    @Before
    public void before() {
        plane1 = new Plane(PlaneType.TINYPLANE);
        plane2 = new Plane(PlaneType.SMALLPLANE);
        plane3 = new Plane(PlaneType.BIGPLANE);
        plane4 = new Plane(PlaneType.HUGEPLANE);
        passenger1 = new Passenger("Bob", 1);
        passenger2 = new Passenger("Frank", 2);
        passenger3 = new Passenger("Greg", 3);
        passenger4 = new Passenger("Jimmy", 1);
        flight1 = new Flight("1A","Edinburgh", "London", "01:00", plane1);
        flight2 = new Flight("2A","London", "Edinburgh", "02:00", plane2);
        flight3 = new Flight("3A","Glasgow", "Paris", "03:00", plane3);
        flight4 = new Flight("4A","Paris", "Glasgow", "04:00", plane4);
    }

    @Test
    public void canCetFlightNumber() {
        assertEquals("1A", flight1.getFlightNumber());
    }

    @Test
    public void canGetDestination() {
        assertEquals("Edinburgh", flight1.getDestination());
    }

    @Test
    public void canGetDepartureAirport() {
        assertEquals("London", flight1.getDepartureAirport());
    }

    @Test
    public void canGetDepartureTime() {
        assertEquals("01:00", flight1.getDepartureTime());
    }

    @Test
    public void canGetPlane() {
        assertEquals(plane1, flight1.getPlane());
    }

    @Test
    public void canAddPassanger(){
        flight4.addPassenger(passenger1);
        assertEquals(1, flight4.passengerCount());
    }

    @Test
    public void canShowAvailableSeats(){
        flight4.addPassenger(passenger1);
        assertEquals(99, flight4.availableSeatsCount());
    }

}

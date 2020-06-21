import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;

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
    Passenger passenger5;
    Passenger passenger6;
    Passenger passenger7;
    Flight flight1;
    Flight flight2;
    Flight flight3;
    Flight flight4;

    @Before
    public void before() throws ParseException {
        plane1 = new Plane(PlaneType.TINYPLANE);
        plane2 = new Plane(PlaneType.SMALLPLANE);
        plane3 = new Plane(PlaneType.BIGPLANE);
        plane4 = new Plane(PlaneType.HUGEPLANE);
        passenger1 = new Passenger("Bob", 1);
        passenger2 = new Passenger("Frank", 2);
        passenger3 = new Passenger("Greg", 3);
        passenger4 = new Passenger("Jimmy", 10);
        passenger5 = new Passenger("Weighless Joe", 0);
        passenger6 = new Passenger("Weightless Smith", 0);
        passenger7 = new Passenger("Weightlss Billy", 0);
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
    public void canAddPassanger__flight_true(){
        flight4.addPassenger(passenger1);
        assertEquals(true, passenger1.isFlight());
    }

    @Test
    public void cannotAddPassanger__over_capacity(){
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger5);
        flight1.addPassenger(passenger6);
        flight1.addPassenger(passenger7);
        assertEquals(2, flight1.passengerCount());
    }

    @Test
    public void canShowBagWeight(){
        flight4.addPassenger(passenger1);
        flight4.addPassenger(passenger2);
        assertEquals(3,flight4.bagWeightCount());
    }

    @Test
    public void canShowAvailableSeats(){
        flight4.addPassenger(passenger1);
        assertEquals(99, flight4.availableSeatsCount());
    }

    @Test
    public void canGetRandomNumber(){
        flight4.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        // I cannot really test for Randomness but I can see the output when the random function is run
        System.out.println(passenger1.getSeatNumber());
        System.out.println(passenger2.getSeatNumber());
    }

    // Bubble Sort and Binary Search never completed, sticking with random seat allocation
    @Test
    public void canBubbleSortSeats() {
        flight4.addPassenger(passenger1);
        flight4.addPassenger(passenger2);
        flight4.addPassenger(passenger3);
        flight4.addPassenger(passenger4);
        flight4.addPassenger(passenger5);
        flight4.bubbleSortSeats();
        System.out.println(flight4.getSeatsTaken());
    }

    @Test
    public void canBinarySeatSearch__failed_search() {
        flight4.addPassenger(passenger1);
        flight4.addPassenger(passenger2);
        flight4.addPassenger(passenger3);
        flight4.addPassenger(passenger4);
        flight4.addPassenger(passenger5);
        boolean answer = flight4.binarySeatSearch(flight4.getSeatsTaken(),1000000000);
        assertEquals(false, answer);
    }
}

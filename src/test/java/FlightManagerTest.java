import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager1;
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
    public void before(){
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
        flightManager1 = new FlightManager(flight4);
    }

    @Test
    public void canGetReservedBaggageWeight() {
    assertEquals(5,flightManager1.reservedBaggageWeight(flight4));
    }

    @Test
    public void canGetPassangersBaggageWeight(){
        flight4.addPassenger(passenger1);
        flight4.addPassenger(passenger2);
        assertEquals(3,flightManager1.passangersBaggageWeight(flight4));
    }


}
